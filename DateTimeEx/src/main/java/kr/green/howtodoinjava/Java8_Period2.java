package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Java8_Period2 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("현재 : " + fmt.format(localDate));

		Period fromDays = Period.ofDays(150); // 150 days
		localDate = localDate.plus(fromDays);
		System.out.println(fromDays + " : " + fmt.format(localDate));

		Period fromMonths = Period.ofMonths(4); // 4 months
		localDate = localDate.plus(fromMonths);
		System.out.println(fromMonths + " : " + fmt.format(localDate));

		Period fromYears = Period.ofYears(10); // 10 years
		localDate = localDate.plus(fromYears);
		System.out.println(fromYears + " : " + fmt.format(localDate));

		Period fromWeeks = Period.ofWeeks(15); // 15 weeks
		localDate = localDate.plus(fromWeeks);
		System.out.println(fromWeeks + " : " + fmt.format(localDate));

		// 20 years, 3 months and 20 days
		Period periodFromUnits = Period.of(20, 3, 20);
		localDate = localDate.minus(periodFromUnits);
		System.out.println(periodFromUnits + " : " + fmt.format(localDate));
	}
}
