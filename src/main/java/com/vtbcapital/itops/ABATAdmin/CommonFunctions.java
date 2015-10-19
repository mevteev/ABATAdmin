package com.vtbcapital.itops.ABATAdmin;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CommonFunctions {
	
	public static void main(String[] args) {
		System.out.println(getCurrentTimezoneOffset());
	}
	
	
	public static int getCurrentTimezoneOffset() {

	    TimeZone tz = TimeZone.getDefault();  
	    Calendar cal = GregorianCalendar.getInstance(tz);
	    int offsetInMillis = tz.getOffset(cal.getTimeInMillis());

	    return offsetInMillis;
	}

}
