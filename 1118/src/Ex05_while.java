// while(조건){ 조건이 참인동안 실행할 명령들... }
// do{ 조건이 참인동안 실행할 명령들... }while(조건);
// 둘다 조건이 참인동안 명령들을 반복실행한다. 차이는 1회 실행 보장에 있다.
public class Ex05_while {
	public static void main(String[] args) {
		// 1 ~ 100까지의 합을 구해보자
		int sum = 0, i = 1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~ 100까지의 합 : " + sum);

		sum = 0;
		i = 1;
		do{
			sum += i;
			i++;
		}while(i<=100); 
		System.out.println("1~ 100까지의 합 : " + sum);
		
		sum = 0;
		do { 
			sum += --i;
		}while(i>0);
		System.out.println("1~ 100까지의 합 : " + sum);

		sum = 0;
		while(i<100)
			sum += ++i; 
		System.out.println("1~ 100까지의 합 : " + sum);
	}
}
