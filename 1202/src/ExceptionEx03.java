import java.util.InputMismatchException;
import java.util.Scanner;

// 두개의 정수를 입력받아 나눗셈을 하는 프로그램이다.
// 잘 만든것일까?
// 치명적인 단점이 두가지가 있다.
// 1. 나누는 수에 0을 입력했을 경우
// 2. 정수가 아닌 다른 값을 입력했을 경우
// 이 두가지를 모두 처리를 해주어야 된다.
// 자바에서는 예외를 처리하는 문법을 지원한다. 그리고 예외처리는 선택이 아닌 필수이다.
public class ExceptionEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 예외가 발생할 소지가 있는 부분을 try블록으로 감싼다.
		try {
			System.out.print("첫번째 정수 입력 : ");
			int x = sc.nextInt();
			
			System.out.print("두번째 정수 입력 : ");
			int y = sc.nextInt();
			
			int result  = x/y;
			
			System.out.printf("%d / %d = %d\n", x, y, result);
		}catch (InputMismatchException e) { // 발생할 소지가 있는 예외를 catch로 잡아준다
			System.out.println("입력값이 정수가 아닙니다.");
			e.printStackTrace(); // 예외를 추적하라
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없어요!!!");
			System.out.println(e.getMessage());
		}catch (Exception e) { // Exception 예외는 모든 예외의 조상입니다. 사용하려면 맨 마지막에 써야 한다. 
			System.out.println("알수 없는 예외입니다.");
		}finally {
			System.out.println("예외 여부와 상관없이 나는 항상 실행 됩니다.");
		}
		sc.close();
	}
}
