package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Ex04_FirstDayOfYearLastDayOfYear {
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		// Java 7 이전
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.get(Calendar.YEAR),1-1,1);
		Date firstDate = calendar.getTime();
		calendar.set(calendar.get(Calendar.YEAR),12-1,31);
		Date lastDate = calendar.getTime();
		System.out.println(sdf.format(firstDate) + " ~ " + sdf.format(lastDate));
		System.out.println();
		
		// Java 8 이후
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalDate firstDay = localDate.withDayOfMonth(1).withMonth(1); // 날짜 변경
		LocalDate lastDay = localDate.withDayOfMonth(31).withMonth(12); 
		System.out.println(formatter.format(firstDay) + " ~ " + formatter.format(lastDay));
		
		// TemporalAdjusters 사용
		firstDay = localDate.with(TemporalAdjusters.firstDayOfYear());
		lastDay   = localDate.with(TemporalAdjusters.lastDayOfYear());
		System.out.println(formatter.format(firstDay) + " ~ " + formatter.format(lastDay));
	}
}
