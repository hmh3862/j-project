package kr.green.util;

public class MyDateUtil {
	// 해당 년월의 마지막 날짜를 얻어내는 메서드 2개
	/*
	public static int getLastDay(int year, int month) {
		return month==2 ? ((year%400==0 || year%4==0 && year%4!=100) ? 29 : 28)
				        : (month<8 ? (month%2==0 ? 30 : 31) :  (month%2==0 ? 31 : 30));	
	}
	*/
	public static int getLastDay(int year, int month) {
		int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		lastDay[1] = (year%400==0 || year%4==0 && year%100!=0) ? 29 : 28; 
		return lastDay[month-1];
	}
	
	// 요일을 구하는 메서드
	public static int getWeekday(int year, int month, int date) {
		return getTotalDay(year, month, date)%7;
	}
	
	public static int getTotalDay(int year, int month, int date) {
		// 1년 1월 1일 부터 총일수
		// 1. 전년도까지의 일수
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400; 
		// 2. 전월까지의 일수
		for(int i=1;i<month;i++) total += getLastDay(year, i);
		// 3. 1+2+일 = 총일수
		total += date;
		return total;		
	}
	public static void viewCalendar(int year, int month) {
		// 2. 1일의 요일
		int week = getWeekday(year, month, 1);
		// 3. 마지막 날짜
		int lastDay = getLastDay(year, month);
		
		// 4. 이제 출력해보자
		// 년월을 출력
		System.out.printf("%18d년 %02d월\n\n", year, month);
		// 요일 출력
		System.out.println("   일   월   화   수   목   금   토");
		// 1일의 요일을 맞추기 위해 앞에 공백을 출력하자
		for(int i=0;i<week;i++)
			System.out.print("     ");
		// 1일부터 마지막 날짜까지 출력한다. 단, 토요일이면 줄바꾼다.
		for(int i=1;i<=lastDay;i++) {
			// 날짜 출력
			System.out.printf("%5d", i);
			// 출력한 날짜의 요일을 구해서 토요일이면 줄바꿈
			week = getWeekday(year, month, i);
			if(week==6) System.out.println();
		}
		System.out.println("\n");
	}
}
