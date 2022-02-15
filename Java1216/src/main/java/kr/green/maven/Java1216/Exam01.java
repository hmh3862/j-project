package kr.green.maven.Java1216;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
CamelCase를 Pothole_case 로 바꾸기!
파이썬과 같은 몇몇 프로그래밍 언어는 Pothole_case 를 더 선호하는 언어라고 합니다.
Example:
codingDojang --> coding_dojang
numGoat30 --> num_goat_3_0
위 보기와 같이 CameleCase를 Pothole_case 로 바꾸는 함수를 만들어요!
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(camelCase2PotholeCase("codingDojang"));
		System.out.println(camelCase2PotholeCase("numGoat30"));
	}
	@Test
	public void test() {
		assertEquals(camelCase2PotholeCase("codingDojang"), "coding_dojang");
		assertEquals(camelCase2PotholeCase("numGoat30"), "num_goat_3_0");
	}
	// 문자를 판단하다가 숫자나 대문자가 나오면 _을 삽입하고 
	// 대문자는 소문자로 바꿔서 더해준다.
	public static String camelCase2PotholeCase(String camel) {
		String pothole = "";
		for(char c : camel.toCharArray()) {
			if(c>='A'&& c<='Z') {
				pothole += "_" + (char)(c+32);
			}else if(c>='0'&& c<='9'){
				pothole += "_" + c;
			}else {
				pothole += c;
			}
		}
		return pothole;
	}
}
