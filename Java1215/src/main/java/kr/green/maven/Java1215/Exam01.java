package kr.green.maven.Java1215;
/*
숫자 출력하기
20150111을 출력합니다. 4가지 기준만 만족하면 됩니다.

코드 내에 숫자가 없어야 합니다.
파일 이름이나 경로를 사용해서는 안됩니다.
시간, 날짜 함수를 사용해서는 안됩니다.
에러 번호 출력을 이용해서는 안됩니다.
 */
public class Exam01 {
	public static void main(String[] args) {
		// 아주 다양한 방법이 있다.
		// 방법 1
		for(char c : "LNOKNOOO".toCharArray()) {
			System.out.print((char)('~'^c));
		}
		System.out.println();
		// 방법 2
		String str = " ABCDE";
		System.out.print(str.indexOf("B"));
		System.out.print(str.indexOf(" "));
		System.out.print(str.indexOf("A"));
		System.out.print(str.indexOf("E"));
		System.out.print(str.indexOf(" "));
		System.out.print(str.indexOf("A"));
		System.out.print(str.indexOf("A"));
		System.out.print(str.indexOf("A"));
		System.out.println();
		
		//...... 연구해 보도록 ㅋㅋㅋㅋ
		
	}
}
