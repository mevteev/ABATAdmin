package com.vtbcapital.itops.ABATAdmin;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import com.atlassian.jira.rest.client.domain.Issue;

public class ABThread extends Thread {
	@Override
	public void run() {
		ABHelper abHelper = AppSettings.getAbHelper();
		if (abHelper == null || !abHelper.isConnected) {
			AppSettings.getLog().log(Level.SEVERE, "Active batch is not connected");
			return;
		}
		
		abHelper.connect(AppSettings.getPREF_ACTIVE_INSTANCE_INST());
		
		JiraHelper jh = new JiraHelper(null);
		jh.connect();
		
		AppSettings.getLog().log("Queue listener started");
		
		while (!Thread.currentThread().isInterrupted()) {
			try {
//////////////////////////////////////////////////////
				if (isProcessing()) {
					//get in progress items
					List<TaskQueue> list = TaskQueue.getInProgressTasks(AppSettings.getPREF_ACTIVE_INSTANCE_INST());
					if (list != null)  {
						for (TaskQueue tq : list) {
							
							//check status in active batch
							String status = abHelper.getJobStatus(tq.getBatchId().intValue());
							if (status.equals("Aborted")) {
								AppSettings.getLog().log(tq.getJiraItem() + " was aborted in AB");
								tq.setStatus((TaskStatus) ReferenceType.getElement("Cancelled", TaskStatus.tableName()));
								tq.setTimeFinished(abHelper.getJobExecTime(tq.getBatchId().intValue()));
								tq.setExitCode(Long.valueOf(abHelper.getJobExitCode(tq.getBatchId().intValue())));
								tq.setExitCodeDescription(abHelper.getJobExitCodeDescriprion(tq.getBatchId().intValue()));
								
								Issue issue = jh.getIssue(tq.getJiraItem());
								jh.commentIssue(issue, tq.getCompany() + ": Aborted");
								
								if (TaskQueue.countQueuedSubTasks(tq.getJiraItem(), AppSettings.getPREF_ACTIVE_INSTANCE_INST()) <= 1) {
									jh.resolveIssue(issue, false, "Workflow aborted");
								}
	
							}
							else if (status.equals("Failed")) {
								AppSettings.getLog().log(tq.getJiraItem() + " was failed in AB");
								tq.setStatus((TaskStatus) ReferenceType.getElement("Failed", TaskStatus.tableName()));
								tq.setTimeFinished(abHelper.getJobExecTime(tq.getBatchId().intValue()));
								tq.setExitCode(Long.valueOf(abHelper.getJobExitCode(tq.getBatchId().intValue())));
								tq.setExitCodeDescription(abHelper.getJobExitCodeDescriprion(tq.getBatchId().intValue()));
								
								Issue issue = jh.getIssue(tq.getJiraItem());
								jh.commentIssue(issue, tq.getCompany() + ": Failed. Error: " + tq.getExitCodeDescription());
								
								if (TaskQueue.countQueuedSubTasks(tq.getJiraItem(), AppSettings.getPREF_ACTIVE_INSTANCE_INST()) <= 1) {
									jh.resolveIssue(issue, false, "Workflow failed");
								}								
	
							}
							else if (status.equals("Succeeded")) {
								AppSettings.getLog().log(tq.getJiraItem() + " was succeeded in AB");
								tq.setStatus((TaskStatus) ReferenceType.getElement("Succeeded", TaskStatus.tableName()));
								tq.setTimeFinished(abHelper.getJobExecTime(tq.getBatchId().intValue()));
								tq.setExitCode(Long.valueOf(abHelper.getJobExitCode(tq.getBatchId().intValue())));
								tq.setExitCodeDescription(abHelper.getJobExitCodeDescriprion(tq.getBatchId().intValue()));
								
								Issue issue = jh.getIssue(tq.getJiraItem());
								//jh.commentIssue(issue, tq.getCompany() + ": Succeeded");
								
								if (TaskQueue.countQueuedSubTasks(tq.getJiraItem(), AppSettings.getPREF_ACTIVE_INSTANCE_INST()) <= 1) {
									jh.resolveIssue(issue, true, tq.getCompany() + ": Succeeded");
								} else {
									jh.commentIssue(issue, tq.getCompany() + ": Succeeded");
								}
	
							} //else {
								//Thread.sleep(AppSettings.getPREF_JIRA_INTERVAL());
								//continue;
							//}
	
							//if done update statuses in queue
							tq.saveElement();
							AppSettings.getLog().log("update");
						}
					}
				}
//////////////////////////////////////////////////////				
//				if (!isProcessing()) {
					//get first queued task
//				if (TaskQueue.getInProgressTasks(AppSettings.getPREF_ACTIVE_INSTANCE_INST()).size() < AppSettings.getPREF_MAX_PARALLEL_JOBS())
//				{
					List<TaskQueue> list = TaskQueue.getQueuedTasks(AppSettings.getPREF_ACTIVE_INSTANCE_INST());
					if (list != null && !list.isEmpty()) {
						
						for (TaskQueue tq : list) {
							if (TaskQueue.getInProgressTasks(AppSettings.getPREF_ACTIVE_INSTANCE_INST()).size() < AppSettings.getPREF_MAX_PARALLEL_JOBS()) {
								String jiraItem = tq.getJiraItem();
								Issue issue = jh.getIssue(jiraItem);
								// if jira item isn't aborted
								//System.out.println(jh.getIssueStatus(issue));
								////////////////////
								if (!jh.getIssueStatus(issue).equals("Closed")) {
								
									// checking for allowance to trigger job
									Companies company = tq.getCompany();
									Jobs job = tq.getJob();
									
									if (tq.isCompanyAlreadyInProgress() || 
											(!job.isParallel() && tq.isJobAlreadyInProgress()) ) 
										continue;
									
									//AppSettings.getLog().log("Processing " + jiraItem);
									// Change status in JIRA
									
									jh.commentIssue(issue, tq.getCompany() + ": Start processing");
									jh.progressIssue(issue);
									
									//Trigger active batch
									AppSettings.getLog().log("Processing " + jiraItem);
									
									Date startDate = tq.getStartDate();
									Date endDate = tq.getEndDate();
									String user = tq.getUserName();
									

									int ABId = 0;
									try {
										ABId = abHelper.triggerJob(AppSettings.getPREF_ACTIVE_INSTANCE_INST(), job, company, startDate, endDate, user);
										// Change status in queue
									} catch (Exception e) {
										AppSettings.getLog().log(Level.SEVERE, "Failed triggering " + jiraItem);
										AppSettings.getLog().log(Level.SEVERE, e.getMessage());
										
										tq.setStatus((TaskStatus) ReferenceType.getElement("Failed", TaskStatus.tableName()));
										// exception if abHelper not connected
										//tq.setTimeFinished(abHelper.getJobExecTime(tq.getBatchId().intValue()));
										///////////
										
										jh.commentIssue(issue, tq.getCompany() + ": Failed. Error: " + e.getMessage());
										
										if (TaskQueue.countQueuedSubTasks(jiraItem, AppSettings.getPREF_ACTIVE_INSTANCE_INST()) <= 1) {
											jh.resolveIssue(issue, false, "Workflow failed");
										}								
										
										
										continue;
									};
									
									tq.setBatchId(Long.valueOf(ABId));
									tq.setTimeStarted(new Date());
									tq.setStatus((TaskStatus)ReferenceType.getElement("In Progress", TaskStatus.tableName()));
									
									
			
									
								} else {
									tq.setStatus((TaskStatus)ReferenceType.getElement("Cancelled", TaskStatus.tableName()));
									AppSettings.getLog().log(jiraItem + " was cancelled in JIRA");
								}
								tq.saveElement();
								AppSettings.getLog().log("update");
							}
							else {
								break;
							}
						}
					}
					Thread.sleep(AppSettings.getPREF_JIRA_INTERVAL());
					
//				}
				
//////////////////////////////				
				
				
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
