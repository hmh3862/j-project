package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

// ISO-8601 달력 시스템 의 Java 8 기간 클래스를 사용하여 일, 월, 연도, 주 또는 연도와 같은 날짜 기반 값에서 
// 두 날짜 간의 차이 를 찾는 방법을 배웁니다 .

// Period클래스는 ISO-8601 기간 형식 일 - 기반 값을 이용하여 시간의 양을 나타내는 데 사용된다 PnYnMnD 및 PNW . 
// 예를 들어 P20Y2M25D문자열은 20년 2개월 25일을 나타냅니다.

public class Ex02_Java8_Period1 {
	public static void main(String[] args) {
		LocalDate startLocalDate = LocalDate.of(2020, 3, 12);
		LocalDate endLocalDate = LocalDate.now();

		// Period.between()
		// 주로 두 날짜 사이(예: 두 LocalDate인스턴스 사이 )의 기간을 나타내는 데 사용됩니다 .
		Period periodBetween = Period.between(startLocalDate, endLocalDate);
		System.out.println(periodBetween); // P1Y6M25D - 1년 6개월 25일
		System.out.println();
		
		System.out.println(periodBetween.getDays()); // 25일
		System.out.println(periodBetween.getMonths()); // 6개월
		System.out.println(periodBetween.getYears()); // 1년
		System.out.println(periodBetween.getDays()/7); // 3주
		System.out.println();
		
		System.out.println(periodBetween.get(ChronoUnit.DAYS)); // 25일
		System.out.println(periodBetween.get(ChronoUnit.MONTHS)); // 6개월
		System.out.println(periodBetween.get(ChronoUnit.YEARS)); // 1년
		try {
			System.out.println(periodBetween.get(ChronoUnit.WEEKS));
		}catch (UnsupportedTemporalTypeException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(periodBetween.get(ChronoUnit.DAYS)/7); // 3주
		}
		System.out.println();
		
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
