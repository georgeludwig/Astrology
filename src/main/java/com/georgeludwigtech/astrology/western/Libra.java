package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;

public class Libra extends WesternSign {

	public Libra() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.SEPTEMBER,22,Calendar.OCTOBER,22);
		addMonthRange(monthRange);
		setName("libra");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=PINK;
		compatArray[1]=OLIVE;
		compatArray[2]=MAGENTA;
		compatArray[3]=GREEN;
		compatArray[4]=PURPLE;
		compatArray[5]=BEIGE;
		compatArray[6]=RED;
		compatArray[7]=BEIGE;
		compatArray[8]=PURPLE;
		compatArray[9]=GREEN;
		compatArray[10]=MAGENTA;
		compatArray[11]=OLIVE;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=4;
		compatArray[1]=7;
		compatArray[2]=8;
		compatArray[3]=4;
		compatArray[4]=7;
		compatArray[5]=4;
		compatArray[6]=7;
		compatArray[7]=3;
		compatArray[8]=4;
		compatArray[9]=1;
		compatArray[10]=9;
		compatArray[11]=6;
		return compatArray;
	}
	
}
