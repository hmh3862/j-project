// return 명령
public class MethodEx02 {
	public static void main(String[] args) {
		int sum1 = 1+2+3 + 1+2+3+4+5 + 1+2+3+4+5+6+7+8+9+10;
		System.out.println(sum1);
		
		int sum2 = sum(3) + sum(5) + sum(10);
		System.out.println(sum2);
		
		for(int i=2000;i<=2010;i++)
			System.out.println(isLeapYear1(i) + " : " + isLeapYear2(i) + " : " + isLeapYear3(i));
		
		System.out.println(power(2, 10));
		System.out.println(Math.pow(2, 10));
		System.out.println(factorial(10));
		System.out.println(sumRange(1, 10));
		System.out.println(sumRange(10, 1));
		System.out.println(sumRange(10, 10));
		
		for(int i=1;i<=12;i++) {
			System.out.println(i + "월 : " + getLastday(2000, i) + ", " + getLastday(2021, i));
		}
		
		gugudan(3,5);
	}
	
	// 10 이하의 두 개의 양의 정수를 입력받아서 작은 수부터 큰 수까지의 구구단을 차례대로 출력하는 프로그램을 구조화하여 작성하시오
	public static void gugudan(int n, int m) {
		if(n>m) { 
			int temp = n;
			n = m;
			m = temp;
		}
		for(int i=n;i<=m;i++) {
			System.out.println(i + "단");
			for(int j=1;j<10;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
	
	// 년, 월을 입력받아 해당 월의 마지막 날짜를 리턴하는 메서드
	public static int getLastday(int year, int month) {
		int m[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		m[1] = isLeapYear3(year) ? 29 : 28; // 메서드 내에서 메서드 호출 가능
		return m[month-1];
	}
	
	// 1. x의 y승을 구하는 메서드를 만드시오
	public static double power(double x, double y) {
		double result = 1;
		for(int i=0;i<y;i++) result *= x;
		return result;
	}
	// 2. n!을 구하는 메서드를 만드시오
	public static long factorial(int n) {
		long result = 1;
		while(n>0) result *= n--;
		return result;
	}
	// 3. n~m까지 정수의 합을 구하는 메서드를 만드시오
	public static int sumRange(int n, int m) {
		if(n>m) { 
			int temp = n;
			n = m;
			m = temp;
		}
		int result = 0;
		for(int i=n;i<=m;i++) result += i;
		return result;
	}
	
	// 1~n까지의 합을 구하는 메서드
	public static int sum(int n) {
		int s = 0;
		for(int i=1;i<=n;i++) s += i;
		return s; // return 값; : 호출한 곳으로 어떠한 값을 돌려준다. 메서드가 종료된다.
		          //              이때 반드시 리턴되는 값의 타입을 메서드명 앞에 기술해야 한다.
				  //              return 되는 값이 없을때는 void이다.
	}
	// 윤년 평년을 알려주는 메서드
	// return 명령은 여러개 나올 수 있다 하지만 별로 좋은 코드는 아니다. return을 만나면 메서드는 종료된다.
	// 어떤 타입이든 리턴이 가능하다.
	public static boolean isLeapYear1(int year) {
		if(year%400==0 || year%4==0 && year%100!=0)
			return true;
		else
			return false;
	}
	public static boolean isLeapYear2(int year) { // 될 수 있으면 return은 마지막에 1번 쓴다.
		boolean result = false;
		if(year%400==0 || year%4==0 && year%100!=0)
			result = true;
		return result;
	}
	public static boolean isLeapYear3(int year) { // 조건식 자체가 논리값이므로 여기서는 조건식을 리턴하면 된다.
		return (year%400==0 || year%4==0 && year%100!=0);
	}
}
