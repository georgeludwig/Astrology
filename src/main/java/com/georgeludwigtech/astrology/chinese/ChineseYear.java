package com.georgeludwigtech.astrology.chinese;

import com.georgeludwigtech.astrology.DateRange;

public class ChineseYear {

	private DateRange dateRange;
	
	public DateRange getDateRange() {
		return dateRange;
	}

	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
	}

	private String polarity;
	
	
	public String getPolarity() {
		return polarity;
	}

	public void setPolarity(String polarity) {
		this.polarity = polarity;
	}

	private String element;
	
	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	private String stem;
	
	public String getStem() {
		return stem;
	}

	public void setStem(String stem) {
		this.stem = stem;
	}

	private String branch;
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	private String animal;

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}
}
