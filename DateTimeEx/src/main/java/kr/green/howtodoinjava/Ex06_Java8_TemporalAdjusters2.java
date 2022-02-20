package kr.green.howtodoinjava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.function.UnaryOperator;

/*
TemporalAdjuster 내장 메서드
firstDayOfMonth()	현재 달의 1일로 설정한 새 날짜를 반환합니다.
lastDayOfMonth()	현재 월의 마지막 날로 설정한 새 날짜를 반환합니다.
firstDayOfNextMonth()	다음 달 1일로 설정한 새 날짜를 반환합니다.
firstDayOfYear()	현재 연도의 첫날로 설정한 새 날짜를 반환합니다.
lastDayOfYear()	현재 연도의 마지막 날로 설정한 새 날짜를 반환합니다.
firstDayOfNextYear()	새 날짜를 반환하고 다음 해의 첫날로 설정합니다.
firstInMonth(DayOfWeek)	첫 번째 일치하는 요일이 있는 같은 달의 새 날짜를 반환합니다. 예를 들어 "5월의 첫 번째 수요일"입니다.
lastInMonth(DayOfWeek)	마지막으로 일치하는 요일이 있는 같은 달의 새 날짜를 반환합니다.
dayOfWeekInMonth(int ordinal, DayOfWeek)	서수 요일을 사용하여 같은 달의 새 날짜를 반환합니다.
next(DayOfWeek)	조정되는 날짜 이후에 지정된 요일이 처음 나타나는 날짜를 반환합니다.
nextOrSame(DayOfWeek)	조정되는 날짜 이후에 지정된 요일이 처음 나타나는 날짜를 반환합니다.
previous(DayOfWeek)	조정되는 날짜 이전에 지정된 요일이 처음 발생한 날짜를 반환합니다.
previousOrSame(DayOfWeek)	조정되는 날짜 이전에 지정된 요일이 처음 발생한 날짜를 반환합니다.
ofDateAdjuster(UnaryOperator<LocalDate>) 사용자가 지정한 형식으로 날짜를 반환합니다.
 */
public class Ex06_Java8_TemporalAdjusters2 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("현재 : " + fmt.format(localDate) + "\n");

		// 이번 달의 시작일
		TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
		LocalDate newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("firstDayOfMonth() : " + fmt.format(newlocalDate));
		
		// 이번 달의 마지막일
		temporalAdjuster = TemporalAdjusters.lastDayOfMonth();
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("lastDayOfMonth() : " + fmt.format(newlocalDate));
		
		// 다음 달의 시작일
		temporalAdjuster = TemporalAdjusters.firstDayOfNextMonth();
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("firstDayOfNextMonth() : " + fmt.format(newlocalDate));
		
		// 이번 년의 시작일
		temporalAdjuster = TemporalAdjusters.firstDayOfYear();
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("firstDayOfYear() : " + fmt.format(newlocalDate));
		
		// 이번 년의 마지막일
		temporalAdjuster = TemporalAdjusters.lastDayOfYear();
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("lastDayOfYear() : " + fmt.format(newlocalDate));
		
		// 다음 년의 시작일
		temporalAdjuster = TemporalAdjusters.firstDayOfNextYear();
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("firstDayOfNextYear() : " + fmt.format(newlocalDate));
		
		// 인수의 이번 월 시작일
		temporalAdjuster = TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY);
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("firstInMonth(DayOfWeek) : " + fmt.format(newlocalDate));
		
		// 인수의 이번 월 마지막일
		temporalAdjuster = TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY);
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("lastInMonth(DayOfWeek) : " + fmt.format(newlocalDate));
		
		// 인수의 이번 월 몇번째 일
		temporalAdjuster = TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.SUNDAY);
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("dayOfWeekInMonth(int ordinal, DayOfWeek) : " + fmt.format(newlocalDate));
		
		// 인수의 이번 월 몇번째 일
		temporalAdjuster = TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.SUNDAY);
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("dayOfWeekInMonth(int ordinal, DayOfWeek) : " + fmt.format(newlocalDate));
		
		// 인수의 이전 일
		temporalAdjuster = TemporalAdjusters.previous(DayOfWeek.SUNDAY);
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("previous(DayOfWeek) : " + fmt.format(newlocalDate));
		
		// 인수의 이전 일
		temporalAdjuster = TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY);
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("previousOrSame(DayOfWeek) : " + fmt.format(newlocalDate));
		
		// 인수의 이후 일 
		temporalAdjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("next(DayOfWeek) : " + fmt.format(newlocalDate));
		
		// 인수의 이후 일 
		temporalAdjuster = TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY);
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("nextOrSame(DayOfWeek) : " + fmt.format(newlocalDate));
		
		// 사용자가 지정한 클래스를 이용하여 적용한다. : 2일 후
		temporalAdjuster = TemporalAdjusters.ofDateAdjuster(date -> date.plusDays(2)); // 람다식 
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("ofDateAdjuster(UnaryOperator<LocalDate>) : " + fmt.format(newlocalDate));
	
		// 사용자가 지정한 클래스를 이용하여 적용한다. : 10년 후
		temporalAdjuster = TemporalAdjusters.ofDateAdjuster(new UnaryOperator<LocalDate>() { // 익명 클래스
			@Override
			public LocalDate apply(LocalDate localDate) {
				return localDate.plusYears(10);
			}
		});
		newlocalDate = localDate.with(temporalAdjuster);
		System.out.println("ofDateAdjuster(UnaryOperator<LocalDate>) : " + fmt.format(newlocalDate));

	}
}
