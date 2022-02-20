package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class Ex03_FirstDayLastDay {
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		// Java 7 이전
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Calendar calendar = Calendar.getInstance();
		int first = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
		int last = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(sdf.format(calendar.getTime()) + " : " + first + "~" + last);
		calendar.set(2000, 2-1, 11); // 2000년 2월 
		first = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
		last = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(sdf.format(calendar.getTime()) + " : " + first + "~" + last);
		
		System.out.println();
		
		// Java 8 이후
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalDate firstDay = localDate.withDayOfMonth(1); // 날짜 변경
		first =  firstDay.getDayOfMonth(); // 일얻기
		// lastDay = localDate.withDayOfMonth(localDate.lengthOfMonth());
		// last = lastDay.getDayOfMonth();
		last = localDate.lengthOfMonth();
		System.out.println(formatter.format(localDate) + " : " + first + "~" + last);
		
		localDate = LocalDate.of(2000, 2, 11);
		firstDay = localDate.withDayOfMonth(1);
		first =  firstDay.getDayOfMonth();
		// lastDay = localDate.withDayOfMonth(localDate.lengthOfMonth());
		// last = lastDay.getDayOfMonth();
		last = localDate.lengthOfMonth();
		System.out.println(formatter.format(localDate) + " : " + first + "~" + last);
		System.out.println();
		
		//  Java에서 제공하는 YearMonth class 사용
		YearMonth month = YearMonth.from(localDate);
		LocalDate start = month.atDay(1);
		LocalDate end   = month.atEndOfMonth();
		first = start.getDayOfMonth();
		last = end.getDayOfMonth();
		System.out.println(start + " ~ " + end + " : " + first + "~" + last);

		// 만약, 이번달의 1일과 마지막 날짜를 구하고 싶다면 아래와 같이 할 수 있습니다.
		start = YearMonth.now().atDay(1);
		end   = YearMonth.now().atEndOfMonth();
		first = start.getDayOfMonth();
		last = end.getDayOfMonth();
		System.out.println(start + " ~ " + end + " : " + first + "~" + last);
		System.out.println();
		
		// TemporalAdjusters 사용
		start = localDate.with(TemporalAdjusters.firstDayOfMonth());
		end   = localDate.with(TemporalAdjusters.lastDayOfMonth());
		first = start.getDayOfMonth();
		last = end.getDayOfMonth();
		System.out.println(start + " ~ " + end + " : " + first + "~" + last);
		
		localDate = LocalDate.now();
		start = localDate.with(TemporalAdjusters.firstDayOfMonth());
		end   = localDate.with(TemporalAdjusters.lastDayOfMonth());
		first = start.getDayOfMonth();
		last = end.getDayOfMonth();
		System.out.println(start + " ~ " + end + " : " + first + "~" + last);
	}
}
