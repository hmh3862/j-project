package kr.green.maven.Java1206;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
문제 1] n의 배수 판정법
어떤 수 x와 n이 주어졌을때 조건에 따라 x가 n의 배수인지 판별하는 
코드를 작성하라.
x는 0 이상의 정수이며 조건에 맞지 않는 입력은 주어지지 않는다.
여기서 하나의 함수인지 여러 함수인지는 본인이 선택하면 된다.
단 절대 산술연산자 중 %와 /는 코드에 없도록 한다.
그리고 divmod() 함수를 쓰는것도 금지한다
코드는 창의적으로 하는 것을 목적으로 한다. 
속도는 크게 중점을 두지 않는다.
n의 종류는 2,3,5,7,11,13이다.
원하는 n만 선택해서 풀 수도 있다.

입력
입력으로 주어질 자연수의 종류를 입력받고 차례로 그 수만큼 정수를 
입력받는다.
6
432 2
4 3
635 5
421 7
122 11
143 13

출력
1
0
1
0
0
1
문제 2] 대각선 길이 구하기
직각삼각형의 밑변이 x, 높이가 y일 때 남은 변(대각선)의 길이를 구하는 함수를 만들어주세요.
ps. 요즘 대각선계산기 어플이 인기가 있는 걸 보고 한번 직접 만들어보는것도 좋다고 생각해서 문제를 만들어 올립니다.

문제 3] 정수와 소수 구별하기
프로그래머 X는 코딩을 하다가 문득, 수학 시간에 배운 정수와 소수를 구별하는 방법을 떠올렸다. 
정수와 소수의 차이는 분수로 표현이 되느냐, 되지 않느냐에 따라 차이가 나기도 하며, 
또한 파이 등 특정한 값을 나타내는 것에 의하여 소수인지 정수인지 판별이 나게 된다.
프로그래머 X는 입력값을 숫자를 입력하거나 문자를 입력하려고 하는데,
만약 숫자를 입력하였으면 그것이 정수인지, 소수인지 구별하는 프로그램을 짜보도록 하고,
만약 문자를 입력하였으면 숫자가 아니므로 math error를 표시하게 하라.
*/
public class Exam {
	@Test // 테스트에 사용되는 메서드이다. 반드시 public void이어야 한다.
	public void test1() {
		Exam exam = new Exam();
		assertEquals(exam.ex01(432,2), 1); // 메서드의 호출값이 일치하는지 테스트 한다.
		assertEquals(exam.ex01(4,3), 0);
		assertEquals(exam.ex01(635,5), 1);
		assertEquals(exam.ex01(421,7), 0);
		assertEquals(exam.ex01(122,11), 0);
		assertEquals(exam.ex01(143,13), 1);
	}
	@Test
	public void test2() {
		// assertEquals (더블 예상, 더블 실제, 더블 엡실론)
		// 델타-두 숫자가 여전히 동일한 것으로 간주되는 예상과 실제 사이의 최대 델타. 아주 작은 숫자를 사용합니다
		assertEquals(Exam.ex02(3, 4), 5.0, 1e-15); // Double의 연산은 불확실하다.
	}
	
	@Test
	public void test3() {
		assertTrue(Exam.ex03(3.0));
		assertFalse(Exam.ex03(3.1));
	}
	public int ex01(int x, int n) {
		int result = 0;
		while(x>0) {
			x -= n; // 계속 빼주어 0이되면 배수이다.
		}
		if(x==0) result = 1; // 0이면 배수라고 1 아니면 0을 저장 : java라면 true/false가 맡다.
		return result; // 린턴
	}
	public static double ex02(int x, int y) {
		return Math.sqrt(x*x + y*y);
	}
	public static boolean ex03(double n) {
		return n == (int)n;
	}
}
