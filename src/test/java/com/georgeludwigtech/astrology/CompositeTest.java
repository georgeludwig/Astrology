package com.georgeludwigtech.astrology;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.georgeludwigtech.astrology.chinese.ChineseSign;
import com.georgeludwigtech.astrology.chinese.ChineseZodiac;
import com.georgeludwigtech.astrology.western.WesternSign;
import com.georgeludwigtech.astrology.western.WesternZodiac;

public class CompositeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testApp() throws Exception {
		
		WesternSign.setWeightMode(WesternSign.COLORED_WEIGHT);
		//WesternSign.setWeightMode(WesternSign.DECIMAL_WEIGHT);
		
		Calendar birthDate=new GregorianCalendar();
		
		// Sarah Getchius
//		birthDate.set(Calendar.YEAR, 1981);
//		birthDate.set(Calendar.MONTH, Calendar.APRIL);
//		birthDate.set(Calendar.DAY_OF_MONTH,11);
		
		// Erin Lukas
//		birthDate.set(Calendar.YEAR, 1978);
//		birthDate.set(Calendar.MONTH, Calendar.DECEMBER);
//		birthDate.set(Calendar.DAY_OF_MONTH,5);
		
		// George
		birthDate.set(Calendar.YEAR, 1962);
		birthDate.set(Calendar.MONTH, Calendar.FEBRUARY);
		birthDate.set(Calendar.DAY_OF_MONTH, 23);

		// Angie
//		birthDate.set(Calendar.YEAR, 1966);
//		birthDate.set(Calendar.MONTH, Calendar.DECEMBER);
//		birthDate.set(Calendar.DAY_OF_MONTH, 2);

		// Jen
//		birthDate.set(Calendar.YEAR, 1967);
//		birthDate.set(Calendar.MONTH, Calendar.JANUARY);
//		birthDate.set(Calendar.DAY_OF_MONTH, 26);

		// Janine
//		birthDate.set(Calendar.YEAR, 1969);
//		birthDate.set(Calendar.MONTH, Calendar.APRIL);
//		birthDate.set(Calendar.DAY_OF_MONTH, 15);
		
		// rikki
//		birthDate.set(Calendar.YEAR, 1983);
//		birthDate.set(Calendar.MONTH, Calendar.SEPTEMBER);
//		birthDate.set(Calendar.DAY_OF_MONTH,14 );
		
		// Ruriko
//		birthDate.set(Calendar.YEAR, 1987);
//		birthDate.set(Calendar.MONTH, Calendar.JANUARY);
//		birthDate.set(Calendar.DAY_OF_MONTH, 12);
		
		// Karl
//		birthDate.set(Calendar.YEAR, 1960);
//		birthDate.set(Calendar.MONTH, Calendar.JULY);
//		birthDate.set(Calendar.DAY_OF_MONTH, 17);
		
		WesternSign wSign=(WesternSign)WesternZodiac.getSign(birthDate.getTimeInMillis());
		ChineseSign cSign=(ChineseSign)ChineseZodiac.getSign(birthDate.getTimeInMillis());
		
		List<Sign>wSignList=WesternZodiac.getSignList();
		List<Sign>cSignList=ChineseZodiac.getSignList();
		
		List<CompositeSign>compositeSignList=new ArrayList<CompositeSign>();
		
		for(Sign wS:wSignList) {
			for(Sign cS:cSignList) {
				CompositeSign composite= new CompositeSign(wSign,cSign);
				composite.setTargetChineseSign((ChineseSign)cS);
				composite.setTargetWesternSign((WesternSign)wS);
				compositeSignList.add(composite);
			}
		}
		
		Collections.sort(compositeSignList);
		
		// print the signs in compatibility order
		for(CompositeSign composite:compositeSignList) {
			System.out.println(composite.explainRelationship());
		}
	}
}
