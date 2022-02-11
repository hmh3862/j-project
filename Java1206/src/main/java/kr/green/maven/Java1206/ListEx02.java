package kr.green.maven.Java1206;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import kr.green.maven.vo.Person;

public class ListEx02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("배");
		list.add("밤");
		list.add("감");
		list.add("복숭아");
		list.add("딸기");
		list.add("딸기");
		list.add("딸기");
		list.add("딸기");
		
		System.out.println(list.size() + " : " + list);
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(list.size() + " : " + list);
		
		List<Person> list2 = new ArrayList<>();
		list2.add(new Person("한사람",22, true));
		list2.add(new Person("두사람",31, false));
		list2.add(new Person("세사람",18, true));
		list2.add(new Person("한사람",33, false));
		list2.add(new Person("두사람",28, false));
		list2.add(new Person("세사람",25, true));
		System.out.println(list2.size() + " : " + list2);
		// 성별, 이름, 나이순으로 정렬하시오
		list2.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// 둘다 true 또는 false라면 ==> 같은 성별이라면
				if((o1.isGender() && o2.isGender()) || (!o1.isGender() && !o2.isGender()) ) {
					if(o1.getName().compareTo(o2.getName())==0) { // 이름이 같다면
						return o1.getAge()-o2.getAge(); // 나이로
					}else {
						return o1.getName().compareTo(o2.getName()); // 이름으로
					}
				}else if(o1.isGender()) { // 성별로
					return 1;
				}else {
					return -1;
				}
					
			}
		});
		System.out.println(list2.size() + " : " + list2);
		
	}
}
