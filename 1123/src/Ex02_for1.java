/*
for(초기식 1;종료식 2;증감식 3){

	종료식이 참인동안 반복실행할 명령들...  4 

}
1 2 4 3 2 4 3 2 4 3.... 순서대로 실행된다.
;은 절대 생략할 수 없다. 
 */
public class Ex02_for1 {
	public static void main(String[] args) {
		
		// 1 ~ 10까지 출력하는 여러가지 방법
		for(int i=1;i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// System.out.println(i); Error다!!!! 왜? for문에서 선언한 변수는 밖에서 사용불가
		
		int i=1;
		for(;i<=10;) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		
		i=1;
		for(;;) { // 무한 Loop이다.
			System.out.print(i++ + " ");
			if(i>10) break;
		}
		System.out.println();
	}
}
