package kr.green.maven.Java1206;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import kr.green.maven.vo.Person;

// 사용자가 만든 객체를 Set에 저장이 가능할까요?
public class SetEx04 {
	public static void main(String[] args) {
		// 사용자가 만든 객체를 Set에 저장하려면 반드시 equals메서드를 오버라이딩 해야만 중복을 허용하지 않는다.
		// equals메서드를 오버라이딩 하지 않으면 hashCode로 비교하여 중복을 허용하지 않는다. 
		Set<Person> persons = new HashSet<>();
		
		persons.add(new Person("한사람", 32, true));
		persons.add(new Person("두사람", 32, true));
		persons.add(new Person("세사람", 22, false));
		System.out.println( persons.size() + "명 : " + persons);

		persons.add(new Person("한사람", 32, true));
		persons.add(new Person("두사람", 32, true));
		persons.add(new Person("세사람", 22, false));
		System.out.println( persons.size() + "명 : " + persons);
		
		// 사용자가 만든 객체를 TreeSet에 저장하려면 반드시 정렬을 지원하는 방법을 기술해 주어야 한다.
		// 정렬을 지원하는 방법은 Comparable인터페이스를 구현해 주면 된다.
		Set<Person> persons2 = new TreeSet<>();
		persons2.add(new Person("한사람", 32, true));
		persons2.add(new Person("한사람", 20, true));
		persons2.add(new Person("두사람", 18, true));
		persons2.add(new Person("두사람", 30, true));
		persons2.add(new Person("세사람", 22, false));
		persons2.add(new Person("세사람", 19, false));
		System.out.println( persons2.size() + "명 : " + persons2);
	}
}
