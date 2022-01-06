
public class Ex02 {
	public static void main(String[] args) {
		int b = 0B10; // 0b로 시작하면 2진수 ==> JDK 1.7 이상에서 지원
		int d = 10;   // 1~9로 시작하면 10진수
		int o = 010;  // 0으로 시작하면 8진수
		int h = 0X10; // 0x로 시작하면 16진수
		
		System.out.println("b = " + b);
		System.out.println("d = " + d);
		System.out.println("o = " + o);
		System.out.println("h = " + h);
	}
}
