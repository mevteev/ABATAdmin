package com.vtbcapital.itops.ABATAdmin;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.sound.sampled.DataLine;
import javax.swing.table.AbstractTableModel;
import javax.swing.event.TableModelListener;

public class PivotModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2492580165381047151L;

	protected List<ReferenceType> rowsList, columnsList;

	protected List<JobCompany> dataList;

	protected List<PivotItem> pivotItems;

	protected EntityManager entityManager;

	protected String[] columnNames;

	protected Class[] columnClass;

	protected Set<TableModelListener> listeners = new HashSet<TableModelListener>();

	public PivotModel(List<ReferenceType> rowsList,
			List<ReferenceType> columnsList, List<JobCompany> dataList,
			List<PivotItem> pivotItems) {
		this.rowsList = rowsList;
		this.columnsList = columnsList;
		this.dataList = dataList;
		this.pivotItems = pivotItems;

		columnNames = new String[columnsList.size() + 1];
		columnClass = new Class[columnsList.size() + 1];

		columnClass[0] = Companies.class;

		for (int i = 0; i < columnsList.size(); i++) {
			columnNames[i + 1] = columnsList.get(i).toString();
			columnClass[i + 1] = Boolean.class;
		}

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
		return rowsList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		PivotItem row = (PivotItem) pivotItems.get(rowIndex);
		if (columnIndex == 0) {
			return row.getItem();
		} else if (columnIndex <= columnsList.size()) {
			return row.getFlag(columnIndex - 1);
		} else
			return null;
	}

	public ReferenceType getRow(int rowIndex) {
		return rowsList.get(rowIndex);
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		PivotItem row = (PivotItem) pivotItems.get(rowIndex);
		if (columnIndex == 0) {
		} else if (columnIndex <= columnsList.size()) {
			row.setFlag((Boolean) aValue, columnIndex - 1);
		}
		fireTableCellUpdated(rowIndex, columnIndex);

		// System.out.println("Calling setValueAt row " + rowIndex + ", column "
		// + columnIndex);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex != 0;
	}

	public ReferenceType getDataAt(int row) {
		return (ReferenceType) rowsList.get(row);
	}

	public ReferenceType removeDataAt(int row) {
		fireTableRowsDeleted(row, row);
		return (ReferenceType) rowsList.remove(row);

	}

	public ArrayList<ReferenceType> getChangedRows() {
		ArrayList<ReferenceType> changed = new ArrayList<>();
		for (ReferenceType rt : rowsList) {
			if (rt.hasChanged()) {
				changed.add(rt);
			}
		}

		return changed;
	}

}
