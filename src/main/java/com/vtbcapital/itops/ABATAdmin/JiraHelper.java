package com.vtbcapital.itops.ABATAdmin;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;




import java.util.logging.Level;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.atlassian.jira.rest.client.JiraRestClient;
import com.atlassian.jira.rest.client.NullProgressMonitor;
import com.atlassian.jira.rest.client.auth.BasicHttpAuthenticationHandler;
import com.atlassian.jira.rest.client.domain.BasicIssue;
import com.atlassian.jira.rest.client.domain.Comment;
import com.atlassian.jira.rest.client.domain.Issue;
import com.atlassian.jira.rest.client.domain.SearchResult;
import com.atlassian.jira.rest.client.domain.Transition;
import com.atlassian.jira.rest.client.domain.input.ComplexIssueInputFieldValue;
import com.atlassian.jira.rest.client.domain.input.FieldInput;
import com.atlassian.jira.rest.client.domain.input.TransitionInput;
import com.atlassian.jira.rest.client.internal.jersey.JerseyJiraRestClientFactory;

public class JiraHelper /*implements Runnable*/ {
	
	private String serverPath;
	private String userName;
	private String password;
	private JiraRestClient restClient;
	
	private static String OPEN_TRANSITION = "Open";
	private static String QUEUE_TRANSITION = "Queue task";
	private static String IN_PROGRESS_TRANSITION = "Task in progress";
	private static String SUCCEEDED_TRANSITION = "Task succeeded";
	private static String FAILED_TRANSITION = "Task failed";
	private static String RESTARTED_TRANSITION = "Restarted";
	
	
	//for some reason jira returns yesterday date
	//so we need add 1 day to parameter
	final private static int dateShift = 0;
	
	private TaskQueueModel tqm;
	
	public JiraHelper(TaskQueueModel tqm) {
		setServerPath(AppSettings.getPREF_JIRA_URL());
		setUserName(AppSettings.getPREF_JIRA_USERNAME());
		setPassword(AppSettings.getPREF_JIRA_PASSWORD());
		
	
		restClient = null;
		
		this.tqm = tqm;
	}
	
	public void connect() {
		JerseyJiraRestClientFactory factory = new JerseyJiraRestClientFactory();
		URI jiraServerUri = null;
		try {
			jiraServerUri = new URI(getServerPath());
		} catch (URISyntaxException e) {
			AppSettings.getLog().log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}
		
		BasicHttpAuthenticationHandler authenticationHandler = new BasicHttpAuthenticationHandler(getUserName(), getPassword());
		
		restClient = factory.create(jiraServerUri, authenticationHandler);
		
	}
	
	public Issue getIssue(String id) {
		if (restClient != null) {
			try {
				NullProgressMonitor pm = new NullProgressMonitor();
				Issue issue = restClient.getIssueClient().getIssue(id, pm);
				return issue;
			} catch (Exception e) {
				e.printStackTrace();
				AppSettings.getLog().log(Level.SEVERE, e.getMessage());
				return null;				
			}
		}
		return null;
		
	}
	
	public String getIssueInfo(Issue issue) {
		String issueType = issue.getIssueType().getName();
		try {
			return issue.getKey() + " " + 
					((JSONObject) issue.getFieldByName("Job - " + issueType).getValue()).getString("value") //+ ":" + 
					//((JSONArray) issue.getFieldByName("Company - " + issueType).getValue()).toString();
					;
		} catch (JSONException e) {
			e.printStackTrace();
			return issue.getKey();
		}
				
	}
	
	public List<Issue> getOpenedIssue() {
		List<Issue> listIssue = new ArrayList<Issue>();
		String jql = "project = " + AppSettings.getPREF_JIRA_PROJECT() +" AND status in (" + OPEN_TRANSITION + "," + RESTARTED_TRANSITION + ") ORDER BY created ASC";
		//System.out.println(jql);
		if (restClient != null) {
			try {
				NullProgressMonitor pm = new NullProgressMonitor();
				SearchResult sr = restClient.getSearchClient().searchJql(jql, pm);
				for (BasicIssue issue : sr.getIssues()) {
					//System.out.println(issue.getKey());
					Issue issue_ = getIssue(issue.getKey());
					//AppSettings.getLog().log("Opened issue: " + getIssueInfo(issue_));
					listIssue.add(issue_);
				}
			} catch (Exception e) {
				e.printStackTrace();
				AppSettings.getLog().log(Level.SEVERE, e.getMessage());
				return null;				
			}
			
		}
		return listIssue;
	}
	
	public String getIssueStatus(Issue issue) {
		return issue.getStatus().getName();
	}
	
	public boolean queueIssue(Issue issue) {
		String companyName = "";
		String jobName = "";
		//create TaskQueue
		
		
		try {
			//retrieve issue type 
			String issueType = issue.getIssueType().getName();
			//Retrieve Company
			
			
			
			//for single value list 
			//ArrayList<JSONObject> compArray = new ArrayList<JSONObject>();
			//JSONObject companyJson = (JSONObject) issue.getFieldByName("Company - " + issueType).getValue();
			//compArray.add(companyJson);
			
			JSONArray compArray = (JSONArray) issue.getFieldByName("Company - " + issueType).getValue();
			
			//if we will change company to list

			//Retrieve Job Type
			//JSONObject jobType = (JSONObject) issue.getFieldByName("Job Type").getValue();
			//Retrieve Job
			JSONObject job = (JSONObject) issue.getFieldByName("Job - " + issueType).getValue();
			jobName = job.getString("value");

			//Retrieve Date Start
			String dateStart = (String) issue.getFieldByName("Date Start").getValue();

			//Retrieve Date End
			String dateEnd = (String) issue.getFieldByName("Date End").getValue();
			
			//Retrieve Implementation time
			String timeImpl = (String) issue.getFieldByName("Implementation time").getValue();
			
			

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date startDate;
			Date endDate;
			try {
				startDate = formatter.parse(dateStart);
				endDate = formatter.parse(dateEnd);
				
				Calendar cal = Calendar.getInstance();
				cal.setTime(startDate);
				cal.add(Calendar.DATE, dateShift);
				
				startDate = cal.getTime();
				
				cal.setTime(endDate);
				cal.add(Calendar.DATE, dateShift);
				
				endDate = cal.getTime();
			}
			catch (ParseException e) {
				e.printStackTrace();
				AppSettings.getLog().log(Level.SEVERE, e.getMessage());
				return false;
			}
			
			formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date implementationTime;
			try {
				implementationTime = formatter.parse(timeImpl);
				
				Calendar cal = Calendar.getInstance();
				cal.setTime(implementationTime);
				cal.add(Calendar.DATE, dateShift);
				
				implementationTime = cal.getTime();
				
			}
			catch (ParseException e) {
				e.printStackTrace();
				AppSettings.getLog().log(Level.SEVERE, e.getMessage());
				return false;
			}
			
			for (int i = 0; i < compArray.length(); i++) {
				
				JSONObject company = (JSONObject) compArray.get(i);
				companyName = company.getString("value");
				
				Companies companyRef = (Companies) ReferenceType.getElement(companyName.trim(), Companies.tableName());
				if (companyRef == null) {
					String errorStr = "Company " + companyName + " not found in database";
					commentIssue(issue, errorStr);
					AppSettings.getLog().log(Level.SEVERE, errorStr);
					return false;
				}
				
				
				TaskQueue tq = new TaskQueue();

				
				tq.setCompany((Companies) ReferenceType.getElement(companyName.trim(), Companies.tableName()));
				tq.setJob((Jobs) ReferenceType.getElement(jobName, Jobs.tableName()));
				tq.setInstance((Instances)ReferenceType.getElement(AppSettings.getPREF_ACTIVE_INSTANCE(), Instances.tableName()));

			
				tq.setUserName(issue.getReporter().getName());
				tq.setJiraItem(issue.getKey());
				
				tq.setStartDate(startDate) ;
				tq.setEndDate(endDate) ;
				
				//tq.setTimeQueued(new Date());
				tq.setTimeQueued(implementationTime);
				
				tq.setStatus((TaskStatus)ReferenceType.getElement("Queued", TaskStatus.tableName()));
				
				if (tqm != null) {
					tqm.addRow(tq);
				} else	{
					tq.saveElement();
				}
			}
			
			AppSettings.getLog().log("Queued issue: " + getIssueInfo(issue));
		
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			AppSettings.getLog().log(Level.SEVERE, e.getMessage());
			return false;
		}
		
		

		return true;
		
	}
	
	public boolean startIssue(Issue issue) {
		NullProgressMonitor pm = new NullProgressMonitor();
		if (restClient != null) {
			final Iterable<Transition> transitions = restClient.getIssueClient().getTransitions(issue.getTransitionsUri(), pm);
			final Transition startProgressTransition = getTransitionByName(transitions, QUEUE_TRANSITION);
			if (startProgressTransition != null) {
				restClient.getIssueClient().transition(issue.getTransitionsUri(), new TransitionInput(startProgressTransition.getId()), pm);
				//AppSettings.getLog().log("Started issue :" + issue.getKey());
				return true;
			} else {
				AppSettings.getLog().log(Level.SEVERE, QUEUE_TRANSITION + " transition not found");
			}
		}
		return false;
	}
	
	public boolean progressIssue(Issue issue) {
		NullProgressMonitor pm = new NullProgressMonitor();
		if (restClient != null) {
			final Iterable<Transition> transitions = restClient.getIssueClient().getTransitions(issue.getTransitionsUri(), pm);
			final Transition startProgressTransition = getTransitionByName(transitions, IN_PROGRESS_TRANSITION);
			if (startProgressTransition != null) {
				restClient.getIssueClient().transition(issue.getTransitionsUri(), new TransitionInput(startProgressTransition.getId()), pm);
				//AppSettings.getLog().log("Started issue :" + issue.getKey());
				return true;
			} else {
				//AppSettings.getLog().log(Level.SEVERE, IN_PROGRESS_TRANSITION + " transition not found");
			}
		}
		return false;
	}
	
	public void resolveIssue(Issue issue, boolean success, String comment) {
		NullProgressMonitor pm = new NullProgressMonitor();
		if (restClient != null) {
			final Iterable<Transition> transitions = restClient.getIssueClient().getTransitions(issue.getTransitionsUri(), pm);
			Transition resolveIssueTransition; 
			if (success) {
				resolveIssueTransition = getTransitionByName(transitions, SUCCEEDED_TRANSITION);
			}
			else {
				resolveIssueTransition = getTransitionByName(transitions, FAILED_TRANSITION);
			}
					
			
			
			if (resolveIssueTransition != null) {
				String fieldVal;
				if (success) {
					fieldVal = "Fixed";
				} else {
					fieldVal = "Won't Fix";
				}
				
				//Collection<FieldInput> fieldInputs = Arrays.asList(new FieldInput("resolution", fieldVal));
				
				final List<FieldInput> fieldInputs = Arrays.asList(new FieldInput("resolution",
				        ComplexIssueInputFieldValue.with("name", fieldVal)));
				
				final List<FieldInput> fieldInputsEmpty = new ArrayList<FieldInput>(0);
				
				
				
		        
		        
		        if (success) {
		        	final TransitionInput transitionInput = new TransitionInput(resolveIssueTransition.getId(), fieldInputs, Comment.valueOf(comment));
		        	restClient.getIssueClient().transition(issue.getTransitionsUri(), transitionInput, pm);
		        	AppSettings.getLog().log("Resolved issue: " + getIssueInfo(issue));
		        } else {
		        	final TransitionInput transitionInput = new TransitionInput(resolveIssueTransition.getId(), fieldInputsEmpty, Comment.valueOf(comment));
		        	restClient.getIssueClient().transition(issue.getTransitionsUri(), transitionInput, pm);
		        	AppSettings.getLog().log("Failed issue: " + getIssueInfo(issue));
		        	
		        }
				

			} else {
				AppSettings.getLog().log(Level.SEVERE, "Resolved transition not found");
			}
		}
	}
	
	public void commentIssue(Issue issue, String comment) {
		NullProgressMonitor pm = new NullProgressMonitor();
		if (restClient != null) {
			restClient.getIssueClient().addComment(pm, issue.getCommentsUri(), Comment.valueOf(comment));
		}
	}
	
	private static Transition getTransitionByName(Iterable<Transition> transitions, String transitionName) {
		for (Transition transition : transitions) {
			if (transition.getName().equals(transitionName)) {
				return transition;
			}
		}
		return null;
	}
	
	
	//reading opened jira items, set status = start progress and add item to the queue 
//	@Override
//	public void run() {
//		AppSettings.getLog().log("Jira listener started");
//		connect();
//		while (!Thread.currentThread().isInterrupted()) {
//			try {
//				//get opened issues
//				
//				List<Issue> li = getOpenedIssue();
//				if (li == null) {
//					throw new InterruptedException();
//				}
//
//				for (Issue issue : li) {
//					//queue issue
//					if (queueIssue(issue)) {
//						startIssue(issue);
//					} else {
//						progressIssue(issue);
//						resolveIssue(issue, false, "Failed");
//					}
//					
//					//System.out.println(issue.getKey());
//				}
//				
//				Thread.sleep(AppSettings.getPREF_JIRA_INTERVAL());
//			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();
//				break;
//			} finally {
//				
//			}
//		}
//		
//		AppSettings.getLog().log("Jira listener stopped");
//		
//	}

	public String getServerPath() {
		return serverPath;
	}

	public void setServerPath(String serverPath) {
		this.serverPath = serverPath;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
//	private String getCustomStringField(Issue issue, String fieldName)
	



}
