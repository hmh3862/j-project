package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Ex02_YesterdayTodayTomorrow {
	public static void main(String[] args) {
		// Java 7 이전
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		Calendar calendar = Calendar.getInstance();
		
		String today = sdf.format(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		String yesterday = sdf.format(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, +2);
		String tomorrow = sdf.format(calendar.getTime());
		view(today, yesterday, tomorrow);
		
		// Java 8 이후
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd(E)");
		localDate = localDate.minusDays(1);
		yesterday = formatter.format(localDate);
		localDate = localDate.plusDays(2);
		tomorrow = formatter.format(localDate);
		view(today, yesterday, tomorrow);

		localDate = LocalDate.now();
		today = formatter.format(localDate);
		yesterday = formatter.format(localDate.minus(Period.ofDays(1)));
		tomorrow = formatter.format(localDate.plus(Period.ofDays(1)));
		view(today, yesterday, tomorrow);
	}

	private static void view(String today, String yesterday, String tomorrow) {
		System.out.println("어제 : " + yesterday);
		System.out.println("오늘 : " + today);
		System.out.println("내일 : " + tomorrow);
		System.out.println();
	}
	
}
