package com.vtbcapital.itops.ABATAdmin;

import java.util.List;

import com.atlassian.jira.rest.client.domain.Issue;

public class JiraThread extends Thread {
	
	@Override
	public void run() {
		JiraHelper jh = new JiraHelper(null);
		List<Issue> li;
		
		AppSettings.getLog().log("Jira listener started");
		jh.connect();
		
		while (!Thread.currentThread().isInterrupted()) {
			try {
				//get opened issues
				li = jh.getOpenedIssue();
				if (li != null) {
				
					for (Issue issue : li) {
						//queue issue
						if (jh.queueIssue(issue)) {
							jh.startIssue(issue);
						} else {
							jh.startIssue(issue);
							jh.progressIssue(issue);
							jh.resolveIssue(issue, false, "Failed");
						}

						
						//System.out.println(issue.getKey());
						AppSettings.getLog().log("update");
					}
				}
				
				Thread.sleep(AppSettings.getPREF_JIRA_INTERVAL());
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				AppSettings.getLog().log("Jira listener stopped");
				return;
			} finally {
				
			}
		}
		
		AppSettings.getLog().log("Jira listener stopped");
		
	}

}
