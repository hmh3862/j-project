package kr.green.generic;

import lombok.Data;

// JDK 1.5에 추가된 Generic : 클래스를 작성할때 타입을 결정하는것이 아니라 사용자가 타입을 결정하게 한다.
@Data
class GenericBox<T>{ // 클래스를 작성할때 타입을 결정하지 않는다.
	T item;
}

public class GenericBoxEx {
	public static void main(String[] args) {
		
		GenericBox<Integer> box = new GenericBox<>(); // 사용자가 사용시 타입을 결정하게 한다.
		box.setItem(1);
		// box.setItem(1.1); // 에러다!!! 저장되는 데이터의 안정성이 보장
		@SuppressWarnings("unused")
		int n = box.getItem(); // 저장되어있는 타입을 알수 있기 때문에 안전하게 사용가능하다. 형변환 없이
		
		GenericBox<String> box2 = new GenericBox<>();
		box2.setItem("하하하");
		System.out.println(box2.getItem());
	}
}
