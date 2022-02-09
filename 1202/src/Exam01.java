import java.util.Arrays;

/*
문제 1] 1부터 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수
문제 2] 3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간값을 가지는 숫자를 출력하세요.
        ex1) 2, 5, 3 => 3 ex2) 4, 6, 4 => 4
문제 3] 양의 정수만 입력으로 받고 그 수의 자릿수를 출력해보자. 
        ex1) 3 > 1자리수, ex2) 649 > 3자리수 ....
문제 4] 자신을 제외한 곱셈
		배열 [a, b, c, d]를 입력하면 배열[bcd, acd, abd, abc]를 출력하는 
		코드를 작성하시오.
		(단, 나눗셈 사용 금지)
		입출력되는 배열은 어떤 형식이든 상관없습니다.
		입력 예시
		2, 6, 4, 7
		출력 예시
		168, 56, 84, 48
*/
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(ex01() +"\n");
		System.out.println(ex02(2,5,3));
		System.out.println(ex02(4,6,4) + "\n");
		System.out.println(ex03(1));
		System.out.println(ex03(12));
		System.out.println(ex03(123) + "\n");
		System.out.println(Arrays.toString(ex04(new int[] {2,6,4,7})));
		System.out.println(Arrays.toString(ex04(new int[] {1,2,3,4,5})));
		// 문제 5] 문자에 해당하는 아스키코드를 알아내는 코드
		System.out.println('a'+0);
		System.out.println('d'+0);
		System.out.println('A'+0);
		// 문제 6] 문자열을 제거한뒤 숫자만반환
		String str = "123s45f67u8*10";
		String result = "";
		for(char c : str.toCharArray()){
			if(c>='0' && c<='9') result += c;
		}
		System.out.println(result);
	}
	public static int ex01() {
		int result = 0;
		while(true) {
			++result;
			boolean flag = true;
			for(int i=1;i<=20;i++) {
				if(result%i!=0) {
					flag = false;
					break;
				}
			}
			if(flag) break;
		}
		return result;
	}
	public static int ex02(int a, int b, int c) {
		if(a>b) { int t = a; a=b; b=t;}
		if(b>c) { int t = b; b=c; c=t;}
		if(a>b) { int t = a; a=b; b=t;}
		return b;
	}
	public static int ex03(int a) {
		return (a+"").length();
	}
	public static int[] ex04(int ar[]) {
		int result[] = new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			int m  = 1;
			for(int j=0;j<ar.length;j++) {
				if(i!=j) m *= ar[j];
			}
			result[i] = m;
		}
		return result;
	}
}
