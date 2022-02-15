package kr.green.stream;

import java.util.Random;

public class StreamEx01 {
	public static void main(String[] args) {
		// 중간 연산 – 연산결과가 스트림인 연산. 반복적으로 적용가능 
		// 최종 연산 – 연산결과가 스트림이 아닌 연산. 스트림의 요소를 소모하므로 한번만 적용가능

		new Random().ints() // 스트림을 만든다.
		.distinct() // 중간연산 : 중복제거
		//.filter(n->n>=1 && n<=45) // 걸러서
		.limit(6) // 6개만
		.sorted() // 정렬
		.forEach(System.out::println); // 최종연산 : 출력 ==> 정적메서드 호출 :: 사용
	}
}
