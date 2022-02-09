import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionEx07 {
	public static void main(String[] args) {
		File file = new File("chunja2.txt");
		Scanner sc = null;// 1.준비
		try {
			sc = new Scanner(file); // 2. 연다
			while(sc.hasNextLine()) { // 3. 사용한다 ---- 여기서 예외가 발생한다면
				String line[] = sc.nextLine().split("\\|");
				System.out.println(line[1] + " : " + line[4]);
			}
			// sc.close(); // 이명령은 실행이 되지 않을 수 도 있다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close(); // 4. 닫는다. --- 닫는 명령은 finally 블럭에 써라!!!
		}
	}
}
