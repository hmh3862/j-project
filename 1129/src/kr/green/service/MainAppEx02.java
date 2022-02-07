package kr.green.service;

import kr.green.vo.PersonVO;

public class MainAppEx02 {
	public static void main(String[] args) {
		PersonVO kimc = new PersonVO("김종서", 23, true);
		System.out.println(kimc);
		
		kimc.setAge(45);
		System.out.println("kimc  : " + kimc);
		
		PersonVO kimc2 = new PersonVO("김종서", 45, true);
		System.out.println("kimc2  : " + kimc2);
		
		if(kimc==kimc2)
			System.out.println("같은 사람!!!");
		else
			System.out.println("다른 사람!!!");
		
		// 내용이 같으면 같은 것으로 판단하고 싶을 경우에는 equals메서드와 hash코드 메서드를 오버 라이딩해야 한다.
		if(kimc.equals(kimc2)) // 객체 비교는 equals메서드 사용
			System.out.println("같은 사람!!!");
		else
			System.out.println("다른 사람!!!");
		
		// hashCode란? 자바 가상머신이 객체들을 구분하여 붙이는 일련번호
		System.out.println(kimc.hashCode());
		System.out.println(kimc2.hashCode());
		
		
		
	}
}
