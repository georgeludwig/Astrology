package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Capricorn extends WesternSign {

	public Capricorn() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.DECEMBER,22,Calendar.DECEMBER,31);
		addMonthRange(monthRange);
		monthRange=new MonthRange(Calendar.JANUARY,1,Calendar.JANUARY,20);
		addMonthRange(monthRange);
		setName("capricorn");
	}
		
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=GREEN;
		compatArray[1]=MAGENTA;
		compatArray[2]=OLIVE;
		compatArray[3]=PINK;
		compatArray[4]=OLIVE;
		compatArray[5]=MAGENTA;
		compatArray[6]=GREEN;
		compatArray[7]=PURPLE;
		compatArray[8]=BEIGE;
		compatArray[9]=RED;
		compatArray[10]=BEIGE;
		compatArray[11]=PURPLE;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=3;
		compatArray[1]=7;
		compatArray[2]=5;
		compatArray[3]=3;
		compatArray[4]=4;
		compatArray[5]=10;
		compatArray[6]=1;
		compatArray[7]=10;
		compatArray[8]=3;
		compatArray[9]=8;
		compatArray[10]=4;
		compatArray[11]=8;
		return compatArray;
	}
	
}
