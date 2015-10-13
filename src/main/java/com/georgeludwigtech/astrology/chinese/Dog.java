package com.georgeludwigtech.astrology.chinese;

public class Dog extends ChineseSign {
	
	public Dog() {
		int[] compatArray=new int[12];
		compatArray[0]=8;
		compatArray[1]=7;
		compatArray[2]=9;
		compatArray[3]=8;
		compatArray[4]=2;
		compatArray[5]=8;
		compatArray[6]=9;
		compatArray[7]=4;
		compatArray[8]=8;
		compatArray[9]=5;
		compatArray[10]=7;
		compatArray[11]=7;
		setCompatArray(compatArray);
		setAnimal("dog");
	}
	
	public Dog(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
