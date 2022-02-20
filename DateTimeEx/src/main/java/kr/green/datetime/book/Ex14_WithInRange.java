package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

// 특정 날짜가 특정 기간 사이에 있는지 체크하기
public class Ex14_WithInRange {
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		
		// Java 7 이전
		Calendar calendar =  Calendar.getInstance();
		calendar.set(2021, 9, 8);
		Date date = calendar.getTime();
		calendar.set(2021, 9, 1);
		Date startDate = calendar.getTime();
		calendar.set(2021, 9, 31);
		Date endDate = calendar.getTime();
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(startDate));
		System.out.println(sdf.format(endDate));
		System.out.println(isWithinRange(date, startDate, endDate));
		calendar.set(2021, 10, 1);
		Date date2 = calendar.getTime();
		System.out.println(sdf.format(date2));
		System.out.println(isWithinRange(date2, startDate, endDate));
		
		// Java 8 이후
		LocalDate localDate = LocalDate.of(2021, 10, 8);
		LocalDate startLocalDate = LocalDate.of(2021, 10, 1);
		LocalDate endLocalDate = LocalDate.of(2021, 10, 31);
		System.out.println(fmt.format(localDate));
		System.out.println(fmt.format(startLocalDate));
		System.out.println(fmt.format(endLocalDate));
		System.out.println(isWithinRange(localDate, startLocalDate, endLocalDate));
		LocalDate localDate2 = LocalDate.of(2021, 11, 8);
		System.out.println(fmt.format(localDate2));
		System.out.println(isWithinRange(localDate2, startLocalDate, endLocalDate));
		
	}
	public static boolean isWithinRange(Date date, Date startDate, Date endDate) {
		boolean result = false;
		result = !startDate.after(date) && !endDate.before(date);
		return result;
	}
	public static boolean isWithinRange(LocalDate date, LocalDate startDate, LocalDate endDate) {
		boolean result = false;
		result = !startDate.isAfter(date) && !endDate.isBefore(date);
		return result;
	}
}
