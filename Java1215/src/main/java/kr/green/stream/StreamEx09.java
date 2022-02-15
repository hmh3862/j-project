package kr.green.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
reduce () 연산은 스트림의 모든 요소를 ​​결합하여 단일 값을 생성합니다.
T  reduce(T identity, BinaryOperator<T> accumulator)
<U> U reduce(U identity, BiFunction<U,? super  T,U> accumulator, BinaryOperator<U> combiner)
Optional<T> reduce(BinaryOperator<T> accumulator)
*/
public class StreamEx09 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("합계 : " + sum);
		
		// 직원목록에서 수입의 총합계를 구하시오
		double sum2 = Employee.persons().stream()
				      .map(e->e.getIncome())
				      .reduce(0.0, Double::sum);
		System.out.println("수입합계 : " + sum2);

		sum2 = Employee.persons().stream()
				.reduce(0.0, (partialSum, person)->partialSum + person.getIncome(), Double::sum);
		System.out.println("수입합계 : " + sum2);
		
		//                                                     누산기                         결합기          
		// <U> U reduce(U identity, BiFunction<U,? super  T,U> accumulator, BinaryOperator<U> combiner)
		sum2 = Employee.persons().stream()
				.reduce(0.0, (Double partialSum, Employee emp)->{
					double acc = partialSum + emp.getIncome();
					System.out.println(Thread.currentThread().getName() + 
							" - accumulator : partialSum = " + partialSum + 
							" Employee = " + emp + ", " + acc);
					return acc;
				},
				(a,b) ->{
					double comb = a + b;
					System.out.println(Thread.currentThread().getName() + 
							" - combiner : a = " + a + ", b = " + b + 
							" combiner = " + comb);
					return comb;
				});
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("수입합계 : " + sum2);
		
		sum2 = Employee.persons().parallelStream() // 병렬 스트림 : 멀티스레드 처럼 작동
				.reduce(0.0, (Double partialSum, Employee emp)->{
					double acc = partialSum + emp.getIncome();
					System.out.println(Thread.currentThread().getName() + 
							" - accumulator : partialSum = " + partialSum + 
							" Employee = " + emp + ", " + acc);
					return acc;
				},
				(a,b) ->{
					double comb = a + b;
					System.out.println(Thread.currentThread().getName() + 
							" - combiner : a = " + a + ", b = " + b + 
							" combiner = " + comb);
					return comb;
				});
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("수입합계 : " + sum2);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
		
		// Optional<T> 결과를 래핑하거나 결과가없는 경우 사용됩니다.
		
		Optional<Integer> max = Stream.of(1,2,3,4,5,6).reduce(Integer::max);
		System.out.println(max);
		if(max.isPresent()) {
			System.out.println("최대값 : " + max.get());
		}else {
			System.out.println("값이 없어요!!!");
		}
		
		max = Stream.<Integer>empty().reduce(Integer::max);
		if(max.isPresent()) {
			System.out.println("최대값 : " + max.get());
		}else {
			System.out.println("값이 없어요!!!");
		}
		
		Optional<Employee> person = Employee.persons().stream()
									.reduce((e1, e2)->e1.getIncome()>e2.getIncome() ? e1 : e2);
		
		if(person.isPresent()) {
			System.out.println("최대 수입인 사람 : " + person.get());
		}else {
			System.out.println("값이 없어요!!!");
		}
	}
}
