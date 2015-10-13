package com.georgeludwigtech.astrology.chinese;


public class Tiger extends ChineseSign {

	public Tiger() {
		int[] compatArray=new int[12];
		compatArray[0]=4;
		compatArray[1]=4;
		compatArray[2]=5;
		compatArray[3]=5;
		compatArray[4]=6;
		compatArray[5]=3;
		compatArray[6]=9;
		compatArray[7]=4;
		compatArray[8]=2;
		compatArray[9]=4;
		compatArray[10]=9;
		compatArray[11]=7;
		setCompatArray(compatArray);
		setAnimal("tiger");
	}
	
	public Tiger(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
