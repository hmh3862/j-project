import java.util.Arrays;
import java.util.Scanner;
/*
자연수 리스트(홀수와 짝수의 개수가 같음)가 주어집니다.
이 리스트를 정렬해야 합니다. 
순서는 홀-짝-홀-짝-...으로 오게 해야 하며, 
홀수는 오름차순 정렬로, 짝수는 내림차순 정렬로 배치해야 합니다.
sample input
4 1 3 2 6 5
sample output
1 6 3 4 5 2
 */
public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 개수 입력
		System.out.print("몇개(짝수)?"); 
		int n = sc.nextInt();
		// 개수만큼 배열 선언
		int ar[] = new int[n];
		// 데이터 입력
		System.out.print(n + "개의 정수 입력(단, 짝/홀수 개수 같게) : ");
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		// 출력
		System.out.println("원본 : " + Arrays.toString(ar));
		// 홀수/짝수를 저장할 배열 선언
		int odd[] = new int[n/2]; // Collections.reverseOrder()를 사용하려면 자료형이 객체형이어야 한다.
		int even[] = new int[n/2];
		// 홀짝을 구분해서 배열에 넣기
		int o=0,e=0; // 홀짝 첨자
		for(int i=0;i<n;i++) {
			if(ar[i]%2==0)
				even[e++] = ar[i];
			else
				odd[o++] = ar[i];
		}
		Arrays.sort(odd); // 오름차순 정렬
		// Arrays.sort(even, Collections.reverseOrder()); // 내림차순 정렬
		Arrays.sort(even); // 오름차순 정렬
		
		System.out.println("홀수 : " + Arrays.toString(odd));
		System.out.println("짝수 : " + Arrays.toString(even));
		// 대시 배열에 넣기
		int k=0;
		for(int i=0;i<n/2;i++) {
			ar[k++] = odd[i]; // 홀수 넣고
			// ar[k++] = even[i];// 짝수 넣기
			ar[k++] = even[ n/2-1 - i];// 짝수 넣기
		}
		System.out.println("정답 : " + Arrays.toString(ar));
		sc.close();
	}
}
