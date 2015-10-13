package com.georgeludwigtech.astrology.chinese;

public class Rooster extends ChineseSign {

	public Rooster() {
		int[] compatArray=new int[12];
		compatArray[0]=6;
		compatArray[1]=9;
		compatArray[2]=4;
		compatArray[3]=2;
		compatArray[4]=9;
		compatArray[5]=9;
		compatArray[6]=6;
		compatArray[7]=5;
		compatArray[8]=4;
		compatArray[9]=4;
		compatArray[10]=5;
		compatArray[11]=5;
		setCompatArray(compatArray);
		setAnimal("rooster");
	}
	
	public Rooster(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
