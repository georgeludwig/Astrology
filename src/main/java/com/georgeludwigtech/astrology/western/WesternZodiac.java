package com.georgeludwigtech.astrology.western;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.georgeludwigtech.astrology.DateRange;
import com.georgeludwigtech.astrology.MonthRange;
import com.georgeludwigtech.astrology.Sign;

public class WesternZodiac {
	
	public static Sign getSign(long birthDate) {
		Sign ret=null;
		Calendar bd=new GregorianCalendar();
		bd.setTimeInMillis(birthDate);
		List<Sign>signList=getSignList();
		for(Sign sign:signList) {
			WesternSign thisSign=(WesternSign)sign;
			for(MonthRange monthRange:thisSign.getMonthRangeList()) {
				DateRange dateRange=monthRange.getDateRange(bd.get(Calendar.YEAR));
				// for debug
				Calendar start=dateRange.getStartCalendar();
				SimpleDateFormat df=new SimpleDateFormat("MM-yyyy-dd HH:mm:ss:SSSS");
				String startString=df.format(start.getTime());
				Calendar end=dateRange.getEndCalendar();
				String endString=df.format(end.getTime());
				String bdString=df.format(bd.getTime());
				if(dateRange.contains(birthDate))
					ret=thisSign;
			}
		}
		return ret;
	}
	
	public static List<Sign>getSignList() {
		List<Sign>ret=new ArrayList<Sign>();
		Aries aries=new Aries();
		ret.add(aries);
		Taurus taurus=new Taurus();
		ret.add(taurus);
		Gemini gemini=new Gemini();
		ret.add(gemini);
		Cancer cancer=new Cancer();
		ret.add(cancer);
		Leo leo=new Leo();
		ret.add(leo);
		Virgo virgo=new Virgo();
		ret.add(virgo);
		Libra libra=new Libra();
		ret.add(libra);
		Scorpio scorpio=new Scorpio();
		ret.add(scorpio);
		Sagittarius sagittarius=new Sagittarius();
		ret.add(sagittarius);
		Capricorn capricorn=new Capricorn();
		ret.add(capricorn);
		Aquarius aquarius=new Aquarius();
		ret.add(aquarius);
		Pisces pisces=new Pisces();
		ret.add(pisces);
		return ret;
	}

	
}
