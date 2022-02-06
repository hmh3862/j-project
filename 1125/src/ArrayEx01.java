import java.util.Arrays;

// 다차원 배열 
public class ArrayEx01 {
	public static void main(String[] args) {
		int ar1[][] = new int[4][3]; // 4행 3열 12개의 공간이 확보된다. [0][0] ~ [3][2]
		System.out.println("행의 수 : " + ar1.length);
		System.out.println("열의 수 : " + ar1[0].length); // 2차원 배열은 1차원 배열의 배열이다.
		
		for(int i=0;i<ar1.length;i++) {
			for(int j=0;j<ar1[i].length; j++) {
				System.out.printf("ar1[%d][%d]=%d ", i, j, ar1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(ar1));
		System.out.println();
		
		int ar2[][] = new int[3][]; // 열의 수를 생략하여 2차원 배열 선언
		for(int i=0;i<ar2.length;i++) {
			ar2[i] = new int[(i+1)*3]; // 행마다 다른 개수의 배열할당이 가능하다. --- 가변 배열이다.
		}
		ar2[0][0] = 11;
		ar2[1][2] = 22;
		System.out.println(Arrays.deepToString(ar2));
		
		for(int i=0;i<ar2.length;i++) {
			for(int j=0;j<ar2[i].length; j++) {
				System.out.printf("%3d ", ar2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int ar3[][] = {{1,2},{3,4,5},{6,7,8,9}}; // 초기화 값으로 배열 설정
		for(int i=0;i<ar3.length;i++) {
			for(int j=0;j<ar3[i].length; j++) {
				System.out.printf("%2d ", ar3[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
