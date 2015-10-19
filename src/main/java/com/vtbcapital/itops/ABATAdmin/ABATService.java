package com.vtbcapital.itops.ABATAdmin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ABATService {
	
	private ServerSocket serverSocket;
	
	public static void main(String[] args) throws InterruptedException {
		//AppSettings.setLog(new LogConsole(null));
		
		ABATService server = new ABATService();
		
		
		server.listenSocket();
		
		/*
		JiraThread jiraThread = new JiraThread();
		
		jiraThread.start();
		
		ABThread abThread = new ABThread();
		
		abThread.start();
		*/

	}
	
	public void listenSocket() {
		try {
			serverSocket = new ServerSocket(AppSettings.getPREF_SERVER_PORT());
		} catch (IOException e) {
			e.printStackTrace();
			AppSettings.getLog().log(Level.SEVERE, "Could not listen on port " + AppSettings.getPREF_SERVER_PORT());
			return;
		}
		
		while (true) {
			Socket clientSocket = null;
			try {
				clientSocket = serverSocket.accept();
				
			} catch (IOException e) {
				e.printStackTrace();
				AppSettings.getLog().log(Level.SEVERE, "Error accepting client connection");
			}
		}
	}

}
