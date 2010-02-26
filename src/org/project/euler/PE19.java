package org.project.euler;

import java.util.Calendar;

/**
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and November.
 * All the rest have thirty-one, Saving February alone, Which has twenty-eight,
 * rain or shine. And on leap years, twenty-nine. A leap year occurs on any year
 * evenly divisible by 4, but not on a century unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 * 
 * @author shekhar.gulati
 * 
 */
public class PE19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch().start();
		int numberOfSundays = 0;
		Calendar calendar = Calendar.getInstance();
		calendar.set(1901, 0, 1);
		System.out.println(calendar.getTime());
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);
		if (startDay != Calendar.SUNDAY) {
			int numberOfDaysToAdd = Calendar.DAY_OF_WEEK - startDay
					+ Calendar.SUNDAY;
			calendar.add(Calendar.DAY_OF_MONTH, numberOfDaysToAdd);
		}
		System.out.println("First Sunday " + calendar.getTime());

		Calendar lastCalendar = Calendar.getInstance();
		lastCalendar.set(2000, 11, 31);

		while (lastCalendar.getTimeInMillis() > calendar.getTimeInMillis()) {
			if (isFirstDayOfMonth(calendar) && isSunday(calendar)) {
				System.out.println(calendar.getTime());
				numberOfSundays++;
			}
			calendar.add(Calendar.DAY_OF_MONTH, Calendar.DAY_OF_WEEK);
		}
		System.out.println("Total number of sundays that fell on 1st "
				+ numberOfSundays);
		stopWatch.stop().getElapsedTime();
	}

	private static boolean isSunday(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}

	private static boolean isFirstDayOfMonth(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_MONTH) == 1;
	}

}
