import java.util.Scanner;

import kr.green.util.MyDateUtil;

public class CalEx04 {
	// 내가 만든 클래스이용하여 달력 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("보고자하는 년/월를 입력하시오");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		MyDateUtil.viewCalendar(year, month);
		sc.close();
	}
}
