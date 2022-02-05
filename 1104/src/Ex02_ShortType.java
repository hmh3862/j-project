// short타입은 정수를 저장하는 타입으로 2바이트를 차지한다. -32768~32767까지 저장가능하다.
// Short타입은 참조형으로 기본자료형을 한번 감싸 객체로 처리하는 클래스이다.
public class Ex02_ShortType {
	public static void main(String[] args) {
		short b = 123;
		System.out.println(Short.BYTES + "Byte");
		System.out.println(Short.SIZE + "Bit");
		System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("b = " + b);
		
		b += 123; // 123을 더하라
		System.out.println("b = " + b); 

		b += Short.MAX_VALUE; // 최대 저장값을  더하라
		System.out.println("b = " + b); // 오버플로우
	}
}
