package com.georgeludwigtech.astrology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.georgeludwigtech.astrology.chinese.ChineseSign;
import com.georgeludwigtech.astrology.chinese.ChineseYear;
import com.georgeludwigtech.astrology.chinese.ChineseZodiac;
import com.georgeludwigtech.astrology.western.WesternSign;

public class CompositeSign implements Comparable<CompositeSign> {

	public CompositeSign(WesternSign wSignSource, ChineseSign cSignSource) {
		setSourceWesternSign(wSignSource);
		setSourceChineseSign(cSignSource);
	}

	private WesternSign sourceWesternSign;
	
	public WesternSign getSourceWesternSign() {
		return sourceWesternSign;
	}

	public void setSourceWesternSign(WesternSign sourceWesternSign) {
		this.sourceWesternSign = sourceWesternSign;
	}

	private ChineseSign sourceChineseSign;
	
	public ChineseSign getSourceChineseSign() {
		return sourceChineseSign;
	}

	public void setSourceChineseSign(ChineseSign sourceChineseSign) {
		this.sourceChineseSign = sourceChineseSign;
	}

	@Override
	public int compareTo(CompositeSign o) {
		if(getCompatibilityFactor()<o.getCompatibilityFactor())
			return 1;
		if(getCompatibilityFactor()>o.getCompatibilityFactor())
			return -1;
		return 0;
	}

	private ChineseSign targetChineseSign;

	public ChineseSign getTargetChineseSign() {
		return targetChineseSign;
	}

	public void setTargetChineseSign(ChineseSign targetChineseSign) {
		this.targetChineseSign = targetChineseSign;
	}

	private WesternSign targetWesternSign;

	public WesternSign getTargetWesternSign() {
		return targetWesternSign;
	}

	public void setTargetWesternSign(WesternSign targetWesternSign) {
		this.targetWesternSign = targetWesternSign;
	}
	
	public int getCompatibilityFactor() {
		int wC=getSourceWesternSign().getCompatibilityFactor(getTargetWesternSign());
		int cC=getSourceChineseSign().getCompatibilityFactor(getTargetChineseSign());
		cFactor=wC*cC;
		return cFactor;
	}
	
	private int cFactor;

	/**
	 * 
	 * Returns a formatted string explaining the relationship between the two signs
	 * 
	 * @return
	 */
	public String explainRelationship() throws Exception {
		return explainRelationship(System.currentTimeMillis());
	}
	
	/**
	 * 
	 * Returns a formatted string explaining the relationship between the two signs
	 * 
	 * @return
	 */
	public String explainRelationship(long reference) throws Exception {
		String ret=getSourceWesternSign().explainRelationShip(getTargetWesternSign());
		ret=ret+" with "+getSourceChineseSign().explainRelationShip(getTargetChineseSign());
		ret=ret+" has a compatibility of "+getCompatibilityFactor();
		ret=ret+"\nand are of the following ages "+getAgeListAsString(reference);
		return ret;
	}
	
	/**
	 * 
	 * Returns a list of birth DateRanges that are valid for a person born under this CompositeSign
	 * @return
	 * 
	 */
	public List<DateRange>getBirthDateRangeList() throws Exception {
		List<DateRange>ret=new ArrayList<DateRange>();
		// get a list of ChineseYears for this sign
		List<ChineseYear>chineseYearList=ChineseZodiac.getYearList(getTargetChineseSign());
		// for every year in the list
		for(ChineseYear chineseYear:chineseYearList) {
			// get the range of possible birthdates
			for(MonthRange monthRange:getTargetWesternSign().getMonthRangeList()) {
				List<DateRange>birthDateRangeList=DateFilter.filterByMonthRange(chineseYear.getDateRange(),monthRange);
				ret.addAll(birthDateRangeList);
			}
		}
		return ret;
	}
	
	public List<Integer>getAgeList() throws Exception {
		return getAgeList(System.currentTimeMillis());
	}
	
	public List<Integer>getAgeList(long reference) throws Exception {
		List<Integer>ret=new ArrayList<Integer>();
		List<DateRange>birthDateRangeList=getBirthDateRangeList();
		for(DateRange dateRange:birthDateRangeList) {
			List<Integer>ageList=dateRange.getAgeList(reference);
			ret.addAll(ageList);
		}
		// dedupe
		Set<Integer>set=new HashSet<Integer>(ret);
		ret=new ArrayList<Integer>(set);
		// sort
		Collections.sort(ret);
		return ret;
	}
	
	public String getAgeListAsString(long reference) throws Exception {
		List<Integer>ageList=getAgeList(reference);
		StringBuffer buf=new StringBuffer();
		for(Integer age:ageList) {
			if(age>0)
				buf.append(age+",");
		}
		String ret=buf.toString();
		ret=ret.substring(0,ret.length()-1);
		return ret;
	}
	
}
