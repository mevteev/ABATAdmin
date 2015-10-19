package com.vtbcapital.itops.ABATAdmin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;






import javax.swing.table.AbstractTableModel;






import com.atlassian.jira.rest.client.domain.Issue;

public class TaskQueueModel extends AbstractTableModel implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4270929665668093030L;
	
	protected String[] columnNames;
	@SuppressWarnings("rawtypes")
	protected Class[] columnClass;
	protected List<TaskQueue> datalist;
	
	
	

	public TaskQueueModel(List<TaskQueue> referenceList) {

		datalist = referenceList;

		columnNames = new String[] { "Instance", "Job", "Company", "Start Date", "End Date", "User Name",
				"Status", "Time Queued", "Time Started", "Time Finished", "Batch Id",
				"Exit Code", "Exit Code Description", "Jira Item"};

		columnClass = new Class[] { Instances.class, Jobs.class, Companies.class, Date.class, Date.class, String.class,
				TaskStatus.class, Date.class, Date.class, Date.class, Long.class,
				Long.class, String.class, String.class };
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {

		TaskQueue row = datalist.get(rowIndex);
		
		switch (columnIndex) {
		case 0:
			return row.getInstance();
		case 1:
			return row.getJob();
		case 2:
			return row.getCompany();
		case 3:
			return row.getStartDate();
		case 4:
			return row.getEndDate();
		case 5:
			return row.getUserName();
		case 6:
			return row.getStatus();
		case 7:
			//return timestampFormatter.format((Date)row.getTimeQueued());
			return row.getTimeQueued();
		case 8:
			return row.getTimeStarted();
		case 9:
			return row.getTimeFinished();
		case 10:
			return row.getBatchId();
		case 11:
			return row.getExitCode();
		case 12:
			return row.getExitCodeDescription();
		case 13:
			return row.getJiraItem();
		}
		return null;
	}
	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		TaskQueue tq = datalist.get(rowIndex);
		switch (columnIndex) {
			case 6:
				tq.setStatus((TaskStatus) aValue);
				break;
			case 8:
				tq.setTimeStarted((Date)aValue);
				break;
			case 10:
				tq.setBatchId((Long) aValue);
				break;			
		}
		
	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnClass[columnIndex];
	}

	public int getColumnCount() {

		return columnNames.length;
	}

	public int getRowCount() {
		return datalist.size();
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	public void addRow(TaskQueue tq) {
		datalist.add(0, tq);
		fireTableRowsInserted(0, 0);
	}

	@Override
	public void run() {
		ABHelper abHelper = AppSettings.getAbHelper();
		if (abHelper == null || !abHelper.isConnected) {
			AppSettings.getLog().log("Active batch is not connected");
			return;
		}
		
		JiraHelper jh = new JiraHelper(this);
		jh.connect();
		
		AppSettings.getLog().log("Queue listener started");
		
		while (!Thread.currentThread().isInterrupted()) {
			try {
				if (!isProcessing()) {
					//get first queued task
					List<TaskQueue> list = TaskQueue.getQueuedTasks(AppSettings.getPREF_ACTIVE_INSTANCE_INST());
					if (list != null && !list.isEmpty()) {
						
						TaskQueue tqq = list.get(0);
						
						int row = datalist.indexOf(tqq);
						TaskQueue tq = datalist.get(row);
						
						String jiraItem = tq.getJiraItem();
						Jobs job = tq.getJob();


						AppSettings.getLog().log("Processing " + jiraItem);
						// Change status in JIRA
						Issue issue = jh.getIssue(jiraItem);
						jh.commentIssue(issue, tq.getCompany() + ": Start processing");
						jh.progressIssue(issue);

							
						//Trigger active batch
						AppSettings.getLog().log("Triggering " + jiraItem);
						Companies company = tq.getCompany();
						Date startDate = tq.getStartDate();
						Date endDate = tq.getEndDate();
						String user = tq.getUserName();
							
							
						int ABId = abHelper.triggerJob(AppSettings.getPREF_ACTIVE_INSTANCE_INST(), job, company, startDate, endDate, user);
						
						tq.setBatchId(Long.valueOf(ABId));
						tq.setTimeStarted(new Date());
						tq.setStatus((TaskStatus)ReferenceType.getElement("In Progress", TaskStatus.tableName()));
						
						fireTableRowsUpdated(row, row);
							
					}
				} else {
					//get in progress items
					List<TaskQueue> list = TaskQueue.getInProgressTasks(AppSettings.getPREF_ACTIVE_INSTANCE_INST());
					if (list != null)  {
						for (TaskQueue tq : list) {
							int row = datalist.indexOf(tq);
							
							TaskQueue tqq = datalist.get(row);
							
							//check status in active batch
							String status = abHelper.getJobStatus(tq.getBatchId().intValue());
							if (status.equals("Aborted")) {
								AppSettings.getLog().log(tq.getJiraItem() + " was aborted in AB");
								tqq.setStatus((TaskStatus) ReferenceType.getElement("Cancelled", TaskStatus.tableName()));
								tqq.setTimeFinished(abHelper.getJobExecTime(tq.getBatchId().intValue()));
								tqq.setExitCode(Long.valueOf(abHelper.getJobExitCode(tq.getBatchId().intValue())));
								tqq.setExitCodeDescription(abHelper.getJobExitCodeDescriprion(tq.getBatchId().intValue()));
								
								Issue issue = jh.getIssue(tqq.getJiraItem());
								jh.commentIssue(issue, tqq.getCompany() + ": Aborted");
								
								if (TaskQueue.countQueuedSubTasks(tqq.getJiraItem(), AppSettings.getPREF_ACTIVE_INSTANCE_INST()) <= 1) {
									jh.resolveIssue(issue, false, "Workflow aborted");
								}


								fireTableRowsUpdated(row, row);
							}
							else if (status.equals("Failed")) {
								AppSettings.getLog().log(tq.getJiraItem() + " was failed in AB");
								tqq.setStatus((TaskStatus) ReferenceType.getElement("Failed", TaskStatus.tableName()));
								tqq.setTimeFinished(abHelper.getJobExecTime(tq.getBatchId().intValue()));
								tqq.setExitCode(Long.valueOf(abHelper.getJobExitCode(tq.getBatchId().intValue())));
								tqq.setExitCodeDescription(abHelper.getJobExitCodeDescriprion(tq.getBatchId().intValue()));
								
								Issue issue = jh.getIssue(tqq.getJiraItem());
								jh.commentIssue(issue, tqq.getCompany() + ": Failed. Error: " + tqq.getExitCodeDescription());

								fireTableRowsUpdated(row, row);
							}
							else if (status.equals("Succeeded")) {
								AppSettings.getLog().log(tq.getJiraItem() + " was succeeded in AB");
								tqq.setStatus((TaskStatus) ReferenceType.getElement("Succeeded", TaskStatus.tableName()));
								tqq.setTimeFinished(abHelper.getJobExecTime(tq.getBatchId().intValue()));
								tqq.setExitCode(Long.valueOf(abHelper.getJobExitCode(tq.getBatchId().intValue())));
								tqq.setExitCodeDescription(abHelper.getJobExitCodeDescriprion(tq.getBatchId().intValue()));
								
								Issue issue = jh.getIssue(tqq.getJiraItem());
								jh.commentIssue(issue, tqq.getCompany() + ": Succeeded");
								
								if (TaskQueue.countQueuedSubTasks(tqq.getJiraItem(), AppSettings.getPREF_ACTIVE_INSTANCE_INST()) <= 1) {
									jh.resolveIssue(issue, true, "");
								}

								fireTableRowsUpdated(row, row);
							}

							//if done update statuses in queue
						}
					}
						
				}
				
				Thread.sleep(AppSettings.getPREF_JIRA_INTERVAL());
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				AppSettings.getLog().log("Queue listener stopped");
				return;
			} finally {
				
			}
		}
		
		AppSettings.getLog().log("Queue listener stopped");
	}
	
	private boolean isProcessing() {
		return TaskQueue.countInProgressTasks(AppSettings.getPREF_ACTIVE_INSTANCE_INST()) > 0; 
				
	}
	
	
	
	
	


}
