// float타입은 단정도 실수를 저장하기 위한 자료형이다. 4Byte용량
// 1.4E-45~3.4028235E38
// double타입은 베정도 실수를 저장하기 위한 자료형이다. 8Byte용량
public class Ex05_FloatType {
	public static void main(String[] args) {
		float f = 123.456f;
		System.out.println(Float.BYTES + "Byte");
		System.out.println(Float.SIZE + "Bit");
		System.out.println(Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("f = " + f);
		// 정수 나누기 정수의 결과는 정수이다.
		float div = 10/3;
		System.out.println("10나누기 3의 값 : " + div);
		div = 10/3f; // 숫자 뒤에 f를 붙이면 float형 상수이다.
		System.out.println("10나누기 3의 값 : " + div);
		// div = 10/3.0; // 에러이다. 3.0은 double형이다. 연산 결과가 8바이트인 double이다.
		                 // double을 float에 넣을 수 없다.
		double div2 = 10/3.;
		System.out.println("10나누기 3의 값 : " + div2);
		// 실수의 연산은 부정확하다. 유효자릿수를 생각해야 한다. 
		System.out.println("  12345678901234567890");
		// %n.mf : n(전체자릿수),m(소수이하 자릿수) 
		System.out.printf("%.20f\n", div); // 소수이하 6자리까지만 믿어라
		System.out.printf("%.20f\n", div2);// 소수이하 15자리까지만 믿어라
	}
}
