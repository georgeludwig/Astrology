package com.georgeludwigtech.astrology;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateRange {
	
	private long start;
	
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public Calendar getStartCalendar() {
		Calendar c=new GregorianCalendar();
		c.setTimeInMillis(getStart());
		return c;
	}
	
	private long end;
	
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	public Calendar getEndCalendar() {
		Calendar c=new GregorianCalendar();
		c.setTimeInMillis(getEnd());
		return c;
	}
	
	public boolean contains(long date) {
		Calendar cal=new GregorianCalendar();
		cal.setTimeInMillis(date);
		// for debug
		SimpleDateFormat df=new SimpleDateFormat("MM-yyyy-dd HH:mm:ss:SSSS");
		String dateString=df.format(cal.getTime());
		String startString=df.format(getStartCalendar().getTime());
		String endString=df.format(getEndCalendar().getTime());
		int compareStart=getStartCalendar().compareTo(cal);
		int compareEnd=getEndCalendar().compareTo(cal);
		if(compareStart<=0&&compareEnd>=0)
			return true;
		return false;
	}
	
	public List<Integer>getAgeList(long referenceDate) {
		List<Integer>ret=new ArrayList<Integer>();
		// get the max age
		Integer maxAge=getAge(getStart(),referenceDate);
		ret.add(maxAge);
		// get the min age
		Integer minAge=getAge(getEnd(),referenceDate);
		if(maxAge!=minAge)
			ret.add(minAge);
		// fill in the middle, if any
		int ctr=maxAge-minAge-1;
		for(int i=0;i<ctr;i++) {
			Integer integer=new Integer(minAge+i+1);
			ret.add(integer);
		}
		Collections.sort(ret);
		return ret;
	}
	
	public Integer getAge(long birthDate, long referenceDate) {
		// Create a calendar object with the date of birth
		Calendar dateOfBirth = new GregorianCalendar();
		dateOfBirth.setTimeInMillis(birthDate);
		// Create a calendar object with reference date
		Calendar today = new GregorianCalendar();
		today.setTimeInMillis(referenceDate);
		// Get age based on year
		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		// Add the tentative age to the date of birth to get this year's birthday
		dateOfBirth.add(Calendar.YEAR, age);
		// If this year's birthday has not happened yet, subtract one from age
		if (today.before(dateOfBirth)) {
		    age--;
		}
		return age;
	}
	
	public String toString() {
		SimpleDateFormat df=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss:SSSS");
		String startDateString=df.format(new Date(getStart()));
		String endDateString=df.format(new Date(getEnd()));
		return "from "+startDateString+" to "+endDateString;
	}
}
