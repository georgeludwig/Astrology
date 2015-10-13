package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Leo extends WesternSign {

	public Leo() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.JULY,23,Calendar.AUGUST,22);
		addMonthRange(monthRange);
		setName("leo");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=MAGENTA;
		compatArray[1]=GREEN;
		compatArray[2]=PURPLE;
		compatArray[3]=BEIGE;
		compatArray[4]=RED;
		compatArray[5]=BEIGE;
		compatArray[6]=PURPLE;
		compatArray[7]=GREEN;
		compatArray[8]=MAGENTA;
		compatArray[9]=OLIVE;
		compatArray[10]=PINK;
		compatArray[11]=OLIVE;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=10;
		compatArray[1]=6;
		compatArray[2]=8;
		compatArray[3]=3;
		compatArray[4]=6;
		compatArray[5]=6;
		compatArray[6]=7;
		compatArray[7]=5;
		compatArray[8]=7;
		compatArray[9]=4;
		compatArray[10]=4;
		compatArray[11]=3;
		return compatArray;
	}
	
}
