// long타입은 정수를 저장하는 타입으로 8바이트를 차지한다. -9223372036854775808~9223372036854775807까지 저장가능하다.
// Long타입은 참조형으로 기본자료형을 한번 감싸 객체로 처리하는 클래스이다.
public class Ex04_LongType {
	public static void main(String[] args) {
		long b = 123;
		System.out.println(Long.BYTES + "Byte");
		System.out.println(Long.SIZE + "Bit");
		System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("b = " + b);
		
		b += 123; // 123을 더하라
		System.out.println("b = " + b); 

		b += Long.MAX_VALUE; // 최대 저장값을  더하라
		System.out.println("b = " + b); // 오버플로우
	}
}
