// 산술 연산자 : +, -, *, /, %
// 관계 연산자 : 연산의 결과가 논리값(true/false)이다.
//            조건문과 같이 사용됩니다.
//            ==, !=, >, >=, <, <=
// 논리 연산자 : !(NOT), &&(AND), ||(OR)
// 삼항 연산자 : 연산 대상이 3개인 연산자
//            논리식 ? 참인경우값 : 거짓인 경우값

public class Ex02_Operator {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(5 > 4 && 5 < 6); // true
		System.out.println(5 > 4 || 5 > 6); // true
		
		int i = 10, j=10;
		System.out.println(i + ", " + j); // 10, 10
		++i; ++j; // 1씩 증가
		System.out.println(i + ", " + j); // 11, 11
		// && 연산의 경우 앞의 식이 거짓이면 뒤의 식은 계산하지 않는다.
		System.out.println(i != j && ++i == ++j); // false
		System.out.println(i + ", " + j); // 11, 11
		// || 연산의 경우 앞의 식이 참이면 뒤의 식은 계산하지 않는다.
		System.out.println(i == j || ++i == ++j); // true
		System.out.println(i + ", " + j); // 11, 11
	}
}
