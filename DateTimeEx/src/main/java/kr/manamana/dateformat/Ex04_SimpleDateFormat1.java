package kr.manamana.dateformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex04_SimpleDateFormat1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("toString() : " + now);
		System.out.println();
		
		DateFormat dateFormat = new SimpleDateFormat();
		System.out.println("기본 : " + dateFormat.format(now));
		System.out.println();
		
		String pattern = "yyyy-MMM-dd(EEEE) hh:mm:ss.S a";
		Locale locale = Locale.getDefault();
		dateFormat = new SimpleDateFormat(pattern, locale);
		System.out.println(locale + " : " + dateFormat.format(now));
		
		locale = Locale.FRANCE;
		dateFormat = new SimpleDateFormat(pattern, locale);
		System.out.println(locale + " : " + dateFormat.format(now));

		locale = Locale.GERMANY;
		dateFormat = new SimpleDateFormat(pattern, locale);
		System.out.println(locale + " : " + dateFormat.format(now));

	}
}
