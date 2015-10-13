package com.georgeludwigtech.astrology.chinese;

public class Rat extends ChineseSign {

	public Rat() {
		int[] compatArray=new int[12];
		compatArray[0]=9;
		compatArray[1]=6;
		compatArray[2]=4;
		compatArray[3]=7;
		compatArray[4]=10;
		compatArray[5]=7;
		compatArray[6]=3;
		compatArray[7]=4;
		compatArray[8]=10;
		compatArray[9]=6;
		compatArray[10]=8;
		compatArray[11]=8;
		setCompatArray(compatArray);
		setAnimal("rat");
	}
	
	public Rat(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
