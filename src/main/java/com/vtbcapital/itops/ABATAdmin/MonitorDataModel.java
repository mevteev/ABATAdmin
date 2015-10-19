package com.vtbcapital.itops.ABATAdmin;

import java.util.Date;

public class MonitorDataModel extends MonitorAbstractTreeTableModel {

	static protected String[] columnNames = { "Level", "Name", "ID", "State",
			"ExecutionTime", "ExitCode", "ExitCodeDescription", "Company",
			"Start Date", "End Date", "Parameters", "User" };

	static protected Class<?>[] columnTypes = { Integer.class,
			MonitorTreeTableModel.class, Integer.class, String.class,
			Date.class, Integer.class, String.class, Date.class, Date.class,
			String.class, String.class, String.class };

	public MonitorDataModel(ActiveJob rootNode) {
		super(rootNode);
		root = rootNode;
	}

	public Object getChild(Object parent, int index) {
		return ((ActiveJob) parent).getChildren().get(index);
	}

	public int getChildCount(Object parent) {
		return ((ActiveJob) parent).getChildren().size();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int column) {
		return columnNames[column];
	}

	public Class<?> getColumnClass(int column) {
		return columnTypes[column];
	}

	@Override
	public Object getValueAt(Object node, int column) {
		switch (column) {
		case 0:
			return ((ActiveJob) node).getLevel();
		case 1:
			return ((ActiveJob) node).getName();
		case 2:
			return ((ActiveJob) node).getId();
		case 3:
			return ABHelper.getInstanceState(((ActiveJob) node).getState());
		case 4:
			return ((ActiveJob) node).getExecutionTime();
		case 5:
			return ((ActiveJob) node).getExitCode();
		case 6:
			return ((ActiveJob) node).getExitCodeDescription();
		case 7:
			return ((ActiveJob) node).getCompany();
		case 8:
			return ((ActiveJob) node).getStartDate();
		case 9:
			return ((ActiveJob) node).getEndDate();
		case 10:
			return ((ActiveJob) node).getParameters();
		case 11:
			return ((ActiveJob) node).getUser();
		default:
			break;
		}
		return null;
	}

	public boolean isCellEditable(Object node, int column) {
		return true; // Important to activate TreeExpandListener
	}

	public void setValueAt(Object aValue, Object node, int column) {
	}

}
