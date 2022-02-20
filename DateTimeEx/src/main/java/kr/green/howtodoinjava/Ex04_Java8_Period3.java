package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
수정
주어진 Period객체 에서 기간을 더하거나 뺄 수 있습니다 . 더하기 및 빼기를 지원하는 방법은 다음과 같습니다.

plus(period) – 지정된 기간이 추가된 지정된 기간의 복사본을 반환합니다.
plusYears() – 지정된 연도가 추가된 지정된 기간의 복사본을 반환합니다.
plusMonths() – 지정된 월이 추가된 지정된 기간의 복사본을 반환합니다.
plusDays() – 지정된 날짜가 추가된 지정된 기간의 복사본을 반환합니다.
minus(period) – 지정된 기간을 뺀 지정된 기간의 복사본을 반환합니다.
minusYears() – 지정된 연도를 뺀 지정된 기간의 복사본을 반환합니다.
minusMonths() – 지정된 월을 뺀 지정된 기간의 복사본을 반환합니다.
minusDays() – 지정된 날짜를 뺀 지정된 기간의 복사본을 반환합니다.
multipliedBy(scalar) – 이 기간의 각 요소에 지정된 스칼라를 곱한 새 인스턴스를 반환합니다.
 */
public class Ex04_Java8_Period3 {
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
