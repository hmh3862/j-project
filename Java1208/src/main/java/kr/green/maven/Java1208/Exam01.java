package kr.green.maven.Java1208;

import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;
import org.junit.Test;
/*
문제 1] 다음 입사문제 중에서
1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오.
(단 점들의 배열은 모두 정렬되어있다고 가정한다.)
예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
*/
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ex01(new int[] {1, 3, 4, 8, 13, 17, 20})));
	}
	@Test
	public void test() {
		assertArrayEquals(ex01(new int[] {1, 3, 4, 8, 13, 17, 20}), new int[] {3,4});
	}
	
	public static int[] ex01(int[] ar) {
		int[] result = {ar[0], ar[1]}; // 넘어온 배열의 첫번째값과 두번째 값을 결과값으로 초기화 
		int min = ar[1] - ar[0]; // 첫번째값과 두번째 값의 차를 최소값으로 저장
		for(int i=2;i<ar.length;i++) { // 다음부터 끝까지 반복
			if(min>ar[i]-ar[i-1]) { // 두개의 차가 더 적다면
				min = ar[i]-ar[i-1]; // 적은값을 최소값으로
				result[0] = ar[i-1]; // 두개를 결과 값으로
				result[1] = ar[i];
			}
		}
		return result;
	}
}
