/*
반복문은 얼마든지 중첩이 가능하다.
 */
public class Ex08_for7 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) { // 9회
			System.out.printf("%5d단\n", i);
			for(int j=1;j<=9;j++) { // 9회
				System.out.printf("%2d * %1d = %2d\n", i, j, i*j); // 81회
			}
			System.out.println("\n"); // 9회 : 줄바꿈
		}
		
		// 구구단을 가로로 출력이 가능할까?
		for(int i=1;i<=9;i++) { // 9회
			for(int j=1;j<=9;j++) { // 9회
				System.out.printf("%2d*%1d=%2d", j, i, i*j); // 81회
			}
			System.out.println(); // 9회 : 줄바꿈
		}
	}
}
