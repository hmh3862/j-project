/*
for(초기식 1;종료식 2;증감식 3){

	종료식이 참인동안 반복실행할 명령들...  4 

}
1 2 4 3 2 4 3 2 4 3.... 순서대로 실행된다.
;은 절대 생략할 수 없다. 
 */
public class Ex04_for3 {
	public static void main(String[] args) {
		
		// 자연수를 계속 더할때 합이 10000을 넘는 순간의 합과 그수를 출력하시오!!!
		int sum=0,i=1;
		for(;sum<=10000;i++) sum += i;
		
		System.out.println(i + ", " + sum);
		
		// 10!을 구하는 프로그램
		int n = 10, fac=1;
		System.out.print(n + "! = ");
		for(;n>1;n--) {
			fac *= n;
			System.out.print(n + " * ");
		}
		System.out.println("1 = " + fac);
		
	}
}
