/*
문제
1부터 15까지 차례로 출력하는 프로그램을 작성하시오. while문을 이용하세요.

출력 예
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 */
public class Ex536 {
	public static void main(String[] args) {
		for(int i=1;i<=15;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int i=1;
		while(i<=15) {
			System.out.print(i + " ");
			i++;
		}
	}
}
