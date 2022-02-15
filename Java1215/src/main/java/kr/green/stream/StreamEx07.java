package kr.green.stream;

import java.util.List;

// 사용자가 만든 클래스를 이용한 스트림 작업
public class StreamEx07 {
	public static void main(String[] args) {
		List<Employee> list = Employee.persons();
		System.out.println("원본 : " + list);
		
		// 모두 출력해보자
		list.stream().forEach(e->System.out.println(e.getName() + "(" + e.isFemale() + ")"));
		System.out.println();
		
		// 필터를 이용하여 걸러서 출력해보자
		list.stream()
		.filter(Employee::isFemale)
		.forEach(e->System.out.println(e.getName() + "(" + e.isFemale() +", " + e.getIncome() + ")"));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// forEach를 이용한 값 변경
		list.stream()
		.filter(Employee::isFemale)
		.forEach(e->e.setIncome(e.getIncome()*1.1));
				
		list.stream()
		.filter(Employee::isFemale)
		.forEach(e->System.out.println(e.getName() + "(" + e.isFemale() +", " + e.getIncome() + ")"));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		list.stream()
		//.filter(Employee::isFemale)
		.map(Employee::getName) // map을 이용한 변환
		.forEach(e->System.out.println(e));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// 남자중 수입이 5000이상인 사람의 이름을 출력하시오
		list.stream()
		.filter(e->!e.isFemale())
		.filter(e->e.getIncome()>=5000) // 필터 두개
		//.map(Employee::getName) // map을 이용한 변환
		.forEach(e->System.out.println(e.getName() + "("+e.getIncome() + ")"));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		list.stream()
		.filter(e->!e.isFemale() && e.getIncome()>=5000) // 필터 한개
		//.map(Employee::getName) // map을 이용한 변환
		.forEach(e->System.out.println(e.getName() + "("+e.getIncome() + ")"));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
}
