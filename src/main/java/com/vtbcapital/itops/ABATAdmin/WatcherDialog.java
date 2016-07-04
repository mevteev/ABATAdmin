package com.vtbcapital.itops.ABATAdmin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.swing.JList;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ScrollPaneConstants;

public class WatcherDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	DefaultListModel<Users> model;
	DefaultListModel<Users> grModel;
	
	private final JPanel contentPanel = new JPanel();
	private JPanel buttonPane;
	private JComboBox cbGroup;
	private JList<Users> lstAllUsers;
	private JList<Users> lstGroupUsers;
	
	private boolean isModified = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			WatcherDialog dialog = new WatcherDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WatcherDialog() {
		setResizable(false);
		setTitle("JIRA Watchers");
		setBounds(100, 100, 475, 383);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(119, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPanel.setLayout(null);
		{
			JLabel lblGroupName = new JLabel("Group Name:");
			lblGroupName.setBounds(10, 14, 63, 14);
			contentPanel.add(lblGroupName);
		}
		{
			cbGroup = new JComboBox<UserGroups>(getGroupsModel());
			/*
			cbGroup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			*/
			
			cbGroup.setBounds(83, 10, 171, 22);
			contentPanel.add(cbGroup);
			
			//////////////////
			cbGroup.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent ie)
				{
					if (ie.getStateChange() == ItemEvent.DESELECTED) {
						groupChanged((UserGroups)ie.getItem());
					} else if (ie.getStateChange() == ItemEvent.SELECTED) {
						//new = ie.getItem
						updateJLists();
						
					}
				}
			});
				
			//////////////////
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBounds(20, 39, 171, 260);
			contentPanel.add(scrollPane);
			{
				lstAllUsers = new JList<Users>();
				lstAllUsers.setVisibleRowCount(14);
				scrollPane.setViewportView(lstAllUsers);
				lstAllUsers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(272, 39, 171, 260);
			contentPanel.add(scrollPane);
			{
				lstGroupUsers = new JList();
				lstGroupUsers.setVisibleRowCount(14);
				scrollPane.setViewportView(lstGroupUsers);
			}
		}
		{
			buttonPane = new JPanel();
			buttonPane.setBounds(0, 310, 455, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (isModified) {
							saveGroup((UserGroups)cbGroup.getSelectedItem());
							dispose();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		JButton btAddAll = new JButton(">>");
		btAddAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lstAddAll();
			}
		});
		btAddAll.setBounds(201, 43, 53, 23);
		contentPanel.add(btAddAll);
		
		JButton btAdd = new JButton(">");
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lstAdd();
			}
		});
		btAdd.setBounds(201, 77, 53, 23);
		contentPanel.add(btAdd);
		
		JButton btRemoveAll = new JButton("<<");
		btRemoveAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lstRemoveAll();
			}
		});
		btRemoveAll.setBounds(201, 126, 53, 23);
		contentPanel.add(btRemoveAll);
		
		JButton btRemove = new JButton("<");
		btRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lstRemove();
			}
		});
		btRemove.setBounds(201, 160, 53, 23);
		contentPanel.add(btRemove);
		{
			JButton btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addGroup();
				}
			});
			btnAdd.setBounds(264, 10, 53, 23);
			contentPanel.add(btnAdd);
		}
		{
			JButton btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					deleteGroup();
				}
			});
			btnDelete.setBounds(326, 10, 72, 23);
			contentPanel.add(btnDelete);
		}
		getContentPane().setLayout(groupLayout);
		
		
		updateJLists();
	}
	
	
	private void addGroup() {
		String groupName = JOptionPane.showInputDialog("Input group name:");
		if (groupName != null) {
			UserGroups ug = new UserGroups();
			ug.setGroupName(groupName);
			ug.saveElement();
			
			UserGroups selected = (UserGroups)cbGroup.getSelectedItem();
			cbGroup.setModel(getGroupsModel());
			
			cbGroup.getModel().setSelectedItem(selected);
		}
	}
	
	private void deleteGroup() {
		UserGroups ug = (UserGroups)cbGroup.getSelectedItem();
		if (ug != null) {
			int result = JOptionPane.showConfirmDialog(null, "Do you want to delete " + ug + "?", "Delete", JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE, null);
			if (result == JOptionPane.YES_OPTION) {
				
				//delete watchers
				SessionObjects so = AppSettings.getSessionObjects();
				List<Watchers> watchers = ug.getWatchers2(so);
				
				Session session = so.getFactory().openSession();
				try {
					session.beginTransaction();
					for (Watchers watcher : watchers) {
						session.delete(watcher);
					}
					
					//delete group
					session.delete(ug);
					
					session.getTransaction().commit();
				}
				catch (HibernateException e) {
		            e.printStackTrace();
		            session.getTransaction().rollback();
		        }
				finally {
					session.close();
				}
				
				cbGroup.setModel(getGroupsModel());
				updateJLists();
			}
			
		}
	}
	
	
	private void groupChanged(UserGroups group) {
		if (isModified) {
			if (JOptionPane.showOptionDialog(null, "Do you want to save group " + group + "?", 
					"Save", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null) == JOptionPane.YES_OPTION) {
				saveGroup(group);
			}
		}
	}
	
	
	private void saveGroup(UserGroups group) {
		SessionObjects so = AppSettings.getSessionObjects();
		
		//delete watchers
		List<Watchers> watchers = group.getWatchers2(so);
		
		Session session = so.getFactory().openSession();
		try {
			session.beginTransaction();
			for (Watchers watcher : watchers) {
				session.delete(watcher);
			}
			session.getTransaction().commit();
		}
		catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
		finally {
			session.close();
		}
		
		//add watchers
		Enumeration<Users> en = grModel.elements();
		while(en.hasMoreElements()) {
			Watchers watcher = new Watchers();
			watcher.setUserGroupId(group);
			watcher.setUser(en.nextElement());
			watcher.saveElement();
		}
			
		
		
	}
	
	private void updateJLists(){
	    model = new DefaultListModel<Users>();
	    grModel = new DefaultListModel<Users>();

	    List<Users> users = ((UserGroups)cbGroup.getSelectedItem()).getNoGroupUsers(AppSettings.getSessionObjects());

	    List<Users> grUsers = ((UserGroups)cbGroup.getSelectedItem()).getGroupUsers(AppSettings.getSessionObjects());
	    
	    for(Users p : users){
	         model.addElement(p);
	    }
	    
	    for(Users p : grUsers){
	         grModel.addElement(p);
	    }   

	    
	    lstAllUsers.setModel(model);     
	    lstAllUsers.setSelectedIndex(0);
	    
	    lstGroupUsers.setModel(grModel);     
	    lstGroupUsers.setSelectedIndex(0);
	    
	    isModified = false;
	    
	}
	
	private void lstAddAll() {
		Enumeration<Users> en = model.elements();
		while(en.hasMoreElements()) {
			grModel.addElement(en.nextElement());
		}
		model.removeAllElements();
		
		sortModel(grModel);
		
		lstGroupUsers.setSelectedIndex(0);
		
		isModified = true;
		
	}
	
	private void lstRemoveAll() {
		Enumeration<Users> en = grModel.elements();
		while(en.hasMoreElements()) {
			model.addElement(en.nextElement());
		}
		grModel.removeAllElements();
		
		sortModel(model);
		
		lstAllUsers.setSelectedIndex(0);
		
		isModified = true;
		
	}
	
	private void lstAdd() {
		Users user = lstAllUsers.getSelectedValue();
		if (user != null) {
			int pos = lstAllUsers.getSelectedIndex();
			grModel.addElement(user);
			model.removeElement(user);
			lstAllUsers.setSelectedIndex(pos);
			
			sortModel(grModel);
			
			isModified = true;
		}
		
	}
	
	private void lstRemove() {
		Users user = lstGroupUsers.getSelectedValue();
		if (user != null) {
			int pos = lstGroupUsers.getSelectedIndex();
			model.addElement(user);
			grModel.removeElement(user);
			lstGroupUsers.setSelectedIndex(pos);
			
			sortModel(model);
			
			isModified = true;
		}
	}
	
	
	private void sortModel(DefaultListModel<Users> model) {
	    List<Users> list = new ArrayList<>();
	    for (int i = 0; i < model.size(); i++) {
	        list.add((Users)model.get(i));
	    }
	    Collections.sort(list);
	    model.removeAllElements();
	    for (Users s : list) {
	        model.addElement(s);
	    }
	}
	
	
	public ComboBoxModel<UserGroups> getGroupsModel() {
		SessionObjects so = AppSettings.getSessionObjects();
		
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;
		List<UserGroups> list = null;

		try {
			tx = session.beginTransaction();
			types = session.createQuery("FROM UserGroups");
			list = types.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		DefaultComboBoxModel<UserGroups> comboModel = new DefaultComboBoxModel<UserGroups>();
		for (UserGroups rt : list) {
			comboModel.addElement(rt);
		}
		
		return comboModel;
	}
}
