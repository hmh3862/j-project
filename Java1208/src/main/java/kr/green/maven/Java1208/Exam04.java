package kr.green.maven.Java1208;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/*
문제 4] Jolly Jumpers
n개의 정수(n>0)로 이루어진 수열에 대해 서로 인접해 있는 두 수의 차가 1에서 n-1까지의 값을 
모두 가지면 그 수열을 유쾌한 점퍼(jolly jumper)라고 부른다. 

예를 들어 다음과 같은 수열에서
1 4 2 3
앞 뒤에 있는 숫자 차의 절대 값이 각각 3,2,1이므로 이 수열은 유쾌한 점퍼가 된다. 
어떤 수열이 유쾌한 점퍼인지 판단할 수 있는 프로그램을 작성하라.

Input
각 줄 맨 앞에는 3000 이하의 정수가 있으며 그 뒤에는 수열을 나타내는 n개의 정수가 입력된다. 
맨 앞 숫자가 0이면 출력하고 종료한다.

output
입력된 각 줄에 대해 "Jolly" 또는 "Not Jolly"를 한 줄씩 출력한다

Sample Input
4 1 4 2 3
5 1 4 2 -1 6

※ 주의: 각 줄의 맨 앞의 숫자는 수열의 갯수이다. 
첫번째 입력인 4 1 4 2 3 의 맨 앞의 4는 뒤에 4개의 숫자가 온다는 것을 의미함
Sample Output
Jolly
Not jolly
*/
public class Exam04 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getSub(4, new int[] {1,4,2,3})));
		System.out.println(isJollyJumper(4, new int[] {1,4,2,3}) ? "Jolly" : "Not Jolly");
		System.out.println(isJollyJumper(5, new int[] {1, 4, 2, -1, 6}) ? "Jolly" : "Not Jolly");
	}
	@Test
	public void test() {
		assertEquals(isJollyJumper(4, new int[] {1,4,2,3}) ? "Jolly" : "Not Jolly", "Jolly");
		assertEquals(isJollyJumper(5, new int[] {1, 4, 2, -1, 6}) ? "Jolly" : "Not Jolly", "Not Jolly");
	}
	// jolly jumper인지 확인하는 메서드
	public static boolean isJollyJumper(int len, int[] ar) {
		boolean jollyJumper = true;
		int ar2[] = getSub(len, ar);
		for(int i=0;i<ar2.length;i++) {
			if(ar2[i]!=i+1) { // 배열의 값이 차례대로 1,2,3,4,5.... 이어야 한다. 아니면 jolly Jumper가 아니다.
				jollyJumper = false;
				break;
			}
		}
		return jollyJumper;
	}
	// 배열을 받아 두수 사이의 차를 오름차순 정렬하여 배열로 리턴하는 메서드
	public static int[] getSub(int len, int[] ar) {
		int[] result = new int[len-1];
		for(int i=0;i<len-1;i++) {
			result[i] = Math.abs(ar[i+1] - ar[i]); // Math.abs(값) : 절대값 구하는 함수
		}
		Arrays.sort(result);
		return result;
	}
}
