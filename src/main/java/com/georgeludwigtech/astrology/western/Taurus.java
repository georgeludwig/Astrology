
package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Taurus extends WesternSign {

	public Taurus() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.APRIL,21,Calendar.MAY,21);
		addMonthRange(monthRange);
		setName("taurus");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=BEIGE;
		compatArray[1]=RED;
		compatArray[2]=BEIGE;
		compatArray[3]=PURPLE;
		compatArray[4]=GREEN;
		compatArray[5]=MAGENTA;
		compatArray[6]=OLIVE;
		compatArray[7]=PINK;
		compatArray[8]=OLIVE;
		compatArray[9]=MAGENTA;
		compatArray[10]=GREEN;
		compatArray[11]=PURPLE;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=3;
		compatArray[1]=5;
		compatArray[2]=3;
		compatArray[3]=10;
		compatArray[4]=6;
		compatArray[5]=8;
		compatArray[6]=7;
		compatArray[7]=7;
		compatArray[8]=4;
		compatArray[9]=7;
		compatArray[10]=5;
		compatArray[11]=1;
		return compatArray;
	}
	
}
