import java.util.Random;

/*
 * JDK 1.5에 추가된 향상된 for문
 * for(변수 : 컬렉션){
 * 		컬렉션안의 내용을 1번씩 반복한다.
 * }
 * collection : 자료의 집합
 */
public class Ex01_For1 {
	public static void main(String[] args) {
		// "문자열".toCharArray() : 문자열을 1글자씩 잘라서 char배열을 만들어 준다.
		for(char ch : "정말 재미없는 자바!".toCharArray()) {
			System.out.println(ch);
		}
		// "문자열".split("구분자") : 구분자로 구분하여 String Array로 만든다.
		for(String str : "사과,배,복숭아,감,딸기".split(",")) {
			System.out.println(str);
		}
		int sum = 0;
		for(int i : new int[] {1,2,3,4,5,6,7,8,9}) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
		for(int i : new Random().ints(6, 1, 45).toArray()) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}
