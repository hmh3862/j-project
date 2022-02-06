// 문제 : 5행 5열짜리 정수 배열을 만들어 아래처럼 채우고 출력하시오
/*
 *     0   1   2   3   4
   0   1   3   6  10  15
   1   2   5   9  14  19
   2   4   8  13  18  22
   3   7  12  17  21  24
   4  11  16  20  23  25
 */
public class ArrayEx08 {
	public static void main(String[] args) {
		final int MAX = 5;
		int ar[][] = new int[MAX][MAX];
		// 채우기
		int k = 0; // 증가 변수
		// 상단 역삼각형모양만 채워보자
		/*
		 * [0][0]
		 * [1][0] [0][1]
		 * [2][0] [1][1] [0][2] 
		 * [3][0] [2][1] [1][2] [0][3] 
		 * [4][0] [3][1] [2][2] [1][3] [0][4] 
		 * [4][1] [3][2] [2][3] [1][4]
		 * [4][2] [3][3] [2][4]
		 * [4][3] [3][4]
		 * [4][4]
		 */
		for(int i=0;i<MAX*2-1;i++) { //  n개일 경우 n번과 n-1번 돌아야 한다.  그래서 MAX*2-1
			if(i<MAX) {
				for(int j=0;j<=i; j++) {
					System.out.printf("[%d][%d] ", i-j, j);
					ar[i-j][j] = ++k;
				}
				System.out.println();
			}else {
				for(int j=i-MAX+1;j<MAX; j++) {
					System.out.printf("[%d][%d] ", i-j, j);
					ar[i-j][j] = ++k;
				}
				System.out.println();
			}
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
