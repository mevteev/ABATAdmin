package com.vtbcapital.itops.ABATAdmin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class LogConsole implements Runnable {
	
	//private ArrayList<LogEntry> logs = new ArrayList<LogEntry>();
	private TaskQueueWindow tfLog;
	final private String logFileName = "server.log";
	private File logFile;
	
	private Logger logger;
	private boolean isServer;
	private AppServer appServer;
	
	private DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
	
	public LogConsole(TaskQueueWindow tfLog) {
		this.tfLog = tfLog;
		logger = Logger.getLogger(LogConsole.class.getName());
		
		this.setServer(false);

		logFile = new File(logFileName);
		if (!logFile.exists()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public LogConsole(AppServer appServer) {
		this((TaskQueueWindow)null);
		this.setServer(true);
		this.setAppServer(appServer);
		
		
	}
	
	public synchronized void log(final String info) {
		log(Level.INFO, info);
			
	}
	
	public synchronized void log(Level level, final String info) {
		String infoMsg = info;
		
		if (!info.equals("update")) {
			
			infoMsg = formatter.format(new Date()) + "\t" + info;
			
			logger.log(level, info);
			//logs.add(new LogEntry(new Date(), info));
			if (tfLog != null) {
				Runnable runnable = new Runnable() {
					public void run() {
						tfLog.setLogText(tfLog.getLogText() + formatter.format(new Date()) + "\t" + info + "\r\n");
						
					}
				};
				SwingUtilities.invokeLater(runnable);
			}
			
			try {
				FileWriter  fw = new FileWriter(logFile.getAbsoluteFile(), true);
				BufferedWriter bw = new BufferedWriter(fw);
				
				PrintWriter out = new PrintWriter(fw);
	
				
				out.println(infoMsg);
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//sending log message to clients 
		
		if (isServer()) {
			for (String host : appServer.getClients()) {
				Socket clientSocket;
				PrintWriter outBuffer;
				
				try {
					clientSocket = new Socket(host, AppSettings.getPREF_LOGGER_PORT());
					
					
					
				} catch (UnknownHostException uhe) {
					// Server Host unreachable 
		            AppSettings.getLog().log(Level.SEVERE, "Unknown Host :" + host); 
		            clientSocket = null;
		            return;
				}
		        catch(IOException ioe) 
		        { 
		            // Cannot connect to port on given server host 
		        	///AppSettings.getLog().log(Level.SEVERE, "Can't connect to server at " + AppSettings.getPREF_LOGGER_PORT() + ". " + host + ". Make sure it is running."); 
		            clientSocket = null; 
		        } 
				if (clientSocket == null) {
					return;
				}
				
				
				try {
					outBuffer = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
					outBuffer.println(infoMsg );
					outBuffer.flush();
					outBuffer.close();
					
					clientSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
			
	}

	
	//client listener for log messages from server
	@SuppressWarnings("resource")
	@Override
	public void run() {
		ServerSocket serverSocket; 
		
		try {
			serverSocket = new ServerSocket(AppSettings.getPREF_LOGGER_PORT());
		} catch(IOException ioe) { 
            AppSettings.getLog().log(Level.SEVERE, "Could not create logger socket on port " + AppSettings.getPREF_LOGGER_PORT());
            return;
        }
		
		
		while (true) {
			try {
				//accept incoming connections
				Socket logSocket = serverSocket.accept();
				
				
				BufferedReader in = null;
								
				in = new BufferedReader(new InputStreamReader(logSocket.getInputStream()));
								
				final String logMsg = in.readLine();
				
				if (logMsg.equals("update")) {
					//System.out.println("needs to update table");
					tfLog.updateTable();
				}
				else {
					if (tfLog != null) {
	
						Runnable runnable = new Runnable() {
							public void run() {
								tfLog.setLogText(tfLog.getLogText() + logMsg + "\r\n");
								
							}
						};
						SwingUtilities.invokeLater(runnable);
					}
				}
				
				logSocket.close();
				
			} catch(IOException e) { 
				//AppSettings.getLog().log(Level.SEVERE, "Exception encountered on accept. Ignoring. Stack Trace :"); 
                //e.printStackTrace(); 
            } 
			
		}
		//serverSocket.close();
		
		
	}

	public boolean isServer() {
		return isServer;
	}

	public void setServer(boolean isServer) {
		this.isServer = isServer;
	}

	public AppServer getAppServer() {
		return appServer;
	}

	public void setAppServer(AppServer appServer) {
		this.appServer = appServer;
	}


}
