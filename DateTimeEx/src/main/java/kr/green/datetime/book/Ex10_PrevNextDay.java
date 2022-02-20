package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
// 몇일전, 몇일후, 몇달전, 몇달후, 몇년전, 몇년후
public class Ex10_PrevNextDay {
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E) a hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		
		// Java 7 이전
		Calendar calendar = Calendar.getInstance();
		System.out.println("오늘 : " + sdf.format(calendar.getTime()));
		// 몇년전, 몇년후
		calendar.add(Calendar.YEAR, 10);
		System.out.println("10년 후 : " + sdf.format(calendar.getTime()));
		calendar.add(Calendar.YEAR, -20);
		System.out.println("10년 전 : " + sdf.format(calendar.getTime()));
		
		// 몇달전, 몇달후
		calendar.add(Calendar.MONTH, 6);
		System.out.println("6개월 후 : " + sdf.format(calendar.getTime()));
		calendar.add(Calendar.MONTH, -12);
		System.out.println("6개월 전 : " + sdf.format(calendar.getTime()));

		// 몇일전, 몇일후
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("3일 후 : " + sdf.format(calendar.getTime()));
		calendar.add(Calendar.DAY_OF_MONTH, -6);
		System.out.println("3일 전 : " + sdf.format(calendar.getTime()));
		// 몇시간전, 몇시간후
		calendar.add(Calendar.HOUR_OF_DAY, 5);
		System.out.println("5시간 후 : " + sdf.format(calendar.getTime()));
		calendar.add(Calendar.HOUR_OF_DAY, -10);
		System.out.println("5시간 전 : " + sdf.format(calendar.getTime()));
		System.out.println();
		
		
		// Java 8 이후
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("오늘 : " + fmt.format(localDateTime));
		// 몇년전, 몇년후
		localDateTime = localDateTime.plusYears(10);
		System.out.println("10년 후 : " + fmt.format(localDateTime));
		localDateTime = localDateTime.minusYears(20);
		System.out.println("10년 전 : " + fmt.format(localDateTime));
		
		// 몇달전, 몇달후
		localDateTime = localDateTime.plusMonths(6);
		System.out.println("6개월 후 : " + fmt.format(localDateTime));
		localDateTime = localDateTime.minusMonths(12);
		System.out.println("6개월 전 : " + fmt.format(localDateTime));
		
		// 몇일전, 몇일후
		localDateTime = localDateTime.plusDays(3);
		System.out.println("3일 후 : " + fmt.format(localDateTime));
		localDateTime = localDateTime.minusDays(6);
		System.out.println("3일 전 : " + fmt.format(localDateTime));
		
		// 몇시간전, 몇시간후
		localDateTime = localDateTime.plusHours(5);
		System.out.println("5시간 후 : " + fmt.format(localDateTime));
		localDateTime = localDateTime.minusHours(10);
		System.out.println("5시간 전 : " + fmt.format(localDateTime));
	}
}
