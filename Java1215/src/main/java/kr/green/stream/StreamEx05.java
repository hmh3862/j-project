package kr.green.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx05 {
	public static void main(String[] args) {
		// 스트림은 읽기만 가능하다. 변경하지는 못한다.
		List<Integer> list = Arrays.asList(3, 1, 5, 4, 2);
		// collect연산 : 만들어라
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sortedList);
		
		// 스트림은 1회용이다.
		Stream<String> strStream = Stream.of("한놈,두식이,석삼,너구리,오징어".split(","));
		strStream.forEach(System.out::println); // 최종연산
		// stream has already been operated upon or closed 예외발생
		// 다시 만들어야 가능하다.
		strStream = Stream.of("한놈,두식이,석삼,너구리,오징어".split(","));
		long count = strStream.count(); // 최종연산
		System.out.println(count + "개");
	}
}
