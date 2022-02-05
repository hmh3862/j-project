import java.util.Random;

// 난수 : 사용자도 예측할 수 없는 수
// 자바에서는 난수를 만들기 위해 2가지 방법을 제공합니다.
// Math.random() 과 java.util.Random클래스
public class Ex03_RandNumber2 {
	public static void main(String[] args) {
		Random random = new Random(); 
		for(int i=0;i<6;i++) { // 6번 반복
			// System.out.println(random.nextDouble()); // 0 ~ 1사이의 난수를 발생한다.
			// System.out.println(random.nextInt()); // 정수의 난수를 발생한다.
			// System.out.println(random.nextInt(100)); // 0 ~ 99사이의 난수를 발생한다.
			// System.out.println(random.nextInt(100)+1); // 1 ~ 100사이의 난수를 발생한다.

			// 원하는 범위의 정수 난수 구하기
			// random.nextInt(최대-최소+1) + 최소값
			System.out.println(random.nextInt(45-1+1) +1); // 1 ~ 45사이의 난수를 발생한다.
		}
	}
}
