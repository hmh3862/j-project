import java.util.Arrays;

/*
문제 1] 10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기
예로, 10~15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다.
10 = 1 * 0 = 0
11 = 1 * 1 = 1
12 = 1 * 2 = 2
13 = 1 * 3 = 3
14 = 1 * 4 = 4
15 = 1 * 5 = 5
그러므로, 이 경우의 답은 0+1+2+3+4+5 = 15

문제 2] Dash Insert
DashInsert 함수는 숫자로 구성된 문자열을 입력받은 뒤, 
문자열 내에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 
짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. 
(예, 454 => 454, 4546793 => 454*67-9-3) 
DashInsert 함수를 완성하자.

입력 - 화면에서 숫자로 된 문자열을 입력받는다.
"4546793"
출력 - *, -가 적절히 추가된 문자열을 화면에 출력한다.
"454*67-9-3"

문제 3] Special Pythagorean triplet
세 자연수 a, b, c 가 피타고라스 정리 a^2 + b^2 = c^2 를 만족하면 피타고라스 수라고 부릅니다(여기서 a < b < c ). 
예를 들면 3^2 + 4^2 = 9 + 16 = 25 = 5^2 이므로 3, 4, 5는 피타고라스 수입니다.
a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
*/
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(exam01(10,15));
		System.out.println(exam01(10,1000));
		System.out.println(exam02("4546793"));
		System.out.println(Arrays.toString(specialPythagoreanTriplet()));
		// System.out.println(200*200 + 375*375 == 425*425);
	}
	public static int[] specialPythagoreanTriplet() {
		int[] result = new int[3];
		for(int i=1;i<500;i++) {
			for(int j=i+1;j<1000-i;j++) {
				if(i*i + j*j == (1000-i-j) * (1000-i-j)) {
					//if(i+j+(1000-i-j) == 1000) {
						result[0] = i; 
						result[1] = j; 
						result[2] = 1000-i-j; 
						break;
					//}
				}
			}
		}
		return result;
	}
	
	public static int exam01(int start, int end) {
		int result = 0;
		for(int i=start;i<=end;i++) {
			int m = 1;
			int temp = i;
			while(temp>0) {
				m *= temp%10;
				temp/=10;
			}
			result += m;
		}
		return result;
	}
	
	public static String exam02(String str) {
		String result = str.charAt(0)+""; // 첫글자 저장
		char oldChar = str.charAt(0); // 이전 글자 저장
		for(int i=1;i<str.length();i++) { // 두번째 부터 끝까지
			if((oldChar-'0')%2==0 && (str.charAt(i)-'0')%2==0) result += "*"; // 이전글자짝수 현재글자짝수라면 * 추가
			if((oldChar-'0')%2!=0 && (str.charAt(i)-'0')%2!=0) result += "-"; // 이전글자홀수 현재글자홀수라면 - 추가
			result += str.charAt(i); // 현재글자 추가
			oldChar = str.charAt(i); // 현재글자를 이전 글자로
		}
		return result;
	}
}
