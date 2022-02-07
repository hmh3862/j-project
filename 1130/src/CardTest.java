import kr.green.vo.CardVO;

public class CardTest {
	public static void main(String[] args) {
		for(int i=0;i<52;i++) {
			CardVO vo = new CardVO(i);
			System.out.print(vo + " ");
			if((i+1)%13==0) System.out.println();
		}
	}
}
