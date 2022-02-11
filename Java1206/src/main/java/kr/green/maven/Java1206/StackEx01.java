package kr.green.maven.Java1206;

import java.util.Stack;

// Stack : LIFO(Last In First Out) 나중에 들어간 데이터가 제일 먼저 출력되는 자료구조
//         계산기, 되돌리기, 이전으로...... 
public class StackEx01 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// 넣기
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.add(55);
		System.out.println(stack.size()  + "개 : " + stack);
		// 맨위의 데이터를 맛보기 : 제거되지 않는다.
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println();
		// 맨위의 데이터 꺼내기 : 제거된다.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		// 반복
		while(!stack.isEmpty()) System.out.println(stack.pop());
		
		
	}
}
