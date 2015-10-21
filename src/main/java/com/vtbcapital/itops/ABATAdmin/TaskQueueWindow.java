package com.vtbcapital.itops.ABATAdmin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;

import javax.swing.JFrame;
import javax.swing.JTable;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.id.CompositeNestedGeneratedValueGenerator.GenerationContextLocator;

import com.vtbcapital.itops.ABATAdmin.AppSettings.EnShowTasks;

import javax.swing.JScrollPane;

import java.awt.BorderLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JSplitPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.text.DefaultCaret;

import java.awt.event.WindowAdapter;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import java.awt.FlowLayout;

public class TaskQueueWindow implements ActionListener, TableModelListener {

	private JFrame frame;
	private JTable table;
	
	protected Session session;
	protected SessionObjects so;
	protected List<TaskQueue> list;
	protected TaskQueueModel model;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmSettings;
	private JSeparator separator;
	private JMenuItem mntmQuit;
	
	private JiraHelper jiraHelper;
	//private ABHelper abHelper;
	private JTextPane tpLog;
	
	private JMenuItem menuItemCancel;
	private JMenuItem menuItemRestart;
	
	private Socket clientSocket;
	private PrintWriter outBuffer;
	private BufferedReader inBuffer;
	
	private boolean isRunningJira;
	private boolean isRunningAB;
	
	private JButton btnQueueStart;
	private JButton btnJiraStart;
	private JMenu mnReferences;
	private JMenuItem mntmCompanies;
	private JMenuItem mntmJobs;
	private JMenuItem mntmTypes;
	private JMenu mnView;
	private JRadioButtonMenuItem rdbtnmntmAllTasks;
	private JRadioButtonMenuItem rdbtnmntmTopTasks;
	
	private JLabel lblStatusBar;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		AppSettings.getApplicationTitle();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskQueueWindow window = new TaskQueueWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TaskQueueWindow() {
		AppSettings.setShowTasks(EnShowTasks.Top100Tasks);
		
		initialize();
		jiraHelper = new JiraHelper(model);
		AppSettings.setLog(new LogConsole(this));


		
		//if (connect()) {
		
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					while (true) {
						updateStatuses();
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
			}).start();
		//}
		
		new Thread(AppSettings.getLog()).start();
		
		
		
		//abHelper = AppSettings.getAbHelper();
		//abHelper.connect(AppSettings.getPREF_ACTIVE_INSTANCE_INST());
	}

	
	
	private void createModel() {
		so = AppSettings.getSessionObjects();
		session = so.getFactory().openSession();
		Transaction tx = null;
		Query taskQueue = null;

		try {
			tx = session.beginTransaction();
			String query;
			switch (AppSettings.getShowTasks()) {
			case MyTasks:
			case Top100Tasks:
				query = "FROM TaskQueue ORDER BY TimeQueued DESC";
				break;
			default:
				query = "FROM TaskQueue ORDER BY TimeQueued DESC";
			}
			taskQueue = session.createQuery(query);
			if (AppSettings.getShowTasks() == EnShowTasks.Top100Tasks) {
				taskQueue.setMaxResults(100);
			}
			list = taskQueue.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		model = new TaskQueueModel(list);
		model.addTableModelListener(this);
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				onExit();
			}
		});
		frame.setBounds(100, 100, 610, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Navision Month Closure Administration");
		

		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.7);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		
		JPanel statusPanel = new JPanel();
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
				.addComponent(statusPanel, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(statusPanel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
		);
		
		lblStatusBar = new JLabel("Status bar");
		lblStatusBar.setHorizontalAlignment(SwingConstants.LEFT);
		GroupLayout gl_statusPanel = new GroupLayout(statusPanel);
		gl_statusPanel.setHorizontalGroup(
			gl_statusPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblStatusBar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
		);
		gl_statusPanel.setVerticalGroup(
			gl_statusPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_statusPanel.createSequentialGroup()
					.addComponent(lblStatusBar)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		statusPanel.setLayout(gl_statusPanel);
		
		btnJiraStart = new JButton("Jira Start");
		btnJiraStart.setIcon(null);
		btnJiraStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isRunningJira()) {
					jiraStart();
				} else {
					jiraStop();
				}
			}
		});
		toolBar.add(btnJiraStart);
		
		btnQueueStart = new JButton("Queue Start");
		btnQueueStart.setIcon(null);
		btnQueueStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isRunningAB()) {
					queueStart();
				} else {
					queueStop();
				}
			}
		});
		toolBar.add(btnQueueStart);
		
		JButton btnRefreshTable = new JButton("Refresh table");
		btnRefreshTable.setIcon(null);
		btnRefreshTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTable();
			}
		});
		
		JButton btnServerStop = new JButton("Service Stop");
		btnServerStop.setIcon(null);
		btnServerStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopServer();
			}
		});
		toolBar.add(btnServerStop);
		toolBar.add(btnRefreshTable);
		
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		
		table = new JTable();
		
		updateTable();
		
		//table = new JTable();
		scrollPane.setViewportView(table);
		
		
		JPopupMenu popupMenu = new JPopupMenu();
		menuItemCancel = new JMenuItem("Cancel task");
		menuItemRestart = new JMenuItem("Restart task");
		popupMenu.add(menuItemCancel);
		popupMenu.add(menuItemRestart);
		menuItemCancel.addActionListener(this);
		menuItemRestart.addActionListener(this);
		table.setComponentPopupMenu(popupMenu);
		table.addMouseListener(new TableMouseListener(table));
		
		tpLog = new JTextPane();
		tpLog.setEditable(false);
		DefaultCaret caret = (DefaultCaret) tpLog.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		JScrollPane jsp = new JScrollPane(tpLog);
		
		
		splitPane.setRightComponent(jsp);
		frame.getContentPane().setLayout(groupLayout);

		frame.setVisible(true);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmSettings = new JMenuItem("Settings...");
		mntmSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppSettingDlg asd = new AppSettingDlg(jiraHelper, clientSocket, outBuffer);
				asd.setVisible(true);
				
				

			}
		});
		mnFile.add(mntmSettings);
		
		separator = new JSeparator();
		mnFile.add(separator);
		
		mntmQuit = new JMenuItem("Quit");
		mntmQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispatchEvent(new WindowEvent(frame,  WindowEvent.WINDOW_CLOSING));
			}
		});
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnFile.add(mntmQuit);
		
		mnView = new JMenu("View");
		menuBar.add(mnView);
		
		ButtonGroup group = new ButtonGroup();

		
		rdbtnmntmAllTasks = new JRadioButtonMenuItem("All tasks");
		rdbtnmntmAllTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppSettings.setShowTasks(EnShowTasks.AllTasks);
				updateTable();
			}
		});
		mnView.add(rdbtnmntmAllTasks);
		
		rdbtnmntmTopTasks = new JRadioButtonMenuItem("Top 100 tasks");
		rdbtnmntmTopTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppSettings.setShowTasks(EnShowTasks.Top100Tasks);
				updateTable();
			}
		});
		mnView.add(rdbtnmntmTopTasks);
		
		group.add(rdbtnmntmAllTasks);
		group.add(rdbtnmntmTopTasks);
		rdbtnmntmTopTasks.setSelected(true);
		
		mnReferences = new JMenu("References");
		menuBar.add(mnReferences);
		
		mntmCompanies = new JMenuItem("Companies");
		mntmCompanies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReferenceTableDialog editCompanies = new CompaniesDialog(
						frame, so, "Companies",
						Companies.class);
				editCompanies.initialize();
				editCompanies.setTitle("Edit companies");
				editCompanies.setModal(true);
				editCompanies.setVisible(true);
			}
		});
		mnReferences.add(mntmCompanies);
		
		mntmJobs = new JMenuItem("Jobs");
		mntmJobs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReferenceTableDialog editJobs = new JobsDialog(
						frame, so, "Jobs",
						Jobs.class);
				editJobs.initialize();
				editJobs.setTitle("Edit jobs");
				editJobs.setModal(true);
				editJobs.setVisible(true);
			}
		});
		mnReferences.add(mntmJobs);
		
		mntmTypes = new JMenuItem("Types");
		mntmTypes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReferenceTableDialog editTypes = new ReferenceTableDialog(
						frame, so, "Types",
						Types.class);
				editTypes.initialize();
				editTypes.setTitle("Edit types");
				editTypes.setModal(true);
				editTypes.setVisible(true);

			}
		});
		mnReferences.add(mntmTypes);
		
		
	}
	
	private void jiraStart() {
		/*
		jiraStop();
		jiraThread = new Thread(jiraHelper);
		
		jiraThread.start();
		*/
		
		//if (clientSocket != null) {
		if (connect()) {
			outBuffer.println("jirastart");
			outBuffer.flush();
			disconnect();
		}
 
		//}
	}
	
	private void jiraStop() {
		/*
		if (jiraThread != null && jiraThread.isAlive())
			jiraThread.interrupt();
			*/
		
		//if (clientSocket != null) {
		if (connect()) {
			outBuffer.println("jirastop");
			outBuffer.flush();
			disconnect();
		}
			
 
		//}
	}
	
	private void queueStart() {
		/*
		queueStop();
		queueThread = new Thread(model);
		queueThread.start();
		*/
		//if (clientSocket != null) {
		if (connect()) {

			outBuffer.println("abstart");
			outBuffer.flush();
			disconnect();
		}
 
		//}
		
		
	}
	
	private void queueStop() {
		/*
		if (queueThread != null && queueThread.isAlive())
			queueThread.interrupt();*/
		
		//if (clientSocket != null) {
		if (connect()) {

			outBuffer.println("abstop");
			outBuffer.flush();
			disconnect();
 
		}
	}
	
	private void stopServer() {
		//if (clientSocket != null) {
		if (connect()) {

			outBuffer.println("stop");
			outBuffer.flush();
			disconnect();
 
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem menu = (JMenuItem) e.getSource();
		if (menu == menuItemCancel) {
			cancelCurrentRow();
		} else if (menu == menuItemRestart) {
			restartCurrentRow();
		}
		
	}
	
	
	private void cancelCurrentRow() {
		int selectedRow = table.convertRowIndexToModel(table.getSelectedRow());

		//if (((TaskStatus)model.getValueAt(selectedRow, 6)).getStatus().equals("Queued") ) {
			model.setValueAt((TaskStatus)ReferenceType.getElement("Cancelled", TaskStatus.tableName()), 
					selectedRow, 6);
			model.fireTableCellUpdated(selectedRow, 6);
			
			AppSettings.getLog().log(
					((String)model.getValueAt(selectedRow, 13)).trim()  + " cancelled"
					);
			
			//model.fireTableRowsUpdated(selectedRow, selectedRow);
		//}
	}
	
	private void restartCurrentRow() {
		int selectedRow = table.convertRowIndexToModel(table.getSelectedRow());

		//if (((TaskStatus)model.getValueAt(selectedRow, 6)).getStatus().equals("Queued") ) {
			model.setValueAt((TaskStatus)ReferenceType.getElement("Queued", TaskStatus.tableName()), 
					selectedRow, 6);
			model.fireTableCellUpdated(selectedRow, 6);
			
			AppSettings.getLog().log(
					((String)model.getValueAt(selectedRow, 13)).trim()  + " restarted"
					);
			
			//model.fireTableRowsUpdated(selectedRow, selectedRow);
		//}
	}
	
	
	@Override
	public void tableChanged(TableModelEvent e) {
		Transaction tx = null;
		int row = e.getFirstRow();

		try {
			session = so.getFactory().openSession();
			tx = session.beginTransaction();
			if (e.getType() == TableModelEvent.DELETE) {
				session.delete(list.get(row));
			} else {
				session.saveOrUpdate(list.get(row));
			}
			tx.commit();
		} catch (HibernateException err) {
			if (tx != null) {
				tx.rollback();
			}
			err.printStackTrace();

		} finally {
			session.close();
		}

	}
	
	private boolean connect() {
		try {
			clientSocket = new Socket(AppSettings.getPREF_SERVER(), AppSettings.getPREF_SERVER_PORT());
			
			outBuffer = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			inBuffer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
		} catch (UnknownHostException uhe) {
			// Server Host unreachable 
            AppSettings.getLog().log(Level.SEVERE, "Unknown Host :" + AppSettings.getPREF_SERVER()); 
            clientSocket = null;
		}
        catch(IOException ioe) 
        { 
            // Cannot connect to port on given server host 
        	AppSettings.getLog().log(Level.SEVERE, "Can't connect to server at " + AppSettings.getPREF_SERVER_PORT() + ". Make sure it is running."); 
            clientSocket = null; 
        } 
		if (clientSocket == null) {
			return false;
		}
		
		//AppSettings.getLog().log("Connected to server at " + AppSettings.getPREF_SERVER() + ":" + AppSettings.getPREF_SERVER_PORT());
		
		
		
		return true;
		
		

	}
	
	private boolean disconnect() {
		try {
			outBuffer.close();
			inBuffer.close();
			clientSocket.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();	
		}
		return true;
	}
	
	
	private String getStatus() {
		//if (clientSocket != null) {
		if (connect()) {

			outBuffer.println("status");
			outBuffer.flush();
			try {
				return inBuffer.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				AppSettings.getLog().log(Level.SEVERE, e.getMessage());
			} finally {
				disconnect();
			}
		}
		return null;
	}
	
	private void updateStatuses() {
		String jt = "JiraThread:";
		String at = "ABThread:";
		
		String status = getStatus();
		if (status != null) {
			int index = status.indexOf(jt);
			char jiraStatus = status.charAt(index + jt.length());
			
			index = status.indexOf(at);
			char abStatus = status.charAt(index + at.length());
			
			setRunningJira((jiraStatus == '1'));
			setRunningAB((abStatus == '1'));
			
			lblStatusBar.setText(getStatusText());
			if (isRunningAB() && isRunningJira()) {
				lblStatusBar.setForeground(Color.BLACK);
			} else {
				lblStatusBar.setForeground(Color.RED);
			}
		}
		
	}
	
	private String getStatusText() {
		String status;
		
		status = "Jira thread: ";
		status += isRunningJira()?"Running":"Stopped";
		status += ". Active Batch Thread : ";
		status += isRunningAB()?"Running":"Stopped";
		status += ".";
		
		return status;
		
	}
	
	
	
	private void onExit() {
//		jiraStop();
//		queueStop();
		//abHelper.disconnect();
		//if (clientSocket != null) {
		if (connect()) {

			outBuffer.println("quit");
			disconnect();
		}

	}

	public boolean isRunningJira() {
		return isRunningJira;
	}

	public void setRunningJira(boolean isRunningJira) {
		this.isRunningJira = isRunningJira;
		
		if (!isRunningJira()) {
			btnJiraStart.setText("Jira Start");
		} else {
			btnJiraStart.setText("Jira Stop");
		}
	}

	public boolean isRunningAB() {
		return isRunningAB;
	}

	public void setRunningAB(boolean isRunningAB) {
		this.isRunningAB = isRunningAB;

		if (!isRunningAB()) {
			btnQueueStart.setText("Queue Start");
		} else {
			btnQueueStart.setText("Queue Stop");
		}
	}
	
	public String getLogText() {
		return tpLog.getText();
	}
	
	public void  setLogText(String text) {
		tpLog.setText(text);
	}
	
	public void updateTable() {
		createModel();
		table.setModel(model);
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setAutoCreateRowSorter(true);
		
		TimestampCellRenderer tcr = new TimestampCellRenderer();
		
		table.getColumnModel().getColumn(7).setCellRenderer(tcr);
		table.getColumnModel().getColumn(8).setCellRenderer(tcr);
		table.getColumnModel().getColumn(9).setCellRenderer(tcr);
		
		table.getColumnModel().getColumn(1).setPreferredWidth(250);
		table.getColumnModel().getColumn(2).setPreferredWidth(180);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(7).setPreferredWidth(120);
		table.getColumnModel().getColumn(8).setPreferredWidth(120);
		table.getColumnModel().getColumn(9).setPreferredWidth(120);
		
		
		table.setDefaultRenderer(Object.class, new TaskQueueCellRenderer());

	}
}
