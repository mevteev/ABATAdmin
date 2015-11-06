package com.vtbcapital.itops.ABATAdmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class AppServerWorker implements Runnable {
	
	Socket clientSocket;
	AppServer appServer;
	boolean isRunning = true;
	
	
	public AppServerWorker(Socket s, AppServer appServer) {
		this.clientSocket = s;
		this.appServer = appServer;
	}

	@Override
	public void run() {
		BufferedReader in = null;
		PrintWriter out = null;
		
		//AppSettings.getLog().log("Accepted Client Address - " + clientSocket.getInetAddress().getHostName());
		appServer.getClients().add(clientSocket.getInetAddress().getHostName());
		
		try {
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			
			//while (isRunning) {
				//read incoming stream
				String clientCommand = in.readLine();
				if (clientCommand != null) {
				
					//System.out.println("Client Says :" + clientCommand);
					
					//client closes
					if(clientCommand.equalsIgnoreCase("quit")) {
						isRunning = false;
						AppSettings.getLog().log("Stopping client thread for client : " + clientSocket.getInetAddress().getHostName());
						appServer.getClients().remove(clientSocket.getInetAddress().getHostName());
					}
					if (clientCommand.equalsIgnoreCase("status")) {
						out.println(appServer.getStatusString());
						out.flush();
					}
					
					if (clientCommand.equalsIgnoreCase("jirastart")) {
						System.out.println("Jira start");
						appServer.jiraStart();
					}
					
					if (clientCommand.equalsIgnoreCase("jirastop")) {
						System.out.println("Jira stop");
						appServer.jiraStop();
					}
	
					if (clientCommand.equalsIgnoreCase("abstart")) {
						appServer.queueStart();
					}
					
					if (clientCommand.equalsIgnoreCase("abstop")) {
						appServer.queueStop();
					}
					
					if (clientCommand.equalsIgnoreCase("stop")) {
						System.out.println("Stopping server");
						isRunning = false;
						appServer.stop();
					}
					
					if (clientCommand.equalsIgnoreCase("readsettings")) {
						appServer.readSettings();
					}
				//}
				
			}
		} catch (Exception e) {
			//AppSettings.getLog().log(e.getMessage());
			e.printStackTrace();
		} finally {
			// clean up
			try {
				in.close();
				out.close();
				//clientSocket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
