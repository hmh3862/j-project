import java.util.Scanner;

// 문제 : 배열을 달팽이로 채우기
/* 
좌측 상단 시계 방향
   1   2   3   4   5
  16  17  18  19   6
  15  24  25  20   7
  14  23  22  21   8
  13  12  11  10   9
 */
public class ArrayEx14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행열의 크기입력 ");
		int value = sc.nextInt();

		int[][] ar = new int[value][value];
		int row = 0, col = -1; // 행, 열
		int number = 0; // 채워질 숫자
		int direction=1;//방향

		int temp = value; // 개수
		while (temp > 0) { // 개수가 0이면 종료
			for (int i = 0; i < 2 * temp - 1; i++) {
				if (i < temp)
					col += direction;
				else
					row += direction;
				ar[row][col] = ++number;
			}
			temp--;// 개수 감소
			direction *= -1; // 반전
		}
		System.out.println("좌측 상단 시계 방향");
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++)
				System.out.format("%4d", ar[i][j]);
			System.out.println();
		}
		sc.close();
	}
}// end class
