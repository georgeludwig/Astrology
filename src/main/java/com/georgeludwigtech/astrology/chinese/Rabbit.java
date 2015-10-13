package com.georgeludwigtech.astrology.chinese;

public class Rabbit extends ChineseSign {

	public Rabbit() {
		int[] compatArray=new int[12];
		compatArray[0]=7;
		compatArray[1]=8;
		compatArray[2]=5;
		compatArray[3]=8;
		compatArray[4]=7;
		compatArray[5]=7;
		compatArray[6]=5;
		compatArray[7]=9;
		compatArray[8]=4;
		compatArray[9]=2;
		compatArray[10]=8;
		compatArray[11]=9;
		setCompatArray(compatArray);
		setAnimal("rabbit");
	}
	
	public Rabbit(int[] compatArray) {
		setCompatArray(compatArray);
	}
}
