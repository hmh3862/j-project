package kr.green.stream;

import java.util.stream.Stream;

public class StreamEx06 {
	public static void main(String[] args) {
		// peek(Consumer<? super T> action) 메서드를 사용하여 스트림을 디버깅 할 수 있습니다
		int sum  = Stream.of(1,2,3,4,5,6,7,8,9,10)
				.peek(n->System.out.println("가져오기 : " + n))
				.filter(n->n%2==1) // 거르기 중간연산
				.peek(n->System.out.println("거르기 : " + n))
				.map(n->n*n) // 변환 중간연산
				.peek(n->System.out.println("변환 : " + n))
				.reduce(0, Integer::sum); // 모든 원소에 대하여 반복하는 최종연산
		
		System.out.println("합계 : " + sum);
	}
}
