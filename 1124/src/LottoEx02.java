import java.util.Random;
import java.util.Scanner;

public class LottoEx02 {
	public static void main(String[] args) {
		int lotto[] = new int[45];
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("몇게임?");
		int game = sc.nextInt();
		int temp;
		while(game>0) {

			for(int i=0;i<lotto.length;i++) lotto[i] = 0; // 배열을 모두 0으로 초기화
			
			for(int i=0;i<6;i++) { // 6개
				do {
					temp = rnd.nextInt(lotto.length); // 0~44사이의난수 발생
				}while(lotto[temp]!=0); // 난수 발생위치 값이  0이면 탈출
				lotto[temp] = 1; // 0인 위치에 0이외의 값을 넣는다.
			}
			// 위 for문이 끝나면 6군데만 1이 들어가 있다.
			
			// 출력 : 1이 저장된 위치를 찍는다. 그래서 정렬하지 않아도 정렬된 숫자가 찍힌다.
			for(int i=0;i<lotto.length;i++) {
				if(lotto[i]!=0) System.out.printf("%4d", i+1);
			}
			System.out.println();
			game--; // 게임수 감소
		}
		sc.close();
	}
}
