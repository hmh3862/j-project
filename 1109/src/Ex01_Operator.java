// 산술 연산자 : +, -, *, /, %
// 관계 연산자 : 연산의 결과가 논리값(true/false)이다.
//            조건문과 같이 사용됩니다.
//            ==, !=, >, >=, <, <=
// 삼항 연산자 : 연산 대상이 3개인 연산자
//            논리식 ? 참인경우값 : 거짓인 경우값

public class Ex01_Operator {
	public static void main(String[] args) {
		System.out.println(5 > 4); // true
		System.out.println(5 <= 4);// false
		// while 반복문
		// while(조건){ 조건이 참인동안 실행할 명령어들....}
		int i=0;
		while(i<=10) {
			System.out.println("i = " + i + " : " + (i%2==0 ? "짝":"홀"));
			i++;
		}
	}
}
