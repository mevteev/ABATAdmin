package com.vtbcapital.itops.ABATAdmin;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReferenceTableDialog extends JDialog implements
		TableModelListener, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6785733541329538789L;

	protected JTable table;
	protected JScrollPane scroll;
	protected ReferenceTableModel model;
	protected List<ReferenceType> list;
	protected Session session;
	protected SessionObjects so;
	final protected Class dataClass;
	protected String tableName;

	protected JButton addRowButton = new JButton("Add row");
	protected JButton deleteRowButton = new JButton("Delete row");

	/**
	 * Create the panel.
	 */
	public ReferenceTableDialog(JFrame parent, SessionObjects so,
			String tableName, Class dataClass) {

		super(parent);

		this.dataClass = dataClass;
		this.tableName = tableName;

		setBounds(300, 300, 300, 300);
		setLocationRelativeTo(parent);

		this.so = so;

	}

	public void initialize() {
		setModel();
		setLayout();
		draw();
	}

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

		model = new ReferenceTableModel(list);
	}

	public void setLayout() {

		table = new JTable(model);

		table.getModel().addTableModelListener(this);

		scroll = new JScrollPane(table);

		customizeTable();

	}

	public void draw() {
		Container contentPane = getContentPane();
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.CENTER;
		c.weightx = 0.5;
		c.weighty = 1.0;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		contentPane.add(scroll, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.LINE_START;
		c.weightx = 0.5;
		c.weighty = 0;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		contentPane.add(addRowButton, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.LINE_START;
		c.weightx = 0.5;
		c.weighty = 0;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		contentPane.add(deleteRowButton, c);

		setButtons();

	}

	public void setButtons() {
		addRowButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// model.addData(new Types());
				try {
					model.addData((ReferenceType) ReferenceTableDialog.this.dataClass
							.newInstance());
				} catch (IllegalAccessException ex) {
					ex.printStackTrace();
				} catch (InstantiationException ex) {
					ex.printStackTrace();
				}

			}
		});

		deleteRowButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int viewRow = table.convertRowIndexToModel(table
						.getSelectedRow());

				model.removeDataAt(viewRow);

			}
		});

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

			JOptionPane.showMessageDialog(scroll, err.getMessage() + ":\n"
					+ err.getCause().getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);

		} finally {
			session.close();
		}

	}

	public void customizeTable() {
		table.getColumnModel().getColumn(0).setMaxWidth(36);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
