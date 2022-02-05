public class Ex08_Operator14 {
	/* 증감 연산자 : ++(1증가), --(1감소) */
	public static void main(String[] args) {
		int i=10, j=10, k;
		
		i++;
		j++;
		System.out.println(i + ", " + j); // 11, 11
	
		++i;
		++j;
		System.out.println(i + ", " + j); // 12, 12
		// 단독으로 사용시 앞에붙은 전위연산이나 뒤에붙은 후위연산 결과가 같다.
		
		// 다른 연산자와 같이 쓰면 연산 순서가 바뀐다.
		k = i++ + ++j; //  ++j;  k = i + j; i++; 순서로 계산된다.
		System.out.println(i + ", " + j + ", " + k); // 13, 13, 25 
	
		k = --i + j--; // --i; k = i+j; j--; 순서로 계산된다.
		System.out.println(i + ", " + j + ", " + k); // 12, 12, 25
		
		//++++++i; // C/C++은 된다.
		// i--------; 모두 에러다.
	}
}
