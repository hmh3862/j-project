package kr.manamana.dateformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex01_DateFormat1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("toString() : " + now);
		System.out.println();
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		System.out.println("기본 : " + dateFormat.format(now));
		System.out.println();
		
		DateFormat format1 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println("FULL : " + format1.format(now));
		DateFormat format2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		System.out.println("LONG : " + format2.format(now));
		DateFormat format3 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		System.out.println("MEDIUM : " + format3.format(now));
		DateFormat format4 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		System.out.println("SHORT : " + format4.format(now));
		DateFormat format5 = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
		System.out.println("DEFAULT : " + format5.format(now));
		System.out.println();
		
		Locale locale = Locale.getDefault();
		DateFormat format6 = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));
		
		locale = Locale.FRANCE;
		format6 = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));

		locale = Locale.GERMANY;
		format6 = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));
	}
}
