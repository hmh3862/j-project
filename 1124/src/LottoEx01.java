import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoEx01 {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("몇게임?");
		int game = sc.nextInt();
			while(game>0) {
			// 중복이 없는 1 ~ 45까지의 숫자 6개 만들기
			for(int i=0;i<lotto.length;i++) { // 6개
				lotto[i] = rnd.nextInt(45)+1; // 1~45사이의 난수를 발생해 배열에 넣는다.
				// 이전에 발생한 난수와 비교하기위해 이전까지 반복
				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) { // 같은 번호가 이미있다면
						i--; // 현재위치를 1 감소시켜 다음 난수를 현재 위치에 생기도록 한다. 
						break;
					}
				}
			}
			Arrays.sort(lotto); // 오름차순 정렬
			System.out.println(Arrays.toString(lotto)); // 출력
			game--; // 게임수 감소
		}
		sc.close();
	}
}
