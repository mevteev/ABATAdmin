package com.vtbcapital.itops.ABATAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.annotations.FetchMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

public class JobsDialog extends ReferenceTableDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8371696748978903470L;

	protected List<Object[]> list;
	protected JobsModel model;

	public JobsDialog(JFrame parent, SessionObjects so, String tableName,
			Class dataClass) {
		super(parent, so, tableName, dataClass);

		setBounds(100, 100, 600, 400);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setModel() {
		session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;

		try {
			tx = session.beginTransaction();

			types = session
					.createQuery("FROM Jobs j left join j.jobPath jp with jp.instanceId.instanceId = "
							+ AppSettings.getPREF_ACTIVE_INSTANCE_INST().getInstanceId());
			list = types.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		model = new JobsModel(list);
	}

	@Override
	public void setButtons() {
		addRowButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// model.addData(new Types());
				try {
					ReferenceType[] row = new ReferenceType[2];
					row[0] = new Jobs();
					row[1] = new JobPath((Jobs) row[0], AppSettings.getPREF_ACTIVE_INSTANCE_INST());
					model.addData(row);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});

		deleteRowButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int viewRow = table.convertRowIndexToModel(table
						.getSelectedRow());

				model.removeDataAt(viewRow);

			}
		});

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
			types = session.createQuery("FROM Types");
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

		table.setDefaultRenderer(Types.class, new ReferenceTypeCellRenderer());
		table.setDefaultEditor(Types.class, new ReferenceTypeCellEditor(
				typesList));

		table.getModel().addTableModelListener(this);

		customizeTable();

		scroll = new JScrollPane(table);

	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		int row = e.getFirstRow();

		try {
			session = so.getFactory().openSession();
			tx = session.beginTransaction();
			if (e.getType() == TableModelEvent.DELETE) {
				session.delete((Jobs) (list.get(row)[0]));
				session.delete((JobPath) (list.get(row)[1]));
			} else {
				session.saveOrUpdate((Jobs) (list.get(row)[0]));
				session.saveOrUpdate((JobPath) (list.get(row)[1]));
			}
			tx.commit();
		} catch (HibernateException err) {
			if (tx != null) {
				tx.rollback();
			}
			err.printStackTrace();

			JOptionPane.showMessageDialog(scroll, err.getMessage() + ":\n"
					+ err.getCause().getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);

		} finally {
			session.close();
		}

	}

	public void customizeTable() {
		table.getColumnModel().getColumn(0).setMinWidth(120);
		table.getColumnModel().getColumn(1).setMaxWidth(60);
	}

}
