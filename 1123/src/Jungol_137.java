import java.util.Scanner;

/*
 * 1 2 3 4
 * 2 4 6 8
 * 3 6 9 12
 */
public class Jungol_137 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("행과 열을 입력하시오");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++) { //행수
			for(int j=1;j<=col;j++) { // 1줄당 개수
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		sc.close();
	}
}
