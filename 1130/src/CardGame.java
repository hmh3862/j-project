import kr.green.vo.CardVO;
import kr.green.vo.DeckVO;

public class CardGame {
	public static void main(String[] args) {
		DeckVO deckVO = new DeckVO(2);
		
		for(int i=0;i<104;i++) {
			CardVO vo = deckVO.nextCard();
			System.out.print(vo + " ");
			if((i+1)%13==0) System.out.println();
		}
		System.out.println(deckVO.nextCard());
	}
}
