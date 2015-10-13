package com.georgeludwigtech.astrology.chinese;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.georgeludwigtech.astrology.DateRange;
import com.georgeludwigtech.astrology.Sign;
import com.georgeludwigtech.common.util.FileUtil;

public class ChineseZodiac {
	
	public static final String YIN="yin";
	public static final String YANG="yang";
	
	public static final String WOOD="wood";
	public static final String FIRE="fire";
	public static final String EARTH="earth";
	public static final String METAL="metal";
	public static final String WATER="water";
	
	/**
	 * 
	 * Returns the Chinese sign based on the birthDate
	 *  
	 * @param birthDate
	 * @return
	 * @throws Exception 
	 */
	public static ChineseSign getSign(long birthDate) throws Exception {
		Date bDate=new Date(birthDate);
		Calendar c=new GregorianCalendar();
		c.setTime(bDate);
		
		Map<String,List<ChineseYear>>yearMap=getYearMap();
		
		for(List<ChineseYear> cYearList:yearMap.values()) {
			for(ChineseYear cYear:cYearList) {
				if(cYear.getDateRange().contains(birthDate))
					return ChineseSignFactory.getSign(cYear.getAnimal());
			}
		}
		
		
		return null;
//		int year=c.get(Calendar.YEAR);
//		year=year-1900;
//		int mod=year%12;
//		switch(mod) {
//			case ChineseSign.RAT:return new Rat();
//			case ChineseSign.OX:return new Ox();
//			case ChineseSign.TIGER:return new Tiger();
//			case ChineseSign.RABBIT:return new Rabbit();
//			case ChineseSign.DRAGON:return new Dragon();
//			case ChineseSign.SNAKE:return new Snake();
//			case ChineseSign.HORSE:return new Horse();
//			case ChineseSign.GOAT:return new Goat();
//			case ChineseSign.MONKEY:return new Monkey();
//			case ChineseSign.ROOSTER:return new Rooster();
//			case ChineseSign.DOG:return new Dog();
//			case ChineseSign.PIG:return new Pig();
//		}
//		return null;
		
	}
	
	public static List<Sign>getSignList() {
		List<Sign>ret=new ArrayList<Sign>();
		Rat rat=new Rat();
		ret.add(rat);
		Ox ox=new Ox();
		ret.add(ox);
		Tiger tiger=new Tiger();
		ret.add(tiger);
		Rabbit rabbit=new Rabbit();
		ret.add(rabbit);
		Dragon dragon=new Dragon();
		ret.add(dragon);
		Snake snake=new Snake();
		ret.add(snake);
		Horse horse=new Horse();
		ret.add(horse);
		Goat goat=new Goat();
		ret.add(goat);
		Monkey monkey=new Monkey();
		ret.add(monkey);
		Rooster rooster=new Rooster();
		ret.add(rooster);
		Dog dog=new Dog();
		ret.add(dog);
		Pig pig=new Pig();
		ret.add(pig);
		return ret;
	}
	
	/**
	 * 
	 * Given a sign, return a list of date ranges
	 * 
	 */
	public static List<ChineseYear>getYearList(ChineseSign sign) throws Exception {
		List<ChineseYear>ret=getYearMap().get(sign.getAnimal());
		return ret;
	}
	
	private static DateFormat df=new SimpleDateFormat("MMM dd, yyyy");
	private static long getDate(String month, String day, String year) throws Exception {
		String ds=month.trim()+" "+day.trim()+" "+year.trim();
		Date d=df.parse(ds);
		return d.getTime();
	}

	private static Map<String,List<ChineseYear>>yearMap;
	
	public static Map<String,List<ChineseYear>>getYearMap() throws Exception {
		if(yearMap==null)
			createYearMap();
		return yearMap;
	}
	
	private static void createYearMap() throws Exception {
		yearMap=new HashMap<String,List<ChineseYear>>();
		List<String> masterList=FileUtil.readFile("classpath:///ChineseNewYearDates.txt","UTF-8");
		int offset=0;
		DateRange dateRange=null;
		long start;
		long end;
		for(String yearString:masterList) {
			if(yearString.trim().length()>0) {
				// split record in to fields
				String[]yearArray=yearString.split("\\s");
				// get data common to both years
				String polarity=yearArray[8];
				String element=yearArray[9];
				String stem=yearArray[10];
				String branch=yearArray[11];
				String animal=yearArray[12];
				// first year date range
				ChineseYear yearOne=new ChineseYear();
				offset=1;
				start=getDate(yearArray[offset],yearArray[offset+1],yearArray[offset+2]);
				offset=5;
				end=getDate(yearArray[offset],yearArray[offset+1],yearArray[offset+2]);
				dateRange=new DateRange();
				dateRange.setStart(start);
				dateRange.setEnd(end);
				yearOne.setDateRange(dateRange);
				// first year common data
				yearOne.setPolarity(polarity);
				yearOne.setElement(element);
				yearOne.setStem(stem);
				yearOne.setBranch(branch);
				yearOne.setAnimal(animal);
				addYearToMap(yearOne);
				// second year date range
				ChineseYear yearTwo=new ChineseYear();
				offset=13;
				start=getDate(yearArray[offset],yearArray[offset+1],yearArray[offset+2]);
				offset=17;
				end=getDate(yearArray[offset],yearArray[offset+1],yearArray[offset+2]);
				dateRange=new DateRange();
				dateRange.setStart(start);
				dateRange.setEnd(end);
				yearTwo.setDateRange(dateRange);
				// second year year common data
				yearTwo.setPolarity(polarity);
				yearTwo.setElement(element);
				yearTwo.setStem(stem);
				yearTwo.setBranch(branch);
				yearTwo.setAnimal(animal);
				addYearToMap(yearTwo);
			}
		}
	}
	
	private static void addYearToMap(ChineseYear chineseYear) {
		List<ChineseYear>yearList=yearMap.get(chineseYear.getAnimal().toLowerCase());
		// if the map does not contain this animal, create it
		if(yearList==null) {
			yearList=new ArrayList<ChineseYear>();
			yearMap.put(chineseYear.getAnimal().toLowerCase(),yearList);
		}
		yearList.add(chineseYear);
	}
}
