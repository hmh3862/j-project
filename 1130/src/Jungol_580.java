import java.util.Scanner;

// 2016년의 날짜를 두 개의 정수 월 일로 입력받아서 
// 입력된 날짜가 존재하면 "OK!" 
// 그렇지 않으면 "BAD!"라고 출력하는 프로그램을 작성하시오.
public class Jungol_580 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 2016;
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		if(day>=1 && day <= getLastDay(year, month)) {
			System.out.println("OK!");
		}else {
			System.out.println("BAD!");
		}
		sc.close();
	}
	
	public static int getLastDay(int year, int month) {
		int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
		m[1] = (year%400==0 || year%4==0 && year%100!=0) ? 29 : 28;
		return m[month-1];
	}
	
}
