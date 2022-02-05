// while(조건){ 조건이 참인동안 실행할 명령들... }
// do{ 조건이 참인동안 실행할 명령들... }while(조건);
// 둘다 조건이 참인동안 명령들을 반복실행한다. 차이는 1회 실행 보장에 있다.
public class Ex06_while {
	public static void main(String[] args) {
		// 1 ~ 100까지의 홀수합/짝수합을 구해보자
		int sum = 0, i = 1;
		while(i<100) {
			sum += i;
			i += 2;
		}
		System.out.println("1~ 100까지의 홀수 합 : " + sum);

		sum = 0; i = 2;
		while(i<=100) {
			sum += i;
			i += 2;
		}
		System.out.println("1~ 100까지의 짝수 합 : " + sum);
		System.out.println();
		// 반복문 1개를 이용하여  1~ 100 사이의 짝수합, 홀수합, 전체합을 구하시오!!!
		// 힌트 : 홀수 + 1 = 짝수, 짝수 + 1 = 홀수
		int oddSum = 0, evenSum=0;
		sum = 0;
		i = 0;
		while(i<100) {
			oddSum += ++i; 	// 1 + 3 + 5 .... + 99
			evenSum += ++i;	// 2 + 4 + 6 .... + 100
		}
		sum = oddSum + evenSum;
		System.out.println("1~ 100까지의 홀수 합 : " + oddSum);
		System.out.println("1~ 100까지의 짝수 합 : " + evenSum);
		System.out.println("1~ 100까지의 전체 합 : " + sum);
	}
}
