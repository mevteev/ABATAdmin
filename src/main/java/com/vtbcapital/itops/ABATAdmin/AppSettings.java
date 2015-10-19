package com.vtbcapital.itops.ABATAdmin;

import java.awt.Cursor;
import java.util.List;

import javax.swing.JFrame;

import com.google.common.io.BaseEncoding;

public class AppSettings {

	final private static String PREF_JIRA_URL_NAME = "Jira_URL";
	final private static String PREF_JIRA_PROJECT_NAME = "Jira_Project";
	final private static String PREF_ACTIVE_INSTANCE_NAME = "Active_instance";
	final private static String PREF_JIRA_INTERVAL_NAME = "Jira_interval";
	final private static String PREF_JIRA_USERNAME_NAME = "Jira_UserName";
	final private static String PREF_JIRA_PASSWORD_NAME = "Jira_Password";
	final private static String PREF_SERVER_NAME = "App_Server";
	final private static String PREF_SERVER_PORT_NAME = "App_Server_Port";
	final private static String PREF_LOGGER_PORT_NAME = "App_Logger_Port";
	final private static String PREF_WEBADMIN_PORT_NAME = "Web_Admin_Port";
	final private static String PREF_MAX_PARALLEL_JOBS_NAME = "Max_Parallel_Jobs";

	final private static String defaultValue = "";
	final private static String defaultInstance = "UAT";
	final private static Integer defaultJiraInterval = 1 * 1000 * 60;
	final private static Integer defaultServerPort = 6666;
	final private static Integer defaultLoggerPort = 6667;
	final private static Integer defaultWebAdminPort = 8080;
	final private static Integer defaultMaxParallelJobs = 4;
	
	private static String PREF_JIRA_URL;
	private static String PREF_JIRA_PROJECT;
	private static String PREF_ACTIVE_INSTANCE;
	private static Instances PREF_ACTIVE_INSTANCE_INST;
	private static Integer PREF_JIRA_INTERVAL;
	private static Integer PREF_MAX_PARALLEL_JOBS;
	
	private static String PREF_JIRA_USERNAME;
	private static String PREF_JIRA_PASSWORD;
	
	private static String PREF_SERVER;
	private static Integer PREF_SERVER_PORT;
	private static Integer PREF_LOGGER_PORT;
	private static Integer PREF_WEBADMIN_PORT;
	
	public static enum EnShowTasks {
		AllTasks,
		MyTasks,
		Top100Tasks
	}
	
	private static EnShowTasks showTasks;


	
	private static SessionObjects sessionObjects;
	
	final private static String APPLICATION_TITLE = "Active Batch Trigger Administration";

	private static int countHistory = 5;

	private static Instances activeInstance;

	private static List<Instances> instList;

	private static JFrame frmApplication;

	private static int instanceId;

	private static ABHelper abHelper;
	
	private static LogConsole log;

	static {
		sessionObjects = new SessionObjects();
		ReadSettings();
		//setAbHelper(new ABHelper());
		
	}
	

	public static void ReadSettings() {
		PREF_JIRA_URL = Config.getValue(PREF_JIRA_URL_NAME);
		if (PREF_JIRA_URL == null) {
			setPREF_JIRA_URL(defaultValue);
		}
		
		PREF_JIRA_PROJECT = Config.getValue(PREF_JIRA_PROJECT_NAME);
		if (PREF_JIRA_PROJECT == null) {
			setPREF_JIRA_PROJECT(defaultValue);
		}
		
		PREF_ACTIVE_INSTANCE = Config.getValue(PREF_ACTIVE_INSTANCE_NAME);
		if (PREF_ACTIVE_INSTANCE == null) {
			setPREF_ACTIVE_INSTANCE(defaultInstance);
		}
		PREF_ACTIVE_INSTANCE_INST = (Instances) ReferenceType.getElement(PREF_ACTIVE_INSTANCE, Instances.tableName());
		
		String intervalStr = Config.getValue(PREF_JIRA_INTERVAL_NAME);
		if (intervalStr == null) {
			setPREF_JIRA_INTERVAL(defaultJiraInterval);
		} else {
			try {
				PREF_JIRA_INTERVAL = Integer.parseInt(intervalStr);	
			} catch (NumberFormatException e) {
				setPREF_JIRA_INTERVAL(defaultJiraInterval);
			}
		}
		
		String parallelStr = Config.getValue(PREF_MAX_PARALLEL_JOBS_NAME);
		if (parallelStr == null) {
			setPREF_MAX_PARALLEL_JOBS(defaultMaxParallelJobs);
		} else {
			try {
				PREF_MAX_PARALLEL_JOBS = Integer.parseInt(parallelStr);	
			} catch (NumberFormatException e) {
				setPREF_MAX_PARALLEL_JOBS(defaultMaxParallelJobs);
			}
		}
		
		PREF_JIRA_USERNAME = Config.getValue(PREF_JIRA_USERNAME_NAME);
		if (PREF_JIRA_USERNAME == null) {
			setPREF_JIRA_USERNAME(defaultValue);
		}
		
		PREF_JIRA_PASSWORD = Config.getValue(PREF_JIRA_PASSWORD_NAME);
		if (PREF_JIRA_PASSWORD == null) {
			setPREF_JIRA_PASSWORD(defaultValue);
		}
		
		PREF_JIRA_PASSWORD = new String(BaseEncoding.base64().decode(PREF_JIRA_PASSWORD));
		
		PREF_SERVER = Config.getValue(PREF_SERVER_NAME);
		if (PREF_SERVER == null) {
			setPREF_SERVER("localhost");
		}
		
		String portStr = Config.getValue(PREF_SERVER_PORT_NAME);
		if (portStr == null) {
			setPREF_SERVER_PORT(defaultServerPort);
		} else {
			try {
				PREF_SERVER_PORT = Integer.parseInt(portStr);	
			} catch (NumberFormatException e) {
				setPREF_SERVER_PORT(defaultServerPort);
			}
		}
		
		String loggerPortStr = Config.getValue(PREF_LOGGER_PORT_NAME);
		if (loggerPortStr == null) {
			setPREF_LOGGER_PORT(defaultLoggerPort);
		} else {
			try {
				PREF_LOGGER_PORT = Integer.parseInt(loggerPortStr);	
			} catch (NumberFormatException e) {
				setPREF_LOGGER_PORT(defaultLoggerPort);
			}
		}
		
		String webAdminPortStr = Config.getValue(PREF_WEBADMIN_PORT_NAME);
		if (webAdminPortStr == null) {
			setPREF_WEBADMIN_PORT(defaultWebAdminPort);
		} else {
			try {
				PREF_WEBADMIN_PORT = Integer.parseInt(webAdminPortStr);	
			} catch (NumberFormatException e) {
				setPREF_WEBADMIN_PORT(defaultWebAdminPort);
			}
		}
	}

	public static int getInstanceId() {
		return instanceId;
	}

	public static void setInstanceId(int instanceId) {
		AppSettings.instanceId = instanceId;
	}

	public static String getApplicationTitle() {
		return APPLICATION_TITLE;
	}

	public static Instances getActiveInstance() {
		return activeInstance;
	}

	public static void setActiveInstance(Instances activeInstance) {

		AppSettings.activeInstance = activeInstance;
		frmApplication.setTitle(APPLICATION_TITLE + " - "
				+ activeInstance.getInstanceName());

		frmApplication.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		getAbHelper().connect(activeInstance);
		frmApplication.setCursor(Cursor.getDefaultCursor());
		
	}

	public static JFrame getFrmApplication() {
		return frmApplication;
	}

	public static void setFrmApplication(JFrame frmApplication) {
		AppSettings.frmApplication = frmApplication;
	}

	public static List<Instances> getInstList() {
		return instList;
	}

	public static void setInstList(List<Instances> instList) {
		AppSettings.instList = instList;
	}

	public static ABHelper getAbHelper() {
		return abHelper;
	}

	public static void setAbHelper(ABHelper abHelper) {
		AppSettings.abHelper = abHelper;
	}

	public static int getCountHistory() {
		return countHistory;
	}

	public static void setCountHistory(int countHistory) {
		AppSettings.countHistory = countHistory;
	}

	public static String getPREF_JIRA_URL() {
		return PREF_JIRA_URL;
	}

	public static void setPREF_JIRA_URL(String pREF_JIRA_URL) {
		PREF_JIRA_URL = pREF_JIRA_URL;
		Config.setValue(PREF_JIRA_URL_NAME, pREF_JIRA_URL);
		//SaveSettings();
	}

	public static String getPREF_JIRA_PROJECT() {
		return PREF_JIRA_PROJECT;
	}

	public static void setPREF_JIRA_PROJECT(String pREF_JIRA_PROJECT) {
		PREF_JIRA_PROJECT = pREF_JIRA_PROJECT;
		Config.setValue(PREF_JIRA_PROJECT_NAME, pREF_JIRA_PROJECT);
		//SaveSettings();
	}
	
	public static String getPREF_ACTIVE_INSTANCE() {
		return PREF_ACTIVE_INSTANCE;
	}

	public static void setPREF_ACTIVE_INSTANCE(String pREF_ACTIVE_INSTANCE) {
		PREF_ACTIVE_INSTANCE = pREF_ACTIVE_INSTANCE;
		PREF_ACTIVE_INSTANCE_INST = (Instances) ReferenceType.getElement(PREF_ACTIVE_INSTANCE, Instances.tableName());
		Config.setValue(PREF_ACTIVE_INSTANCE_NAME, pREF_ACTIVE_INSTANCE);
		//SaveSettings();
	}

	public static Integer getPREF_JIRA_INTERVAL() {
		return PREF_JIRA_INTERVAL;
	}

	public static void setPREF_JIRA_INTERVAL(Integer pREF_JIRA_INTERVAL) {
		PREF_JIRA_INTERVAL = pREF_JIRA_INTERVAL;
		Config.setValue(PREF_JIRA_INTERVAL_NAME, pREF_JIRA_INTERVAL.toString());
		//SaveSettings();
	}

	public static LogConsole getLog() {
		return log;
	}

	public static void setLog(LogConsole log) {
		AppSettings.log = log;
	}

	public static Instances getPREF_ACTIVE_INSTANCE_INST() {
		return PREF_ACTIVE_INSTANCE_INST;
	}

	public static void setPREF_ACTIVE_INSTANCE_INST(
			Instances pREF_ACTIVE_INSTANCE_INST) {
		PREF_ACTIVE_INSTANCE_INST = pREF_ACTIVE_INSTANCE_INST;
	}

	public static String getPREF_JIRA_USERNAME() {
		return PREF_JIRA_USERNAME;
	}

	public static void setPREF_JIRA_USERNAME(String pREF_JIRA_USERNAME) {
		PREF_JIRA_USERNAME = pREF_JIRA_USERNAME;
		Config.setValue(PREF_JIRA_USERNAME_NAME, PREF_JIRA_USERNAME);
	}

	public static String getPREF_JIRA_PASSWORD() {
		return PREF_JIRA_PASSWORD;
	}

	public static void setPREF_JIRA_PASSWORD(String pREF_JIRA_PASSWORD) {
		PREF_JIRA_PASSWORD = pREF_JIRA_PASSWORD;
		Config.setValue(PREF_JIRA_PASSWORD_NAME, BaseEncoding.base64().encode(PREF_JIRA_PASSWORD.getBytes()));
		

	}

	public static SessionObjects getSessionObjects() {
		return sessionObjects;
	}

	public static void setSessionObjects(SessionObjects sessionObjects) {
		AppSettings.sessionObjects = sessionObjects;
	}

	public static String getPREF_SERVER() {
		return PREF_SERVER;
	}

	public static void setPREF_SERVER(String pREF_SERVER) {
		PREF_SERVER = pREF_SERVER;
		Config.setValue(PREF_SERVER_NAME, pREF_SERVER);
	}

	public static Integer getPREF_SERVER_PORT() {
		return PREF_SERVER_PORT;
	}

	public static void setPREF_SERVER_PORT(Integer pREF_SERVER_PORT) {
		PREF_SERVER_PORT = pREF_SERVER_PORT;
		Config.setValue(PREF_SERVER_PORT_NAME, pREF_SERVER_PORT.toString());
	}

	public static Integer getPREF_LOGGER_PORT() {
		return PREF_LOGGER_PORT;
	}

	public static void setPREF_LOGGER_PORT(Integer pREF_LOGGER_PORT) {
		PREF_LOGGER_PORT = pREF_LOGGER_PORT;
		Config.setValue(PREF_LOGGER_PORT_NAME, pREF_LOGGER_PORT.toString());
	}

	public static Integer getPREF_WEBADMIN_PORT() {
		return PREF_WEBADMIN_PORT;
	}

	public static void setPREF_WEBADMIN_PORT(Integer pREF_WEBADMIN_PORT) {
		PREF_WEBADMIN_PORT = pREF_WEBADMIN_PORT;
		Config.setValue(PREF_WEBADMIN_PORT_NAME, pREF_WEBADMIN_PORT.toString());
	}

	public static EnShowTasks getShowTasks() {
		return showTasks;
	}

	public static void setShowTasks(EnShowTasks showTasks) {
		AppSettings.showTasks = showTasks;
	}

	public static Integer getPREF_MAX_PARALLEL_JOBS() {
		return PREF_MAX_PARALLEL_JOBS;
	}

	public static void setPREF_MAX_PARALLEL_JOBS(Integer pREF_MAX_PARALLEL_JOBS) {
		PREF_MAX_PARALLEL_JOBS = pREF_MAX_PARALLEL_JOBS;
	}

}
