import java.util.Scanner;

// 문제 : 배열을 달팽이로 채우기
/* 
좌측 상단 시계 반대 방향
   1  16  15  14  13
   2  17  24  23  12
   3  18  25  22  11
   4  19  20  21  10
   5   6   7   8   9
 */
public class ArrayEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행열의 크기입력 ");
		int value = sc.nextInt();

		int[][] ar = new int[value][value];
		int row = -1, col = 0; // 행, 열
		int number = 0; // 채워질 숫자
		int direction=1;//방향

		int temp = value; // 개수
		while (temp > 0) { // 개수가 0이면 종료
			for (int i = 0; i < 2 * temp - 1; i++) {
				if (i < temp)
					row += direction;
				else
					col += direction;
				ar[row][col] = ++number;
			}
			temp--;// 개수 감소
			direction *= -1; // 반전
		}
		System.out.println("좌측 상단 시계 반대 방향");
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++)
				System.out.format("%4d", ar[i][j]);
			System.out.println();
		}
		sc.close();
	}
}// end class
