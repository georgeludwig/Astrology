package com.georgeludwigtech.astrology.chinese;

public class Snake extends ChineseSign {

	public Snake() {
		int[] compatArray=new int[12];
		compatArray[0]=7;
		compatArray[1]=9;
		compatArray[2]=3;
		compatArray[3]=7;
		compatArray[4]=8;
		compatArray[5]=8;
		compatArray[6]=4;
		compatArray[7]=7;
		compatArray[8]=4;
		compatArray[9]=9;
		compatArray[10]=8;
		compatArray[11]=4;
		setCompatArray(compatArray);
		setAnimal("snake");
	}
	
	public Snake(int[] compatArray) {
		setCompatArray(compatArray);
	}
	
}
