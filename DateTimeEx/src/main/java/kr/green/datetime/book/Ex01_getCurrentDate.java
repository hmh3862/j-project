package kr.green.datetime.book;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class Ex01_getCurrentDate {
	// 현재의 날짜 알아내기
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Java 7 이전
		Date date = new Date();
		System.out.println("현재 : " + date);
		System.out.println(String.format("현재 : %4d-%02d-%02d", 
				date.getYear()+1900, date.getMonth()+1, date.getDate()));
		Calendar calendar = Calendar.getInstance();
		System.out.println(String.format("현재 : %4d-%02d-%02d", 
										  calendar.get(Calendar.YEAR),
				                          calendar.get(Calendar.MONTH)+1, 
				                          calendar.get(Calendar.DAY_OF_MONTH)));

		// 정해진 표시형식으로
		DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("현재 : " + dateFormat1.format(date));
		DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("현재 : " + dateFormat2.format(calendar.getTime()));
		DateFormat dateFormat3 = DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println("현재 : " + dateFormat3.format(date));
		DateFormat dateFormat4 = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println("현재 : " + dateFormat4.format(calendar.getTime()));
		DateFormat dateFormat5 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
		System.out.println("현재 : " + dateFormat5.format(calendar.getTime()));
		
		// 사용자 정의 표시형식으로
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
		System.out.println("현재 : " + simpleDateFormat1.format(date));
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("y-MM-dd(E) a hh:mm:ss");
		System.out.println("현재 : " + simpleDateFormat2.format(calendar.getTime()));
		System.out.println();
		
		// Java 8 이후
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("현재 : " + localDate);
		System.out.println("현재 : " + localTime);
		System.out.println("현재 : " + localDateTime);
		
		// 정해진 표시형식으로
		System.out.println("현재 : " + DateTimeFormatter.ISO_DATE.format(localDateTime));
		System.out.println("현재 : " + localDateTime.format(DateTimeFormatter.ISO_DATE));
		System.out.println("현재 : " + DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(localDateTime));
		System.out.println("현재 : " + DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(localDateTime));
		
		// 사용자 정의 표시형식으로
		String pattern1 = "yyyy'년' MM'월' dd'일('EEEE')'";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(pattern1);
		System.out.println("현재 : " + formatter1.format(localDate));
		String pattern2 = "yyyy'년' MM'월' dd'일('E')' a hh:mm:ss";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern2);
		System.out.println("현재 : " + formatter2.format(localDateTime));
	}
}
