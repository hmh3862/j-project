// 문제 : 배열을 달팽이로 채우기
/* 좌측 상단 시계 반대 방향
  1 16 15 14 13
  2 17 24 23 12
  3 18 25 22 11
  4 19 20 21 10
  5  6  7  8  9
 */
public class ArrayEx11 {
	public static void main(String[] args) {
		final int MAX = 5;
		int ar[][] = new int[MAX][MAX];
		// 채우기
		// 변수 선언
		int k = 0, count = MAX, sw=1, row=-1, col=0; // 증가, 개수, 반전, 행, 열
		while(true) {
			for(int i=0;i<count;i++) {
				row += sw;
				ar[row][col] = ++k;
			}
			count--; // 개수감소
			if(count==0) break; // 개수가 0이면 종료
			for(int i=0;i<count;i++) {
				col += sw;
				ar[row][col] = ++k;
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
