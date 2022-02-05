// 복합대입 연산자
// +=, -=, *=, /= , .......
public class Ex02_Operator {
	public static void main(String[] args) {
		// 자바에서 1 더하는 여러가지 방법
		byte i = 10;
		System.out.println("i = " + i);
		
		i++;
		System.out.println("i = " + i);
		
		++i;
		System.out.println("i = " + i);
		
		// i = i + 1; // byte = byte + int : 이 연산만 형변환이 일어난다.
		System.out.println("i = " + i);
		
		i += 1;
		System.out.println("i = " + i);
		
		i /= 2;
		System.out.println("i = " + i);

		i %= 3;
		System.out.println("i = " + i);
		
		
		i=10;
		i *= 2 + 3; // 이것의 결과는  i = 10 * 2 + 3 = 23일까요? i = 10 * (2+3) = 50일까요? 
					// 복합 대입 연산자는 연산순서가 우변보다 느리다. 우변이 모두 계산되고 복합대입 연산자가 계산되어
					// 정답은 50이다.
		System.out.println("i = " + i);
		
		
		
	}
}
