// 재귀호출(recursive call) 메서드 : 자기가 자기 자신을 부르는 메서드. 반드시 종료식을 포함해야 한다.
//                                   잘쓰면 약!!! 잘못쓰면 독!!!
public class MethodEx04 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=1;i<=10;i++) {
			System.out.print(fibo(i) + " ");
		}
		System.out.println();
		System.out.println("실행시간 : " + (System.currentTimeMillis() - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i=1;i<=10;i++) {
			System.out.print(recursiveFibo(i) + " ");
		}
		System.out.println();
		System.out.println("실행시간 : " + (System.currentTimeMillis() - start) + "ms");
		
		start = System.currentTimeMillis();
		System.out.println(fibo(5)); // 매개변수값을 40이상으로 바꿔서 테스트해보면 실행속도의 차이를 알 수 있다.
		System.out.println("실행시간 : " + (System.currentTimeMillis() - start) + "ms");
		
		start = System.currentTimeMillis();
		System.out.println(recursiveFibo(5));
		System.out.println("실행시간 : " + (System.currentTimeMillis() - start) + "ms");
	}
	
	// n번째 피보나치 수열을 알려주는 재귀호출 메서드 : 독이 되는 재귀호출 --- 절대 사용하면 않됨!!! 실행시간이 엄청 길다.
	public static long recursiveFibo(int n) {
		//System.out.println("recursiveFibo(" + n + ") 호출");
		return n==1 || n==2 ? 1 : recursiveFibo(n-1) + recursiveFibo(n-2);
	}
	
	// n번째 피보나치 수열을 알려주는 일반 메서드
	public static long fibo(int n) {
		//System.out.println("fibo(" + n + ") 호출");
		int first = 0, second = 1;
		while(n>1) {
			second = second + first;
			first  = second - first;
			n--;
		}
		return second;
	}
	
}
