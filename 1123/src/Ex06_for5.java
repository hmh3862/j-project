import java.util.Scanner;

/*
for(초기식 1;종료식 2;증감식 3){

	종료식이 참인동안 반복실행할 명령들...  4 

}
1 2 4 3 2 4 3 2 4 3.... 순서대로 실행된다.
;은 절대 생략할 수 없다. 
 */
public class Ex06_for5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		sc.close();

		int first = 0, second = 1; 
		
		for(;second<=n;) { 
			System.out.printf("%5d", second); 
			second = first + second; 
			first = second - first; 
		}
		System.out.println();
		
		for(first = 0, second = 1;second<=n;second = first + second,first = second - first) 
			System.out.printf("%5d", second); 
		System.out.println();
	}
}
