package kr.green.maven.Java1206;

import java.util.HashSet;
import java.util.Set;

// Set : 중복을 허용하지 않는 자료구조
public class SetEx01 {
	public static void main(String[] args) {
		// JDK 1.4까지의 사용방법
		Set set1 = new HashSet(); // 기본적으로 Object타입의 데이터를 넣는다. 어떤것도 다 들어간다.
		set1.add(1);
		set1.add(3.14);
		set1.add("한사람");
		System.out.println(set1.size() + "개 : " + set1);
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(2);
		System.out.println(set1.size() + "개 : " + set1); // 중복이 허용되지 않는다. 순서는 중요하지 않다.
		
		for(Object o : set1) {
			System.out.println(o); // 여기에서 타입을 변환해서 처리를 해줘야 한다. 문제가 발생할 소지가 많다.
		}
		
		
		// JDK 1.5부터는 제네릭을 지원한다.
		// 제네릭이란? 자료형에 상관없이 프로그램을 한다. 사용시에 자료형을 결정짓게 한다.
		// Set<Integer> set2 = new HashSet<Integer>(); // JDK 1.5까지
		Set<Integer> set2 = new HashSet<>(); // JDK 1.6부터
		System.out.println(set2.size() + "개 : " + set2);
		for(int i=0;i<10;i++) set2.add((i+1)*5);
		System.out.println(set2.size() + "개 : " + set2);
		for(int i=0;i<10;i++) set2.add((i+2)*5);
		System.out.println(set2.size() + "개 : " + set2);
		
		// set2.add("한사람"); // 에러다!!! 정수만 저장 가능하다. 타입의 안정성이 보장된다.		
		for(int i : set2) System.out.println(i*6);
		
	}
}
