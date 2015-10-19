package com.vtbcapital.itops.ABATAdmin;

import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class MonitorTableCellRenderer extends DefaultTableCellRenderer {

	public MonitorTableCellRenderer() {
		super();

	}

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {

		Component cell = super.getTableCellRendererComponent(table, value,
				isSelected, hasFocus, row, column);
		Object columnValue = table.getValueAt(row,
				MonitorTreeTable.MONITOR_STATE_COLUMN);
		String columnValue1 = columnValue.toString();
		columnValue1 = columnValue1.trim();

		Object columnValue2 = table.getValueAt(row, 0);
		String columnValue3 = columnValue2.toString();
		columnValue3 = columnValue3.toString();

		Colors color = ColorByState.colorByState.get(columnValue1);

		if (isSelected) {
			setBackground(table.getSelectionBackground());
			setForeground(table.getSelectionForeground());
		} else if (color != null) {
			if (color.background == null) {
				setBackground(table.getBackground());
			} else {
				setBackground(color.background);
			}

			if (color.foreground == null) {
				setForeground(table.getForeground());
			} else {
				setForeground(color.foreground);
			}
		} else {
			setBackground(table.getBackground());
			setForeground(table.getForeground());

		}

		int level = Integer.parseInt(table.getValueAt(row, 0).toString());

		if (this.getText().equals("0") && level < 3)
			this.setText("");

		if (value instanceof Date) {
			String sdfStr;
			if (column < 6)
				sdfStr = "dd.MM.yyyy HH:mm:ss";
			else
				sdfStr = "dd.MM.yyyy";

			SimpleDateFormat sdf = new SimpleDateFormat(sdfStr);

			this.setText(sdf.format((Date) value));
		}

		return cell;
	}

}
