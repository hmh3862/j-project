import java.util.Arrays;
import java.util.Comparator;

/*
사이냅소프트 면접문제

주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌

1. 김씨와 이씨는 각각 몇 명 인가요?
2. "이재영"이란 이름이 몇 번 반복되나요?
3. 중복을 제거한 이름을 출력하세요.
4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
 */
public class Exam02 {
	public static void main(String[] args) {
		// 문자열.split(구분자) : 구분자로 구분하여 배열로 만든다.
		String[] names= "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌".split(",");
		System.out.println(names.length + "명");
		System.out.println(Arrays.toString(names));
		// 3. 중복을 제거한 이름을 출력하세요.
		String result = "";
		for(String name : names) {
			// 문자열.contains(문자열2) : 문자열에 문자열2가 포함되어있는지를 알려준다. true/false  
			if(!result.contains(name)) result += name + " "; // 포함되어 있지 않으면 연결해준다.
		}
		System.out.println(result);
		// 문자열을 다시 배열로 만든다.
		// 문자열.trim() : 문자열이 앞/뒤의 공백을 제거해 준다. 
		String ar[] = result.trim().split(" ");
		System.out.println(ar.length + "명");
		System.out.println(Arrays.toString(ar));
		
		// 4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
		Arrays.sort(ar, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(Arrays.toString(ar));
		// 내림차순 정렬
		Arrays.sort(ar, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(ar));
		
		
	}
}
