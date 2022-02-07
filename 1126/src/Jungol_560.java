import java.util.Scanner;

// 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
// (입력받을 정수는 1000을 넘지 않는다.)
public class Jungol_560 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명?");
		int cnt = sc.nextInt();
		sc.close();
		
		int n[] = new int[cnt];
		int min;// = 1000;  // 최소값을 구할 변수에는 제일 큰값으로 초기화 하고
		int max;// = -1000; // 최대값을 구할 변수에는 제일 적은값으로 초기화 하고
		int sum = 0;	 // 합계를 구할 변수는 0으로 초기화해야 한다.
		double avg;
		System.out.print("정수 10개 입력 : ");
		max = min = n[0] = sc.nextInt(); // 배열의 첫번째 값으로 초기화
		for(int i=1;i<n.length;i++) { // 두번째 부터 입력
			n[i] = sc.nextInt();
			if(n[i]<min) min = n[i]; // 최소값을 저장할 변수의 값이 나보다 크다면 그값을 가진다.
			if(n[i]>max) max = n[i];
			
			sum += n[i]; // 누적(합계)
		}
		avg = (double)sum/n.length; // 평균은 반드시 여기서 구한다(형변환)
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + String.format("%.1f", avg));
	}
}
