package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
// 월 특정 요일만 가져오기
public class Ex09_WeekDays {
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		
		// Java 7 이전
		List<Date> weekDays7 = getWeekDay7(2021, 10, "일");
		for(Date date : weekDays7) System.out.println(sdf.format(date));
		System.out.println();
		weekDays7 = getWeekDay7(2021, 6, "수");
		for(Date date : weekDays7) System.out.println(sdf.format(date));
		System.out.println();
		// Java 8 이후
		List<LocalDate> weekDays8 = getWeekDay8(2021, 10, DayOfWeek.SUNDAY);
		for(LocalDate localDate : weekDays8) System.out.println(fmt.format(localDate));
		System.out.println();
		weekDays8 = getWeekDay8(2021, 6, DayOfWeek.WEDNESDAY);
		for(LocalDate localDate : weekDays8) System.out.println(fmt.format(localDate));
	}
	
	public static List<Date> getWeekDay7(int year, int month, String week){
		String weeks = "일월화수목금토";
		int intWeek = weeks.indexOf(week)+1;
		List<Date> weekDays = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i<=last;i++) {
			cal.set(Calendar.DATE, i);// 일 변경
			if(cal.get(Calendar.DAY_OF_WEEK)==intWeek) weekDays.add(cal.getTime());// 추가
		}
		return weekDays;
	}
	
	public static List<LocalDate> getWeekDay8(int year, int month, DayOfWeek dayOfWeek){
		List<LocalDate> weekDays = new ArrayList<LocalDate>();
		LocalDate localDate = LocalDate.of(year, month, 1); // 1일로 만들기
		localDate = localDate.with(TemporalAdjusters.next(dayOfWeek)); // 다음요일로 가기
		do {
			weekDays.add(localDate);
			localDate = localDate.with(TemporalAdjusters.next(dayOfWeek)); 
		}while(localDate.getMonth().getValue()==month); // 월이 같을때 까지
		return weekDays;
	}
}