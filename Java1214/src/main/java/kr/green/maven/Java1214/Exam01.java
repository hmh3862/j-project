package kr.green.maven.Java1214;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

/*
문제 1] 뒤쪽 0의 갯수 구하기
N!의 정의는 다음과 같습니다.

N! = 1 * 2 * 3 * 4 ... N
이때 N!를 정수로 변환 해 뒤에서 부터 연속되는 0의 갯수를 구하세요.

예) f(12) -> 2 # 12!은 479001600 f(25) -> 6 # 25!은 15511210043330985984000000
*/
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(fac(12));
		System.out.println(fac(25));
		System.out.println();
		System.out.println(fac(12L));
		System.out.println(fac(25L));
		System.out.println();
		System.out.println(factorial(12));
		System.out.println(factorial(25));
		System.out.println();
		System.out.println(zeroCount(factorial(12)+""));
		System.out.println(zeroCount(factorial(25)+""));
	}
	public static int fac(int n) {
		return n==1 ? 1 : n*fac(n-1);
	}
	public static long fac(long n) {
		return n==1 ? 1 : n*fac(n-1);
	}
	@Test
	public void test() {
		assertEquals(zeroCount(factorial(12)+""), 2);
		assertEquals(zeroCount(factorial(25)+""), 6);
	}
	// 뒤의 0의 개수를 센다.
	public static int zeroCount(String t) {
		int count = 0;
		for(int i = t.length()-1;i>0;i--) {
			if(t.charAt(i)!='0') break;
			count++;
		}
		return count;
	}
	// 팩토리알 값을 구한다. : 함정이 있군요!!! int, long의 범위를 벗어나네요.......
	public static BigDecimal factorial(int n) {
		BigDecimal result = new BigDecimal(1);
		BigDecimal bn = new BigDecimal(n);
		while(bn.compareTo(new BigDecimal(1))>0) { // 앞의 수가 클때까지
			result = result.multiply(bn); // 곱하기
			bn = bn.subtract(new BigDecimal(1)); // 빼기
		}
		return result;
	}
}
