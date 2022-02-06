/*
1~100사이의 소수를 1줄에 5개씩 출력하시오
소수란 1과 자신만을 약수로 가지는 수이다. 2 3 5 7 11 ....
 */
public class Ex15_for14 {
	public static void main(String[] args) {
		int n = 1947354127;
		//==================================================================================
		long startTime = System.nanoTime();
		boolean flag = true;
		for(int j=2;j<=n/2;j++) { // i/2까지만 반복
			if(n%j==0) {
				flag = false;
				break;
			}
		}
		if(flag) System.out.println(n + "은 소수");
		System.out.println("실행시간 : " + (System.nanoTime() - startTime) + "ns");
		//==================================================================================
		startTime = System.nanoTime();
		int j=1;
		while(n%++j!=0);
		if(n==j) System.out.println(n + "은 소수");
		System.out.println("실행시간 : " + (System.nanoTime() - startTime) + "ns");
		//==================================================================================
		startTime = System.nanoTime();
		int cnt = 0;
		for(j=1;j<=n;j++) if(n%j==0) cnt++;
		if(cnt==2) System.out.println(n + "은 소수");
		System.out.println("실행시간 : " + (System.nanoTime() - startTime) + "ns");
		//==================================================================================
	}
}
