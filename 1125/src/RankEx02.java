import java.util.Arrays;
import java.util.Random;

// 석차를 구해보자
public class RankEx02 {
	public static void main(String[] args) {
		int score[] = new int[10];
		int rank[] = new int[10];
		
		Random rnd = new Random();
		for(int i=0;i<score.length;i++) {
			score[i] = rnd.nextInt(11); // 0~100사이의 난수로 초기화
			rank[i] = 1; // 누구나 처음은 1등이다.
		}
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(rank));
		System.out.println();
		
		// Selection Sort 알고리즘을 이용하여 구해보자 : n(n-1)/2 회의 반복횟수를 가진다. 10개의 경우 45회 
		
		for(int i=0;i<score.length-1;i++) {
			for(int j=i+1;j<score.length;j++) {
				/*
				// 이렇게 하면 동률 처리가 되지 않는다.
				if(score[i]<score[j])
					rank[i]++;
				else
					rank[j]++;
				*/
				// 이렇게 하면 동률 처리가 된다.
				if(score[i]<score[j])
					rank[i]++;
				else if(score[i]>score[j])
					rank[j]++;
			}
		}
		for(int i=0;i<score.length;i++) {
			System.out.printf("%3d : %2d\n", score[i], rank[i]);
		}
	}
}
