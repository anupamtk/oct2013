package com.anupam.java;

import java.util.Calendar;
import java.util.Date;

public class DateApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//syso + CTRL + SPACE = System.out.println()
		Date date = new Date();
		System.out.println("d.toString() = "+date.toString());
		
		Calendar calendar = Calendar.getInstance();
//		calendar.set(2, 0);
		System.out.println("calendar.getTime() = " + calendar.getTime());
		System.out.println("calendar.getTimeInMillis() = " + calendar.getTimeInMillis());
		System.out.println("Year = calendar.get(calendar.YEAR) = " + calendar.get(calendar.YEAR));
		System.out.println("Month = calendar.get(calendar.MONTH) = " + calendar.get(calendar.MONTH));
		System.out.println("Date = calendar.get(calendar.DATE) = " + calendar.get(calendar.DATE));
		System.out.println("Hour = calendar.get(calendar.HOUR_OF_DAY) = " + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("Minute = calendar.get(calendar.MINUTE) = " + calendar.get(calendar.MINUTE));
		System.out.println("Second = calendar.get(calendar.SECOND) = " + calendar.get(calendar.SECOND));
		System.out.println("Day = calendar.get(calendar.DAY_OF_WEEK) = " + calendar.get(calendar.DAY_OF_WEEK));
		
		calendar.set(calendar.YEAR, 2011);
		System.out.println("calendar.set(calendar.YEAR, 2011) = " + calendar.getTime());
		
		calendar.set(2011, 1, 28);
		System.out.println("calendar.set(2011, 1, 28) = " + calendar.getTime());
		
		calendar.add(calendar.DATE, 1);
		System.out.println("calendar.add(calendar.DATE, 1) = " + calendar.getTime());
				
//		for(int a=0; a<=16; a++){
//			System.out.println("a = " + a + " " + calendar.get(a));
//		}


	}

}
