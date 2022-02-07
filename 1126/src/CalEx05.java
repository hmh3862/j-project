import java.util.Calendar;

public class CalEx05 {
	// 수동으로 요일을 구하는 프로그램을 만들어 보자
	// 1년 1월 1일 부터 총일수 구하여 7로 나눈 나머지가 0이면 일요일이다. -- 성경책
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		
		// year=2; month=1; date=1;
		// 1년 1월 1일 부터 총일수
		// 1. 전년도까지의 일수
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400; 
		// 2. 전월까지의 일수
		int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 월의 마지막 날짜!!
		lastDay[1] = (year%400==0 || year%4==0 && year%100!=0) ? 29 : 28; // 윤년일 경우 2월의 날짜를 변경한다.

		for(int i=0;i<month-1;i++) {
			total += lastDay[i];
		}
		
		// 3. 1+2+일 = 총일수
		total += date;
		
		System.out.println("지금 까지의 총일수 : " + total + "일");
		// 못믿겠다.... 요일이라도 구해서 확인해 보자
		String week = "일월화수목금토";
		System.out.println("오늘의 요일 : " + week.charAt(total%7));
	}
}
