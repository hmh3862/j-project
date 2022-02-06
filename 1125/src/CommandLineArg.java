import java.util.Arrays;

public class CommandLineArg {
	//public static void main(String[] args) {
	public static void main(String...args) {
		// ... : 가변인수이다. 몇개가 들어오든 모두 배열로 받아 주겠다.
		System.out.println("될까요?");
		
		for(String arg : args) { // 명령실행시 뒤에 따라오는 인수(매개변수)들을 배열로 받아준다.
			System.out.println(arg);
		}
		
		int result = 0;
		System.out.println(Arrays.toString(args));
		int n1 = Integer.parseInt(args[0]);
		String op = args[1];
		int n2 = Integer.parseInt(args[2]);
		
		switch (op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		}
		
		System.out.println(n1 + op + n2 + "=" + result);
	}
}
