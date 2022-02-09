// 두개의 정수를 입력받아 나눗셈을 하는 프로그램이다.
// 잘 만든것일까?
// 치명적인 단점이 두가지가 있다.
// 1. 나누는 수에 0을 입력했을 경우
// 2. 정수가 아닌 다른 값을 입력했을 경우
// 이 두가지를 모두 처리를 해주어야 된다.
// 자바에서는 예외를 처리하는 문법을 지원한다. 그리고 예외처리는 선택이 아닌 필수이다.
public class ExceptionEx05 {
	public static void main(String[] args) {
		try {
			System.out.println(div(12, 0));
		}catch (Exception e) {
			e.printStackTrace(); // 예외 추적
			System.out.println(e.getMessage()); // 예외 메세지 얻기
		}
	}
	
	public static int div(int a, int b) {
		return div2(a, b);
	}

	private static int div2(int a, int b) {
		return a/b;		
	}
	
}
