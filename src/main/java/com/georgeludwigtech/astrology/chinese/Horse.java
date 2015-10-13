package com.georgeludwigtech.astrology.chinese;


public class Horse extends ChineseSign {

	public Horse() {
		int[] compatArray=new int[12];
		compatArray[0]=3;
		compatArray[1]=5;
		compatArray[2]=9;
		compatArray[3]=5;
		compatArray[4]=8;
		compatArray[5]=4;
		compatArray[6]=8;
		compatArray[7]=8;
		compatArray[8]=5;
		compatArray[9]=6;
		compatArray[10]=9;
		compatArray[11]=6;
		setCompatArray(compatArray);
		setAnimal("horse");
	}
	
	public Horse(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
