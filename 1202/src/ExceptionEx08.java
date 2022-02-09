import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionEx08 {
	public static void main(String[] args) {
		File file = new File("chunja2.txt");
	
		try(Scanner sc = new Scanner(file);) { // JDK 1.7부터 지원하는 자동 닫기 // 2. 연다
			while(sc.hasNextLine()) { // 3. 사용한다 ---- 여기서 예외가 발생한다면
				String line[] = sc.nextLine().split("\\|");
				System.out.println(line[1] + " : " + line[4]);
			}
			// sc.close(); // 이명령은 실행이 되지 않을 수 도 있다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
}


class MyException extends Exception{
	private static final long serialVersionUID = -2924925120665924158L;

	public MyException(String message) {
		super(message);
	}
}