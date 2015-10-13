package com.georgeludwigtech.astrology;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MonthRange {
	
	public MonthRange(int startMonth, int startDay, int endMonth, int endDay) {
		setStartMonth(startMonth);
		setStartDay(startDay);
		setEndMonth(endMonth);
		setEndDay(endDay);
	}
	
	private int startMonth;
	private int endMonth;
	private int startDay;
	private int endDay;

	
	public int getStartMonth() {
		return startMonth;
	}
	private void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}
	public int getEndMonth() {
		return endMonth;
	}
	private void setEndMonth(int endMonth) {
		this.endMonth = endMonth;
	}
	public int getStartDay() {
		return startDay;
	}
	private void setStartDay(int startDay) {
		this.startDay = startDay;
	}
	public int getEndDay() {
		return endDay;
	}
	public void setEndDay(int endDay) {
		this.endDay = endDay;
	}

	public DateRange getDateRange(int year) {
		DateRange dateRange=new DateRange();
		Calendar start=new GregorianCalendar();
		start.set(Calendar.YEAR, year);
		start.set(Calendar.MONTH,getStartMonth());
		start.set(Calendar.DAY_OF_MONTH,getStartDay());
		start.set(Calendar.HOUR, 0);
		start.set(Calendar.MINUTE, 0);
		start.set(Calendar.SECOND, 0);
		start.set(Calendar.MILLISECOND, 0);
		start.set(Calendar.AM_PM, Calendar.AM);
		dateRange.setStart(start.getTimeInMillis());
		Calendar end=new GregorianCalendar();
		end.set(Calendar.YEAR, year);
		end.set(Calendar.MONTH,getEndMonth());
		end.set(Calendar.DAY_OF_MONTH,getEndDay());
		end.set(Calendar.HOUR, 11);
		end.set(Calendar.MINUTE, 59);
		end.set(Calendar.SECOND, 59);
		end.set(Calendar.MILLISECOND, 999);
		end.set(Calendar.AM_PM, Calendar.PM);
		dateRange.setEnd(end.getTimeInMillis());
		return dateRange;
	}
	
	public String toString() {
		return getMonth(getStartMonth())+" "+getStartDay()+" to "+getMonth(getEndMonth())+" "+getEndDay();
	}
	
	public static String getMonth(int month) {
		switch(month) {
			case 0: return "Jan";
			case 1: return "Feb";
			case 2: return "Mar";
			case 3: return "Apr";
			case 4: return "May";
			case 5: return "Jun";
			case 6: return "Jul";
			case 7: return "Aug";
			case 8: return "Sep";
			case 9: return "Oct";
			case 10: return "Nov";		
			case 11: return "Dec";
		}
		return "unkown";
	}
}
