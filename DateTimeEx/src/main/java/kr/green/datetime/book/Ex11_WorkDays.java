package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
// 주말과 휴일을 제외한 날짜 구하기 
public class Ex11_WorkDays {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		
		// Java 7 이전
		List<Date> workDays7 = getWorkDays7(2021, 10);
		for(Date date : workDays7) System.out.println(sdf.format(date));
		System.out.println();
		
		List<Date> holidays = new ArrayList<Date>();
		holidays.add(new Date(121,9,1));
		holidays.add(new Date(121,9,3));
		holidays.add(new Date(121,9,4));
		holidays.add(new Date(121,9,11));
		workDays7 = getWorkDays7(2021, 10, holidays);
		for(Date date : workDays7) System.out.println(sdf.format(date));
		System.out.println();
			
		// Java 8 이후
		List<LocalDate> workDays8 = getWorkDays8(2021, 10);
		for(LocalDate localDate : workDays8)
			System.out.println(fmt.format(localDate));
		System.out.println();
		
		List<LocalDate> holidays2 = new ArrayList<LocalDate>();
		holidays2.add(LocalDate.of(2021, 10, 1));
		holidays2.add(LocalDate.of(2021, 10, 3));
		holidays2.add(LocalDate.of(2021, 10, 4));
		holidays2.add(LocalDate.of(2021, 10, 11));
		workDays8 = getWorkDays8(2021, 10, holidays2);
		for(LocalDate localDate : workDays8)
			System.out.println(fmt.format(localDate));
		System.out.println();
	}
	// parameter : 년, 월
	public static List<Date> getWorkDays7(int year, int month){
		List<Date> workDays = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i<=last;i++) {
			cal.set(Calendar.DATE, i);// 일 변경
			if(cal.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY && cal.get(Calendar.DAY_OF_WEEK)!=Calendar.SATURDAY) 
				workDays.add(cal.getTime());// 추가
		}
		return workDays;
	}
	
	// parameter : 년, 월, 휴일리스트
	public static List<Date> getWorkDays7(int year, int month, List<Date> holidays){
		List<Date> workDays = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i<=last;i++) {
			cal.set(Calendar.DATE, i);// 일 변경
			if(!isContains(holidays, cal.getTime()) && 
					cal.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY && cal.get(Calendar.DAY_OF_WEEK)!=Calendar.SATURDAY) {
				workDays.add(cal.getTime());// 추가
			}
		}
		return workDays;
	}
	// 리스트에 포함 여부 판단
	private static boolean isContains(List<Date> holidays, Date date) {
		String pattern = "yyyyMMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		for(Date d : holidays) {
			if(sdf.format(date).equals(sdf.format(d))) return true;
		}
		return false;
	}

	// parameter : 년, 월
	public static List<LocalDate> getWorkDays8(int year, int month){
		List<LocalDate> workDays = new ArrayList<LocalDate>();
		LocalDate localDate = LocalDate.of(year, month, 1);
		int last = localDate.lengthOfMonth();
		localDate = localDate.minusDays(1);
		for(int i=1;i<=last;i++) { 
			localDate = localDate.plusDays(1);
			if(!isWeekend(localDate)) workDays.add(localDate);
		}
		return workDays;
	}	
	// parameter : 년, 월, 휴일리스트
	public static List<LocalDate> getWorkDays8(int year, int month, List<LocalDate> holidays){
		List<LocalDate> workDays = new ArrayList<LocalDate>();
		LocalDate localDate = LocalDate.of(year, month, 1);
		int last = localDate.lengthOfMonth();
		localDate = localDate.minusDays(1);
		for(int i=1;i<=last;i++) { 
			localDate = localDate.plusDays(1);
			if(!holidays.contains(localDate) && !isWeekend(localDate)) workDays.add(localDate);
		}
		return workDays;
	}	
	
	private static boolean isWeekend(LocalDate localDate) {
		DayOfWeek day = DayOfWeek.of(localDate.get(ChronoField.DAY_OF_WEEK));
		return day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY;
	}
	
}
