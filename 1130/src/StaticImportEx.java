
// JDK 1.5에 추가된 정적 import : 자주 사용하는 놈의 클래스 이름을 생략할 수 있게 한다. 
import static java.lang.System.out;
import static java.lang.System.in;

import java.util.Scanner;


public class StaticImportEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(in);
		out.println("어 System은 어디로 갔을까?");
		
		out.print("이름?");
		// String name = scanner.next(); // 입력구분자는 엔터, 탭, 공백이다. 빈칸은 입력되지 않는다.
		String name = scanner.nextLine(); // 공백까지 입력받으여면 nextLine()을 써야 한다.
		
		out.print("몇살?");
		int age = scanner.nextInt();
		
		out.append(name + "씨 " + age + "살이네 행님이라 불러라~~~~");
		scanner.close();
	}
}
