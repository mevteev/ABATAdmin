package com.vtbcapital.itops.ABATAdmin;

import java.util.List;

public class CompaniesModel extends ReferenceTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1468588464875432902L;

	public CompaniesModel(List<ReferenceType> referenceList) {
		super(referenceList);

		columnNames = new String[] { "Name", "Type", "Memo1", "Memo2" };

		columnClass = new Class[] { String.class, Types.class, String.class,
				String.class };
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Companies row = (Companies) datalist.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return row.getValue();
		case 1:
			return row.getCompanyType();
		case 2:
			return row.getMemo1();
		case 3:
			return row.getMemo2();
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Companies row = (Companies) datalist.get(rowIndex);

		switch (columnIndex) {
		case 0:
			row.setValue((String) aValue);
			break;
		case 1:
			row.setCompanyType((Types) aValue);
			break;
		case 2:
			row.setMemo1((String) aValue);
			break;
		case 3:
			row.setMemo2((String) aValue);
			break;
		}

		fireTableRowsUpdated(rowIndex, rowIndex);
		// fireTableDataChanged();

		// System.out.println("Calling setValueAt row " + rowIndex + ", column "
		// + columnIndex);
	}

}
