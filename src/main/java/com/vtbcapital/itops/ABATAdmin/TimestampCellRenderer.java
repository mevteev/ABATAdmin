package com.vtbcapital.itops.ABATAdmin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableCellRenderer;

public class TimestampCellRenderer extends DefaultTableCellRenderer {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7477727498230008085L;
	
	
	DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public TimestampCellRenderer() {
        super();
    }

    public void setValue(Object value) {
        if (formatter == null) {
            formatter = DateFormat.getDateInstance();
        }
        setText((value == null) ? "" : formatter.format(value));
    }
}
