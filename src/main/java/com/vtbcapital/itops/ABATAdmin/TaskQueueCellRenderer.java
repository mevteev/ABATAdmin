package com.vtbcapital.itops.ABATAdmin;

import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TaskQueueCellRenderer extends DefaultTableCellRenderer {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8254546006116312154L;
	
	public TaskQueueCellRenderer() {
		super();
	}

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		
/*        Component c = super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
            TaskQueueModel model = (TaskQueueModel) table.getModel();
            if (model.getValueAt(row, 6).toString().equals("Cancelled")) {
                c.setBackground(Color.green.darker());
            } else if (!isSelected) {
                c.setBackground(table.getBackground());
            }
            System.out.println("sdasdasd");
            return c;
*/

		Component cell = super.getTableCellRendererComponent(table, value,
				isSelected, hasFocus, row, column);
		if (table.getColumnCount() > 6) {
			Object columnValue = table.getValueAt(row, 6);
			String columnValue1 = columnValue.toString();
			columnValue1 = columnValue1.trim();
			Colors color = ColorByState.colorByStateQueue.get(columnValue1);
	
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
		
		//System.out.println("sdasdasd");
		}

		return cell;
	
	}

	
}
