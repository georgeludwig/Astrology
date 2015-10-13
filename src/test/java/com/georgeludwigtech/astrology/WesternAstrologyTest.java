package com.georgeludwigtech.astrology;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.georgeludwigtech.astrology.western.*;

public class WesternAstrologyTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testApp() throws Exception {
		// test getSign()
		Calendar birthDate=new GregorianCalendar();

		// Aries test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.MARCH);
		birthDate.set(Calendar.DAY_OF_MONTH,21);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Aries.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.APRIL);
		birthDate.set(Calendar.DAY_OF_MONTH,20);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Aries.class);
		// Taurus test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.APRIL);
		birthDate.set(Calendar.DAY_OF_MONTH,21);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Taurus.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.MAY);
		birthDate.set(Calendar.DAY_OF_MONTH,21);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Taurus.class);
		// Gemini test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.MAY);
		birthDate.set(Calendar.DAY_OF_MONTH,22);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Gemini.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.JUNE);
		birthDate.set(Calendar.DAY_OF_MONTH,21);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Gemini.class);
		// Cancer test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.JUNE);
		birthDate.set(Calendar.DAY_OF_MONTH,22);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Cancer.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.JULY);
		birthDate.set(Calendar.DAY_OF_MONTH,22);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Cancer.class);
		// Leo test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.JULY);
		birthDate.set(Calendar.DAY_OF_MONTH,23);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Leo.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.AUGUST);
		birthDate.set(Calendar.DAY_OF_MONTH,22);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Leo.class);
		// Virgo test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.AUGUST);
		birthDate.set(Calendar.DAY_OF_MONTH,23);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Virgo.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.SEPTEMBER);
		birthDate.set(Calendar.DAY_OF_MONTH,21);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Virgo.class);
		// Libra test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.SEPTEMBER);
		birthDate.set(Calendar.DAY_OF_MONTH,22);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Libra.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.OCTOBER);
		birthDate.set(Calendar.DAY_OF_MONTH,22);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Libra.class);
		// Scorpio test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.OCTOBER);
		birthDate.set(Calendar.DAY_OF_MONTH,23);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Scorpio.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.NOVEMBER);
		birthDate.set(Calendar.DAY_OF_MONTH,21);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Scorpio.class);
		// Sagittarius test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.NOVEMBER);
		birthDate.set(Calendar.DAY_OF_MONTH,22);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Sagittarius.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.DECEMBER);
		birthDate.set(Calendar.DAY_OF_MONTH,21);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Sagittarius.class);
		// Capricorn test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.DECEMBER);
		birthDate.set(Calendar.DAY_OF_MONTH,22);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Capricorn.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.JANUARY);
		birthDate.set(Calendar.DAY_OF_MONTH,20);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Capricorn.class);
		// Aquarius test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.JANUARY);
		birthDate.set(Calendar.DAY_OF_MONTH,21);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Aquarius.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.FEBRUARY);
		birthDate.set(Calendar.DAY_OF_MONTH,19);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Aquarius.class);
		// Pisces test
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.FEBRUARY);
		birthDate.set(Calendar.DAY_OF_MONTH,20);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Pisces.class);
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH,Calendar.MARCH);
		birthDate.set(Calendar.DAY_OF_MONTH,20);
		assertTrue(WesternZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Pisces.class);
		
		// test getSignList()
		List<Sign>signList=WesternZodiac.getSignList();
		assertTrue(signList.size()==12);
	}

}
