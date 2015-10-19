package com.vtbcapital.itops.ABATAdmin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String ddd = "2015-08-27T01:00:00.000+0300";
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        
		Date implementationTime = new Date();
		try {
			implementationTime = formatter.parse(ddd);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(implementationTime);
			//cal.add(Calendar.DATE, dateShift);
			
			implementationTime = cal.getTime();
			
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(implementationTime);

    }
}
