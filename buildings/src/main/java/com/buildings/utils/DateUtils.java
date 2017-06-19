package com.buildings.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static Date parseDate(String date) {
		Date retDate = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			retDate = formatter.parse(date);
		} catch(ParseException ex) {
			
		}
		return retDate;
	}
}
