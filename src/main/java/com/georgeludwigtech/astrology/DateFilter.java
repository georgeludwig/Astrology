package com.georgeludwigtech.astrology;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class DateFilter {

	public static List<DateRange>filterByMonthRange(DateRange sourceDateRange, MonthRange monthRange) {
		List<DateRange>filteredDateRangeList=new ArrayList<DateRange>();
		// get list of years contained in the date range
		List<Integer>yearList=getYearList(sourceDateRange);
		// for every year, get a list of DateRanges that correspond to the MonthRange for that year
		for(int year:yearList) {
			// get list of DateRanges for the year
			DateRange dr=filterByYearAndMonthRange(sourceDateRange,year,monthRange);
			// add the DateRages to master list
			if(dr!=null)
				filteredDateRangeList.add(dr);
		}
		return filteredDateRangeList;
	}
	
	/**
	 * 
	 * return a list of years that are contained in the date range
	 * @param date
	 * @return
	 */
	public static List<Integer>getYearList(DateRange dateRange) {
		List<Integer>yearList=new ArrayList<Integer>();
		// create start calendar
		Calendar start=dateRange.getStartCalendar();
		// create end calendar
		Calendar end=dateRange.getEndCalendar();
		// get start year
		int startYear=start.get(Calendar.YEAR);
		// get end year
		int endYear=end.get(Calendar.YEAR);
		for(int i=0;i<endYear-startYear+1;i++) {
			yearList.add(startYear+i);
		}
		return yearList;
	}
	
	/**
	 * 
	 * get DateRanges for a given year contained within the month range
	 * @param year
	 * @param sourceDateRange
	 * @return
	 */
	public static DateRange filterByYearAndMonthRange(DateRange dateRange, int year, MonthRange monthRange) {
		// create start calendar for begin of month range
		Calendar targetStart=new GregorianCalendar();
		targetStart.set(Calendar.YEAR,year);
		targetStart.set(Calendar.MONTH,monthRange.getStartMonth());
		targetStart.set(Calendar.DAY_OF_MONTH,monthRange.getStartDay());
		// create end calendar for end of month range
		Calendar targetEnd=new GregorianCalendar();
		targetEnd.set(Calendar.YEAR,year);
		targetEnd.set(Calendar.MONTH,monthRange.getEndMonth());
		targetEnd.set(Calendar.DAY_OF_MONTH,monthRange.getEndDay());
		// create return value
		DateRange ret=new DateRange();
		// for beginning of ret, use whichever is greater of source or target start
		if(dateRange.getStart()>=targetStart.getTimeInMillis()&&targetStart.getTimeInMillis()<=dateRange.getEnd())
			ret.setStart(dateRange.getStart());
		else ret.setStart(targetStart.getTimeInMillis());
		// for end of ret, use whichever is lesser of source or target end
		if(dateRange.getEnd()<=targetEnd.getTimeInMillis()&&targetEnd.getTimeInMillis()>=dateRange.getStart())
			ret.setEnd(dateRange.getEnd());
		else ret.setEnd(targetEnd.getTimeInMillis());
		// check for range compatibility
		DateRange targetDateRange=new DateRange();
		if(dateRange.contains(ret.getStart())&&dateRange.contains(ret.getEnd())) {
			return ret;
		}
		return null;
	}
	
}
