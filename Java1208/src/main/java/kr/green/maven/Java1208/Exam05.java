package kr.green.maven.Java1208;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
문제 5] Every Other Digit
모든 짝수번째 숫자를 * 로 치환하시오.(홀수번째 숫자,또는 짝수번째 문자를 치환하면 안됩니다.) 
로직을 이용하면 쉬운데 정규식으로는 어려울거 같아요.

Example: a1b2cde3~g45hi6 → a*b*cde*~g4*hi6
*/
public class Exam05 {
	public static void main(String[] args) {
		System.out.println(everyOtherDigit("a1b2cde3~g45hi6"));
	}
	@Test
	public void test() {
		assertEquals(everyOtherDigit("a1b2cde3~g45hi6"), "a*b*cde*~g4*hi6");
	}
	public static String everyOtherDigit(String str) {
		String result = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i); // i번째 1글자 가져오기
			// 첨자가 0부터 시작되니까 짝수번째는 첨자가 홀수일때 이다.
			// 짝수번째 문자가 숫자라면 
			if(i%2!=0 && ch>='0' && ch<='9') { 
				result += "*";
			}else {
				result += ch;
			}
		}
		return result;
	}

}
