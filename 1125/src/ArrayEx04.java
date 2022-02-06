/*
 * 3행 3열의 배열을 만들고
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 로 초기화한 후에 90도 180도 270도 회전시켜 출력하시오
 */
public class ArrayEx04 {
	public static void main(String[] args) {
		int row = 3, col= 3;
		int ar[][] = new int[row][col]; // C/C++과 다르게 배열 선언시 변수를 사용가능 하다.
		
		// 초기화
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar[i].length; j++)
				ar[i][j] = i*row + j +1; 
		
		System.out.println("원본");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length; j++)
				System.out.printf("%3d", ar[i][j]);
			System.out.println();
		}
		System.out.println("90도 회전");
		/*
		 7 4 1    [2][0] [1][0] [0][0]
		 8 5 2	  [2][1] [1][1] [0][1]
		 9 6 3    [2][2] [1][2] [0][2]
		 같은 줄에서 변경되는 값은 j로 만들어 주고
		 행이 변하면서 변경되는값은 i로 만들어 준다.
		 */
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length; j++)
				System.out.printf("%3d", ar[row-j-1][i]);
			System.out.println();
		}
		System.out.println("180도 회전");
		/*
		 9 8 7    [2][2] [2][1] [2][0]
		 6 5 4	  [1][2] [1][1] [1][0]
		 3 2 1    [0][2] [0][1] [0][0]
		 같은 줄에서 변경되는 값은 j로 만들어 주고
		 행이 변하면서 변경되는값은 i로 만들어 준다.
		 */
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length; j++)
				System.out.printf("%3d", ar[row-i-1][row-j-1]);
			System.out.println();
		}
		System.out.println("270도 회전");
		/*
		 3 6 9    [0][2] [1][2] [2][2]
		 2 5 8	  [0][1] [1][1] [2][1]
		 1 4 7    [0][0] [1][0] [2][0]
		 같은 줄에서 변경되는 값은 j로 만들어 주고
		 행이 변하면서 변경되는값은 i로 만들어 준다.
		 */
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length; j++)
				System.out.printf("%3d", ar[j][row-i-1]);
			System.out.println();
		}
	}	
}
