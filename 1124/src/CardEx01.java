import java.util.Random;

/*
 * 52장의 카드를 섞어보자!!!!
 */
public class CardEx01 {
	public static void main(String[] args) {
		int card[] = new int [52]; // 52장의 카드
		Random rnd = new Random();
		int temp;
		for(int i=0;i<card.length;i++) { // 카드 1묶음
			do {
				temp = rnd.nextInt(card.length);
			}while(card[temp]!=0); // 0이 입력된 위치를 찾는다.
			card[temp] = i; // 숫자를 부여한다.
		}
		// 출력 : 0 ~ 51까지의 숫자를 무작위로 섞었다!!!!!
		// 출력할때 그림으로 바꿔서 출력하면 된다.
		for(int i=0;i<card.length;i++) { 
			System.out.printf("%3d", card[i]);
			if((i+1)%13==0) System.out.println(); // 13장마다 줄바꿈
		}
		System.out.println();
		
		// 숫자 0~51을 카드모양으로 바꿔서 출력해보자!!!
		String cardName[] = "◆♠♥♣".split("");
		String cardNumber[] = "01,02,03,04,05,06,07,08,09,10, J, Q, K".split(",");
		for(int i=0;i<card.length;i++) { 
			System.out.printf("%1s%2s", cardName[i/13],cardNumber[i%13]);
			if((i+1)%13==0) System.out.println(); // 13장마다 줄바꿈
		}
		System.out.println();
		
		// 섞인 카드를 출력해보자!!!
		for(int i=0;i<card.length;i++) { 
			System.out.printf("%1s%2s", cardName[card[i]/13],cardNumber[card[i]%13]);
			if((i+1)%13==0) System.out.println(); // 13장마다 줄바꿈
		}
		System.out.println();
	}
}
