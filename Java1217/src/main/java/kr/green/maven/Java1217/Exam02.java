package kr.green.maven.Java1217;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
Happy Number
양의 정수 S0 의 각 아라비아 숫자들의 제곱의 합으로 양의 정수 S1을 만든다고 하자.
동일한 방법이라면, S1으로 S2를 만들 수 있고, 이 후로도 계속 만들 수 있다.
만약 어떤 i(i ≥ 1)에 대해서 Si = 1이라면, 최초의 S0를 Happy Number라고 부른다.
Happy Number가 아닌 수를 Unhappy Number라고 부른다.

예를 들어, 7에서 시작하게 되면 다음과 같은 일련의 순서를 가지게 되며
7, 49(=7^2), 97(=4^2+9^2), 130(=9^2+7^2), 10(=1^2+3^2), 1(=1^2),

따라서 7은 즐거운 수이다.

그리고 4는
4, 16(4^2), 37(1^2+6^2), 58(3^2+7^2), 89(5^2+8^2), 145(8^2+9^2),
42(1^2+4^2+5^2), 20(4^2+2^2), 4(2^2)의 순서로 반복되므로 Unhappy Number이다.

== 입력 ==
첫 라인은 인풋 케이스의 수 n이 주어지며 이후 n라인의 케이스가 주어진다.
각 테스트 케이스는 한 개의 양의 정수 N으로 구성되며 N은 10^9 보다 작다.
== 출력 ==
출력은 주어진 수 N이 Happy Number인지 Unhappy Number인지 여부에 따라 다음과 같이 출력한다.
N이 Happy Number라면 “Case #p: N is a Happy number.”
N이 Unhappy Number라면 “Case #p: N is an Unhappy number.”
p는 1부터 시작하는 케이스의 번호이며 각각의 케이스는 한 줄에 결과를 표시한다.

== 샘플 인풋 ==
3
7
4
13

== 샘플 출력 ==
Case #1: 7 is a Happy number.
Case #2: 4 is an Unhappy number.
Case #3: 13 is a Happy number.
*/
public class Exam02 {
	public static void main(String[] args) {
		System.out.println("7 is a " + (isHappyNumber(7) ? "Happy":"Unhappy") + " number.");
		System.out.println("4 is a " + (isHappyNumber(4) ? "Happy":"Unhappy") + " number.");
		//System.out.println("13 is a " + (isHappyNumber(13) ? "Happy":"Unhappy") + " number.");
	}
	@Test
	public void test() {
		assertTrue(isHappyNumber(7));
		assertFalse(isHappyNumber(4));
		assertTrue(isHappyNumber(13));
	}
	public static boolean isHappyNumber(int n) {
		int t = n; // 피신
		do{
			int tt = t; // 피신
			t = 0; // 제곱의 합
			while(tt>0) {
				t += (tt%10)*(tt%10); // 맨뒷자리 수의 제곱을 누적
				tt/=10; // 뒤의 1자리 버리기
			}
			// System.out.println(t); 
		}while(t!=1 && t!=n); // 1이되거나 또는 원래의 수가 될때까지 반복
		return t!=n; // 원수와 같다면 무한 반복.... Happy Number가 아니다.
	}
}
