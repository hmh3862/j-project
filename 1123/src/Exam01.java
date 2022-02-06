import java.util.Scanner;

/*
 피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 
 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
 예) 0, 1, 1, 2, 3, 5, 8, 13
 인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
 풀이방법
 1. 두개의 변수를 선언하고 0과 1로 초기화한다.
 2. 첫번째 변수를 출력한다. 0부터 출력하려면 first를 출력하고 1부터 출력하려면 second를 출력하면 된다.
 3. 임시변수에 두번째 값을 피신 시킨다.
 4. 두개의 변수값을 더해 두번째에 넣는다.
 5. 피신시킨값을 첫번째에 넣는다.
 6. 2~5번을 n이될때까지 반복한다.
 */
public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int first = 0, second = 1, temp; // 1번 해결
		while(first<=n) { // 6번 해결
			System.out.printf("%5d", first); // 2번 해결
			temp = second; // 3번 해결
			second = first + second; // 4번 해결
			first = temp; // 5번 해결
		}
		System.out.println();
		// 여러분의 능력을 믿어 보겠습니다. 위의 문제를 temp라는 임시변수 없이 해결 가능합니다.
		// 해결해 보세요!!!!! temp의 역할은 두번째 변수값이 사라지므로 사라지기 전에 피신 시킨것이다.
		// 사라지기 전의 값을 알아낼 수 있다면 temp라는 변수는 필요 없다.
		first = 0; second = 1;
		while(second<=n) { // 6번 해결
			System.out.printf("%5d", second); // 2번 해결
			second = first + second; // 4번 해결
			first = second - first; // 늘어난값을 빼주면 원래의 값이다.
		}
		System.out.println();
		sc.close();
	}
}
