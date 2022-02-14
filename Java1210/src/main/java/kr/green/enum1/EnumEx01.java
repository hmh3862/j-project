package kr.green.enum1;
/*
열거형(enum)
1. 클래스처럼 보이게 하는 상수
2. 서로 관련있는 상수들끼리 모아 상수들을 대표할 수 있는 이름으로 타입을 정의하는 것
3. Enum 클래스 형을 기반으로 한 클래스형 선언 
 */
// 클래스 밖에, 클래스 안에, 별도의 파일로 작성이 가능하다. 컴파일 되어 class파일이 생성된다.
enum DevType {
	MOBILE, WEB, SERVER
}

public class EnumEx01 {
	// 예전에는 이렇게 상수로 사용했었다.
	static final int CLOVER = 0;
	static final int HEART = 1;
	static final int DIAMOND = 2;
	static final int SPADE = 3;
	
	enum Card { CLOVER, HEART, DIAMOND, SPADE } // 상수들만으로 구성되있는 특별한 클래스. 새로운 타입이 정의 된다.
	
	public static void main(String[] args) {
		int card = CLOVER; // 상수 대입
		System.out.println("card : " + card); // 값이 출력
		card = 5; // 이외의 값도 저장 가능
		System.out.println("card : " + card);

		Card card2 = Card.CLOVER; // 열거형 대입. 타입을 열거형 이름으로 선언
		System.out.println("card2 : " + card2);
		// card2 = 5; // 에러!!! 열거형 외에는 저장되지 않는다. 타입에 더욱 안전성이 있다.
		
		// 내부 적으로 메서드를 자동으로 가지고 있다. values() : 원소를 배열에 담아 리턴해 준다. 
		for(Card c : Card.values()) {
			System.out.println(c + " : " + c.ordinal()); // ordinal() : 열거된 순서를 정수 값으로 알려준다.
		}
		System.out.println();
		
		for(DevType t : DevType.values()) {
			System.out.println(t + " : " + t.ordinal());
		}
		System.out.println();
		
		System.out.println(DevType.valueOf("WEB"));
	}
}
