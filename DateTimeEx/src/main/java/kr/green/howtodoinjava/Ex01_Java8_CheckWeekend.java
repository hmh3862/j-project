package kr.green.howtodoinjava;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class Ex01_Java8_CheckWeekend {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		Calendar  calendar = Calendar.getInstance();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(fmt1.format(today));
		DateFormat fmt2 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(fmt1.format(today));
		System.out.println(fmt2.format(calendar.getTime()));
		System.out.println();
		
		System.out.println("Is weekend : " + isWeekend(today));
		System.out.println("Is weekend : " + isWeekend(calendar));
		System.out.println("Is weekend : " + isWeekend(calendar.getTime()));
		System.out.println();
		
		LocalDate someDate = LocalDate.of(2021, 1, 2);
		calendar.set(2021, 0, 2);
		System.out.println(fmt1.format(today));
		System.out.println(fmt2.format(calendar.getTime()));
		System.out.println();
		
		System.out.println("Is weekend : " + isWeekend(someDate));
		System.out.println("Is weekend : " + isWeekend(calendar));
		System.out.println("Is weekend : " + isWeekend(calendar.getTime()));
	}
	// Java 8 이상 : DayOfWeek
	private static boolean isWeekend(LocalDate localDate) {
		DayOfWeek day = DayOfWeek.of(localDate.get(ChronoField.DAY_OF_WEEK));
		return day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY;
	}
	// Java 7 이하 : Date
	private static boolean isWeekend(Date date) {
        @SuppressWarnings("deprecation")
		int day = date.getDay();
        return day == 0 || day == 6;
	}
	// Java 7 이하 : Calendar
	private static boolean isWeekend(Calendar calendar) {
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		return day == Calendar.SUNDAY || day == Calendar.SATURDAY;
	}
}
