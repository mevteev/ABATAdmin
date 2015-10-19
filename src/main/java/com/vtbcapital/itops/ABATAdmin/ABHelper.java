package com.vtbcapital.itops.ABATAdmin;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

import com4j.Com4jObject;
import com4j.ComThread;
import com4j.EventCookie;
import asci.activebatch.ClassFactory;
import asci.activebatch.IAbatAlertObjectLite;
import asci.activebatch.IAbatJob;
import asci.activebatch.IAbatJobHistory;
import asci.activebatch.IAbatJobLite;
import asci.activebatch.IAbatJobScheduler;
import asci.activebatch.IAbatObjectLite;
import asci.activebatch.IAbatObjectsLite;
import asci.activebatch.IAbatPlanLite;
import asci.activebatch.IAbatVariable;
import asci.activebatch.IAbatVariables;
import asci.activebatch.enumInstanceState;
import asci.activebatch.enumObjectLiteFilter;

//import asci;

public class ABHelper {

	IAbatJobScheduler jobScheduler;
	boolean isConnected = false;

	public ABHelper() {
		jobScheduler = ClassFactory.createAbatJobScheduler();
	}

	public void connect(Instances inst) {
		if (isConnected) {
			jobScheduler.disconnect();
		}

		jobScheduler.connect(inst.getInstanceHost(),
				com4j.Variant.getMissing(), com4j.Variant.getMissing(),
				com4j.Variant.getMissing());
		isConnected = true;
	}

	public void disconnect() {
		if (isConnected) {
			jobScheduler.disconnect();
			isConnected = false;
		}
	}

	public List<ActiveJob> getJobHistory(Jobs job, String path, int level) {
		List<ActiveJob> list = new ArrayList<ActiveJob>();

		if (isConnected) {
			Com4jObject objJob = jobScheduler.getAbatObjectLite(path);
			Com4jObject abatJob = null;
			Com4jObject abatPlan = null;

			abatJob = objJob.queryInterface(IAbatJobLite.class);
			boolean isJob = true;

			if (abatJob == null) {
				abatPlan = objJob.queryInterface(IAbatPlanLite.class);
				isJob = false;
			}

			IAbatObjectsLite jobHistoryList;

			if (isJob) {
				jobHistoryList = ((IAbatJobLite) abatJob).getInstances(
						AppSettings.getCountHistory(),
						com4j.Variant.getMissing(), com4j.Variant.getMissing(),
						com4j.Variant.getMissing(), com4j.Variant.getMissing());
			} else {
				jobHistoryList = ((IAbatPlanLite) abatPlan).getInstances(
						AppSettings.getCountHistory(),
						com4j.Variant.getMissing(), com4j.Variant.getMissing(),
						com4j.Variant.getMissing(), com4j.Variant.getMissing());
			}

			for (int i = 1; i <= jobHistoryList.count(); i++) {
				Com4jObject obj = jobHistoryList.item(i);

				IAbatJobHistory abatObj = obj
						.queryInterface(IAbatJobHistory.class);

				ActiveJob aj = new ActiveJob();
				aj.setId(abatObj.id());
				aj.setName(abatObj.name());
				aj.setJob(job);
				aj.setState(abatObj.instanceState());
				aj.setExecutionTime(abatObj.executionDateTime());
				aj.setExitCode(abatObj.jobReturnCode());
				aj.setExitCodeDescription(abatObj.exitCodeDescription());
				IAbatVariables vars = abatObj.getVariables();

				aj.setUser(abatObj.executionUser());

				aj.setLevel(level);

				String param = "";

				for (Com4jObject varObj : vars) {
					IAbatVariable var = varObj
							.queryInterface(IAbatVariable.class);
					if (var != null) {
						param = param + var.name() + "=" + var.value() + ";";

						if (var.name().equals("Company")) {
							aj.setCompany(var.value().toString());
						} else if (var.name().equals("DateStart")) {
							SimpleDateFormat sdf = new SimpleDateFormat(
									"yyyy-MM-dd");
							try {
								aj.setStartDate(sdf.parse(var.value()
										.toString()));
							} catch (ParseException e) {
								e.printStackTrace();
							}
						} else if (var.name().equals("DateEnd")) {
							SimpleDateFormat sdf = new SimpleDateFormat(
									"yyyy-MM-dd");
							try {
								aj.setEndDate(sdf.parse(var.value().toString()));
							} catch (ParseException e) {
								e.printStackTrace();
							}
						} else if (var.name().equals("User")) {
							aj.setUser(var.value().toString());
						}
					}

				}

				aj.setParameters(param);

				list.add(aj);

				if (!isJob) {

					List<ActiveJob> histList = new ArrayList<ActiveJob>();

					IAbatObjectsLite planHist = jobScheduler
							.getBatchRun(abatObj.id());
					for (Com4jObject varHistObj : planHist) {
						IAbatJobHistory abatHistObj = varHistObj
								.queryInterface(IAbatJobHistory.class);
						if (abatHistObj != null) {
							ActiveJob ahj = new ActiveJob();
							ahj.setId(abatHistObj.id());
							ahj.setName(abatHistObj.name());
							ahj.setJob(job);
							ahj.setState(abatHistObj.instanceState());
							ahj.setExecutionTime(abatHistObj
									.executionDateTime());
							ahj.setExitCode(abatHistObj.jobReturnCode());
							ahj.setExitCodeDescription(abatHistObj
									.exitCodeDescription());

							ahj.setLevel(level + 1);

							histList.add(ahj);

						}
					}

					if (!histList.isEmpty()) {
						aj.setChildren(histList);
					}

				}

			}

			// IAbatObjectsLite aol = jobScheduler.search(path, "*",
			// enumObjectLiteFilter., "AllFields", false);
			// for (int i = 1; i <= aol.count(); i++) {
			// Com4jObject obj = aol.item(i);
			// IAbatObjectLite abatObj =
			// obj.queryInterface(IAbatObjectLite.class);
			// System.out.println(abatObj.id());
			// }

			// jobScheduler.getInstances(AppSettings.getCountHistory(),
			// instanceStateFilter, showOldestFirst, startDateTime, endDateTime)
		}

		return list;
	}
	
	public String getJobStatus(int jobID) {
		if (isConnected) {
			Com4jObject objJob = jobScheduler.getAbatObjectLite(jobID);
			
			Com4jObject abatJob = null;

			abatJob = objJob.queryInterface(IAbatJobHistory.class);

			
			return getInstanceState(((IAbatJobHistory) abatJob).instanceState());
			
		} else {
			return "";
		}
	}
	
	public int getJobExitCode(int jobID) {
		if (isConnected) {
			Com4jObject objJob = jobScheduler.getAbatObjectLite(jobID);
			
			Com4jObject abatJob = null;

			abatJob = objJob.queryInterface(IAbatJobHistory.class);

			
			return ((IAbatJobHistory) abatJob).jobReturnCode();
			
		} else {
			return 0;
		}
	}
	
	
	public String getJobExitCodeDescriprion(int jobID) {
		if (isConnected) {
			Com4jObject objJob = jobScheduler.getAbatObjectLite(jobID);
			
			Com4jObject abatJob = null;

			abatJob = objJob.queryInterface(IAbatJobHistory.class);

			
			return ((IAbatJobHistory) abatJob).exitCodeDescription();
			
		} else {
			return "";
		}
	}
	
	public Date getJobExecTime(int jobID) {
		if (isConnected) {
			Com4jObject objJob = jobScheduler.getAbatObjectLite(jobID);
			
			Com4jObject abatJob = null;

			abatJob = objJob.queryInterface(IAbatJobHistory.class);

			return new Date( ((IAbatJobHistory) abatJob).completionDateTime().getTime()  + CommonFunctions.getCurrentTimezoneOffset());
			
		} else {
			return new Date();
		}
	}

	//
	// public static void main(String[] args) {
	//
	// IAbatJobScheduler jobScheduler = ClassFactory.createAbatJobScheduler();
	// jobScheduler.connect("abuat", com4j.Variant.getMissing(),
	// com4j.Variant.getMissing(), com4j.Variant.getMissing());
	//
	// jobScheduler.disconnect();
	// }

	public static String getInstanceState(enumInstanceState state) {
		if (state == null)
			return "";

		switch (state) {
		case abatIS_Aborted:
			return "Aborted";
		case abatIS_Executing:
			return "Executing";
		case abatIS_Failed:
			return "Failed";
		case abatIS_NotRun:
			return "Not run";
		case abatIS_Orphaned:
			return "Orphaned";
		case abatIS_Preprocessing:
			return "Preprocessing";
		case abatIS_Ready:
			return "Ready";
		case abatIS_Succeeded:
			return "Succeeded";
		case abatIS_Waiting:
			return "Waiting";
		default:
			return "";
		}
	}
	
	public int triggerJob(Instances instance, Jobs job, Companies company, Date startDate, Date endDate, String user) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		JobPath jp = JobPath.getElement(instance, job);
		
		String ABPath = jp.getPath();
		String ABCompany = company.getCompanyName();
		String ABDateStart = df.format(startDate);
		String ABDateEnd = df.format(endDate);
		String ABMemo1 = company.getMemo1();
		String ABMemo2 = company.getMemo2();
		String ABParamName1 = job.getParam1().trim();
		String ABParamName2 = job.getParam2().trim();
		
		int instanceId = -1;
		
		//By period - SM and EM parameters are adding
		if (ABParamName1.equals("SM")) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(startDate);
			ABMemo1 = Integer.toString(cal.get(Calendar.MONTH) + 1);
			cal.setTime(endDate);
			ABMemo2 = Integer.toString(cal.get(Calendar.MONTH) + 1);
		}

		
		
		String param = "";
		param = "Company=" + ABCompany + ";DateStart=" + ABDateStart + ";DateEnd=" + ABDateEnd;
		if (!ABParamName1.isEmpty()) {
			param += ";" + ABParamName1 + "=" + ABMemo1;
		}

		if (!ABParamName2.isEmpty()) {
			param += ";" + ABParamName2 + "=" + ABMemo2;
		}
		
		
		
		AppSettings.getLog().log(ABPath);
		AppSettings.getLog().log(param);
		
		//triggering
		if (isConnected) {
			Com4jObject objJob = jobScheduler.getAbatObjectLite(ABPath);
			
			Com4jObject abatJob = null;

			abatJob = objJob.queryInterface(IAbatJobLite.class);
			boolean isJob = true;

			if (abatJob == null) {
				abatJob = objJob.queryInterface(IAbatPlanLite.class);
				isJob = false;
			}
			
			Com4jObject varObj = jobScheduler.createObject("Variables");
			
			IAbatVariables var = varObj.queryInterface(IAbatVariables.class);
			
			
			var.setVariable("Company", "", ABCompany, true);
			var.setVariable("DateStart", "", ABDateStart, true);
			var.setVariable("DateEnd", "", ABDateEnd, true);
			
			var.setVariable("User", "", user.trim(), true);
			
			if (!ABParamName1.isEmpty()) {
				var.setVariable(ABParamName1, "", ABMemo1, true);
			}
			if (!ABParamName2.isEmpty()) {
				var.setVariable(ABParamName2, "", ABMemo2, true);
			}
			
//			if (false) {
			
				if (isJob) {
					instanceId = ((IAbatJobLite) abatJob).trigger3(com4j.Variant.getMissing(), 
							com4j.Variant.getMissing(), 
							com4j.Variant.getMissing(), 
							com4j.Variant.getMissing(), 
							com4j.Variant.getMissing(),
							var, com4j.Variant.getMissing());
				} else {
					instanceId = ((IAbatPlanLite) abatJob).trigger3(com4j.Variant.getMissing(), 
							com4j.Variant.getMissing(), 
							com4j.Variant.getMissing(), 
							com4j.Variant.getMissing(), 
							com4j.Variant.getMissing(), 
							var, com4j.Variant.getMissing());
				}				
					
//			}
		
		}
		
		
		
		
		return instanceId;
	}


}
