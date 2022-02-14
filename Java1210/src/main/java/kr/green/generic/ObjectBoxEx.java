package kr.green.generic;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class ObjectBox{
	Object item; // 자바 객체의 최고 조상이다. 무엇이든지 저장이 가능하다.
}

public class ObjectBoxEx {
	public static void main(String[] args) {
		ObjectBox box = new ObjectBox();
		// 어떠한 데이터도 저장이 가능하다.
		box.setItem(1);
		int n = (int) box.getItem();
		System.out.println(n);
		
		box.setItem(3.14);
		double d = (double) box.getItem();
		System.out.println(d);
		
		box.setItem("문자열");
		box.setItem(true);
		box.setItem(new Date());
		
		d = (double) box.getItem(); // ClassCastException 발생 : 예외를 컴파일 단계에서 잡을 수 없다.
		System.out.println(d);		//                           자료의 안정성이 떨어진다.
		
		
	}
}
