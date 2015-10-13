package com.georgeludwigtech.astrology.western;

import java.util.ArrayList;
import java.util.List;

import com.georgeludwigtech.astrology.MonthRange;
import com.georgeludwigtech.astrology.Sign;

public abstract class WesternSign extends Sign {

	public static final int RED=7;
	public static final int MAGENTA=6;
	public static final int PURPLE=5;
	public static final int PINK=4;
	public static final int BEIGE=3;
	public static final int OLIVE=2;
	public static final int GREEN=1;
	
	public static final int REFERENCE_YEAR=1900;
	
	public static final int COLORED_WEIGHT=0;
	public static final int DECIMAL_WEIGHT=1;
	
	public WesternSign() {
		if(getWeightMode()==COLORED_WEIGHT)
			setCompatArray(getColoredWeight());
		else setCompatArray(getDecimalWeight());
	}
	
	@Override
	public String explainRelationShip(Sign other) {
		return this.getName()+ " and " + other.getName();
	}
	
	@Override
	public int getCompatibilityFactor(Sign targetSign) {
		if(targetSign.getClass()==Aries.class)
			return getCompatArray()[0];
		if(targetSign.getClass()==Taurus.class)
			return getCompatArray()[1];
		if(targetSign.getClass()==Gemini.class)
			return getCompatArray()[2];
		if(targetSign.getClass()==Cancer.class)
			return getCompatArray()[3];
		if(targetSign.getClass()==Leo.class)
			return getCompatArray()[4];
		if(targetSign.getClass()==Virgo.class)
			return getCompatArray()[5];
		if(targetSign.getClass()==Libra.class)
			return getCompatArray()[6];
		if(targetSign.getClass()==Scorpio.class)
			return getCompatArray()[7];
		if(targetSign.getClass()==Sagittarius.class)
			return getCompatArray()[8];
		if(targetSign.getClass()==Capricorn.class)
			return getCompatArray()[9];
		if(targetSign.getClass()==Aquarius.class)
			return getCompatArray()[10];
		if(targetSign.getClass()==Pisces.class)
			return getCompatArray()[11];
		return 0;
	}
	
	private List<MonthRange> monthRangeList=new ArrayList<MonthRange>();
	
	public List<MonthRange> getMonthRangeList() {
		return monthRangeList;
	}
	
	public void addMonthRange(MonthRange monthRange) {
		getMonthRangeList().add(monthRange);
	}
	
	private static int weightMode=COLORED_WEIGHT;
	
	public static void setWeightMode(int weightMode) {
		WesternSign.weightMode=weightMode;
	}
	
	public static int getWeightMode() {
		return WesternSign.weightMode;
	}
	
	public abstract int[] getColoredWeight();
	public abstract int[] getDecimalWeight();
	
}
