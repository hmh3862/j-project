import java.util.Scanner;

/*
뒤집어서 더하기
정수 두개를 입력받아 앞의 숫자를 뒤집어서 더하기를 뒤의 숫자만큼하시오
입력
 1 10

1 + 1 = 2				1
2 + 2 = 4				2
4 + 4 = 8				3
8 + 8 = 16				4
16 + 61 = 77			5
77 + 77 = 154			6
154 + 451 = 605			7
605 + 506 = 1111		8
1111 + 1111 = 2222		9
2222 + 2222 = 4444	   10

출력
4444	
*/
public class BackAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 2개입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("정답 : " + backAdd(n,m)); // 메서드 호출
		sc.close();
	}
	// 처리 로직을 메서드로 만들었다.
	private static int backAdd(int n, int m) {
		for(int i=1;i<=m;i++) { // m번 반복
			int temp = n; // 피신
			// 길이를 구한다.
			int len = 1;
			while(temp>=10) {
				len *=10;
				temp/=10;
			}
			// System.out.println(len);
			// 뒤집는다.
			temp = n;
			int sum = 0;
			while(temp>0) {
				sum += temp%10 * len;
				temp /= 10;
				len  /= 10;
			}
			System.out.println(i + "회 :" + n + " : " + sum);
			// 뒤집은 데이터를 더한다.
			n += sum;
		}
		return n; // 계산 결과를 불러준 곳으로 돌려보낸다.
	}
}
