import java.util.Scanner;

public class Ex05_Operator4 {
	public static void main(String[] args) {
		// 문제 : 연도를 입력받아 평년/윤년 인지를 판단하여 출력하시오
		// 윤년 판단 기준
		// 년도가 400의 배수면 윤년
		// 또는
		// 년도가 4의 배수이면서 100의 배수가 아니면 윤년
		
		// if 조건문 : if(조건) { 조건이 참인경우 실행할 명령 들...}
		// break 명령 : 무조건 반복문을 탈출한다.

		// 2. 변수를 선언하자 --- 재료 준비가 끝났다
		Scanner sc = new Scanner(System.in); // Scanner객체
		boolean isLeapYear; // 윤년/평년을 판단할 변수
		int year; // 연도를 입력받을 변수
		
		while(true) { // 무한 반복되는 명령어!!! 반드시 탈출하는 명령이 존재해야 한다. 사용하면 좋지 않은 명령어
			System.out.print("연도 입력(0은 종료)");
			year = sc.nextInt();
			if(year==0) break; // 참인 경우 실행할 명령이 1줄이면 {} 생략 가능
			if(year<0) {
				System.out.println("너 바보지 년도가 어떻게 음수가되냐!!!");
				continue; // 무조건 반복문의 처음으로 간다.
			}
			// 여기까지 왔다는 것은 년도가 양수로 입력되었다는 이야기이다.
			isLeapYear = year%400 == 0 || year%4 == 0 && year%100 != 0;
			System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평") + "년입니다.");
			
			// 만약에 논리 연산자를 잘 사용하지 못한다면 다음과 같이 복잡해 진다.
			isLeapYear = false;
			//  if(조건) { 조건이 참인경우 실행할 명령 들...} else {조건이 거짓인 경우 실행할 명령 들...}
			if(year%400==0) {
				isLeapYear = true;
			}else {
				if(year%4==0) {
					if(year%100!=0) {
						isLeapYear = true;
					}
				}
			}
			System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평") + "년입니다.");
			// isLeapYear에 초기값을 false로 주지 않으면 다음과 같아진다. 
			if(year%400==0) {
				isLeapYear = true;
			}else {
				if(year%4==0) {
					if(year%100!=0) {
						isLeapYear = true;
					}else {
						isLeapYear = false;
					}
				}else {
					isLeapYear = false;
				}
			}
			System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평") + "년입니다.");
		}
		sc.close();
	}
}
