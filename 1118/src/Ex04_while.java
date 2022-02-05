// while(조건){ 조건이 참인동안 실행할 명령들... }
// do{ 조건이 참인동안 실행할 명령들... }while(조건);
// 둘다 조건이 참인동안 명령들을 반복실행한다. 차이는 1회 실행 보장에 있다.
public class Ex04_while {
	public static void main(String[] args) {
		// 초기 조건의 값이 거짓인 경우 실행이 달라진다.
		boolean gender = false;
		
		while(gender) {
			System.out.println("나는 실행이 될까요?(while)"); // 1회도 실행되지 않는다.
		}
		
		do {
			System.out.println("나는 실행이 될까요?(do ~ while)");
		}while(gender); // 조건이 거짓이어도 최소 1회는 실행된다.
	}
}
