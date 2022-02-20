package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Java8_Period3 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("현재 : " + fmt.format(localDate));

		Period period = Period.parse("P1Y2M3D");
		System.out.println(period);
		
		localDate = localDate.plus(period);
		System.out.println("localDate.plus(" + period + ") : " + fmt.format(localDate));

		localDate = localDate.minus(period);
		System.out.println("localDate.minus(" + period + ") : " + fmt.format(localDate));
	}
}
