/*
1~100사이의 소수를 1줄에 5개씩 출력하시오
소수란 1과 자신만을 약수로 가지는 수이다. 2 3 5 7 11 ....
 */
public class Ex14_for13 {
	public static void main(String[] args) {
		// 어떻게 구하지? 
		// 1. 약수의 개수를 세서 약수의 개수가 2이면 소수이다.  --- 멍청한 방법 ㅎㅎㅎ
		// 2. 2부터 자신까지 나누어서 나누어 떨어졌을때 그수가 자기 자신이라면 중간에 약수가 없다. 즉 소수다. 
		// 3. 수학에서 절반이 넘는 수로는 나누어 떨어질 수 없다. 절반까지의 수로만  나누어 보아도
		//    소수를 판별할 수 있다.
		// 4. 자바에서는 반복문 여러개를 한번에 탈출하거나 처음으로 돌아가는 방법이 있다
		//    break 이름표; continue 이름표;
		
		
		// 실행시간을 측정해 보자
		// 1. 시작시 시간을 저장한다.
		//    System.currentTimeMillis(); : 1970년 1월 1일 이후 시간을 1/1000초 간격으로 알려준다.
		long startTime = System.currentTimeMillis();
		
		int count = 0; // 소수의 개수를 세어줄 변수
		loop: // "이름:" : 이름표를 단다. 
		for(int i=2;i<=100000;i++) { // 2~100사이를 반복
			for(int j=2;j<=i/2;j++) { // i/2까지만 반복
				if(i%j==0) continue loop;
			}
			System.out.printf("%5d", i);
			if(++count%5==0) System.out.println();// 출력한 개수가 5의 배수이면 줄바꿔라!!!
		}
		
		// 2. 종료시간을 저장한다.
		long endTime = System.currentTimeMillis();
		// 3. 빼서 출력한다.
		System.out.println("실행시간 : " + (endTime - startTime) + "ms");
	}
}
