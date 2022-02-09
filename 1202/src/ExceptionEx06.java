import java.io.FileNotFoundException;
import java.io.FileReader;

// 두개의 정수를 입력받아 나눗셈을 하는 프로그램이다.
// 잘 만든것일까?
// 치명적인 단점이 두가지가 있다.
// 1. 나누는 수에 0을 입력했을 경우
// 2. 정수가 아닌 다른 값을 입력했을 경우
// 이 두가지를 모두 처리를 해주어야 된다.
// 자바에서는 예외를 처리하는 문법을 지원한다. 그리고 예외처리는 선택이 아닌 필수이다.
public class ExceptionEx06 {
	public static void main(String[] args) {
	
		try {
			System.out.println(div(12, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			@SuppressWarnings({ "unused", "resource" })
			FileReader fr = new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		reader1("a.txt"); // UnChecked Exception을 발생하는 메서드는 try~catch를 사용자가 알아서 써야 한다.
		
		try {
			reader2("a.txt"); // Checked Exception을 발생하는 메서드는 try~catch를 반드시 써야만 컴파일 된다.
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}
	// 예외 포장하기 : Checked Exception을 UnChecked Exception으로 포장하여 던지기
	public static FileReader reader1(String filename) {
		FileReader fr = null;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("파일이 없어요"); // 예외 처리 선택적인 예외(UnChecked Exception)
		}
		return fr;
	}
	public static FileReader reader2(String filename) throws Exception {
		FileReader fr = null;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			// throw new Exception("파일이 없어요"); // 예외 처리가 필수인 예외(Checked Exception)
			throw e;
		}
		return fr;
	}
	
	
	
	// 예외 미루기
	public static int div(int a, int b) throws Exception {
		return div2(a, b);
	}

	// 예외 미루기 : 메서드명 뒤에 throw절을 써서 이메서드가 예외를 발생시키는 메서드라고 표시한다.
	// 그러면 이 메서드를 호출하는 곳에서는 반드시 예외처리를 하도록 강제한다.
	private static int div2(int a, int b) throws Exception { 
		if(b==0) 
			throw new Exception("0으로 나눌 수 없어요"); // 사용자가 예외 발생
		return a/b;		
	}
	
}
