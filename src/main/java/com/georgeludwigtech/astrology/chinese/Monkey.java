package com.georgeludwigtech.astrology.chinese;

public class Monkey extends ChineseSign {

	public Monkey() {
		int[] compatArray=new int[12];
		compatArray[0]=10;
		compatArray[1]=4;
		compatArray[2]=2;
		compatArray[3]=4;
		compatArray[4]=10;
		compatArray[5]=4;
		compatArray[6]=5;
		compatArray[7]=5;
		compatArray[8]=9;
		compatArray[9]=4;
		compatArray[10]=8;
		compatArray[11]=7;
		setCompatArray(compatArray);
		setAnimal("monkey");
	}
	
	public Monkey(int[] compatArray) {
		setCompatArray(compatArray);
	}
}
