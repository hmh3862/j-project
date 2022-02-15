package kr.green.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx02 {
	// 문자열의 길이가 0인지 판단하는 함수를 만들어서 사용하고 싶다.
	public static void main(String[] args) {
		System.out.println(isEmpty(""));
		System.out.println(isEmpty(null));
		System.out.println(isEmpty("하하하하"));
		System.out.println();
		
		// 자바에서 지원하는 함수형 인터페이스를 이용하면 다음과 같이 사용 가능하다.
		// 람다 전 사용법
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t!=null && t.length()==0;
			}
		};
		System.out.println(predicate.test(""));
		System.out.println(predicate.test(null));
		System.out.println(predicate.test("하하하하"));
		System.out.println();
		
		// 위의 내용을 람다식으로 표현하면
		Predicate<String> predicate2 = (t)-> t!=null && t.length()==0;
		System.out.println(predicate2.test(""));
		System.out.println(predicate2.test(null));
		System.out.println(predicate2.test("하하하하"));
		System.out.println();
		
		
		// 매개변수도 없고 리턴값도 없다 : Runnable을 람다로 사용
		Runnable r = ()->{System.out.println("하하하");};
		r.run();
		r.run();
		r.run();
		System.out.println();
		// 빈줄 2개를 출력해주는 함수
		Runnable blankDoubleLine = ()->{System.out.println("\n");};
		System.out.println("호호호호");
		blankDoubleLine.run();
		System.out.println("호호호호");
		blankDoubleLine.run();
		System.out.println("호호호호");
		
		
		// 하나의 매개변수를 받아 하나를 반환하는 함수
		// int를 받아 String으로 만들어주는 함수
		Function<Integer, String> int2String = (a)->(a+"");
		System.out.println(int2String.apply(123) + 123 );
		
	}
	// 지금까지는 이렇게 만들어서 사용을 했다.
	public static boolean isEmpty(String str) {
		return str!=null && str.length()==0;
	}
}
