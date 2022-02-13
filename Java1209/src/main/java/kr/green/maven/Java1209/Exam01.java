package kr.green.maven.Java1209;
/*
문제 1] Ones
2나 5로 나눌 수 없는 0 이상 10,000 이하의 정수 n이 주어졌는데, 
n의 배수 중에는 10진수로 표기했을 때 모든 자리 숫자가 1인 것이 있다. 
그러한 n의 배수 중에서 가장 작은 것은 몇 자리 수일까?

Sample Input
3
7
9901

Sample Output
3
6
12
*/
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(ones(3));
		System.out.println(ones(7));
		System.out.println(ones(9901));
	}
	
	public static int ones(long n) {
		if(n%2!=0 && n%5!=0 && n>10000) return 0; // 2나 5로 나눌 수 없는 0 이상 10,000 이하의 정수 n이 아니면 0리턴
		long i=1, t;
		do {
			t = n * ++i; // n의 배수
		}while(!isDigit1(t)); // 모두 1이 될때까지 반복
		System.out.print(t + " : "); // 출력해봄. 지울것
		return (t+"").length(); // 길이가 답!!!
	}
	
	public static boolean isDigit1(long n) { // 모두 1인 숫자인지 검사하는 메서드
		boolean isOnes = true;
		for(char c : (n+"").toCharArray()) { // 문자로 바꿔 1글자씩 반복
			if(c!='1') { // 1이 아니면 false
				isOnes = false;
				break;
			}
		}
		return isOnes; // 모두 1이면 true
	}
}
