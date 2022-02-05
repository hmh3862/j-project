import java.util.Scanner;

// 출력을 배웠으니 입력을 받아보자
public class Ex07_Input {
	public static void main(String[] args) {
		// Scanner : 입력을 받을 수 있도록 준비되어있는 클래스
		// 괄호 안에는 어디로 부터 입력받을 지를 기술한다.
		// System.in : 표준입력장치로 키보드를 나타낸다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println(name + "씨 " + age + "살이네 행님이라 불러라!!!");
		System.out.println("내년에는 " + age+1 + "살 이겠네요");
		System.out.println("내년에는 " + (age+1) + "살 이겠네요");
		sc.close(); // 사용이 끝나면 닫아준다.
		
		char a = 'A';
		System.out.println(a + 1);
		// 'A' + 1 = 65 + 1 = 66 : 'A'의 ASCII코드값 65번으로 변경되어 정수 연산을 한다.
		System.out.println((char)(a + 1)); // 다시 문자형으로 변경하면 66번 코드 'B'가 나온다.
		// 대문자 + 32 = 소문자, 소문자 - 32 = 대문자
		System.out.println((char)(a + 32));
		System.out.println((char)('f' - 32));
		System.out.println((char)('F' + 32));
	}
}
