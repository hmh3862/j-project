import java.util.Scanner;

// 두 개의 정수를 입력받아 절대값이 더 큰 수를 출력하고 
// 두 개의 실수를 입력받아 절대값이 작은 수를 출력하는 프로그램을 작성하시오.
// 실수는 소수점 이하 2자리까지 출력한다.
public class Jungol_581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		System.out.println(absMax(x1, x2));
		System.out.printf("%.2f\n", absMin(d1, d2));
		sc.close();
	}

	private static double absMin(double d1, double d2) {
		if(d1<0) d1 *= -1;
		if(d2<0) d2 *= -1;
		return d1<d2 ? d1 : d2;
	}

	private static int absMax(int x1, int x2) {
		if(x1<0) x1 *= -1;
		if(x2<0) x2 *= -1;
		return x1>x2 ? x1 : x2;
	}
	/*
	private static double absMin(double d1, double d2) {
		return Math.min(Math.abs(d1), Math.abs(d2));
	}

	private static int absMax(int x1, int x2) {
		return Math.max(Math.abs(x1), Math.abs(x2));
	}
	*/
	
	
	
}
