package kr.green.maven.Java1207;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import kr.green.maven.vo.Person;

public class MapEx03 {
	public static void main(String[] args) {
		Map<String, Person> map = new TreeMap<>(); // 정렬(키)이 지원되는 맵
		
		Person person1 = new Person("한사람",22,true);
		Person person2 = new Person("두사람",31,false);
		Person person3 = new Person("세사람",28,false);
		Person person4 = new Person("네사람",18,true);
		// 키값이 같으면 수정 그래서 키값은 유일하게 구분되는 값이어야 한다.
		Person person5 = new Person("네사람",43,true);
		
		map.put(person1.getName(), person1);
		map.put(person2.getName(), person2);
		map.put(person3.getName(), person3);
		map.put(person4.getName(), person4);
		map.put(person5.getName(), person5);
		System.out.println(map.size() + "명 : " + map);
		
		// 키만
		for(String key : map.keySet()) { // 키를 Set으로 리턴
			System.out.println(key);
		}
		System.out.println();
		
		// 값만
		for(Person person : map.values()) {
			System.out.println(person);
		}
		System.out.println();
		
		Iterator<Person> it = map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
		
		// 키값 모두
		for(String key : map.keySet()) { // 키를 Set으로 리턴
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
	}
}
