package com.georgeludwigtech.astrology;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.georgeludwigtech.astrology.chinese.Goat;
import com.georgeludwigtech.astrology.chinese.Horse;
import com.georgeludwigtech.astrology.chinese.Rat;
import com.georgeludwigtech.astrology.chinese.Tiger;
import com.georgeludwigtech.astrology.western.Aquarius;
import com.georgeludwigtech.astrology.western.Aries;
import com.georgeludwigtech.astrology.western.Cancer;
import com.georgeludwigtech.astrology.western.Capricorn;
import com.georgeludwigtech.astrology.western.Gemini;
import com.georgeludwigtech.astrology.western.Leo;
import com.georgeludwigtech.astrology.western.Libra;
import com.georgeludwigtech.astrology.western.Pisces;
import com.georgeludwigtech.astrology.western.Sagittarius;
import com.georgeludwigtech.astrology.western.Scorpio;
import com.georgeludwigtech.astrology.western.Taurus;
import com.georgeludwigtech.astrology.western.Virgo;
import com.georgeludwigtech.astrology.western.WesternSign;

public class CompositeSignTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testApp() throws Exception {
		
		Calendar reference=new GregorianCalendar();
		reference.set(Calendar.YEAR, 2010);
		reference.set(Calendar.MONTH, Calendar.DECEMBER);
		reference.set(Calendar.DAY_OF_MONTH, 20);
		CompositeSign sign=null;
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Aries());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.RED*9);
	
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Taurus());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.BEIGE*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Gemini());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.PURPLE*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Cancer());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.GREEN*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Leo());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.MAGENTA*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Virgo());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.OLIVE*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Libra());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.PINK*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Scorpio());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.OLIVE*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Sagittarius());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.MAGENTA*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Capricorn());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.GREEN*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Aquarius());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.PURPLE*9);
		
		sign=new CompositeSign(new Aries(), new Rat());
		sign.setTargetWesternSign(new Pisces());
		sign.setTargetChineseSign(new Rat());
		assertTrue(sign.getCompatibilityFactor()==WesternSign.BEIGE*9);
		
		// pisces/capricorn tiger/horse
		sign=new CompositeSign(new Pisces(), new Tiger());
		sign.setTargetWesternSign(new Capricorn());
		sign.setTargetChineseSign(new Horse());
		int c=sign.getCompatibilityFactor();
		//assertTrue(sign.getCompatibilityFactor()==WesternSign.PURPLE*9);
		assertTrue(c==WesternSign.PURPLE*9);
		
		// pisces/pisces tiger/goat
		sign=new CompositeSign(new Pisces(), new Tiger());
		sign.setTargetWesternSign(new Pisces());
		sign.setTargetChineseSign(new Goat());
		c=sign.getCompatibilityFactor();
		assertTrue(sign.getCompatibilityFactor()==WesternSign.RED*4);
		
	}
}
