package com.vtbcapital.itops.ABATAdmin;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Panel;

public class MainWindow_ {

	private JFrame frmActiveBatchTrigger;
	
	private List<Instances> instList = null;
	private SessionObjects sessionObjects;
	private JTextField txtInstance;
	private JTable table;
	private JTable runningProcessesTable;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JLabel statusLabel;
	private JButton btnRefresh;
	
	
	private MonitorTreeTable monitorTreeTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow_ window = new MainWindow_();
					window.frmActiveBatchTrigger.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow_() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ButtonGroup bgInstances = new ButtonGroup();
		
		frmActiveBatchTrigger = new JFrame();
		frmActiveBatchTrigger.setTitle("Active Batch Trigger Administration");
		frmActiveBatchTrigger.setBounds(100, 100, 665, 475);
		frmActiveBatchTrigger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		sessionObjects = new SessionObjects();
		AppSettings.setFrmApplication(frmActiveBatchTrigger);
		
		// Creating menus
		
		JMenuBar menuBar = new JMenuBar();
		frmActiveBatchTrigger.setJMenuBar(menuBar);

		JMenu mnApplication = new JMenu("Application");
		menuBar.add(mnApplication);

		JMenuItem mntmSettings = new JMenuItem("Settings...");
		mntmSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AppSettingDlg asd = new AppSettingDlg(null, null, null);
				asd.setVisible(true);
			}
		});

		JMenu mnInstancesNewMenu = new JMenu("Switch instance");
		mnApplication.add(mnInstancesNewMenu);

		// Adding instances menuitems

		instList = Instances.getList(sessionObjects);
		if (instList != null) {
			AppSettings.setInstList(instList);

			Action switchInstanceAction = new SwitchInstanceAction(instList, this);

			JRadioButtonMenuItem[] mnInstances = new JRadioButtonMenuItem[instList.size()];
			int i = 0;
			for (Instances inst : instList) {
				mnInstances[i] = new JRadioButtonMenuItem(
						inst.getInstanceName());
				mnInstances[i].setAction(switchInstanceAction);
				mnInstances[i].setText(inst.getInstanceName());
				mnInstancesNewMenu.add(mnInstances[i]);
				bgInstances.add(mnInstances[i]);

				// /DEBUG
				// AppSettings.setActiveInstance(new Instances("UAT"));
				// ////////////

				// if (inst.equals(AppSettings.getActiveInstance())) {
				if (inst.getInstanceName().equals("UAT")) {
					AppSettings.setActiveInstance(inst);
					mnInstances[i].setSelected(true);
				}
				i++;

			}
		}

		mnApplication.add(mntmSettings);

		JMenu mnReferences = new JMenu("References");
		menuBar.add(mnReferences);

		JMenuItem mntmCompanies = new JMenuItem("Companies");
		mntmCompanies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReferenceTableDialog editCompanies = new CompaniesDialog(
						frmActiveBatchTrigger, sessionObjects, "Companies",
						Companies.class);
				editCompanies.initialize();
				editCompanies.setTitle("Edit companies");
				editCompanies.setModal(true);
				editCompanies.setVisible(true);
			}
		});
		mnReferences.add(mntmCompanies);

		JMenuItem mntmJobs = new JMenuItem("Jobs");
		mntmJobs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReferenceTableDialog editJobs = new JobsDialog(
						frmActiveBatchTrigger, sessionObjects, "Jobs",
						Jobs.class);
				editJobs.initialize();
				editJobs.setTitle("Edit jobs");
				editJobs.setModal(true);
				editJobs.setVisible(true);
			}
		});
		mnReferences.add(mntmJobs);

		JMenuItem mntmTypes = new JMenuItem("Types");
		mntmTypes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReferenceTableDialog editTypes = new ReferenceTableDialog(
						frmActiveBatchTrigger, sessionObjects, "Types",
						Types.class);
				editTypes.initialize();
				editTypes.setTitle("Edit types");
				editTypes.setModal(true);
				editTypes.setVisible(true);
			}
		});
		mnReferences.add(mntmTypes);

		JSeparator separator = new JSeparator();
		mnReferences.add(separator);

		JMenuItem mntmCompanyLists = new JMenuItem("Company Lists");
		mntmCompanyLists.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PivotTableDialog pivotDialog = new PivotTableDialog(
						frmActiveBatchTrigger, sessionObjects, "Companies",
						"Jobs", "JobCompany", "Types");
				pivotDialog.initialize();
				pivotDialog.setTitle("Edit company lists");
				pivotDialog.setModal(true);
				pivotDialog.setVisible(true);
			}
		});
		mnReferences.add(mntmCompanyLists);

		JMenuItem mntmActiveBatchInstances = new JMenuItem(
				"Active Batch Instances");
		mntmActiveBatchInstances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReferenceTableDialog editInstances = new InstancesDialog(
						frmActiveBatchTrigger, sessionObjects, "Instances",
						Instances.class);
				editInstances.initialize();
				editInstances.setTitle("Active Batch Instances");
				editInstances.setModal(true);
				editInstances.setVisible(true);
			}
		});
		mnReferences.add(mntmActiveBatchInstances);
		
		JLabel lblInstance = new JLabel("Instance:");
		
		txtInstance = new JTextField();
		txtInstance.setEnabled(false);
		txtInstance.setColumns(10);
		
		txtInstance.setText(AppSettings.getActiveInstance().getInstanceName());
		
		JCheckBox chckbxAutorefreshEvery = new JCheckBox("Autorefresh every");
		
		JSpinner spinner = new JSpinner();
		
		JLabel lblMinutes = new JLabel("minutes");
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshTables();
			}
		});
		
		JPanel statusPanel = new JPanel();
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		//statusPanel.setPreferredSize(new Dimension(frmActiveBatchTrigger.getWidth(), 16));
		

		
		
		
		
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GroupLayout groupLayout = new GroupLayout(frmActiveBatchTrigger.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInstance)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtInstance, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(chckbxAutorefreshEvery)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMinutes)
					.addGap(31)
					.addComponent(btnRefresh)
					.addContainerGap(125, Short.MAX_VALUE))
				.addComponent(statusPanel, GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInstance)
						.addComponent(txtInstance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxAutorefreshEvery)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMinutes)
						.addComponent(btnRefresh))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(statusPanel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
		);
		
		

		
		JPanel panel_1 = new JPanel();
		splitPane.setLeftComponent(panel_1);
		
		JLabel lblJobHistory = new JLabel("Job history");
		
		scrollPane = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblJobHistory)
					.addContainerGap(584, Short.MAX_VALUE))
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblJobHistory)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		
///////////////////////////
		
		//;
		//scrollPane_1.setRowHeaderView(monitorTreeTable_1);
///////////////////////////////////////////////////

//		MonitorView mv = new MonitorView(AppSettings.getActiveInstance(),
//				sessionObjects);
//		MonitorAbstractTreeTableModel treeTableModel = new MonitorDataModel(
//				mv.createNodes());
//		MonitorTreeTable monitorTreeTable = new MonitorTreeTable(treeTableModel);
//		monitorTreeTable.setFillsViewportHeight(true);
		
		//MonitorTreeTable monitorTreeTable_1 = new MonitorTreeTable(treeTableModel);
		//monitorTreeTable_1.setFillsViewportHeight(true);
		
		

		
		
		
///////////////////////////////////////////////
		
		panel_1.setLayout(gl_panel_1);
		
		Panel panel_2 = new Panel();
		splitPane.setRightComponent(panel_2);
		
		splitPane.setResizeWeight(1);
		
		JLabel lblRunningProcesses = new JLabel("Running processes");
		
		scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRunningProcesses)
					.addContainerGap(547, Short.MAX_VALUE))
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lblRunningProcesses)
					.addGap(8)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
		);
		

		

		

		panel_2.setLayout(gl_panel_2);
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		statusLabel = new JLabel("status");
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		statusPanel.add(statusLabel);
		
		frmActiveBatchTrigger.getContentPane().setLayout(groupLayout);
		
		runningProcessesTable = new JTable();
		refreshTables();

		
	}
	
	
	private void refreshTables() {
		Thread refreshThread = new Thread(new Runnable()
		{

			@Override
			public void run() {
				
				statusLabel.setText("Updatind...");
				btnRefresh.setEnabled(false);
				
				frmActiveBatchTrigger.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
				
				
				
				MonitorView mv = new MonitorView(AppSettings.getActiveInstance(),
						sessionObjects);
				MonitorAbstractTreeTableModel treeTableModel = new MonitorDataModel(
						mv.createNodes());
				
				RunningProcessesTableModel rptm = new RunningProcessesTableModel(mv.getActiveJobs());

				
				monitorTreeTable = new MonitorTreeTable(treeTableModel);
				monitorTreeTable.setFillsViewportHeight(true);
				
				runningProcessesTable.setModel(rptm);
				
				scrollPane.setViewportView(monitorTreeTable);
				scrollPane_1.setViewportView(runningProcessesTable);
				
				statusLabel.setText("");
				btnRefresh.setEnabled(true);
				
				frmActiveBatchTrigger.setCursor(Cursor.getDefaultCursor());

				
			}
		});
		
		refreshThread.start();
	}
	
	
	public void onChangeInstance() {
		txtInstance.setText(AppSettings.getActiveInstance().getInstanceName());
	}
}
