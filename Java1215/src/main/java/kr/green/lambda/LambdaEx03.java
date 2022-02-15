package kr.green.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaEx03 {
	public static void main(String[] args) {
		// 0~100사이의 임의의 숫자를 얻는 함수가 필요하다.
		System.out.println(rand100());
		System.out.println(rand100());
		System.out.println(rand100());
		System.out.println();
		
		// 인수가 없고 리턴값이 있는경우
		Supplier<Integer> rand100 = ()->(int)(Math.random()*101);
		System.out.println(rand100.get());
		System.out.println(rand100.get());
		System.out.println(rand100.get());
		
		// 인수가 1개 있고 리턴값이 없다.
		Consumer<Integer> printInt = i -> {System.out.print(i + " ");};
		printInt.accept(123);
		printInt.accept(456);
		printInt.accept(789);
		System.out.println();
	}
	
	public static int rand100() {
		// Random random = new Random();
		// return random.nextInt(101);
		return (int)(Math.random()*101);
	}
}
