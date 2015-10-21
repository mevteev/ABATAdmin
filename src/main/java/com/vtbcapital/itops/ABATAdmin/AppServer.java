package com.vtbcapital.itops.ABATAdmin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

public class AppServer {
	
	protected int 			serverPort;
	protected ServerSocket 	serverSocket = null;
	protected boolean 		isStopped = false;
	protected Thread 		runningThread = null;
	
	
	private JiraThread 		jiraThread;
	private ABThread 		abThread;
	
	private ABHelper		abHelper;
	
	protected Socket clientSocket = null;
	
	private Set<String> clients;
	
	public AppServer(int port) {
		
		AppSettings.setLog(new LogConsole(this));
		AppSettings.setAbHelper(new ABHelper());
		
		abHelper = AppSettings.getAbHelper();
		abHelper.connect(AppSettings.getPREF_ACTIVE_INSTANCE_INST());
		
		clients = new HashSet<String>();
		
		//new WebAdmin();
		
		setJiraThread(new JiraThread());
		setAbThread(new ABThread());

		this.serverPort = port;
		
		try {
			serverSocket = new ServerSocket(port);
		} catch(IOException ioe) { 
            AppSettings.getLog().log(Level.SEVERE, "Could not create server socket on port " + port); 
            System.exit(-1); 
        }
		
		while (!isStopped()) {
			try {
				//waiting for a client
				//accept incoming connections
				Socket clientSocket = serverSocket.accept();
				
				AppServerWorker cliThread = new AppServerWorker(clientSocket, this);
				new Thread(cliThread).start();
			} catch(IOException e) { 
				//AppSettings.getLog().log(Level.SEVERE, "Exception encountered on accept. Ignoring. Stack Trace :"); 
                //e.printStackTrace(); 
            } 

		}
		
		try {
			serverSocket.close();
			AppSettings.getLog().log("Server stopped");
		} catch(Exception ioe) { 
            AppSettings.getLog().log(Level.SEVERE, "Problem stopping server socket"); 
            System.exit(-1); 
        } 


	}

	
	private synchronized boolean isStopped() {

		return this.isStopped;
		
	}
	
	public synchronized void stop() {
		this.isStopped = true;
		try {
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	



	public JiraThread getJiraThread() {
		return jiraThread;
	}


	public void setJiraThread(JiraThread jiraThread) {
		this.jiraThread = jiraThread;
	}


	public ABThread getAbThread() {
		return abThread;
	}


	public void setAbThread(ABThread abThread) {
		this.abThread = abThread;
	}
	
	
	public void jiraStart() {
		jiraStop();
		jiraThread = new JiraThread();
		
		jiraThread.start();
	}
	
	public void jiraStop() {
		if (jiraThread != null && jiraThread.isAlive())
			jiraThread.interrupt();
	}
	
	public void queueStart() {
		queueStop();
		abThread = new ABThread();
		
		
		abThread.start();
	}
	
	public void queueStop() {
		if (abThread != null && abThread.isAlive())
			abThread.interrupt();
	}
	
	public String getStatusString() {
		String status = "JiraThread:";
		if (jiraThread != null && jiraThread.isAlive()) {
			status += "1";
		} else {
			status += "0";
		}
		status += ";ABThread:";
		if (abThread != null && abThread.isAlive()) {
			status += "1";
		} else {
			status += "0";
		}
		return status;
		
	}
	
	public void readSettings() {
		AppSettings.ReadSettings();
		AppSettings.getLog().log("New settings have been read");
	}

	
	public static void main(String[] args) {
		new AppServer(AppSettings.getPREF_SERVER_PORT());
		System.exit(-1);
	}


	public Set<String> getClients() {
		return clients;
	}


	public void setClients(Set<String> clients) {
		this.clients = clients;
	}
	
	
	
}
