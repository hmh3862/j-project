import java.util.Scanner;

// while(조건){ 조건이 참인동안 실행할 명령들... }
// do{ 조건이 참인동안 실행할 명령들... }while(조건);
// 둘다 조건이 참인동안 명령들을 반복실행한다. 차이는 1회 실행 보장에 있다.
public class Ex07_while {
	public static void main(String[] args) {
		// n을 입력받아 n!값을 구하여 출력하는 프로그램을 만드시오
		// 5! = 5 * 4 * 3 * 2 * 1 = 120 
		Scanner sc = new Scanner(System.in);
		System.out.print("Factorial 값을 구할 정수를 입력하시오 ");
		int n = sc.nextInt();
		long fac = 1; // 덧셈은 0으로 곱셈은 1로 초기화 해야 한다. 각각 "항등원"이다.
		System.out.print(n + "! = ");
		/*
		while(n > 1) {
			fac *= n;
			System.out.print(n + " * ");
			n--;
		}
		*/
		do{
			fac *= n;
			System.out.print(n + " * ");
			n--;
		}while(n > 1); 
		System.out.println("1 = " + fac);
		sc.close();
	}
}
