package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Cancer extends WesternSign {

	public Cancer() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.JUNE,22,Calendar.JULY,22);
		addMonthRange(monthRange);
		setName("cancer");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=GREEN;
		compatArray[1]=PURPLE;
		compatArray[2]=BEIGE;
		compatArray[3]=RED;
		compatArray[4]=BEIGE;
		compatArray[5]=PURPLE;
		compatArray[6]=GREEN;
		compatArray[7]=MAGENTA;
		compatArray[8]=OLIVE;
		compatArray[9]=PINK;
		compatArray[10]=OLIVE;
		compatArray[11]=MAGENTA;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=1;
		compatArray[1]=10;
		compatArray[2]=1;
		compatArray[3]=3;
		compatArray[4]=3;
		compatArray[5]=8;
		compatArray[6]=4;
		compatArray[7]=7;
		compatArray[8]=4;
		compatArray[9]=3;
		compatArray[10]=4;
		compatArray[11]=8;
		return compatArray;
	}
	
}
