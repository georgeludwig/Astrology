package com.georgeludwigtech.astrology;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateRangeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testApp() throws Exception {
		// create date range
		DateRange dateRange=new DateRange();
		Calendar startCal=new GregorianCalendar();
		startCal.set(Calendar.YEAR, 1960);
		startCal.set(Calendar.MONTH, Calendar.DECEMBER);
		startCal.set(Calendar.DAY_OF_MONTH, 31);
		dateRange.setStart(startCal.getTimeInMillis());
		Calendar endCal=new GregorianCalendar();
		endCal.set(Calendar.YEAR, 1960);
		endCal.set(Calendar.MONTH, Calendar.JANUARY);
		endCal.set(Calendar.DAY_OF_MONTH, 2);
		dateRange.setEnd(endCal.getTimeInMillis());
		// create reference date
		Calendar reference=new GregorianCalendar();
		reference.set(Calendar.YEAR, 1970);
		reference.set(Calendar.MONTH, Calendar.JANUARY);
		reference.set(Calendar.DAY_OF_MONTH, 1);
		// get age list
		List<Integer>ageList=dateRange.getAgeList(reference.getTimeInMillis());
		// assertions
		assertTrue(ageList.size()==1);
		assertTrue(ageList.get(0)==9);
		
		// create date range
		dateRange=new DateRange();
		startCal=new GregorianCalendar();
		startCal.set(Calendar.YEAR, 1960);
		startCal.set(Calendar.MONTH, Calendar.DECEMBER);
		startCal.set(Calendar.DAY_OF_MONTH, 31);
		dateRange.setStart(startCal.getTimeInMillis());
		endCal=new GregorianCalendar();
		endCal.set(Calendar.YEAR, 1961);
		endCal.set(Calendar.MONTH, Calendar.JANUARY);
		endCal.set(Calendar.DAY_OF_MONTH, 2);
		dateRange.setEnd(endCal.getTimeInMillis());
		// create reference date
		reference=new GregorianCalendar();
		reference.set(Calendar.YEAR, 1970);
		reference.set(Calendar.MONTH, Calendar.JANUARY);
		reference.set(Calendar.DAY_OF_MONTH, 1);
		// get age list
		ageList=dateRange.getAgeList(reference.getTimeInMillis());
		// assertions
		assertTrue(ageList.size()==2);
		assertTrue(ageList.get(0)==8);
		assertTrue(ageList.get(1)==9);
		
		// create date range
		dateRange=new DateRange();
		startCal=new GregorianCalendar();
		startCal.set(Calendar.YEAR, 1960);
		startCal.set(Calendar.MONTH, Calendar.DECEMBER);
		startCal.set(Calendar.DAY_OF_MONTH, 31);
		dateRange.setStart(startCal.getTimeInMillis());
		endCal=new GregorianCalendar();
		endCal.set(Calendar.YEAR, 1968);
		endCal.set(Calendar.MONTH, Calendar.JANUARY);
		endCal.set(Calendar.DAY_OF_MONTH, 2);
		dateRange.setEnd(endCal.getTimeInMillis());
		// create reference date
		reference=new GregorianCalendar();
		reference.set(Calendar.YEAR, 1970);
		reference.set(Calendar.MONTH, Calendar.JANUARY);
		reference.set(Calendar.DAY_OF_MONTH, 1);
		// get age list
		ageList=dateRange.getAgeList(reference.getTimeInMillis());
		// assertions
		assertTrue(ageList.size()==9);
		assertTrue(ageList.get(0)==1);
		assertTrue(ageList.get(8)==9);
	
		// create date range
		dateRange=new DateRange();
		startCal=new GregorianCalendar();
		startCal.set(Calendar.YEAR, 1962);
		startCal.set(Calendar.MONTH, Calendar.FEBRUARY);
		startCal.set(Calendar.DAY_OF_MONTH, 23);
		dateRange.setStart(startCal.getTimeInMillis());
		endCal=new GregorianCalendar();
		endCal.set(Calendar.YEAR, 1962);
		endCal.set(Calendar.MONTH, Calendar.FEBRUARY);
		endCal.set(Calendar.DAY_OF_MONTH, 22);
		dateRange.setEnd(endCal.getTimeInMillis());
		// create reference date
		reference=new GregorianCalendar();
		reference.set(Calendar.YEAR, 2010);
		reference.set(Calendar.MONTH, Calendar.DECEMBER);
		reference.set(Calendar.DAY_OF_MONTH, 20);
		// get age list
		ageList=dateRange.getAgeList(reference.getTimeInMillis());
		// assertions
		assertTrue(ageList.size()==1);
		assertTrue(ageList.get(0)==48);

	}
	
}
