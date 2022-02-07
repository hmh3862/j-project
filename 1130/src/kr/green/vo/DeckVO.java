package kr.green.vo;

import java.util.Random;

// 카드 N묶음을 저장하는 클래스
@SuppressWarnings("unused")
public class DeckVO {
	private CardVO[] cards;
	private int index = 0; // 현재 카드의 위치
	
	public DeckVO() { // 숫자를 넘겨주지 않으면 1묶음으로
		// cards = new CardVO[52];
		this(1);
	}

	public DeckVO(int count) { // 숫자를 넘겨주면 넘겨진 숫자의 묶음으로 배열 생성
		cards = new CardVO[52*count];
		shuffle();
	}
	
	// 카드를 섞어주는 메서드
	private void shuffle() {
		Random rnd = new Random();
		int temp;
		for(int i=0;i<cards.length;i++) {
			do {
				temp = rnd.nextInt(cards.length);
			}while(cards[temp]!=null);
			cards[temp] = new CardVO(i%52);
		}
	}
	
	public CardVO nextCard() {
		if(index<cards.length) {
			return cards[index++];
		}else {
			System.out.println("카드없다.");
			return null;
		}
	}
	
}
