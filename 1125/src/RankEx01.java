import java.util.Arrays;
import java.util.Random;

// 석차를 구해보자
public class RankEx01 {
	public static void main(String[] args) {
		int score[] = new int[10];
		int rank[] = new int[10];
		
		Random rnd = new Random();
		for(int i=0;i<score.length;i++) {
			score[i] = rnd.nextInt(101); // 0~100사이의 난수로 초기화
			rank[i] = 1; // 누구나 처음은 1등이다.
		}
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(rank));
		System.out.println();
		
		// 멍청한 방법 : n명일 경우 n*n번 비교를 한다.
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score.length;j++) {
				if(score[i]<score[j]) rank[i]++;
			}
		}
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(rank));
	}
}
