/*
for(초기식 1;종료식 2;증감식 3){

	종료식이 참인동안 반복실행할 명령들...  4 

}
1 2 4 3 2 4 3 2 4 3.... 순서대로 실행된다.
;은 절대 생략할 수 없다. 
 */
public class Ex03_for2 {
	public static void main(String[] args) {
		
		// 1 ~ 100까지 합을 출력하는 여러가지 방법
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("1~100까지 합 : " + sum);
		
		sum=0;
		int i=1;
		for(;i<=100;i++)
			sum += i;
		System.out.println("1~100까지 합 : " + sum);

		for(sum=i=0;i<100;)
			sum += ++i;
		System.out.println("1~100까지 합 : " + sum);

		for(sum=0, i=0;i<100; ++i, sum += i);
		System.out.println("1~100까지 합 : " + sum);
		
		for(sum=i=0;i<100;sum += ++i); // {}
		System.out.println("1~100까지 합 : " + sum);
		
	}
}
