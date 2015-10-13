package com.georgeludwigtech.astrology.chinese;

import com.georgeludwigtech.astrology.Sign;

public abstract class ChineseSign extends Sign {

	public static final int RAT=0;
	public static final int OX=1;
	public static final int TIGER=2;
	public static final int RABBIT=3;
	public static final int DRAGON=4;
	public static final int SNAKE=5;
	public static final int HORSE=6;
	public static final int GOAT=7;
	public static final int MONKEY=8;
	public static final int ROOSTER=9;
	public static final int DOG=10;
	public static final int PIG=11;

	@Override
	public String explainRelationShip(Sign other) {
		return this.getName()+ " and " + other.getName();
	}
	
	@Override
	public int getCompatibilityFactor(Sign targetSign) {
		if(targetSign.getClass()==Rat.class)
			return getCompatArray()[0];
		if(targetSign.getClass()==Ox.class)
			return getCompatArray()[1];
		if(targetSign.getClass()==Tiger.class)
			return getCompatArray()[2];
		if(targetSign.getClass()==Rabbit.class)
			return getCompatArray()[3];
		if(targetSign.getClass()==Dragon.class)
			return getCompatArray()[4];
		if(targetSign.getClass()==Snake.class)
			return getCompatArray()[5];
		if(targetSign.getClass()==Horse.class)
			return getCompatArray()[6];
		if(targetSign.getClass()==Goat.class)
			return getCompatArray()[7];
		if(targetSign.getClass()==Monkey.class)
			return getCompatArray()[8];
		if(targetSign.getClass()==Rooster.class)
			return getCompatArray()[9];
		if(targetSign.getClass()==Dog.class)
			return getCompatArray()[10];
		if(targetSign.getClass()==Pig.class)
			return getCompatArray()[11];
		return 0;
	}

	private String animal;

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	@Override
	public String getName() {
		return getAnimal();
	}
	
}
