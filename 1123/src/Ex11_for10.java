/*
1~100사이의 소수를 1줄에 5개씩 출력하시오
소수란 1과 자신만을 약수로 가지는 수이다. 2 3 5 7 11 ....
 */
public class Ex11_for10 {
	public static void main(String[] args) {
		// 어떻게 구하지? 
		// 약수의 개수를 세서 약수의 개수가 2이면 소수이다.  --- 멍청한 방법 ㅎㅎㅎ
		for(int i=1;i<=100;i++) { // 1~100사이를 반복
			int cnt = 0; // 약수의 개수를 세어줄 변수
			System.out.print(i + " : ");
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					System.out.print(j + " ");
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.print(" : 소수");
			}
			System.out.println();
		}
		System.out.println();

		int count = 0; // 소수의 개수를 세어줄 변수
		for(int i=1;i<=100;i++) { // 1~100사이를 반복
			int cnt = 0; // 약수의 개수를 세어줄 변수
			for(int j=1;j<=i;j++) {
				if(i%j==0) cnt++;
			}
			if(cnt==2) {
				System.out.printf("%5d", i);
				if(++count%5==0) System.out.println();
			}
		}
		
	}
}
