package com.vtbcapital.itops.ABATAdmin;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ReferenceTypeCellRenderer extends DefaultTableCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2467009459247196536L;

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		if (value instanceof ReferenceType) {
			ReferenceType rt = (ReferenceType) value;
			setText(rt.getValue());
		}

		if (isSelected) {
			setBackground(table.getSelectionBackground());
		} else {
			setBackground(table.getSelectionForeground());
		}

		return this;
	}

}
