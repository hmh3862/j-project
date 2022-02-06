/*
반복문은 얼마든지 중첩이 가능하다.
 */
public class Ex07_for6 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) { // 5회
			for(int j=1;j<=5;j++) { // 5회
				System.out.print("바보 " +  j + " "); // 25회
			}
			System.out.println(); // 5회 : 줄바꿈
		}
		System.out.println();
		
		for(int i=0;i<5;i++) { // 5회
			for(int j=1;j<=5;j++) { // 5회
				System.out.printf("%3d", (i * 5 + j)); // 25회
			}
			System.out.println(); // 5회 : 줄바꿈
		}
	}
}
