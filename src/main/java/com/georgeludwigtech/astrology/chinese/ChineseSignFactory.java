package com.georgeludwigtech.astrology.chinese;

public class ChineseSignFactory {

	public static final String DOG="Dog";
	public static final String DRAGON="Dragon";
	public static final String GOAT="Goat";
	public static final String HORSE="Horse";
	public static final String MONKEY="Monkey";
	public static final String OX="Ox";
	public static final String PIG="Pig";
	public static final String RABBIT="Rabbit";
	public static final String RAT="Rat";
	public static final String ROOSTER="Rooster";
	public static final String SNAKE="Snake";
	public static final String TIGER="Tiger";
	
	
	
	public static ChineseSign getSign(String animal) {
		if(animal.equals(DOG))
			return new Dog();
		if(animal.equals(DRAGON))
			return new Dragon();
		if(animal.equals(GOAT))
			return new Goat();
		if(animal.equals(HORSE))
			return new Horse();
		if(animal.equals(MONKEY))
			return new Monkey();
		if(animal.equals(OX))
			return new Ox();
		if(animal.equals(PIG))
			return new Pig();
		if(animal.equals(RABBIT))
			return new Rabbit();
		if(animal.equals(RAT))
			return new Rat();
		if(animal.equals(ROOSTER))
			return new Rooster();
		if(animal.equals(SNAKE))
			return new Snake();
		if(animal.equals(TIGER))
			return new Tiger();
		return null;
		
	}
	
}
