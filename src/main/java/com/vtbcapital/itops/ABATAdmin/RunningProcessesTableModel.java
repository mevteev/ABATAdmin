package com.vtbcapital.itops.ABATAdmin;

import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class RunningProcessesTableModel extends AbstractTableModel {
	
	protected String[] columnNames = { 
		"Name", 
		"ID",
		"ExecutionTime", 
		"Company",
		"Start Date", 
		"End Date", 
		"Parameters", 
		"User" };

	protected Class<?>[] columnTypes = { 
		String.class,
		Integer.class, 
		Date.class, 
		String.class, 
		Date.class, 
		Date.class,
		String.class, 
		String.class };
	
	private List<ActiveJob> data;
	
	public RunningProcessesTableModel(List<ActiveJob> data) {
		this.data = data;
	}


	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ActiveJob node = data.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return ((ActiveJob) node).getName();
		case 1:
			return ((ActiveJob) node).getId();
		case 2:
			return ((ActiveJob) node).getExecutionTime();
		case 3:
			return ((ActiveJob) node).getCompany();
		case 4:
			return ((ActiveJob) node).getStartDate();
		case 5:
			return ((ActiveJob) node).getEndDate();
		case 6:
			return ((ActiveJob) node).getParameters();
		case 7:
			return ((ActiveJob) node).getUser();
		default:
			break;
		}
		return null;
	}
	
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
	
	public boolean isCellEditable(int row, int col) {
		return false;
	}
	
	public void setValueAt(Object value, int row, int col) {
		
	}

}
