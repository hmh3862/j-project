// 난수 : 사용자도 예측할 수 없는 수
// 자바에서는 난수를 만들기 위해 2가지 방법을 제공합니다.
// Math.random() 과 java.util.Random클래스
public class Ex02_RandNumber1 {
	public static void main(String[] args) {
		for(int i=0;i<6;i++) { // 6번 반복
			// System.out.println(Math.random()); // 0 ~ 1사이의 난수를 발생한다.
			// System.out.println((int)(Math.random()*100)); // 0 ~ 99사이의 난수를 발생한다.
			// System.out.println((int)(Math.random()*50)+51); // 51 ~ 100사이의 난수를 발생한다.
			// 원하는 범위의 정수 난수 구하기
			// (int)(Math.random() * (최대-최소+1)) + 최소값
			System.out.println((int)(Math.random()*(45-1+1))+1); // 1 ~ 45사이의 난수를 발생한다.
		}
	}
}
