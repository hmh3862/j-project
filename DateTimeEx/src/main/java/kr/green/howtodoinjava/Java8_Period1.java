package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.Period;

public class Java8_Period1 {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(1950, 6, 25);
		LocalDate endDate = LocalDate.of(1953, 7, 27);
		System.out.println("한국전쟁 시작일 : " + startDate);
		System.out.println("한국전쟁 휴전일 : " + endDate);
		
		Period period = Period.between(startDate, endDate);
		System.out.println(period);
		System.out.print("한국전쟁은 기간은 " + period.getYears() + "년 ");
		System.out.print(period.getMonths() + "개월 ");
		System.out.println(period.getDays() +"일간 치뤄졌습니다.");
		System.out.println();
		
		LocalDate birthDate = LocalDate.of(1992, 8, 22);
		System.out.println("당신의 생일 : " + birthDate);
		System.out.println("현재 일 : " + LocalDate.now());
		
		Period period2 = Period.between(birthDate, LocalDate.now());
		System.out.println(period2);
		System.out.print("당신은 " + period2.getYears() + "년 ");
		System.out.print(period2.getMonths() + "개월 ");
		System.out.println(period2.getDays() +"일째 살고 있습니다.");
	}
}
