package com.vtbcapital.itops.ABATAdmin;

import java.util.Enumeration;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

public class CompaniesDialog extends ReferenceTableDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7454927610052650185L;

	public CompaniesDialog(JFrame parent, SessionObjects so, String tableName,
			Class dataClass) {
		super(parent, so, tableName, dataClass);

		setBounds(100, 100, 700, 400);
		// TODO Auto-generated constructor stub
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

		model = new CompaniesModel(list);
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
			types = session.createQuery("FROM " + Types.tableName());
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
		table.getColumnModel().getColumn(0).setMinWidth(120);
		table.getColumnModel().getColumn(1).setMaxWidth(60);
	}

}
