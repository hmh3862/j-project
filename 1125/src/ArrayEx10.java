// 문제 : 배열을 달팽이로 채우기
/*
 25 24 23 22 21
 10  9  8  7 20
 11  2  1  6 19
 12  3  4  5 18
 13 14 15 16 17
 */
public class ArrayEx10 {
	public static void main(String[] args) {
		final int MAX = 5;
		int ar[][] = new int[MAX][MAX];
		// 채우기
		// 변수 선언
		int k = MAX*MAX, count = MAX, sw=1, row=0, col=-1; // 증가, 개수, 반전, 행, 열
		while(true) {
			for(int i=0;i<count;i++) {
				col += sw;
				ar[row][col] = k--;
			}
			count--; // 개수감소
			if(count==0) break; // 개수가 0이면 종료
			for(int i=0;i<count;i++) {
				row += sw;
				ar[row][col] = k--;
			}
			// 반전
			sw *= -1;
		}
		
		// 출력
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length; j++) {
				if(ar[i][j] != 0)
					System.out.printf("%3d", ar[i][j]);
				else
					System.out.print("   ");
			}
			System.out.println();
		}// end for
	}// end main
}// end class
