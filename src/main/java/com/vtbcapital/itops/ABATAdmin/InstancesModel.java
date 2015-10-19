package com.vtbcapital.itops.ABATAdmin;

import java.util.List;

public class InstancesModel extends ReferenceTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3734969766314407687L;

	public InstancesModel(List<ReferenceType> referenceList) {
		super(referenceList);

		columnNames = new String[] { "Name", "Host" };

		columnClass = new Class[] { String.class, String.class };
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Instances row = (Instances) datalist.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return row.getValue();
		case 1:
			return row.getInstanceHost();
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Instances row = (Instances) datalist.get(rowIndex);

		switch (columnIndex) {
		case 0:
			row.setValue((String) aValue);
			break;
		case 1:
			row.setInstanceHost((String) aValue);
			break;
		}

		fireTableRowsUpdated(rowIndex, rowIndex);
	}

}
