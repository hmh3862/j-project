package kr.green.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEx01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("한놈","두식이","석삼","너구리","오징어");
		System.out.println(list);
		// 오름 차순 정렬을 해보자
		Collections.sort(list);
		System.out.println(list);
		// 내림 차순 정렬을 해보자
		/*
		// 정렬기준을 익명 클래스로 만들었다.
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		// 정렬기준을 람다식으로 만들었다.
		Collections.sort(list, (s1, s2)->s2.compareTo(s1));
		System.out.println(list);
		
		// 1줄 출력하는것을 스레드로 만들었다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!!!");
			}
		}).start();
		
		// 위의 식을 람다식로 만들어 보자
		new Thread(()->{System.out.println("Hello World2!!!");}).start();
		
		
	}
	
}
