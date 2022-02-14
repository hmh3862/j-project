package kr.green.maven.Java1210;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
문제 1] 487-3229
회사원들은 외우기 좋은 전화번호를 갖고 싶어한다. 
전화번호를 외우기 쉽도록 만드는 한 방법은 기억하기 좋은 단어나 구절이 되도록 하는 것이다. 
예를 들어, 워털루 대학의 전화는 TUT-GLOP으로 전화를 걸 수 있다. 
때때로 번호의 일부만이 단어를 쓰기 위해 사용될 수 있다. 
Gino에서 피자를 주문하기 위해 310-GINO로 전화를 거는 식이다. 
전화번호를 외우기 좋도록 하는 또다른 방법은 숫자들을 기억하기 좋은 방법으로 묶는 것이다. 
3-10-10-10 (Three-tens)으로 전화를 걸면 피자헛에 주문을 할 수 있다.

전화번호의 표준형은 세 번째 번호와 네 번째 번호 사이에 하이픈(-)을 삽입한 7개의 숫자로 구성되어 있다. 
(예: 888-1200). 전화기의 키패드는 다음과 같은 글자 대 숫자의 대응을 지닌다.

A, B, C -> 2
D, E, F -> 3
G, H, I -> 4
J, K, L -> 5
M, N, O -> 6
P, R, S -> 7
T, U, V -> 8
W, X, Y -> 9

Q와 Z에 대한 대응관계는 존재하지 않는다. 
하이픈은 전화기에 입력되지 않으며 필요에 따라 추가되거나 빠질 수 있다. 
TUT-GLOP의 표준형은 888-4567이고, 310-GINO의 표준형은 310-4466, 3-10-10-10의 표준형은 310-1010이다.
만약 어떤 두 전화번호가 같은 표준형을 지니면 그들은 같은 번호이다.

여러분의 회사는 지역 회사원들의 전화번호를 정리하고 있다. 품질 관리 과정의 일환으로, 
여러분은 정리된 전화번호부의 번호 중에 같은 것이 둘 이상 있지 않은지 확인하고 싶다.

Input
입력은 하나의 테스트 케이스로 구성된다. 
입력의 첫 줄은 전화번호의 갯수(<=100,000)로 이뤄져 있다. 
남은 줄들은 전화번호부 내의 전화번호들이 한 줄에 하나씩 들어 있다. 
각 전화번호는 십진 숫자들과 대문자(Q,Z 제외), 하이픈으로 구성된 문자열로 이뤄져 있다. 
문자열 내에서 정확히 7개의 문자들이 숫자 또는 알파벳 문자이다.

Output
한 번 이상 등장한 전화번호들이 출력을 구성한다. 
각 줄은 표준형으로 표현된 전화번호와 출현 횟수가 하나의 공백 문자로 구분되어 있다. 
출력되는 전화 번호들은 증가하는 사전식 순서로 되어 있어야 한다. 
만약 입력으로 들어온 전화번호 중에 중복이 없다면 "No duplicates."를 출력한다.

Sample Input
12
4873279
ITS-EASY
888-4567
3-10-10-10
888-GLOP
TUT-GLOP
967-11-11
310-GINO
F101010
888-1200
-4-8-7-3-2-7-9-
487-3279

Sample Output
310-1010 2
487-3279 4
888-4567 3
*/
public class Exam01 {
	public static void main(String[] args) {
		ex01();
	}
	public static void ex01() {
		try {
			List<String> list = Files.readAllLines(Paths.get("src/main/resources/input.txt")); // 모든 라인을 리스트로 읽기
			Set<String>  set = new TreeSet<String>(); // 중복을 제거하기 위한 셑
			list.remove(0); // 첫줄 지우고 : 왜? 1줄은 개수 이므로 여기서는 필요 없다.
			for(int i=0;i<list.size();i++) { // 전체를
				list.set(i, getPhoneNumber(list.get(i))); // 7자리 전화 번호로 변경하여 다시 저장
				set.add(getPhoneNumber(list.get(i))); // 7자리 전화 번호로 변경하여 셑에 저장하여 중복제거
			}
			System.out.println(list);
			System.out.println(set);
			for(String t : set) { // 셑 반복
				int count =  0; // 개수세기
				for(String p : list) { // 리스트 반복
					if(t.equals(p)) ++count; // 셑과 일치하는 개수 증가
				}
				if(count>1) System.out.println(t + " " + count); // 2개 이상만 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 전화번호를 숫자로 변경하고 000-0000으로 만들어 리턴하는 메서드
	public static String getPhoneNumber(String number) {
		String result = "";
		String[] table = {"ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"}; // 숫자에 대응하는 문자열 배열 
		number = number.replaceAll("-", ""); // - 를 모두 지우기
		number = number.replaceAll(" ", ""); // 공백을 모두 지우기
		for(int i=0;i<number.length();i++) { // 1글자씩
			char ch = number.charAt(i); // 1글자 얻기
			for(int j=0;j<table.length;j++) { // 영문자 판단
				if(table[j].contains(ch+"")) { // 영문자라면
					ch =(char)('0' + (j+2)); // 배열의 첨자 + 2 ==> 번호
					break; // 빠져나온다.
				}
			}
			result += ch; // 문자열 연결
		}
		return result.substring(0,3) + "-" + result.substring(3); // 000-0000으로 변환
	}
}
