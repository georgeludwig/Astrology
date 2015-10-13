package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Virgo extends WesternSign {

	public Virgo() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.AUGUST,23,Calendar.SEPTEMBER,21);
		addMonthRange(monthRange);
		setName("virgo");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=OLIVE;
		compatArray[1]=MAGENTA;
		compatArray[2]=GREEN;
		compatArray[3]=PURPLE;
		compatArray[4]=BEIGE;
		compatArray[5]=RED;
		compatArray[6]=BEIGE;
		compatArray[7]=PURPLE;
		compatArray[8]=GREEN;
		compatArray[9]=MAGENTA;
		compatArray[10]=OLIVE;
		compatArray[11]=PINK;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=4;
		compatArray[1]=8;
		compatArray[2]=4;
		compatArray[3]=8;
		compatArray[4]=6;
		compatArray[5]=5;
		compatArray[6]=4;
		compatArray[7]=4;
		compatArray[8]=5;
		compatArray[9]=10;
		compatArray[10]=1;
		compatArray[11]=6;
		return compatArray;
	}
	
}
