package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Aquarius extends WesternSign {

public Aquarius() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.JANUARY,21,Calendar.FEBRUARY,19);
		addMonthRange(monthRange);
		setName("aquarius");
	}

	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=PURPLE;
		compatArray[1]=GREEN;
		compatArray[2]=MAGENTA;
		compatArray[3]=OLIVE;
		compatArray[4]=PINK;
		compatArray[5]=OLIVE;
		compatArray[6]=MAGENTA;
		compatArray[7]=GREEN;
		compatArray[8]=PURPLE;
		compatArray[9]=BEIGE;
		compatArray[10]=RED;
		compatArray[11]=BEIGE;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=9;
		compatArray[1]=5;
		compatArray[2]=7;
		compatArray[3]=4;
		compatArray[4]=4;
		compatArray[5]=1;
		compatArray[6]=9;
		compatArray[7]=4;
		compatArray[8]=9;
		compatArray[9]=4;
		compatArray[10]=6;
		compatArray[11]=6;
		return compatArray;
	}

}
