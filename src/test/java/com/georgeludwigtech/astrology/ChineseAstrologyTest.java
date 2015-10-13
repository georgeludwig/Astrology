package com.georgeludwigtech.astrology;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.georgeludwigtech.astrology.chinese.ChineseZodiac;
import com.georgeludwigtech.astrology.chinese.Dog;
import com.georgeludwigtech.astrology.chinese.Dragon;
import com.georgeludwigtech.astrology.chinese.Goat;
import com.georgeludwigtech.astrology.chinese.Horse;
import com.georgeludwigtech.astrology.chinese.Monkey;
import com.georgeludwigtech.astrology.chinese.Ox;
import com.georgeludwigtech.astrology.chinese.Pig;
import com.georgeludwigtech.astrology.chinese.Rabbit;
import com.georgeludwigtech.astrology.chinese.Rat;
import com.georgeludwigtech.astrology.chinese.Rooster;
import com.georgeludwigtech.astrology.chinese.Snake;
import com.georgeludwigtech.astrology.chinese.Tiger;

public class ChineseAstrologyTest {

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
		birthDate.set(Calendar.YEAR, 1924);
		birthDate.set(Calendar.MONTH, Calendar.JUNE);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Rat.class);
		birthDate.set(Calendar.YEAR, 1925);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Ox.class);
		birthDate.set(Calendar.YEAR, 1926);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Tiger.class);
		birthDate.set(Calendar.YEAR, 1927);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Rabbit.class);
		birthDate.set(Calendar.YEAR, 1928);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Dragon.class);
		birthDate.set(Calendar.YEAR, 1929);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Snake.class);
		birthDate.set(Calendar.YEAR, 1930);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Horse.class);
		birthDate.set(Calendar.YEAR, 1931);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Goat.class);
		birthDate.set(Calendar.YEAR, 1932);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Monkey.class);
		birthDate.set(Calendar.YEAR, 1933);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Rooster.class);
		birthDate.set(Calendar.YEAR, 1934);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Dog.class);
		birthDate.set(Calendar.YEAR, 1935);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Pig.class);
		birthDate.set(Calendar.YEAR, 2008);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Rat.class);
		birthDate.set(Calendar.YEAR, 2009);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Ox.class);
		birthDate.set(Calendar.YEAR, 2010);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Tiger.class);
		birthDate.set(Calendar.YEAR, 2011);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Rabbit.class);
		birthDate.set(Calendar.YEAR, 2012);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Dragon.class);
		birthDate.set(Calendar.YEAR, 2013);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Snake.class);
		birthDate.set(Calendar.YEAR, 2014);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Horse.class);
		birthDate.set(Calendar.YEAR, 2015);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Goat.class);
		birthDate.set(Calendar.YEAR, 2016);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Monkey.class);
		birthDate.set(Calendar.YEAR, 2017);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Rooster.class);
		birthDate.set(Calendar.YEAR, 2018);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Dog.class);
		birthDate.set(Calendar.YEAR, 2019);
		assertTrue(ChineseZodiac.getSign(birthDate.getTimeInMillis()).getClass()==Pig.class);
		// test getSignList()
		List<Sign>signList=ChineseZodiac.getSignList();
		assertTrue(signList.size()==12);
	}
}
