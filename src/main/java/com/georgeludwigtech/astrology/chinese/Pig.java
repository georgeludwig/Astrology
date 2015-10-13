package com.georgeludwigtech.astrology.chinese;

public class Pig extends ChineseSign {

	public Pig() {
		int[] compatArray=new int[12];
		compatArray[0]=8;
		compatArray[1]=7;
		compatArray[2]=7;
		compatArray[3]=9;
		compatArray[4]=8;
		compatArray[5]=4;
		compatArray[6]=6;
		compatArray[7]=9;
		compatArray[8]=7;
		compatArray[9]=5;
		compatArray[10]=7;
		compatArray[11]=8;
		setCompatArray(compatArray);
		setAnimal("pig");
	}
	
	public Pig(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
