
public class Ex06_StringEquals {
	public static void main(String[] args) {
		String name1 = "한사람";
		String name2 = "한사람";
		String name3 = new String("한사람");
		String name4 = new String("한사람");
		
		System.out.println(name1 == name2 ? "같다." : "다르다."); // 같다.
		System.out.println(name2 == name3 ? "같다." : "다르다."); // 다르다.
		System.out.println(name3 == name4 ? "같다." : "다르다."); // 다르다.
		System.out.println();
		// String 클래스 값을 ""로 초기화하면 같은 문자열은 새롭게 생기지 않고 공유한다.
		// 하지만 new 로 만들면 만들때마다 메모리에 생깁니다. 위의 코드는 "한사람"이 3개가 만들어졌다.
		
		// 그래서 참조형 변수들의 "같다"비교는 equals메서드로 해야 한다. 그래야 주소가 아닌 값을 비교한다.
		System.out.println(name1.equals(name2) ? "같다." : "다르다."); // 같다.
		System.out.println(name2.equals(name3) ? "같다." : "다르다."); // 같다.
		System.out.println(name3.equals(name4) ? "같다." : "다르다."); // 같다.
		System.out.println();
		
		System.out.println("Bye".equals("bye")); // 문자열은 대소문자 구별한다.  false
		System.out.println("Bye".equalsIgnoreCase("bye"));// 대소문자 무시하고 비교 true
	}
}
