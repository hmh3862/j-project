import java.util.Scanner;

// 두개의 정수를 입력받아 나눗셈을 하는 프로그램이다.
// 잘 만든것일까?
// 치명적인 단점이 두가지가 있다.
// 1. 나누는 수에 0을 입력했을 경우
// 2. 정수가 아닌 다른 값을 입력했을 경우
// 이 두가지를 모두 처리를 해주어야 된다.
// 자바에서는 예외를 처리하는 문법을 지원한다. 그리고 예외처리는 선택이 아닌 필수이다.
public class ExceptionEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0;
		boolean flag = true;
		do {
			try {
				System.out.print("첫번째 정수 입력 : ");
				x = sc.nextInt();
				flag = false;
			}catch (Exception e) {
				System.out.println("정수가 아닙니다.");
				sc.nextLine(); // 입력 버퍼의 내용을 읽어서 지워버린다.
			}
		}while(flag);
		flag = true;
		do {
			try {
				System.out.print("두번째 정수 입력 : ");
				y = sc.nextInt();
				flag = false;
			}catch (Exception e) {
				System.out.println("정수가 아닙니다.");
				sc.nextLine();
			}
		}while(flag);
		
		try {	
			int result  = x/y;
			System.out.printf("%d / %d = %d\n", x, y, result);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
