package com.georgeludwigtech.astrology.chinese;

public class Dragon extends ChineseSign {

	public Dragon() {
		int[] compatArray=new int[12];
		compatArray[0]=10;
		compatArray[1]=7;
		compatArray[2]=6;
		compatArray[3]=7;
		compatArray[4]=9;
		compatArray[5]=8;
		compatArray[6]=8;
		compatArray[7]=7;
		compatArray[8]=10;
		compatArray[9]=9;
		compatArray[10]=2;
		compatArray[11]=8;
		setCompatArray(compatArray);
		setAnimal("dragon");
	}
	
	public Dragon(int[] compatArray) {
		setCompatArray(compatArray);
	}

}
