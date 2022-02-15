package kr.green.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LambdaEx04 {
	public static void main(String[] args) {
		// 매개 변수와 반환 타입이 일치하는 함수 인터페이스
		UnaryOperator<Integer> doubleValue = (i)->i*2;
		
		System.out.println(doubleValue.apply(4));
		System.out.println(doubleValue.apply(456));
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) list.add(new Random().nextInt(101));
		System.out.println(list);
		// 최대값과 최소값을 구하라!!!
		int maxVal, minVal;
		maxVal = minVal = list.get(0);
		for(int n : list) {
			if(maxVal<n) maxVal = n;
			if(minVal>n) minVal = n;
		}
		System.out.println("최대값 : " + maxVal);
		System.out.println("최소값 : " + minVal);
		
		BinaryOperator<Integer> max = (n, m)-> n > m ? n : m;
		BinaryOperator<Integer> min = (n, m)-> n < m ? n : m;
		
		maxVal = minVal = list.get(0);
		for(int n : list) {
			maxVal = max.apply(maxVal, n);
			minVal = min.apply(minVal, n);
		}
		System.out.println("최대값 : " + maxVal);
		System.out.println("최소값 : " + minVal);
	}
}
