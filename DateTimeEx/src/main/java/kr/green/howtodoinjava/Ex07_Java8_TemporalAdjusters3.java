package kr.green.howtodoinjava;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/*
Custom TemporalAdjuster


 */
public class Ex07_Java8_TemporalAdjusters3 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("현재 : " + fmt.format(localDate) + "\n");

		// 사용자 정의 TemporalAdjuster 형식
		// 1. 람다식
		TemporalAdjuster temporalAdjuster = t -> t.plus(Period.ofDays(7));
		LocalDate newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("사용자 정의 TemporalAdjuster 형식 1 : " + fmt.format(newlocalDate));

		// 2. 익명 클래스
		temporalAdjuster = new TemporalAdjuster() {
			@Override
			public Temporal adjustInto(Temporal temporal) {
				return temporal.with(ChronoField.MONTH_OF_YEAR, 1).plus(Period.ofDays(22));
			}
		};
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("사용자 정의 TemporalAdjuster 형식 2 : " + fmt.format(newlocalDate));
		
		// 3. 내부 클래스
		temporalAdjuster = new NextBirthDay();
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("사용자 정의 TemporalAdjuster 형식 3 : " + fmt.format(newlocalDate));

	}

	static class NextBirthDay implements TemporalAdjuster {
		@Override
		public Temporal adjustInto(Temporal temporal) {
			return temporal.with(ChronoField.MONTH_OF_YEAR, 11).with(ChronoField.DAY_OF_MONTH, 22);
		}
	}
}
