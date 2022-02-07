import java.util.Date;

public class CalEx01 {
	// Date클래스만을 이용하여 이번달 달력 출력하기
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date today = new Date();
		// 1. 출력할 년/월
		int year = today.getYear()+1900; // 년 : 1900년 이후의 년수
		int month = today.getMonth()+1; // 월 : 0~11월
		/*
		year = 2022;
		month = 5;
		today.setYear(year-1900);
		today.setMonth(month-1);
		*/
		// 2. 1일의 요일
		// 날짜를 1일로 변경
		today.setDate(1);
		int week = today.getDay(); // 1일의 요일

		// 3. 그달의 마지막 날짜
		int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 월의 마지막 날짜!!
		lastDay[1] = (year%400==0 || year%4==0 && year%100!=0) ? 29 : 28; // 윤년일 경우 2월의 날짜를 변경한다.
		int lastDate = lastDay[month-1]; // 그달의 마지막 날짜
		
		// 4. 이제 출력해보자
		// 년월을 출력
		System.out.printf("%18d년 %02d월\n\n", year, month);
		// 요일 출력
		System.out.println("   일   월   화   수   목   금   토");
		// 1일의 요일을 맞추기 위해 앞에 공백을 출력하자
		for(int i=0;i<week;i++)
			System.out.print("     ");
		// 1일부터 마지막 날짜까지 출력한다. 단, 토요일이면 줄바꾼다.
		for(int i=1;i<=lastDate;i++) {
			// 날짜 출력
			System.out.printf("%5d", i);
			// 출력한 날짜의 요일을 구해서 토요일이면 줄바꿈
			today.setDate(i);
			week = today.getDay();
			if(week==6) System.out.println();
		}
		
	}
}
