/*
사이냅소프트 면접문제

주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌

1. 김씨와 이씨는 각각 몇 명 인가요?
2. "이재영"이란 이름이 몇 번 반복되나요?
3. 중복을 제거한 이름을 출력하세요.
4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
 */
public class Exam01 {
	public static void main(String[] args) {
		// 문자열.split(구분자) : 구분자로 구분하여 배열로 만든다.
		String[] names= "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌".split(",");
		System.out.println(names.length + "명");
		
		// 1. 김씨와 이씨는 각각 몇 명 인가요?
		// 2. "이재영"이란 이름이 몇 번 반복되나요?
		int kimc = 0,leec = 0, count = 0;
		for(String name : names) {
			System.out.println(name);
			// 문자열.charAt(위치) : 지정 위치의 1글자를 char로 얻어온다.
			if(name.charAt(0) == '김') kimc++;
			// 문자열.startWith(문자열) : 지정 문자열로 시작되는지 판단한다. true/false
			if(name.startsWith("이")) leec++;
			
			if(name.equals("이재영")) count++;
		}
		System.out.println("김씨 : " + kimc + "명");
		System.out.println("이씨 : " + leec + "명");
		System.out.println("이재영씨 : " + count + "명");
	}
}
