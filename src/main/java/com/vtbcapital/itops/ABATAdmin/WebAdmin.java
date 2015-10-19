package com.vtbcapital.itops.ABATAdmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class WebAdmin {
	
	public WebAdmin() {
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				ServerSocket ss;
				try {
					ss = new ServerSocket(AppSettings.getPREF_WEBADMIN_PORT());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				}
				while (true) {
					try {
						Socket s = ss.accept();
						new Thread(new WebAdminProcessor(s)).start();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
				
			}
		}).start();
	}

	private static class WebAdminProcessor implements Runnable {
		private Socket s;
		private InputStream is;
		private OutputStream os;
		
		private WebAdminProcessor(Socket s) throws Throwable {
			this.s = s;
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
		}
		

		@Override
		public void run() {
            try {
                readInputHeaders();
                writeResponse("<html><body><h1>Hello from Habrahabr</h1></body></html>");
            } catch (Throwable t) {
                /*do nothing*/
            } finally {
                try {
                    s.close();
                } catch (Throwable t) {
                    /*do nothing*/
                }
            }
            System.err.println("Client processing finished");
			
		}
		
        private void writeResponse(String s) throws Throwable {
            String response = "HTTP/1.1 200 OK\r\n" +
                    "Server: YarServer/2009-09-09\r\n" +
                    "Content-Type: text/html\r\n" +
                    "Content-Length: " + s.length() + "\r\n" +
                    "Connection: close\r\n\r\n";
            String result = response + s;
            os.write(result.getBytes());
            os.flush();
        }

        private void readInputHeaders() throws Throwable {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while(true) {
                String s = br.readLine();
                if(s == null || s.trim().length() == 0) {
                    break;
                }
            }
        }
        
    	private void createModel() {
    		SessionObjects so = AppSettings.getSessionObjects();
    		Session session = so.getFactory().openSession();
    		Transaction tx = null;
    		Query taskQueue = null;
    		List<TaskQueue> list;

    		try {
    			tx = session.beginTransaction();
    			taskQueue = session.createQuery("FROM TaskQueue ORDER BY TimeQueued DESC");
    			list = taskQueue.list();

    		} catch (HibernateException e) {
    			if (tx != null) {
    				tx.rollback();
    				e.printStackTrace();
    			}
    		} finally {
    			session.close();
    		}


    	}
		
		
	}
}
