package com.vtbcapital.itops.ABATAdmin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.persistence.EntityManager;

// Simple Id - Name model 
public class ReferenceTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7090272012561512633L;

	protected List<ReferenceType> datalist;

	protected EntityManager entityManager;

	protected String[] columnNames = new String[] { "Id", "Name" };

	protected Class[] columnClass = new Class[] { Long.class, String.class };

	protected Set<TableModelListener> listeners = new HashSet<TableModelListener>();

	public ReferenceTableModel(List<ReferenceType> referenceList) {
		datalist = referenceList;
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnClass[columnIndex];
	}

	@Override
	public int getColumnCount() {

		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return datalist.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ReferenceType row = (ReferenceType) datalist.get(rowIndex);
		if (columnIndex == 0) {
			return row.getId();
		} else if (columnIndex == 1) {
			return row.getValue();
		} else {
			return null;
		}
	}

	public ReferenceType getRow(int rowIndex) {
		return datalist.get(rowIndex);
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		ReferenceType row = (ReferenceType) datalist.get(rowIndex);

		if (columnIndex == 0) {
		} else if (columnIndex == 1) {
			row.setValue((String) aValue);
		}
		fireTableRowsUpdated(rowIndex, rowIndex);
		// fireTableDataChanged();

		// System.out.println("Calling setValueAt row " + rowIndex + ", column "
		// + columnIndex);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	public ReferenceType getDataAt(int row) {
		return (ReferenceType) datalist.get(row);
	}

	public ReferenceType removeDataAt(int row) {
		fireTableRowsDeleted(row, row);
		return (ReferenceType) datalist.remove(row);

	}

	public void addData(ReferenceType w) {
		datalist.add(w);
		fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
		;
	}

	public ArrayList<ReferenceType> getChangedRows() {
		ArrayList<ReferenceType> changed = new ArrayList<>();
		for (ReferenceType rt : datalist) {
			if (rt.hasChanged()) {
				changed.add(rt);
			}
		}

		return changed;
	}

}
