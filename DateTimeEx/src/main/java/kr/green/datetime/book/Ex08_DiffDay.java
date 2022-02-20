package kr.green.datetime.book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class Ex08_DiffDay {
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		String strStartDate = "2021-01-01";
		String strEndDate = "2021-12-31";
		// Java 7 이전
		try {
			Date startDate = sdf.parse(strStartDate);
			Date endDate = sdf.parse(strEndDate);
			long diffDate = getDiffDay7(startDate, endDate);
			System.out.println(sdf.format(startDate) + "~" + sdf.format(endDate) + " : " + diffDate);
			
			strStartDate = "0001-01-01";
			strEndDate = "2021-12-31";
			startDate = sdf.parse(strStartDate);
			endDate = sdf.parse(strEndDate);
			diffDate = getDiffDay7(startDate, endDate);
			System.out.println(sdf.format(startDate) + "~" + sdf.format(endDate) + " : " + diffDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		// Java 8 이후
		LocalDate startLocalDate = LocalDate.of(2021, 1, 1);
		LocalDate endLocalDate = LocalDate.of(2021, 12, 31);
		long diffDate = getDiffDay8(startLocalDate, endLocalDate);
		System.out.println(fmt.format(startLocalDate) + "~" + fmt.format(endLocalDate) + " : " + diffDate);
		startLocalDate = LocalDate.of(1, 1, 1);
		endLocalDate = LocalDate.of(2021, 12, 31);
		diffDate = getDiffDay8(startLocalDate, endLocalDate);
		System.out.println(fmt.format(startLocalDate) + "~" + fmt.format(endLocalDate) + " : " + diffDate);
		System.out.println();
		
		// 사용자 정의
		diffDate = getTotalDay(2021, 12, 31) - getTotalDay(2021, 1, 1);
		System.out.println(fmt.format(startLocalDate) + "~" + fmt.format(endLocalDate) + " : " + diffDate);
		diffDate = getTotalDay(2021, 12, 31) - getTotalDay(1, 1, 1);
		System.out.println(fmt.format(startLocalDate) + "~" + fmt.format(endLocalDate) + " : " + diffDate);
		
	}
	
	public static long getDiffDay7(Date startDate,Date endDate){
		// 1000밀리초는 1초로 계산되므로 getTime()으로 구한 값을 밀리초를 1000으로 나누면 초를 얻습니다. 
		// 이 초를 기본으로 하여 다른 시간 단위들도 계산할 수 있습니다.
		// 초 : / 1000 
		// 분 : / (1000 * 60)
		// 시 : / (1000 * 60 * 60)
		long diffDay = 0;
		diffDay = (endDate.getTime() - startDate.getTime())/(60*60*24*1000);
		return diffDay;
	}
	
	public static long getDiffDay8(LocalDate startLocalDate, LocalDate endLocalDate){
		// 두 날짜간 전체 일 수 차이를 구하려면 ChronoUnit 클래스의 between() 메소드를 사용하면 됩니다.
		// ChronoUnit 클래스는 enum 클래스이며 기간 단위별로 enum 타입이 정의되어 있습니다.
		// ChronoUnit.YEARS : 년
		// ChronoUnit.MONTHS : 월
		// ChronoUnit.WEEKS : 주
		// ChronoUnit.DAYS : 일
		// ChronoUnit.HOURS : 시간
		// …		
		long diffDay = 0;
		diffDay = ChronoUnit.DAYS.between(startLocalDate, endLocalDate);
		return diffDay;
	}
	// ------------------------------------------------------------------------------------------------
	// 윤년 판단
	private static boolean isLeapYear(int year) {
		return year%400==0 || year%4==0 && year%100!=0;
	}
	// 년월의 마지막 날짜
	private static int getLastDay(int year, int month) {
		int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2) m[1] = isLeapYear(year) ? 29 : 28;
		return m[month-1];
	}
	// 지정일까지의 총일수
	private static long getTotalDay(int year,int month, int date) {
		// 전년도 까지의 총일 수
		long days = (year-1) * 365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		// 전월까지의 총일수
		for(int i=1;i<month;i++) days += getLastDay(year, i);
		// + 일
		days += date;
		return days;
	}
	
}
