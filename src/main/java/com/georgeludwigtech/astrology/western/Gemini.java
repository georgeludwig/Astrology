package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Gemini extends WesternSign {

	public Gemini() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.MAY,22,Calendar.JUNE,21);
		addMonthRange(monthRange);
		setName("gemini");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=PURPLE;
		compatArray[1]=BEIGE;
		compatArray[2]=RED;
		compatArray[3]=BEIGE;
		compatArray[4]=PURPLE;
		compatArray[5]=GREEN;
		compatArray[6]=MAGENTA;
		compatArray[7]=OLIVE;
		compatArray[8]=PINK;
		compatArray[9]=OLIVE;
		compatArray[10]=MAGENTA;
		compatArray[11]=GREEN;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=7;
		compatArray[1]=3;
		compatArray[2]=10;
		compatArray[3]=1;
		compatArray[4]=8;
		compatArray[5]=4;
		compatArray[6]=8;
		compatArray[7]=6;
		compatArray[8]=4;
		compatArray[9]=5;
		compatArray[10]=7;
		compatArray[11]=3;
		return compatArray;
	}
	
}
