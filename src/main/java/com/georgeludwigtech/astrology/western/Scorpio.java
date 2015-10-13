package com.georgeludwigtech.astrology.western;

import java.util.Calendar;

import com.georgeludwigtech.astrology.MonthRange;


public class Scorpio extends WesternSign {

	public Scorpio() {
		super();
		MonthRange monthRange=new MonthRange(Calendar.OCTOBER,23,Calendar.NOVEMBER,21);
		addMonthRange(monthRange);
		setName("scorpio");
	}
	
	@Override
	public int[] getColoredWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=OLIVE;
		compatArray[1]=PINK;
		compatArray[2]=OLIVE;
		compatArray[3]=MAGENTA;
		compatArray[4]=GREEN;
		compatArray[5]=PURPLE;
		compatArray[6]=BEIGE;
		compatArray[7]=RED;
		compatArray[8]=BEIGE;
		compatArray[9]=PURPLE;
		compatArray[10]=GREEN;
		compatArray[11]=MAGENTA;
		return compatArray;
	}
	
	@Override
	public int[] getDecimalWeight() {
		int[] compatArray=new int[12];
		compatArray[0]=4;
		compatArray[1]=7;
		compatArray[2]=6;
		compatArray[3]=7;
		compatArray[4]=5;
		compatArray[5]=4;
		compatArray[6]=3;
		compatArray[7]=5;
		compatArray[8]=3;
		compatArray[9]=10;
		compatArray[10]=4;
		compatArray[11]=7;
		return compatArray;
	}

}
