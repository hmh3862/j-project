package kr.green.app;

public class Ex03 {
	public static void main(String[] args) {
		// 어떠한 내용을 사용자에게 알려줄때 print명령을 사용한다.
		System.out.println("1줄");
		System.out.println("2줄"); // 출력하고 줄바꿈을 한다.
		System.out.print("3줄"); // 출력하고 줄바꿈하지 않는다.
		System.out.println("4줄");
		// 변수 선언
		String name = "박문수";
		int age = 35;
		
		System.out.println("\"" + name + "\"씨 " + age + "살이네 행님이라 불러");
		
		// format("출력모양", 출력할 데이터....) : 모양에 맞추어 출력할때 사용한다.
		// %s:문자열, %d,%i : 정수, %f : 실수 ...
		// \문자 : 이스케이프 시퀀스로 제어를 할때 사용
		// \n : 줄바꿈, \t : 탭, \\ : \출력, \" : "출력....
		System.out.format("\"%s\"님 %d살이네 행님이라 불러!!\n", name, age);
		System.out.printf("\"%s\"님 %d살이네 행님이라 불러!!\n", name, age);
		// String.format() : 결과를 String으로 만들어 준다. 사용법은 printf와 동일하다.
		System.out.println(String.format("\"%s\"님 %d살이네 행님이라 불러!!\n", name, age));
	}
}
