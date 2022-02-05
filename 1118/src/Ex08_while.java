import java.util.Scanner;

// while(조건){ 조건이 참인동안 실행할 명령들... }
// do{ 조건이 참인동안 실행할 명령들... }while(조건);
// 둘다 조건이 참인동안 명령들을 반복실행한다. 차이는 1회 실행 보장에 있다.
public class Ex08_while {
	public static void main(String[] args) {
		// 임의의 정수를 입력받아 뒷자리부터 세로로 출력해 보시오
		// 예) 1234 [엔터]
		// 4
		// 3
		// 2
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 ");
		int n = sc.nextInt();
		while(n>0) {
			System.out.println(n%10); // 맨 뒷자리 잘라내어 출력
			n /= 10; // 출력한 값 버리기
		}
		sc.close();
	}
}
