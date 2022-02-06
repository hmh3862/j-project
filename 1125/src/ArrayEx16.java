import java.util.Random;

/*
 * 1반의 성적 처리를 2차원 배열로 해보자
 * 6행 7열의 배열을 만들자
 * 1. 5행 5열에 난수로 성적을 넣고
 * 2. 6행에는 과목 합계를 6열에는 합계를 7열에는 석차를 넣고
 * 3. 출력할때는 6행에 과목 평균을 찍자.
 * 4. 6열과 7열 사이에 학생의 평균을 찍어보자
 * 
 */
public class ArrayEx16 {
	public static void main(String[] args) {
		int row=6, col=7; // row : 학생수 +1, col : 과목수 + 2
		int ar[][] = new int[row][col];
		Random rnd = new Random();
		
		// 5행 5열에 난수로 성적을 넣고
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-2;j++) {
				ar[i][j] = rnd.nextInt(101);
			}
			ar[i][col-1] = 1; // 석차는 누구나 1등이다.
		}
		//------------------------------------------------------
		print(row, col, ar);
		// 가로합과 세로합을 구해보자
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-2;j++) {
				ar[i][col-2] += ar[i][j]; // 가로합
				ar[row-1][j] += ar[i][j]; // 세로합
			}
		}
		print(row, col, ar);
		//------------------------------------------------------
		// 석차를 구해보자
		for(int i=0;i<row-2;i++) {
			for(int j=i+1;j<row-1;j++) {
				if(ar[i][col-2] < ar[j][col-2]) {
					ar[i][col-1]++;
				}else if(ar[i][col-2] > ar[j][col-2]) {
					ar[j][col-1]++;
				}
			}
		}
		print(row, col, ar);
		//------------------------------------------------------
		
	}// end main

	private static void print(int row, int col, int[][] ar) {
		// 출력해보자
		// 과목출력
		for(String t : "국어 영어 수학 전산 미술 합계 평균 석차".split(" ")) {
			System.out.printf("%4s", t);
		}
		System.out.println();
		// 성적 출력
		for(int i=0;i<row-1;i++) { // 마지막 줄에는 과목 평균을 출력하기위해 제외 : row-1
			for(int j=0;j<col;j++) {
				System.out.printf("%6d", ar[i][j]);
				if(j==col-2) { // 합계를 찍었다면 옆에 평균을 출력해보자
					System.out.printf("%6.2f", (double)ar[i][j]/(col-2));
				}
			}// end for
			System.out.println();
		}// end for
		// 과목 평균을 출력해보자!!!
		for(int i=0;i<col-2;i++) {
			System.out.printf("%6.2f", (double)ar[row-1][i]/(row-1));
		}
		System.out.println("\n");
	}
}// end class
