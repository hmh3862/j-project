package kr.green.service;


import kr.green.vo.MyDateVO;

public class MainAppEx01 {
	public static void main(String[] args) {
		MyDateVO date1 = new MyDateVO();
		System.out.println(date1);
		
		MyDateVO date2 = new MyDateVO(2021,23,45);
		System.out.println(date2);
		
		// field를 외부로 공개하면 유효성을 방지할 수 없게 된다. 
		// 숨기고 필요시 메서드를 통해서 수정할 수 있도록 해주면 유효성 검사를 할 수 있다. 
		
		// private 멤버는 외부에서 접근이 불가능하다.
		// date2.month = 14;
		// date2.date = 56;
		
		// 수정하고 읽을 수있는 getter & setter를 클래스에 만들어 주어야 한다.
		date2.setYear(2025);
		date2.setMonth(33);
		date2.setDate(58);
		System.out.println(date2);
		
		date2.addMonth(23);
		System.out.println(date2);
		
		date2.addMonth(-3);
		System.out.println(date2);
		
		
		
	}
}
