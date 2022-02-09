import java.util.Scanner;

/*
문제 1] 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다.
1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?

문제 2] 100까지의 자연수의 합의 제곱과 제곱의 합의 차이

문제 3] 시저 암호는, 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호인데, 
예를 들어 알파벳 A를 입력했을 때, 그 알파벳의 n개 뒤에 오는
(여기서는 예를 들 때 3으로 지정하였다)알파벳이 출력되는 것이다. 
예를 들어 바꾸려는 단어가 'CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성해라.

문제 4] 어떤 숫자를 입력받았을 때 그 숫자를 2진법으로 출력하는 프로그램을 작성하시오. 

문제 5] 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다. 
        두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다. 
        세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
*/
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(fibo());
		System.out.println(ex2());
		Scanner sc = new Scanner(System.in);
		System.out.print("암호 입력 : ");
		String str = sc.nextLine();
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		System.out.println("만들어진 암호 : " + ex3(str, n));
		// 문제 4
		System.out.print("2진수로 나타낼 숫자 입력 : ");
		n = sc.nextInt();
		System.out.println(n + " : " + Integer.toBinaryString(n));
		System.out.println(n + " : " + Integer.toString(n, 2));
		sc.close();
		int max = 0;
		for(int i=99;i>=10;i--) {
			for(int j=99;j>=10;j--) {
				String t1 = i*j + ""; // 곱해서 문자열로
				String t2 = new StringBuffer(t1).reverse().toString(); // StringBuffer로 만들고 뒤집어서 다시 문자열로 
				if(t1.equals(t2)) { // 뒤집은 글자가 같다면 대칭수
					if(max<Integer.parseInt(t1)) max = Integer.parseInt(t1);
				}
			}			
		}
		System.out.println(max);
		max = 0;
		for(int i=999;i>=100;i--) {
			for(int j=999;j>=100;j--) {
				String t1 = i*j + ""; // 곱해서 문자열로
				String t2 = new StringBuffer(t1).reverse().toString(); // StringBuffer로 만들고 뒤집어서 다시 문자열로 
				if(t1.equals(t2)) { // 뒤집은 글자가 같다면 대칭수
					if(max<Integer.parseInt(t1)) max = Integer.parseInt(t1);
				}
			}			
		}
		System.out.println(max);
	}
	public static String ex3(String str, int n) {
		String result = "";
		for(char ch : str.toCharArray()) {
			result += (char)(ch+n);
		}
		return result;
	}
	public static int ex2() {
		int s1 = 0, s2 = 0;
		for(int i=1;i<=100;i++) {
			s1 += i; // 합
			s2 += i*i; // 제곱의 합
		}
		return s1*s1-s2; // 합의제곱-제곱의 합
	}
	public static int fibo() {
		int result = 0;
		int first=1, second=2;
		while(first<=400_0000) {
			if(first%2==0) result += first;
			// System.out.println(first);
			second += first;
			first = second - first;
		}
		return result;
	}
}
