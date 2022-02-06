/*
for(초기식 1;종료식 2;증감식 3){

	종료식이 참인동안 반복실행할 명령들...  4 

}
1 2 4 3 2 4 3 2 4 3.... 순서대로 실행된다.
;은 절대 생략할 수 없다. 
 */
public class Ex05_for4 {
	public static void main(String[] args) {
		// 1~100까지 홀수합, 짝수합, 전체합을 구하시오!!! 
		// 반복문 1개 사용
		int sum=0, oddSum=0, evenSum=0;
		for(int i=1;i<=100;i++) {
			oddSum += i;
			++i; // 될 수 있으면 for문에서 반복변수의 값을 변경하지 않는것이 좋다.
			evenSum += i;
		}
		sum = oddSum + evenSum;
		System.out.println("홀수합 : " + oddSum);
		System.out.println("짝수합 : " + evenSum);
		System.out.println("전체합 : " + sum);
		
	}
}
