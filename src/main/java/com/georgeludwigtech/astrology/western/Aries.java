package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Aries extends WesternSign {

	public Aries() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.MARCH,21,Calendar.APRIL,20);
		addMonthRange(monthRange);
		setName("aries");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=RED;
		compatArray[1]=BEIGE;
		compatArray[2]=PURPLE;
		compatArray[3]=GREEN;
		compatArray[4]=MAGENTA;
		compatArray[5]=OLIVE;
		compatArray[6]=PINK;
		compatArray[7]=OLIVE;
		compatArray[8]=MAGENTA;
		compatArray[9]=GREEN;
		compatArray[10]=PURPLE;
		compatArray[11]=BEIGE;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=4;
		compatArray[1]=3;
		compatArray[2]=7;
		compatArray[3]=1;
		compatArray[4]=10;
		compatArray[5]=4;
		compatArray[6]=4;
		compatArray[7]=4;
		compatArray[8]=7;
		compatArray[9]=3;
		compatArray[10]=9;
		compatArray[11]=4;
		return compatArray;
	}
	
}
