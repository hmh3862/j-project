import java.util.Scanner;

// 오늘의 문제 : 정수 3개를 입력받아 크기 순서대로 출력하시오 
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하시오");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		if (i > j) { // 앞의 두개를 비교해서 앞의 수가 크면 바꾼다.
			i = i ^ j;
			j = i ^ j;
			i = i ^ j;
		}
		// System.out.println(i + ", " + j + ", " + k);
		if (j > k) { // 뒤의 두개를 비교해서 앞의 수가 크면 바꾼다.
			j = j ^ k;
			k = j ^ k;
			j = j ^ k;
		}
		// System.out.println(i + ", " + j + ", " + k);
		if (i > j) { // 앞의 두개를 비교해서 앞의 수가 크면 바꾼다.
			i = i ^ j;
			j = i ^ j;
			i = i ^ j;
		}
		System.out.println(i + ", " + j + ", " + k);
		sc.close();
	}
}
