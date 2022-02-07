import java.util.Calendar;
import java.util.Scanner;

import kr.green.util.MyDateUtil;

public class CalEx06 {
	// 수동으로 요일을 구하는 프로그램을 만들어 보자
	// 1년 1월 1일 부터 총일수 구하여 7로 나눈 나머지가 0이면 일요일이다. -- 성경책
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DAY_OF_MONTH);

		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력하시오(예) 1992 8 2[엔터]");
		int yy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		
		System.out.print(yy + "년 " + mm + "월 " + dd + "일에 태어난 당신은 현재 ");
		// 오늘까지의 총일수 - 생일까지의 총일수  + 1 = 내가 살아올 일수
		System.out.print(MyDateUtil.getTotalDay(year, month, date)-MyDateUtil.getTotalDay(yy, mm, dd)+1);
		System.out.println("일째 살고 있네요!!!");
		
		String week = "일월화수목금토";
		System.out.println("당신은 " + week.charAt(MyDateUtil.getTotalDay(yy, mm, dd)%7) + "요일에 태어났네요!!!");
		
		sc.close();

	}
}
