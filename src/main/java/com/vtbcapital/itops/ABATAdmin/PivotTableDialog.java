package com.vtbcapital.itops.ABATAdmin;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListDataListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PivotTableDialog extends JDialog implements TableModelListener,
		ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 31313777469633318L;

	protected JTable table;
	protected JScrollPane scroll;
	protected PivotModel model;
	protected List<ReferenceType> rowList;
	protected List<ReferenceType> columnList;
	protected List<JobCompany> dataList;
	protected List<PivotItem> pivotItems;
	protected List<ReferenceType> typesList;
	protected Session session;
	protected SessionObjects so;
	protected String rowTableName;
	protected String columnTableName;
	protected String dataTableName;
	protected String typeTableName;

	protected JComboBox<ReferenceType> combo;

	/**
	 * Create the panel.
	 */
	public PivotTableDialog(JFrame parent, SessionObjects so,
			String rowTableName, String columnTableName, String dataTableName,
			String typeTableName) {

		super(parent);

		this.rowTableName = rowTableName;
		this.columnTableName = columnTableName;
		this.dataTableName = dataTableName;
		this.typeTableName = typeTableName;

		setBounds(100, 100, 600, 600);
		setLocationRelativeTo(parent);

		this.so = so;

	}

	public void initialize() {
		setModel(-1);
		setLayout();
		draw();
	}

	public void setModel(int rowFilter) {
		session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;

		try {
			tx = session.beginTransaction();

			types = session.createQuery("FROM " + typeTableName);
			typesList = types.list();

			if (typesList.isEmpty()) {
				types = session.createQuery("FROM " + rowTableName);
			} else if (rowFilter == -1) {
				types = session.createQuery("FROM " + rowTableName
						+ " WHERE CompanyType = " + typesList.get(0).getId());
			} else {
				types = session.createQuery("FROM " + rowTableName
						+ " WHERE CompanyType = " + rowFilter);

			}
			rowList = types.list();

			if (typesList.isEmpty()) {
				types = session.createQuery("FROM " + columnTableName);
			} else if (rowFilter == -1) {
				types = session.createQuery("FROM " + columnTableName
						+ " WHERE JobType = " + typesList.get(0).getId());
			} else {
				types = session.createQuery("FROM " + columnTableName
						+ " WHERE JobType = " + rowFilter);

			}

			columnList = types.list();

			types = session.createQuery("FROM " + dataTableName);
			dataList = types.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		pivotItems = new ArrayList<PivotItem>();
		for (ReferenceType rt : rowList) {
			pivotItems.add(new PivotItem(rt, columnList.size()));
		}

		for (JobCompany jc : dataList) {
			int rowIndex = rowList.indexOf(jc.getCompanyId());
			int colIndex = columnList.indexOf(jc.getJobId());

			if (rowIndex != -1 && colIndex != -1) {
				pivotItems.get(rowIndex).setFlag(true, colIndex);
			}
		}

		model = new PivotModel(rowList, columnList, dataList, pivotItems);

		model.addTableModelListener(this);
	}

	public void setLayout() {

		table = new JTable(model);
		customizeTable();
		table.setAutoCreateRowSorter(true);

		scroll = new JScrollPane(table);

		combo = new JComboBox(typesList.toArray());
		combo.addActionListener(this);

	}

	public void draw() {
		Container contentPane = getContentPane();
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 0.5;
		c.weighty = 0;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		contentPane.add(new JLabel("Type:"), c);

		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.EAST;
		c.weightx = 0.5;
		c.weighty = 0;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 1;
		contentPane.add(combo, c);

		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.CENTER;
		c.weightx = 0.5;
		c.weighty = 1.0;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		contentPane.add(scroll, c);

		/*
		 * c.fill = GridBagConstraints.HORIZONTAL; c.anchor =
		 * GridBagConstraints.LINE_START; c.weightx = 0.5; c.weighty = 0;
		 * c.gridx = 0; c.gridy = 1; c.gridwidth = 1;
		 * contentPane.add(addRowButton, c);
		 * 
		 * c.fill = GridBagConstraints.HORIZONTAL; c.anchor =
		 * GridBagConstraints.LINE_START; c.weightx = 0.5; c.weighty = 0;
		 * c.gridx = 1; c.gridy = 1; c.gridwidth = 1;
		 * contentPane.add(deleteRowButton, c);
		 * 
		 * 
		 * 
		 * addRowButton.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * //model.addData(new Types()); try { model.addData((ReferenceType)
		 * ReferenceTableDialog.this.dataClass.newInstance()); } catch
		 * (IllegalAccessException ex) { ex.printStackTrace(); } catch
		 * (InstantiationException ex) { ex.printStackTrace(); }
		 * 
		 * 
		 * } });
		 * 
		 * deleteRowButton.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * model.removeDataAt(table.getSelectedRow());
		 * 
		 * } });
		 */
	}

	public void customizeTable() {
		TableCellRenderer headerRenderer = new VerticalTableHeaderCellRenderer();
		Enumeration<TableColumn> columns = table.getColumnModel().getColumns();
		int colNum = 0;
		while (columns.hasMoreElements()) {
			TableColumn tc = columns.nextElement();
			tc.setHeaderRenderer(headerRenderer);
			if (colNum > 0) {
				tc.setMaxWidth(36);
			}
			colNum++;
		}
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		int row = e.getFirstRow();
		int column = e.getColumn();

		JobCompany editedJC = new JobCompany();
		editedJC.setCompanyId((Companies) rowList.get(row));
		editedJC.setJobId((Jobs) columnList.get(column - 1));

		if (dataList.contains(editedJC)) {
			if (!pivotItems.get(row).getFlags()[column - 1]) {
				// delete item

				int idx = dataList.indexOf(editedJC);

				try {
					session = so.getFactory().openSession();
					tx = session.beginTransaction();
					session.delete(dataList.get(idx));
					dataList.remove(idx);

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
		} else if (pivotItems.get(row).getFlags()[column - 1]) {
			// add item
			try {
				session = so.getFactory().openSession();
				tx = session.beginTransaction();
				session.saveOrUpdate(editedJC);
				dataList.add(editedJC);

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

		//
		// try {
		// session = so.getFactory().openSession();
		// tx = session.beginTransaction();
		// if (e.getType() == TableModelEvent.DELETE) {
		// session.delete(list.get(row));
		// } else {
		// session.saveOrUpdate(list.get(row));
		// }
		// tx.commit();
		// } catch (HibernateException err) {
		// if (tx != null) {
		// tx.rollback();
		// }
		// err.printStackTrace();
		// } finally {
		// session.close();
		// }

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == combo) {
			setModel(((ReferenceType) combo.getSelectedItem()).getId()
					.intValue());
			table.setModel(model);
			customizeTable();
		}

	}

}
