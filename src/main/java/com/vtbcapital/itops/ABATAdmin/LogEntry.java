package com.vtbcapital.itops.ABATAdmin;

import java.util.Date;

public class LogEntry {
	Date date;
	String info;
	
	public LogEntry(Date date, String info) {
		this.date = date;
		this.info = info;
	}
}