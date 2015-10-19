package com.vtbcapital.itops.ABATAdmin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import asci.activebatch.enumInstanceState;

public class MonitorView {

	Instances activeInstance;
	DefaultMutableTreeNode topNode;
	SessionObjects sessionObjects;
	
	List<ActiveJob> runningProcesses;

	public MonitorView(Instances activeInstance,
			DefaultMutableTreeNode topNode, SessionObjects sessionObjects) {
		this.activeInstance = activeInstance;
		this.topNode = topNode;
		this.sessionObjects = sessionObjects;
		
		runningProcesses = new ArrayList<ActiveJob>();
		

	}

	public MonitorView(Instances activeInstance, SessionObjects sessionObjects) {
		this.activeInstance = activeInstance;
		this.sessionObjects = sessionObjects;
		
		runningProcesses = new ArrayList<ActiveJob>();

	}

	public ActiveJob createNodes() {
		
		runningProcesses.clear();
		
		ActiveJob root = new ActiveJob("Jobs", 0);

		List<ActiveJob> typeNodes = new ArrayList<ActiveJob>();

		List<Types> typesList = Types.getList(sessionObjects);
		for (Types type : typesList) {
			ActiveJob typeNode = new ActiveJob(type.getTypeName(), 1);

			SortedSet<Jobs> jobsList = type.jobsSorted();

			List<ActiveJob> jobNodes = new ArrayList<ActiveJob>();
			for (Jobs job : jobsList) {
				JobPath jp = job.getJobPath(activeInstance);
				if (jp != null && !jp.getPath().equals("")) {
					// ActiveJob jobNode = new ActiveJob(job.getJobName() +
					// " ("+jp.getPath()+")");
					ActiveJob jobNode = new ActiveJob(job.getJobName(), 2);

					List<ActiveJob> jobHistNodes = AppSettings.getAbHelper()
							.getJobHistory(job, jp.getPath(), 3);
					
					// fill running list
					for (ActiveJob aj : jobHistNodes) {
						if (aj.getState() == enumInstanceState.abatIS_Executing) {
							if (!runningProcesses.contains(aj)) {
								runningProcesses.add(aj);
							}
						}
					}
					

					jobNode.setChildren(jobHistNodes);
					jobNodes.add(jobNode);

				}

			}
			typeNode.setChildren(jobNodes);

			typeNodes.add(typeNode);
		}
		root.setChildren(typeNodes);

		return root;
	}
	
	public List<ActiveJob> getActiveJobs() {
		return runningProcesses;
		
		
	}

}
