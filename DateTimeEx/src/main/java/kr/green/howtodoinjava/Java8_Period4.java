package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Java8_Period4 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("현재 : " + fmt.format(localDate));

		Period period = Period.parse("P0Y0M0D");
		System.out.println(period);
		
		period = period.plusYears(5);
		System.out.println(period);
		period = period.minusYears(5);
		System.out.println(period);

		period = period.plusMonths(5);
		System.out.println(period);
		period = period.minusMonths(5);
		System.out.println(period);
		
		period = period.plusDays(3);
		System.out.println(period);
		period = period.minusDays(3);
		System.out.println(period);
		
		period = period.plusYears(1).plusMonths(2).plusDays(3);
		System.out.println(period);
		
		period = period.multipliedBy(-1);
		System.out.println(period);
		
		localDate = localDate.plus(period);
		System.out.println("현재 : " + fmt.format(localDate));
		localDate = localDate.minus(period);
		System.out.println("현재 : " + fmt.format(localDate));
	}
}
