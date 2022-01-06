
public class Ex01 {
	// 절대 컴퓨터는 믿을 수 없는 놈이다.
	// 변수 : 변하는 데이터값을 임시로 저장할 기억장소의 별칭으로 선언하면 메모리에 지정 바이트 만큼 공간을 확보한다.
	public static void main(String[] args) {
		// byte b = 126; // 자료형(Data Type)을 너무 적게 지정하였다.
						 // 자료형이란 그릇의 종류고 그릇은 변수명이다.
		int b = 126;
		System.out.println("b = " + b);
		b++; // 1증가
		System.out.println("b = " + b);
		//  = : 대입연산자
		// == : 상등(같다) 연산자
		b = b + 1; // b라는 그릇의 값에 1을 더해서 다시 b라는 그릇에 넣어라 ==> 1증가
		System.out.println("b = " + b);
		b--; // 1감소
		System.out.println("b = " + b);
		
		System.out.println("byte타입의 크기 : " + Byte.BYTES);
		System.out.print("byte타입의 저장 범위 : ");
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		
		System.out.println("int타입의 크기 : " + Integer.BYTES);
		System.out.print("int타입의 저장 범위 : ");
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
	}
}
