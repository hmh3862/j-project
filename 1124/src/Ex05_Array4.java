import java.util.Scanner;

/*
배열(Array) : 동일한 자료형의 집합
              참조형이다.
 */
public class Ex05_Array4 {
	public static void main(String[] args) {
		// 정수 3개를 입력받아 입력순서 역순으로 출력하고 합계와 평균을 구하여 출력하시오!!!
		// 배열이 없다면 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오!!");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println(n3 + " " + n2 + " " + n1);
		System.out.println("합계 : " + (n1+n2+n3));
		System.out.println("평균 : " + (n1+n2+n3)/3.0);
		
		// 입력값이 10개라면? 왕짜증~~~~
		
		// 배열이 있다면
		int num[] = new int[10];
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		double avg = (double)sum/num.length;
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		sc.close();
	}
}
