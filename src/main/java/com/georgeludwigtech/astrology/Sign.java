package com.georgeludwigtech.astrology;


public abstract class Sign {
	
	public abstract int getCompatibilityFactor(Sign targetSign);
	
	private long birthDay;

	public long getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(long birthDay) {
		this.birthDay = birthDay;
	}
	
	public abstract String explainRelationShip(Sign other);
	
	private int[] compatArray;

	public int[] getCompatArray() {
		return compatArray;
	}

	public void setCompatArray(int[] compatArray) {
		this.compatArray = compatArray;
	}
	
	private String name;

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	
}
