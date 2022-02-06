import java.util.Scanner;

/*
 * 정수 n을 입력받아 1부터 n까지의 숫자중에 3과 5의 배수의 출력하고 합을 구하여 출력하시오!!!
 */
public class Exam02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// for(;;) {
		while(true) {
			System.out.print("양의 정수를 입력하시오(0은 종료) ");
			int n = scanner.nextInt();
			if(n==0) break;
			if(n<0) {
				System.out.println("정확한 값(양의 정수)을 입력하세요");
				continue;
			}
			// 여기를 코딩한다.
			int sum = 0;
			for(int i=1;i<n;i++) {
				/*
				// 답이 틀렸다. 뭐가 잘못된 것일까? 3의배수이면서 5의 배수인 15의 배수가 2번씩 더해진다.
				if(i%3==0) {
					sum += i;
					System.out.print(i + " ");
				}
				if(i%5==0) {
					sum += i;
					System.out.print(i + " ");
				}
				*/
				if(i%3==0 || i%5==0) {
					sum += i;
					System.out.print(i + " ");
				}
			}
			System.out.println("\n합 : " + sum); 
		}
		scanner.close();
	}
}
