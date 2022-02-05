// int타입은 정수를 저장하는 타입으로 4바이트를 차지한다. -2147483648~2147483647까지 저장가능하다.
// Integer타입은 참조형으로 기본자료형을 한번 감싸 객체로 처리하는 클래스이다.
public class Ex03_IntegerType {
	public static void main(String[] args) {
		int b = 123;
		System.out.println(Integer.BYTES + "Byte");
		System.out.println(Integer.SIZE + "Bit");
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("b = " + b);
		
		b += 123; // 123을 더하라
		System.out.println("b = " + b); 

		b += Integer.MAX_VALUE; // 최대 저장값을  더하라
		System.out.println("b = " + b); // 오버플로우
	}
}
