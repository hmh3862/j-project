// 재귀호출(recursive call) 메서드 : 자기가 자기 자신을 부르는 메서드. 반드시 종료식을 포함해야 한다.
//                                   잘쓰면 약!!! 잘못쓰면 독!!!
public class MethodEx03 {
	public static void main(String[] args) {
		System.out.println(sum(100));
		System.out.println(recursiveSum(100));
		System.out.println(factorial(5));
		System.out.println(recursiveFactorial(5));
		/*
		 * fac(5) = 5 * fac(4) = 5 * 4 * fac(3) = 5 * 4 * 3 * fac(2) = 5 * 4 * 3 * 2 * fac(1) = 5 * 4 * 3 * 2 * 1 
		 */
		for(int i=0;i<=10;i++)
			System.out.println(power(2, i));
		
		show(5);
	}
	// 5 4 3 2 1 0 1 2 3 4 5  출력하기
	public static void show(int n) {
		System.out.print(n + " ");
		if(n==0) return;
		show(n-1);
		System.out.print(n + " ");
	}
	
	
	// x의 y승을 구하는 재귀호출 메서드
	public static double power(double x, double y) {
		return y<=0 ? 1 : x * power(x, y-1);
	}
	
	// 1부터 n까지 합을 구하는 일반 메서드
	public static int sum(int n) {
		int s = 0;
		while (n > 0)
			s += n--;
		return s;
	}
	// 1부터 n까지 합을 구하는 재귀호출 메서드
	public static int recursiveSum(int n) {
		return n <= 0 ? 0 : n + recursiveSum(n - 1);
	}
	// n!을 구하는 일반 메서드
	public static long factorial(int n) {
		long result = 1;
		while (n > 0)
			result *= n--;
		return result;
	}
	// n!을 구하는 재귀호출 메서드
	public static int recursiveFactorial(int n) {
		return n <= 1 ? 1 : n * recursiveFactorial(n - 1);
	}
}
