package kr.green.vo;

import lombok.EqualsAndHashCode;

// 1장의 카드를 저장할 클래스
@SuppressWarnings("unused")
@EqualsAndHashCode
public class CardVO {
	// 모든 멤버 변수에 대하여 getter&seter를 하나도 만들어 주지 않을 수도 있다.
	// 카드를 나타내는 번호
	private int number;
	// 모든 카드가 공유하므로 정적멤버로 선언
	private static String cardName[] = "◆♠♥♣".split("");
	private static String cardNumber[] = "01,02,03,04,05,06,07,08,09,10, J, Q, K".split(",");

	public CardVO(int number) {
		if(number<0) number = -number; // 음수면 양수로 만들어 준다.
		this.number = number%52; // 0~51사이의 숫자를 가지게 한다.
	}
	// 무늬만 얻기
	public String getKind() {
		return cardName[number/13];
	}
	// 숫자만 얻기
	public String getNum() {
		return cardNumber[number%13];
	}
	
	@Override
	public String toString() {
		return getKind()+getNum();
	}
}
