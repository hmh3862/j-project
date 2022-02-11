package kr.green.maven.Java1207;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

// Map : (키,값) 형태의 자료구조
public class MapEx01 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new Hashtable<>(); // 멀티스레드에 안전하게 설계되었다. 옛날것!!
		// 넣기
		map1.put(1, "한사람");
		map1.put(2, "두사람");
		map1.put(3, "세사람");
		System.out.println(map1.size() + "개 : " + map1);
		// 수정
		map1.put(1, "한석봉");
		System.out.println(map1.size() + "개 : " + map1);
		// 얻기
		System.out.println("2번 학생의 이름 : " + map1.get(2));
		// 삭제
		map1.remove(3);
		System.out.println(map1.size() + "개 : " + map1);
		
		System.out.println(map1.containsKey(3) ? "3번 있다" : "3번 없다.");
		
		System.out.println("-----------------------------------------------");
		
		Map<Integer, String> map2 = new HashMap<>(); // 싱글스레드에만 안전하게 설계되었다. 최신것!!
		// 넣기
		map2.put(1, "한사람");
		map2.put(2, "두사람");
		map2.put(3, "세사람");
		System.out.println(map2.size() + "개 : " + map2);
		// 수정
		map2.put(1, "한석봉");
		System.out.println(map2.size() + "개 : " + map2);
		// 얻기
		System.out.println("2번 학생의 이름 : " + map2.get(2));
		// 삭제
		map2.remove(3);
		System.out.println(map2.size() + "개 : " + map2);
		System.out.println(map2.containsKey(3) ? "3번 있다" : "3번 없다.");
	}
}
