// 문제 : 배열을 모래시계처럼 채워 출력하시오
/*
  1  2  3  4  5  6  7
     8  9 10 11 12   
       13 14 15      
          16         
       17 18 19      
    20 21 22 23 24   
 25 26 27 28 29 30 31
 
  숙제
  1                25
  2  8          20 26
  3  9 13    17 21 27
  4 10 14 16 18 22 28
  5 11 15    19 23 29
  6 12          24 30
  7                31
*/
public class ArrayEx06 {
	public static void main(String[] args) {
		final int MAX = 7;
		int ar[][] = new int[MAX][MAX];
		// 채우기
		int k = 0; // 증가 변수
		// 상단 역삼각형모양만 채워보자
		/*
		 * [0][0] [0][1] [0][2] [0][3] [0][4] [0][5] [0][6]
		 *        [1][1] [1][2] [1][3] [1][4] [1][5]
		 *               [2][2] [2][3] [2][4] 
		 *                      [3][3] 
		 *               [4][2] [4][3] [4][4] 
		 *        [5][1] [5][2] [5][3] [5][4] [5][5]
		 * [6][0] [6][1] [6][2] [6][3] [6][4] [6][5] [6][6]
		 */
		for(int i=0;i<MAX;i++) {
			if(i<=MAX/2) {
				for(int j=i;j<MAX-i; j++) {
					ar[i][j] = ++k;
				}
			}else {
				for(int j=MAX-i-1;j<=i; j++) {
					ar[i][j] = ++k;
				}
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
