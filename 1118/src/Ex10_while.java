import java.util.Scanner;

// while(조건){ 조건이 참인동안 실행할 명령들... }
// do{ 조건이 참인동안 실행할 명령들... }while(조건);
// 둘다 조건이 참인동안 명령들을 반복실행한다. 차이는 1회 실행 보장에 있다.
public class Ex10_while {
	public static void main(String[] args) {
		// 임의의 정수를 입력받아 숫자를 뒤집기하기
		// 예) 1234 [엔터]
		// 4321 = 4 * 1000 + 3*100 + 2*10 + 1*1
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
		temp = 0;
		while(n>0) {
			temp += n%10 * length; // 뒤의 1자리 * 길이
			length /= 10;   // 길이 줄이기
			n /= 10; // 뒷자리 줄이기
		}
		System.out.println(temp);
		sc.close();
	}
}
