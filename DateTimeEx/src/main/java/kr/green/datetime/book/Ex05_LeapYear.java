package kr.green.datetime.book;

import java.time.LocalDate;
import java.time.Year;
import java.util.GregorianCalendar;

public class Ex05_LeapYear {
	public static void main(String[] args) {
		// Java 7 이전
		for(int year = 1998;year<=2004;year++) {
			boolean isLeap = year%400==0 || year%4==0 && year%100!=0;
			System.out.println(year + "년은 " + (isLeap ? "윤" : "평") + "년 입니다.");
		}
		System.out.println();
		GregorianCalendar gregorianCalendar =  new GregorianCalendar();
		for(int year = 1998;year<=2004;year++) {
			System.out.println(year + "년은 " + (gregorianCalendar.isLeapYear(year) ? "윤" : "평") + "년 입니다.");
		}
		System.out.println();
		
		// Java 8 이후
		for(int year = 1998;year<=2004;year++) {
			System.out.println(year + "년은 " + ( Year.of(year).isLeap() ? "윤" : "평") + "년 입니다.");
		}
		System.out.println();
		
		for(int year = 1998;year<=2004;year++) {
			System.out.println(year + "년은 " + ( LocalDate.now().withYear(year).isLeapYear() ? "윤" : "평") + "년 입니다.");
		}
	}
}
