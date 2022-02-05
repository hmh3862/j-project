import java.awt.Color;

public class Ex08_Operator7 {
	/*
	 * Bitwise Operator : 비트 단위 연산을 수행한다.
	 * 비트 연산시 0은 거짓, 1은 참이다.
	 *   & : bit AND
	 *   | : bit OR
	 *   ^ : bit XOR
	 *   ~ : bit NOT
	 */
	public static void main(String[] args) {
		// AND연산 : 필요없는 부분을 지울때 사용한다.
		// OR 연산 : 특정 부분에 값을 지정할때 사용한다.
		int x = 0XABE4; // 16진수로 초기화 : 16진수 1자리는 2진수 4자리다!!!!
		// 필요없는 4비트를 비워보자
		System.out.println(x + " : " + Integer.toHexString(x));
		// A만 지워보자
		x = x & 0x0FFF; // 0으로 AND연산하면 지워지고 1로 AND연산하면 통과!!!
		System.out.println(x + " : " + Integer.toHexString(x));
		// E만 지워보자
		x = x & 0xFF0F; // 0으로 AND연산하면 지워지고 1로 AND연산하면 통과!!!
		System.out.println(x + " : " + Integer.toHexString(x));
		// 뒤에서 두번째 자리를 D로 버꿔보자 
		x = x | 0x00D0; // 0으로 OR연산하면 통과이고 1로 OR연산하면 설정!!!
		System.out.println(x + " : " + Integer.toHexString(x));
		// 뒤에서 네번째 자리를 7로 버꿔보자 
		x = x | 0x7000; // 0으로 OR연산하면 통과이고 1로 OR연산하면 설정!!!
		System.out.println(x + " : " + Integer.toHexString(x));
		
		// 자바의 색상 클래스
		// 자바는 모든 소스가 공개되어있다. 소스를 보려면 클래스 위에서 F3키를 누르거나 Ctrl+Click을 한다.
		@SuppressWarnings("unused")
		Color color = Color.DARK_GRAY;
		
	}
}
