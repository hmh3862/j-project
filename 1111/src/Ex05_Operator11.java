import java.util.Scanner;

public class Ex05_Operator11 {
	/*
	 * 10진수를 2진수로 바꿔보자
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(n != 0) {
			System.out.print("1~255사이의 양의 정수를 입력하시오(0은 종료)");
			n = sc.nextInt();
			if(n==0) continue;
			if(n<0 || n > 255) {
				System.out.println("정확하게 입력해라!!!!");
				continue;
			}
			// 1~255는 1바이트로 나타날수 있는 숫자 범위
			int mask = 0x80; // 1000 0000 : 최상위비트가 1이고 나머지는 모두 0인 수 : 
			// mask값이 0x8000  이고 16번 반복하면 2바이트를 2진수로 변환
			for(int i=0;i<8;i++) { // 8회 반복
				System.out.print((n & mask)==mask ? "1" : "0");
				mask = mask >> 1;
			}
			System.out.println("  :  " + Integer.toBinaryString(n));
		}
		sc.close();
		
		// 0010 0110 => 입력된수
		// 1000 0000 => mask 
		// ---------    AND
		// 0000 0000 => mask와 같냐?   0
		// 위와 같은 연산을 8회 진행
		
		// 0010 0110 => 입력된수
		// 0100 0000 => mask 
		// ---------    AND
		// 0000 0000 => mask와 같냐?   00

		// 0010 0110 => 입력된수
		// 0010 0000 => mask 
		// ---------    AND
		// 0010 0000 => mask와 같냐?   001 ==> 결국 같아지는 경우는 위의 비트값이 1인 경우만이다.
		
		// 8회를 진행하면 결과는 원본과 같아진다. 0010 0110 
	}
}
