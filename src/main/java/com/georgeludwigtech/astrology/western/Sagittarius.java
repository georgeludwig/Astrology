package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Sagittarius extends WesternSign {

	public Sagittarius() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.NOVEMBER,22,Calendar.DECEMBER,21);
		addMonthRange(monthRange);
		setName("sagittarius");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=MAGENTA;
		compatArray[1]=OLIVE;
		compatArray[2]=PINK;
		compatArray[3]=OLIVE;
		compatArray[4]=MAGENTA;
		compatArray[5]=GREEN;
		compatArray[6]=PURPLE;
		compatArray[7]=BEIGE;
		compatArray[8]=RED;
		compatArray[9]=BEIGE;
		compatArray[10]=PURPLE;
		compatArray[11]=GREEN;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=7;
		compatArray[1]=4;
		compatArray[2]=4;
		compatArray[3]=4;
		compatArray[4]=7;
		compatArray[5]=5;
		compatArray[6]=4;
		compatArray[7]=3;
		compatArray[8]=7;
		compatArray[9]=3;
		compatArray[10]=9;
		compatArray[11]=8;
		return compatArray;
	}
	
}
