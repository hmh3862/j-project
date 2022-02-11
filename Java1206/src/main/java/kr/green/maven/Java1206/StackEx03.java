package kr.green.maven.Java1206;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

/*
문제 설명
여섯 가지 괄호 '(', ')', '{', '}', '[', ']'로 이루어진 문자열이 바르게 닫힌 문자열인지 알아보려 합니다. 
바르게 닫힌 문자열이라는 것은

'(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로,
'[' 문자로 열렸으면 반드시 짝지어서 ']' 문자로,
'{' 문자로 열렸으면 반드시 짝지어서 '}' 문자로
닫히는 문자열입니다. 또한, 괄호 쌍 안에는 다른 괄호 쌍이 들어갈 수 있습니다. 예를 들어,

{{}}, ({})[]는 바르게 닫힌 괄호입니다.
[), ]()[, ([())]는 바르게 닫히지 않은 괄호입니다.
문자열 s가 주어졌을 때, 문자열 s가 바르게 닫힌 괄호이면 true를, 
그렇지 않으면 false를 return 하는 solution 함수를 완성해 주세요.
 */
public class StackEx03 {
	@Test
	public void test() {
		assertTrue(StackEx03.ex01("{{}}"));
		assertTrue(StackEx03.ex01("({})[]"));
		assertFalse(StackEx03.ex01("[)"));
		assertFalse(StackEx03.ex01("]()["));
		assertFalse(StackEx03.ex01("([())]"));
	}
	
	public static boolean ex01(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			// 여는 괄호는 스텍에 넣는다.
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			}else {
				// 닫는 괄호이면 
				if(!stack.isEmpty()) { // 스텍에 데이터가 있다면
					// 스텍에서 1개를 꺼낸다.
					char t = stack.pop();
					if(ch==')' && t!='(') return false; 
					if(ch==']' && t!='[') return false; 
					if(ch=='}' && t!='{') return false;
				}else { // 스텍에 데이터가 없다면
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
