import java.util.Scanner;

// while(조건){ 조건이 참인동안 실행할 명령들... }
// do{ 조건이 참인동안 실행할 명령들... }while(조건);
// 둘다 조건이 참인동안 명령들을 반복실행한다. 차이는 1회 실행 보장에 있다.
public class Ex09_while {
	public static void main(String[] args) {
		// 임의의 정수를 입력받아 앞자리부터 세로로 출력해 보시오
		// 예) 1234 [엔터]
		// 1
		// 2
		// 3
		// 4
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 ");
		int n = sc.nextInt();
		// 먼저 길이를 구한다.
		int temp = n; // 원본이 바뀌면 안되므로 피신 시킨다.
		int length = 1; // 자릿수를 구할 변수
		// 1 10 100 1000 10000 100000 ....
		while(temp>=10) { // 1자리는 구했으니 10보다 클때까지 반복
			length *= 10; // 10을 곱해 자릿수를 구해준다.
			temp /= 10; // 10으로 나눠 자릿수를 줄인다.
		}
		System.out.println("길이 : " + length);
		temp = n;
		while(temp>0) {
			System.out.println(temp/length); // 1자리 출력
			temp %= length; // 앞의 1자리 버리기
			length /= 10;   // 길이 줄이기
		}
		sc.close();
	}
}
