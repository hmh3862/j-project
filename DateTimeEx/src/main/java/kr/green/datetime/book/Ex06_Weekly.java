package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
// 현재 일주일 알아내기
import java.util.List;
public class Ex06_Weekly {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		// Java 7 이전
		List<Date> list1 = getWeekly7(new Date());
		for(Date date : list1) System.out.println(sdf.format(date));
		System.out.println();
		list1 = getWeekly7(new Date(100, 0, 17));
		for(Date date : list1) System.out.println(sdf.format(date));
		System.out.println();
		
		
		// Java 8 이후
		List<LocalDate> list2 = getWeekly8(LocalDate.now());
		for(LocalDate localDate : list2)
			System.out.println(fmt.format(localDate));
		System.out.println();
		list2 = getWeekly8(LocalDate.of(2000, 1, 17));
		for(LocalDate localDate : list2)
			System.out.println(fmt.format(localDate));
	}
	
	public static List<Date> getWeekly7(Date date){
		List<Date> weekly = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// 이전 일요일로 이동
		while(cal.get(Calendar.DAY_OF_WEEK)>1) {
			cal.add(Calendar.DATE, -1);
		}
		do {
			cal.add(Calendar.DATE, 1);// 일 증가
			weekly.add(cal.getTime());// 추가
		}while(cal.get(Calendar.DAY_OF_WEEK)<=6);// 토요일까지
		cal.add(Calendar.DATE, 1);// 일요일로 이동
		weekly.add(cal.getTime());// 추가
		return weekly;
	}
	
	public static List<LocalDate> getWeekly8(LocalDate localDate){
		List<LocalDate> weekly = new ArrayList<LocalDate>();
		if(localDate.getDayOfWeek()!=DayOfWeek.MONDAY) { // 월요일이 아니면
			TemporalAdjuster temporalAdjuster = TemporalAdjusters.previous(DayOfWeek.MONDAY);
			localDate = localDate.with(temporalAdjuster); // 이전 월요일로 이동
		}
		for(int i=0;i<7;i++) { // 7일
			weekly.add(localDate);
			localDate = localDate.plusDays(1); // 일 증가
		}
		return weekly;
	}
}
