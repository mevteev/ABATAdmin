package com.vtbcapital.itops.ABATAdmin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.NumberFormat;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class AppSettingDlg extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7396461689244290925L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfJiraURL;
	private JTextField tfJiraProject;
	private JSpinner spInterval;
	private JComboBox<String> cbActiveInstance;
	private JTextField tfJiraUserName;
	private JPasswordField pfJiraPassword;
	private JSpinner spParallel;
	
	private JiraHelper jh = null;
	private JTextField tfServerName;
	private JFormattedTextField tfServerPort;
	private JFormattedTextField tfLoggerPort;
	
	private Socket clientSocket;
	private PrintWriter outBuffer;


	/**
	 * Create the dialog.
	 */
	public AppSettingDlg(final JiraHelper jh, final Socket clientSocket, final PrintWriter outBuffer) {
		if (jh != null) {
			this.jh = jh;
		}
		
		this.clientSocket = clientSocket;
		this.outBuffer = outBuffer;
		
		setTitle("Settings");
		setModal(true);
		setBounds(100, 100, 406, 298);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
			gbc_tabbedPane.gridwidth = 2;
			gbc_tabbedPane.insets = new Insets(0, 0, 0, 5);
			gbc_tabbedPane.fill = GridBagConstraints.BOTH;
			gbc_tabbedPane.gridx = 0;
			gbc_tabbedPane.gridy = 0;
			contentPanel.add(tabbedPane, gbc_tabbedPane);
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Application Settings", null, panel, null);
				
				JLabel lblActiveInstance = new JLabel("Active instance");
				
				cbActiveInstance = new JComboBox<String>(getInstancesModel());
				cbActiveInstance.setSelectedItem(AppSettings.getPREF_ACTIVE_INSTANCE());
				
				JLabel lblRefreshInterval = new JLabel("Refresh interval");
				
				spInterval = new JSpinner();
				spInterval.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
				
				spInterval.setValue(AppSettings.getPREF_JIRA_INTERVAL() / 60 / 1000);
				
				JLabel lblMinutes = new JLabel("minutes");
				
				JLabel lblServerName = new JLabel("Server name:");
				
				tfServerName = new JTextField(AppSettings.getPREF_SERVER());
				tfServerName.setColumns(10);
				
				JLabel lblPort = new JLabel("Server port");
				
				NumberFormatter nf  = new NumberFormatter(NumberFormat.getIntegerInstance());
				nf.setValueClass(Integer.class);
				nf.setMinimum(0);
				nf.setMaximum(65635);
				
				tfServerPort = new JFormattedTextField(nf);
				tfServerPort.setValue(AppSettings.getPREF_SERVER_PORT());
				
				JLabel lblNewLabel = new JLabel("Logger port");
				
				tfLoggerPort = new JFormattedTextField(nf);
				tfLoggerPort.setValue(AppSettings.getPREF_LOGGER_PORT());
				
				JLabel lblMaxParallelJobs = new JLabel("Max parallel jobs");
				
				spParallel = new JSpinner();
				spParallel.setModel(new SpinnerNumberModel(new Integer(4), new Integer(1), null, new Integer(1)));
				spParallel.setValue(AppSettings.getPREF_MAX_PARALLEL_JOBS());
				
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblActiveInstance)
									.addGap(10)
									.addComponent(cbActiveInstance, 0, 277, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblServerName)
										.addComponent(lblPort)
										.addComponent(lblNewLabel))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(tfServerName, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(tfLoggerPort, Alignment.LEADING)
											.addComponent(tfServerPort, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRefreshInterval)
										.addComponent(lblMaxParallelJobs))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(spParallel, Alignment.LEADING)
										.addComponent(spInterval, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblMinutes)
									.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE)))
							.addContainerGap())
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblActiveInstance)
								.addComponent(cbActiveInstance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRefreshInterval)
								.addComponent(lblMinutes)
								.addComponent(spInterval, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMaxParallelJobs)
								.addComponent(spParallel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblServerName)
								.addComponent(tfServerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPort)
								.addComponent(tfServerPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(tfLoggerPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(28, Short.MAX_VALUE))
				);
				panel.setLayout(gl_panel);
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Jira Settings", null, panel, null);
				
				JLabel lblJiraUrl = new JLabel("JIRA URL:");
				
				tfJiraURL = new JTextField(AppSettings.getPREF_JIRA_URL());
				tfJiraURL.setColumns(10);
				
				JLabel lblJiraProject = new JLabel("JIRA Project:");
				
				tfJiraProject = new JTextField(AppSettings.getPREF_JIRA_PROJECT());
				tfJiraProject.setColumns(10);
				
				JLabel lblUsername = new JLabel("Username:");
				
				JLabel lblPassword = new JLabel("Password:");
				
				tfJiraUserName = new JTextField(AppSettings.getPREF_JIRA_USERNAME());
				tfJiraUserName.setColumns(10);
				
				pfJiraPassword = new JPasswordField(AppSettings.getPREF_JIRA_PASSWORD());
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblJiraUrl)
								.addComponent(lblJiraProject)
								.addComponent(lblUsername)
								.addComponent(lblPassword))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(pfJiraPassword, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
								.addComponent(tfJiraUserName, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
								.addComponent(tfJiraProject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfJiraURL, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
							.addGap(112))
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblJiraUrl)
								.addComponent(tfJiraURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblJiraProject)
								.addComponent(tfJiraProject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(12)
									.addComponent(lblUsername))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfJiraUserName, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassword)
								.addComponent(pfJiraPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(14, Short.MAX_VALUE))
				);
				panel.setLayout(gl_panel);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//AppSettings.set_AB_SERVER_VALUE(tbABHost.getText());
						AppSettings.setPREF_JIRA_PROJECT(tfJiraProject.getText());
						AppSettings.setPREF_JIRA_URL(tfJiraURL.getText());
						AppSettings.setPREF_ACTIVE_INSTANCE(cbActiveInstance.getSelectedItem().toString());
						AppSettings.setPREF_JIRA_INTERVAL((Integer)spInterval.getValue() * 60 * 1000);
						AppSettings.setPREF_JIRA_USERNAME(tfJiraUserName.getText());
						AppSettings.setPREF_JIRA_PASSWORD(String.copyValueOf(pfJiraPassword.getPassword()));
						AppSettings.setPREF_SERVER(tfServerName.getText());
						AppSettings.setPREF_SERVER_PORT((Integer)tfServerPort.getValue());
						AppSettings.setPREF_LOGGER_PORT((Integer)tfLoggerPort.getValue());
						AppSettings.setPREF_MAX_PARALLEL_JOBS((Integer)spParallel.getValue());
						
						if (jh != null) {
							jh.setServerPath(AppSettings.getPREF_JIRA_URL());
							jh.setUserName(AppSettings.getPREF_JIRA_USERNAME());
							jh.setPassword(AppSettings.getPREF_JIRA_PASSWORD());
							
							jh.connect();
						}
						
						if (clientSocket != null) {
							outBuffer.println("readsettings");
							outBuffer.flush();
				 
						}

						
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	
	public ComboBoxModel<String> getInstancesModel() {
		SessionObjects so = AppSettings.getSessionObjects();
		
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;
		List<ReferenceType> list = null;

		try {
			tx = session.beginTransaction();
			types = session.createQuery("FROM Instances");
			list = types.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();
		for (ReferenceType rt : list) {
			comboModel.addElement(rt.getValue());
		}
		
		return comboModel;
	}
}
