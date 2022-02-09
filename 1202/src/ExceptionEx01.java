import java.util.Scanner;
// 두개의 정수를 입력받아 나눗셈을 하는 프로그램이다.
// 잘 만든것일까?
// 치명적인 단점이 두가지가 있다.
// 1. 나누는 수에 0을 입력했을 경우
// 2. 정수가 아닌 다른 값을 입력했을 경우
// 이 두가지를 모두 처리를 해주어야 된다.
public class ExceptionEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int y = sc.nextInt();
		
		int result  = x/y;
		
		System.out.printf("%d / %d = %d\n", x, y, result);
		
		sc.close();
	}
}
