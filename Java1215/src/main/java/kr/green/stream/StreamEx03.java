package kr.green.stream;

import java.util.Random;
import java.util.stream.Stream;

// 스트림 중간 연산을 알아보자!!!! 
public class StreamEx03 {
	public static void main(String[] args) {
		// 20~30까지 출력하기
		Stream
		.iterate(20, n->n+1) // 스트림 만들기
		.limit(11) // 개수 제한하기 중간연산
		.forEach(n->System.out.print(n + " ")); // 출력하는 최종연산
		System.out.println();

		// 20~30까지의 홀수만 출력하기
		Stream
		.iterate(20, n->n+1) // 스트림 만들기
		.limit(11) // 개수 제한하기 중간연산
		.filter(n->n%2==1) // 필터(조건에 맞는것만 걸러준다) 중간연산
		.forEach(n->System.out.print(n + " ")); // 출력하는 최종연산
		System.out.println();

		// 20~30까지의 홀수만 출력하기
		Stream
		.iterate(20, n->n+1) // 스트림 만들기
		.limit(11) // 개수 제한하기 중간연산
		.filter(StreamEx03::isOdd) // 필터(조건에 맞는것만 걸러준다) 중간연산 ==>  정적메서드를 이용
		.forEach(n->System.out.print(n + " ")); // 출력하는 최종연산
		System.out.println();
		
		// 1부터 홀수중 200번째부터 10개중 3의 배수만 출력하고 싶다.
		Stream
		.iterate(1, n->n+2) // 스트림 만들기
		.skip(200) // 건너띄기 중간 연산
		.limit(10) // 개수 제한하기 중간연산
		.filter(n->n%3==0) // 3의 배수만
		.forEach(n->System.out.print(n + " ")); // 출력하는 최종연산
		System.out.println();
		
		// generate()에서 정적메서드 사용
		Stream
		.generate(Math::random) // 정적메서드 사용
		.limit(10)
		.forEach(n->System.out.print(n + " ")); // 출력하는 최종연산
		System.out.println();
		
		Stream
		.generate(StreamEx03::next) // 사용자가 만든 정적메서드 사용
		.limit(10)
		.forEach(n->System.out.print(n + " ")); // 출력하는 최종연산
		System.out.println();
		
		Stream
		.generate(StreamEx03::rand) // 사용자가 만든 정적메서드 사용
		.limit(10)
		.forEach(n->System.out.print(n + " ")); // 출력하는 최종연산
		System.out.println();
		
		// 객체의 메서드 호출하여 스트림 작성
		Stream
		.generate(new Random()::nextInt) // 객체의 메서드 호출
		.limit(10)
		.forEach(n->System.out.print(n + " ")); // 출력하는 최종연산
		System.out.println();
		
		
		new Random().ints().limit(10).sorted().forEach(n->System.out.print(n + " ")); 
		System.out.println();

		new Random().ints(6, 1, 46).sorted().forEach(n->System.out.print(n + " ")); 
		System.out.println();
		
	}
	public static int rand() {
		return (int)(Math.random()*101);
	}
	static int count = 1;
	public static int next() {
		count *= 2;
		return count;
	}
	
	// 정적메서드를 이용한 필터의 적용
	public static boolean isOdd(int n) {
		return n%2==1;
	}
}
