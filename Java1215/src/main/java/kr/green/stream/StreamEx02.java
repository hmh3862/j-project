package kr.green.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림은 순차 및 병렬 집계 작업을 지원하는 일련의 데이터 값이다.
public class StreamEx02 {
	public static void main(String[] args) {
		// 중간 연산 – 연산결과가 스트림인 연산. 반복적으로 적용가능 
		// 최종 연산 – 연산결과가 스트림이 아닌 연산. 스트림의 요소를 소모하므로 한번만 적용가능

		// 스트림 만든다.
		// 1. 리스트로부터 스트림 만들기
		Stream<Integer> intStream = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream();
		System.out.println(intStream); // 객체다. toString()오버라이딩 되어있지 않다.
		// intStream.forEach(n -> System.out.print(n + " ")); // 최종 연산 : 출력
		// System.out.println();
		intStream.forEach(System.out::println);
	
		// 2. 배열로부터 스트림 생성
		Stream<String> strStream = Stream.of("한놈,두식이,석삼,너구리,오징어".split(","));
		strStream.forEach(System.out::println);
		
		// 3. iterate()를 이용한 스트림 생성
		Stream<Integer> evenStream = Stream.iterate(100, n->n+2); // 100부터 짝수 스트림 생성
		evenStream.limit(10).forEach(System.out::println); // 10개만 출력
		
		Stream<Integer> oddStream = Stream.iterate(1, n->n+2); // 1부터 홀수 스트림 생성
		oddStream.limit(10).forEach(System.out::println); // 10개만 출력
		
		// 4. generate()를 이용한 스트림 생성
		Stream<Double> doubleStream = Stream.generate(Math::random); // 난수 스트림
		doubleStream.limit(10).forEach(System.out::println);
		
		// 5. Random클래스를 이용한 스트림 생성
		IntStream intStream2 = new Random().ints(6);
		intStream2.forEach(System.out::println);
		
		// 로또 번호 생성기
		for(int i=0;i<10;i++) {
			IntStream lottoStream = new Random().ints(6, 1, 46);
			lottoStream.sorted().forEach(n->System.out.print(n + " "));
			System.out.println();
		}
		System.out.println();
		// 자바에서 제일 짧은 로또번호 생성기
		new Random().ints(6, 1, 46).sorted().forEach(n->System.out.print(n + " "));
		System.out.println();
		
		// 6. 값으로부터 스트림 만들기
		Stream<String> strStream2 = Stream.of("정말 재미없는 자바 스트림!!!");
		strStream2.forEach(System.out::println);

		Stream<String> strStream3 = Stream.of("한놈","두식이","석삼","너구리","오징어","육개장","칠면조","팔불출","구공탄");
		strStream3.forEach(System.out::println);
		
		// 7. builder()를 이용한  스트림 만들기
		Stream<String> strStream4 = Stream.<String>builder().add("하나").add("둘").add("셋").build();
		strStream4.forEach(System.out::println);
		
		// 8. range()를 이용한 스트림 만들기
		IntStream intStream3 = IntStream.range(1, 6); // 1 ~ 5
		intStream3.forEach(System.out::println);
		
		IntStream intStream4 = IntStream.rangeClosed(1, 6); // 1 ~ 6
		intStream4.forEach(System.out::println);
		
		// 9. empty()를 이용한 스트림 만들기
		Stream<String> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		
	}
}
