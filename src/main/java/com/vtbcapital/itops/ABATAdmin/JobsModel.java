package com.vtbcapital.itops.ABATAdmin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class JobsModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3234370030002073556L;

	protected EntityManager entityManager;

	protected String[] columnNames;

	protected Class[] columnClass;

	protected Set<TableModelListener> listeners = new HashSet<TableModelListener>();

	protected List<Object[]> datalist;

	public JobsModel(List<Object[]> referenceList) {

		datalist = referenceList;

		columnNames = new String[] { "Name", "Type", "Active Batch Path", "Param1", "Param2", "Parallel", "Monopoly" };

		columnClass = new Class[] { String.class, Types.class, String.class, String.class, String.class, Boolean.class, Boolean.class };
	}

	public Object getValueAt(int rowIndex, int columnIndex) {

		Object[] row = (Object[]) datalist.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return ((Jobs) row[0]).getValue();
		case 1:
			return ((Jobs) row[0]).getJobType();
		case 2:
			JobPath jp = (JobPath) row[1];
			if (jp != null)
				return ((JobPath) row[1]).getPath();
			else
				return "";
		case 3:
			return ((Jobs) row[0]).getParam1();
		case 4:
			return ((Jobs) row[0]).getParam2();
		case 5:
			return ((Jobs) row[0]).isParallel();
		case 6:
			return ((Jobs) row[0]).isMonopoly();
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Object[] row = (Object[]) datalist.get(rowIndex);

		switch (columnIndex) {
		case 0:
			((Jobs) row[0]).setValue((String) aValue);
			break;
		case 1:
			((Jobs) row[0]).setJobType((Types) aValue);
			break;
		case 2:
			// row.setABPath((String) aValue);
			JobPath jp = (JobPath) row[1];
			if (jp != null)
				((JobPath) row[1]).setPath((String) aValue);
			else {
				jp = new JobPath();
				jp.setInstanceId(AppSettings.getActiveInstance());
				jp.setJobId((Jobs) row[0]);
				jp.setPath((String) aValue);
				row[1] = jp;
				datalist.set(rowIndex, row);
			}
			break;
		case 3:
			((Jobs) row[0]).setParam1((String) aValue);
			break;
		case 4:
			((Jobs) row[0]).setParam2((String) aValue);
			break;
		case 5:
			((Jobs) row[0]).setParallel((boolean) aValue);
			break;
		case 6:
			((Jobs) row[0]).setMonopoly((boolean) aValue);
			break;			
		}

		fireTableRowsUpdated(rowIndex, rowIndex);
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnClass[columnIndex];
	}

	public int getColumnCount() {

		return columnNames.length;
	}

	public int getRowCount() {
		return datalist.size();
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	public ReferenceType[] getDataAt(int row) {
		return (ReferenceType[]) datalist.get(row);
	}

	public Object[] removeDataAt(int row) {
		fireTableRowsDeleted(row, row);
		return (Object[]) datalist.remove(row);

	}

	public void addData(ReferenceType[] w) {
		datalist.add(w);
		fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
		;
	}

	public ArrayList<Object[]> getChangedRows() {
		ArrayList<Object[]> changed = new ArrayList<>();
		for (Object[] rt : datalist) {
			if (((ReferenceType) rt[0]).hasChanged()
					|| ((ReferenceType) rt[1]).hasChanged()) {
				changed.add(rt);
			}
		}

		return changed;
	}

}
