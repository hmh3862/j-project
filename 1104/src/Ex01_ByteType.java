// byte타입은 정수를 저장하는 타입으로 -128 ~ +127까지 저장가능하다.
// Byte타입은 참조형으로 기본자료형을 한번 감싸 객체로 처리하는 클래스이다.
public class Ex01_ByteType {
	public static void main(String[] args) {
		byte b = 123;
		System.out.println(Byte.BYTES + "Byte");
		System.out.println(Byte.SIZE + "Bit");
		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("b = " + b);
		
		b += 123; // 123을 더하라
		System.out.println("b = " + b); // 오버플로우가 발생하여 -10이다.
	}
}
