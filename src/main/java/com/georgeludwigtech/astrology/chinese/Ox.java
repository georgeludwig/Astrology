package com.georgeludwigtech.astrology.chinese;

public class Ox extends ChineseSign {
	public Ox() {
		int[] compatArray=new int[12];
		compatArray[0]=6;
		compatArray[1]=8;
		compatArray[2]=4;
		compatArray[3]=8;
		compatArray[4]=7;
		compatArray[5]=9;
		compatArray[6]=5;
		compatArray[7]=2;
		compatArray[8]=4;
		compatArray[9]=9;
		compatArray[10]=7;
		compatArray[11]=7;
		setCompatArray(compatArray);
		setAnimal("ox");
	}
	
	public Ox(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
