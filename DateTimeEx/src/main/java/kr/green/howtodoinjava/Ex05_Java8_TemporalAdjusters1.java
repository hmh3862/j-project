package kr.green.howtodoinjava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

/*
TemporalAdjuster 

주간 보고서 처리, 자동화된 월간 보고서 출력 전송 등과 같은 반복 날짜 를 처리할때 사용합니다.
TemporalAdjuster인터페이스와 TemporalAdjusters팩토리 클래스는 많은 유용한 제공 붙박이 조절기를 
반복 이벤트를 처리하기 위해. 이들 대부분의 이름은 그들이 하는 일을 직접적으로 알려줍니다.

제공된 조정자에 의해 해결되지 않은 특정 비즈니스 요구 사항이 있는 경우 
자체 사용자 지정 TemporalAdjuster 를 구축할 수 있습니다 .

그런 다음 with()해당 날짜/시간 개체 의 메서드 를 사용하여 모든 시간 개체에 적용할 수 있습니다 .
 */
public class Ex05_Java8_TemporalAdjusters1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("현재 : " + fmt.format(today) + "\n");

		// 다음 월요일 5회 
		List<LocalDate> meetingDates = getWeeklyMeetingDates(today, DayOfWeek.MONDAY, 5);
        for(LocalDate localDate : meetingDates) {
        	System.out.println(fmt.format(localDate));
        }
	}

	private static List<LocalDate> getWeeklyMeetingDates(LocalDate localDate, DayOfWeek dayOfWeek, int count) {
		List<LocalDate> dates = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			localDate = localDate.with(TemporalAdjusters.next(dayOfWeek));
			dates.add(localDate);
		}
		return dates;
	}


}
