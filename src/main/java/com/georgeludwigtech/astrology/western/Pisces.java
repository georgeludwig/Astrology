package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Pisces extends WesternSign {

	public Pisces() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.FEBRUARY,20,Calendar.MARCH,20);
		addMonthRange(monthRange);
		setName("pisces");
	}

	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=BEIGE;
		compatArray[1]=PURPLE;
		compatArray[2]=GREEN;
		compatArray[3]=MAGENTA;
		compatArray[4]=OLIVE;
		compatArray[5]=PINK;
		compatArray[6]=OLIVE;
		compatArray[7]=MAGENTA;
		compatArray[8]=GREEN;
		compatArray[9]=PURPLE;
		compatArray[10]=BEIGE;
		compatArray[11]=RED;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=4;
		compatArray[1]=1;
		compatArray[2]=3;
		compatArray[3]=8;
		compatArray[4]=3;
		compatArray[5]=6;
		compatArray[6]=6;
		compatArray[7]=7;
		compatArray[8]=8;
		compatArray[9]=8;
		compatArray[10]=6;
		compatArray[11]=10;
		return compatArray;
	}
	
}
