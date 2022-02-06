import java.util.Scanner;

/*
100 이하의 양의 정수만 입력된다.
while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
 */
public class Jungol_537 {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("1~100사이의 양의 정수 입력(0은 종료) : ");
			n = scanner.nextInt();
			if(n==0) break;
			if(n<0 || n>100) continue;
			
			sum=0;
			for(int i=1;i<=n;i++) sum += i;
			System.out.println("합 : " + sum);
		}
		
		//-----------------------------------------------------------------
		System.out.print("1~100사이의 양의 정수 입력 : ");
		n = scanner.nextInt();
		if(n>0 && n<=100) {
			sum=0;
			for(int i=1;i<=n;i++) sum += i;
			System.out.println("합 : " + sum);
		}
		scanner.close();
	}
}
