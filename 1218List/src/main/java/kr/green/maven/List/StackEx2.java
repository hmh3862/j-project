<<<<<<< HEAD
package kr.green.maven.List;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class StackEx2 {
	public static void main(String[] args) throws IOException {
    	// 수식 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("중위표현식 입력 : ");
        String str = sc.nextLine();
        sc.close();
        
        
        String exp = toPostfix(str);
        System.out.println("후위 표현식 : " + exp);
        System.out.println("계산된값 : " + calc(exp));
    }
	
	// 연산 우선순위를 구해주는 메서드 
    public static int getPriority(char ch) {
    	switch(ch) {
    	case '^':
    		return 3;
    	case '*' :
    	case '/' :
    	case '%' :
    		return 2;
    	case '+' :
    	case '-' :
    		return 1;
    	default :
    		return 0;
    	}
    }
 // 후위 표현식을 이용하여 계산하기
    private static int calc(String exp) {
    	Stack<Integer> stack = new Stack<>();
    	String[] exps = exp.split(" "); // 공백을 구분자로 해서 배열을 만든다.
    	// System.out.println(Arrays.toString(exps));
    	for(String t : exps) {
    		try { // 숫자라면 스텍에 넣는다.
    			int num = Integer.parseInt(t);
    			stack.push(num);
    		}catch (Exception e) {
				// 연산자라면 두개를 꺼내어 연산한후 다시 스텍에 넣는다.
    			int n1 = stack.pop();
    			int n2 = stack.pop();
    			switch (t) {
    			case "^":
    				int result = 1;
    				while(n1>0) {
    					result *= n2;
    					n1--;
    				}
    				stack.push(result);
    				break;
				case "*":
					stack.push(n1*n2);
					break;
				case "/":
					stack.push(n2/n1);
					break;
				case "+":
					stack.push(n1+n2);
					break;
				case "-":
					stack.push(n2-n1);
					break;
				}
			}
    		//System.out.println(stack);
    	}
    	
    	return stack.pop();
    }
    // 중위 표현식을 후위 표현식으로 변환하기 
	private static String toPostfix(String str) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stk = new Stack<>();
        // 문자열의 길이를 구한다
        int len = str.length();
        for(int i = 0; i < len; i++) {  // 괄호를 먼저 없앤다 === 반복
            char ch = str.charAt(i); // 1글자 얻기
            int priority = getPriority(ch); // 우선순위를 구하고

            switch(ch) {
            	// 연산자라면  
                case '+' :
                case '-' :
                case '*' :
                case '/' :
                case '^' :
                	sb.append(" ");
                	// 스텍이 비거나 연산순위가 큰값이 나타날때까지 꺼내서 출력한다.
                    while(!stk.isEmpty() && getPriority(stk.peek()) >= priority) {
                        sb.append(stk.pop()); // 꺼내서 출력
                        sb.append(" "); // 공백
                    }
                    stk.push(ch); // 현재연산자를 스텍에 넣는다.
                    break;
                // 여는 괄호라면 스텍에 넣는다.
                case '(' : 
                    stk.push(ch);
                    break;
                // 닫는 괄호라면 스텍이 비어있지않으면서 여는괄호가 나타날때까지 꺼내서 출력한다. 
                case ')' :
                	sb.append(" ");
                    while(!stk.isEmpty() && stk.peek() != '(') {
                    	sb.append(" ");
                        sb.append(stk.pop());
                    }
                    stk.pop();  // '(' 제거
                    break;
                // 숫자라면
                default :  // operand
                    sb.append(ch); // 숫자라면 출력한다.
            }
        }
        sb.append(" "); // 구분자
        // 스텍이 빌때까지 모두꺼내어 출력한다.
        while(!stk.isEmpty()) {
            sb.append(stk.pop());
            sb.append(" "); // 공백추가
        }
        return sb.toString().replaceAll("  ", " ").trim();
	}
=======
package kr.green.maven.List;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class StackEx2 {
	public static void main(String[] args) throws IOException {
    	// 수식 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("중위표현식 입력 : ");
        String str = sc.nextLine();
        sc.close();
        
        
        String exp = toPostfix(str);
        System.out.println("후위 표현식 : " + exp);
        System.out.println("계산된값 : " + calc(exp));
    }
	
	// 연산 우선순위를 구해주는 메서드 
    public static int getPriority(char ch) {
    	switch(ch) {
    	case '^':
    		return 3;
    	case '*' :
    	case '/' :
    	case '%' :
    		return 2;
    	case '+' :
    	case '-' :
    		return 1;
    	default :
    		return 0;
    	}
    }
 // 후위 표현식을 이용하여 계산하기
    private static int calc(String exp) {
    	Stack<Integer> stack = new Stack<>();
    	String[] exps = exp.split(" "); // 공백을 구분자로 해서 배열을 만든다.
    	// System.out.println(Arrays.toString(exps));
    	for(String t : exps) {
    		try { // 숫자라면 스텍에 넣는다.
    			int num = Integer.parseInt(t);
    			stack.push(num);
    		}catch (Exception e) {
				// 연산자라면 두개를 꺼내어 연산한후 다시 스텍에 넣는다.
    			int n1 = stack.pop();
    			int n2 = stack.pop();
    			switch (t) {
    			case "^":
    				int result = 1;
    				while(n1>0) {
    					result *= n2;
    					n1--;
    				}
    				stack.push(result);
    				break;
				case "*":
					stack.push(n1*n2);
					break;
				case "/":
					stack.push(n2/n1);
					break;
				case "+":
					stack.push(n1+n2);
					break;
				case "-":
					stack.push(n2-n1);
					break;
				}
			}
    		//System.out.println(stack);
    	}
    	
    	return stack.pop();
    }
    // 중위 표현식을 후위 표현식으로 변환하기 
	private static String toPostfix(String str) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stk = new Stack<>();
        // 문자열의 길이를 구한다
        int len = str.length();
        for(int i = 0; i < len; i++) {  // 괄호를 먼저 없앤다 === 반복
            char ch = str.charAt(i); // 1글자 얻기
            int priority = getPriority(ch); // 우선순위를 구하고

            switch(ch) {
            	// 연산자라면  
                case '+' :
                case '-' :
                case '*' :
                case '/' :
                case '^' :
                	sb.append(" ");
                	// 스텍이 비거나 연산순위가 큰값이 나타날때까지 꺼내서 출력한다.
                    while(!stk.isEmpty() && getPriority(stk.peek()) >= priority) {
                        sb.append(stk.pop()); // 꺼내서 출력
                        sb.append(" "); // 공백
                    }
                    stk.push(ch); // 현재연산자를 스텍에 넣는다.
                    break;
                // 여는 괄호라면 스텍에 넣는다.
                case '(' : 
                    stk.push(ch);
                    break;
                // 닫는 괄호라면 스텍이 비어있지않으면서 여는괄호가 나타날때까지 꺼내서 출력한다. 
                case ')' :
                	sb.append(" ");
                    while(!stk.isEmpty() && stk.peek() != '(') {
                    	sb.append(" ");
                        sb.append(stk.pop());
                    }
                    stk.pop();  // '(' 제거
                    break;
                // 숫자라면
                default :  // operand
                    sb.append(ch); // 숫자라면 출력한다.
            }
        }
        sb.append(" "); // 구분자
        // 스텍이 빌때까지 모두꺼내어 출력한다.
        while(!stk.isEmpty()) {
            sb.append(stk.pop());
            sb.append(" "); // 공백추가
        }
        return sb.toString().replaceAll("  ", " ").trim();
	}
>>>>>>> refs/remotes/origin/master
}