package kr.green.maven.Java1214;

import java.util.HashMap;
import java.util.Map;

/*
문제 2] 모스부호 해독
문자열 형식으로 입력 받은 모스코드(dot: . dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성하시오.
글자와 글자 사이는 공백 하나, 단어와 단어 사이는 공백 두개로 구분한다.
예를 들어 다음 모스부호는 "he sleeps early"로 해석해야 한다.
.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--

모스부호 규칙 표
문자	부호	문자	부호
A		.-		N		-.
B		-...	O		---
C		-.-.	P		.--.
D		-..		Q		--.-
E		.		R		.-.
F		..-.	S		...
G		--.		T		-
H		....	U		..-
I		..		V		...-
J		.---	W		.--
K		-.-		X		-..-
L		.-..	Y		-.--
M		--		Z		--..
 */
public class Exam02 {
	private static Map<String, String> map = new HashMap<String, String>();
	
	{ // 인스턴스 초기화 블록 : 인스턴스변수의 초기화 담당. 잘사용하지 않는다.
	  //                        생성자에서 초기화가 가능하기 때문이다.	
		
	}
	
	static { // 정적변수 초기화 블록 : 정적 변수의 초기화가 복잡할 경우에 사용한다.
		map.put(".-", "a");			map.put("-...", "b");
		map.put("-.-.", "c");		map.put("-..", "d");
		map.put(".", "e");			map.put("..-.", "f");
		map.put("--.", "g");		map.put("....", "h");
		map.put("..", "i");			map.put(".---", "j");
		map.put("-.-", "k");		map.put(".-..", "l");
		map.put("--", "m");			map.put("-.", "n");
		map.put("---", "o");		map.put(".--.", "p");
		map.put("--.-", "q");		map.put(".-.", "r");
		map.put("...", "s");		map.put("-", "t");
		map.put("..-", "u");		map.put("...-", "v");
		map.put(".--", "w");		map.put("-..-", "x");
		map.put("-.--", "y");		map.put("--..", "z");
	}
	public static void main(String[] args) {
		System.out.println(ex02(".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--"));
	}
	public static String ex02(String t) {
		String[] ar = t.split(" ");
		String result = "";
		for(String str : ar) {
			if(map.containsKey(str)) 
				result += map.get(str);
			else
				result += " ";
		}
		return result;
	}
}
