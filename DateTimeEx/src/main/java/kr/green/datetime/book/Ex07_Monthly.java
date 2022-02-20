package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
// 현재 월을 리스트로
import java.util.List;
public class Ex07_Monthly {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		// Java 7 이전
		List<Date> list1 = getMonthly7(new Date());
		for(Date date : list1) System.out.println(sdf.format(date));
		System.out.println();
		list1 = getMonthly7(new Date(100, 1, 17));
		for(Date date : list1) System.out.println(sdf.format(date));
		System.out.println();
		
		
		// Java 8 이후
		List<LocalDate> list2 = getMonthly8(LocalDate.now());
		for(LocalDate localDate : list2)
			System.out.println(fmt.format(localDate));
		System.out.println();
		list2 = getMonthly8(LocalDate.of(2000, 2, 17));
		for(LocalDate localDate : list2)
			System.out.println(fmt.format(localDate));
	}
	
	public static List<Date> getMonthly7(Date date){
		List<Date> monthly = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i<=last;i++) {
			monthly.add(cal.getTime());// 추가
			cal.add(Calendar.DATE, 1);// 일 증가
		}
		return monthly;
	}
	
	public static List<LocalDate> getMonthly8(LocalDate localDate){
		List<LocalDate> monthly = new ArrayList<LocalDate>();
		TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
		localDate = localDate.with(temporalAdjuster); 
		for(int i=0;i<localDate.lengthOfMonth();i++) { 
			monthly.add(localDate.plusDays(i));
		}
		return monthly;
	}
}
