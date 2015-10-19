package com.vtbcapital.itops.ABATAdmin;
import java.awt.EventQueue;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JSeparator;
import javax.swing.JLabel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JPanel;

public class mainWindow {

	private JFrame frmActiveBatchTrigger;

	private SessionObjects sessionObjects;

	private List<Instances> instList = null;
	private JTextField textField;

	private JTree tree;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JSplitPane splitPane;

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
			// SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow window = new mainWindow();
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
	public mainWindow() {
		initialize();

		// EditTypes et = new EditTypes(frmActiveBatchTrigger, sessionObjects);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		ButtonGroup bgInstances = new ButtonGroup();

		frmActiveBatchTrigger = new JFrame();
		frmActiveBatchTrigger.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				AppSettings.getAbHelper().disconnect();
			}
		});
		frmActiveBatchTrigger.setTitle("Active Batch Trigger Administration");
		frmActiveBatchTrigger.setBounds(100, 100, 699, 513);
		frmActiveBatchTrigger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sessionObjects = new SessionObjects();
		AppSettings.setFrmApplication(frmActiveBatchTrigger);

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

			//Action switchInstanceAction = new SwitchInstanceAction(instList, this);

			JRadioButtonMenuItem[] mnInstances = new JRadioButtonMenuItem[instList
					.size()];
			int i = 0;
			for (Instances inst : instList) {
				mnInstances[i] = new JRadioButtonMenuItem(
						inst.getInstanceName());
				//mnInstances[i].setAction(switchInstanceAction);
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

		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);

		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem(
				"New radio item");
		mnNewMenu.add(rdbtnmntmNewRadioItem);

		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem(
				"New radio item");
		mnNewMenu.add(rdbtnmntmNewRadioItem_1);

		JLabel lblActiveBatchInstance = new JLabel("Active Batch Instance:");

		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTree();
			}
		});
		
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		


		GroupLayout groupLayout = new GroupLayout(
				frmActiveBatchTrigger.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(splitPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblActiveBatchInstance)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
							.addComponent(btnRefresh)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActiveBatchInstance)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRefresh))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
					.addContainerGap())
		);
		
				scrollPane = new JScrollPane();
				splitPane.setLeftComponent(scrollPane);
				
				JPanel panel = new JPanel();
				splitPane.setRightComponent(panel);
				
				JLabel lblRunningProcesses = new JLabel("Running processes");
				
				scrollPane_1 = new JScrollPane();
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRunningProcesses)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 651, GroupLayout.PREFERRED_SIZE)))
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lblRunningProcesses)
							.addGap(11)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))
				);
				panel.setLayout(gl_panel);
				
				

		
		


		// MonitorView mv = new MonitorView(AppSettings.getActiveInstance(),
		// sessionObjects);
		//
		// MonitorAbstractTreeTableModel treeTableModel = new
		// MonitorDataModel(mv.createNodes());
		// MonitorTreeTable monitorTreeTable = new
		// MonitorTreeTable(treeTableModel);
		//
		// scrollPane.setViewportView(monitorTreeTable);

		setTree();

		frmActiveBatchTrigger.getContentPane().setLayout(groupLayout);

	}

	void setTree() {
		
		MonitorView mv = new MonitorView(AppSettings.getActiveInstance(),
				sessionObjects);
		MonitorAbstractTreeTableModel treeTableModel = new MonitorDataModel(
				mv.createNodes());
		MonitorTreeTable monitorTreeTable = new MonitorTreeTable(treeTableModel);
		monitorTreeTable.setFillsViewportHeight(true);
		
		MonitorTreeTable monitorTreeTable_1 = new MonitorTreeTable(treeTableModel);
		monitorTreeTable_1.setFillsViewportHeight(true);
		
		scrollPane.setViewportView(monitorTreeTable);
		scrollPane_1.setRowHeaderView(monitorTreeTable_1);

	}
}
