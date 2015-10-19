package com.vtbcapital.itops.ABATAdmin;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

public class InstancesDialog extends ReferenceTableDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4919154124798909359L;

	public InstancesDialog(JFrame parent, SessionObjects so, String tableName,
			Class dataClass) {
		super(parent, so, tableName, dataClass);
		setBounds(100, 100, 600, 400);
	}

	@Override
	public void setModel() {
		session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;

		try {
			tx = session.beginTransaction();
			types = session.createQuery("FROM " + tableName);
			list = types.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		model = new InstancesModel(list);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setLayout() {

		// Set Types list

		List<ReferenceType> typesList = null;

		session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;

		try {
			tx = session.beginTransaction();
			types = session.createQuery("FROM " + tableName);
			typesList = types.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		table = new JTable(model);
		table.setAutoCreateRowSorter(true);

		table.setDefaultRenderer(Types.class, new ReferenceTypeCellRenderer());
		table.setDefaultEditor(Types.class, new ReferenceTypeCellEditor(
				typesList));

		table.getModel().addTableModelListener(this);
		customizeTable();

		scroll = new JScrollPane(table);

	}

	public void customizeTable() {
		table.getColumnModel().getColumn(0).setMinWidth(80);
		// table.getColumnModel().getColumn(1).setMaxWidth(120);
	}

}
