package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
ofDays(int days) – 일 수를 나타내는 기간.
ofMonths(int months) – 개월 수를 나타내는 기간.
ofWeeks(int weeks) – 주 수를 나타내는 기간입니다.
ofYears(int years) – 년 수를 나타내는 기간. 
*/
public class Ex03_Java8_Period2 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("현재 : " + fmt.format(localDate));
		
		Period fromDays = Period.ofDays(150);   // 150 days
		localDate = localDate.plus(fromDays);
		System.out.println(fromDays + " : " + fmt.format(localDate));
		
		
		Period fromMonths = Period.ofMonths(4); // 4 months
		localDate = localDate.plus(fromMonths);
		System.out.println(fromMonths + " : " + fmt.format(localDate));
		
		Period fromYears = Period.ofYears(10);  // 10 years
		localDate = localDate.plus(fromYears);
		System.out.println(fromYears + " : " + fmt.format(localDate));
		
		Period fromWeeks = Period.ofWeeks(15);  // 15 weeks
		localDate = localDate.plus(fromWeeks);
		System.out.println(fromWeeks + " : " + fmt.format(localDate));
		
		//20 years, 3 months and 20 days
		Period periodFromUnits = Period.of(20, 3, 20);
		localDate = localDate.minus(periodFromUnits);
		System.out.println(periodFromUnits + " : " + fmt.format(localDate));
	}
}
