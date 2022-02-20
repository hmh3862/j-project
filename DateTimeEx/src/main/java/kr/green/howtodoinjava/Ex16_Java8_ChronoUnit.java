package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class Ex16_Java8_ChronoUnit {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(1950, 6, 25);
		LocalDate endDate = LocalDate.of(1953, 7, 27);

		long months = ChronoUnit.MONTHS.between(startDate, endDate);
		long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
		long days = ChronoUnit.DAYS.between(startDate, endDate);

		System.out.println("Months: " + months);
		System.out.println("Weeks: " + weeks);
		System.out.println("Days: " + days);

		LocalTime startTime = LocalTime.of(1, 2, 3);
		LocalTime endTime = LocalTime.of(11, 12, 53, 100);

		long hours = ChronoUnit.HOURS.between(startTime, endTime);
		long minutes = ChronoUnit.MINUTES.between(startTime, endTime);
		long seconds = ChronoUnit.SECONDS.between(startTime, endTime);

		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		System.out.println();
		
		Period periodBetween = Period.between(startDate, endDate);
		System.out.println(periodBetween.get(ChronoUnit.DAYS)); // 2일
		System.out.println(periodBetween.get(ChronoUnit.MONTHS)); // 1개월
		System.out.println(periodBetween.get(ChronoUnit.YEARS)); // 3년
		try {
			System.out.println(periodBetween.get(ChronoUnit.WEEKS));
		}catch (UnsupportedTemporalTypeException e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println();		
	}
}
