package kr.manamana.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Ex05_MiliVsNano {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		
		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);
		
		Date date1 = new Date(currentTimeMillis);
		System.out.println(sdf.format(date1));

		Date date2 = new Date(nanoTime);
		System.out.println(sdf.format(date2));
		
		long day1 = currentTimeMillis/1000/60/60/24; // ms/초/분/시
		System.out.println(day1);
		long day2 = nanoTime/10000/60/60/24; // ns/초/분/시
		System.out.println(day2);
		
		// 날짜 계산
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1);
		LocalDate localDate2 = localDate1.minusDays(day1);
		System.out.println(localDate2);
	}
}
