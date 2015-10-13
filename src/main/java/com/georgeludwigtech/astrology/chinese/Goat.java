package com.georgeludwigtech.astrology.chinese;


public class Goat extends ChineseSign {
	
	public Goat() {
		int[] compatArray=new int[12];
		compatArray[0]=4;
		compatArray[1]=2;
		compatArray[2]=4;
		compatArray[3]=9;
		compatArray[4]=7;
		compatArray[5]=7;
		compatArray[6]=8;
		compatArray[7]=9;
		compatArray[8]=5;
		compatArray[9]=5;
		compatArray[10]=4;
		compatArray[11]=9;
		setCompatArray(compatArray);
		setAnimal("goat");
	}
	
	public Goat(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
