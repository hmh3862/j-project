import java.util.Arrays;

/*
문제1] 중앙값 구하기
	   리스트에 있는 숫자들의 중앙값을 구하는 프로그램을 만들어라.
	[7, 9, 14] = 9
	[24, 31, 35, 49] = 33
	[17, 37, 37, 47, 57] = 37
	중앙값 : 자료를 작은 값에서부터 크기순으로 나열할 때 중앙에 위치한 값
	① 자료의 개수가 홀수이면 가운데 위치한 값이 중앙값이다.
	② 자료의 개수가 짝수이면 가운데 위치한 두 값의 평균이 중앙값이다.
문제2] 	홀수와 짝수의 개수 구하기
문제3] 	삼각형 구별하기
		3개의 각으로 삼각형의 예각, 직각, 둔각을 구별하는 프로그램을 만들어라.
		[60, 60, 60] = 예각삼각형
		[30, 60, 90] = 직각삼각형
		[20, 40, 120] = 둔각삼각형
		[0, 90, 90] = 삼각형이 아니다
		[60, 70, 80] = 삼각형이 아니다
		[40, 40, 50, 50] = 삼각형이 아니다
		예각삼각형 : 3개의 각이 모두 예각인 삼각형
		직각삼각형 : 1개의 각이 직각인 삼각형
		둔각삼각형 : 1개의 각이 둔각인 삼각형
		① 각이 3개가 아닐 경우 삼각형이 아니다.
		② 3개의 각의 합이 180°가 아닐 경우 삼각형이 아니다.
문제4] 각 자릿수의 합을 구할 수 있나요?
문제5] 남은퇴근시간 계산기
		현우는 성인이되어 회사에입사했다. 하지만 들어간기업이 하필 할일없는 중소기업이라
		퇴근시간까지 놀다가 퇴근시간에 퇴근하는것이 일상화가되어버렸다..
		현우는 심심한지라 좀더효율적으로놀기위해 현재부터 퇴근시간까지 남은시간을 알려주는 계산기를 만들어
		계산적으로놀고싶었다 우리가현우를 도와주자!! (참고로 현우의퇴근시간은 17시30분이다)
		input: 현재시간
		output: 남은시간 : hh:mm:ss
		or
		남은시간 : s
문제6] 숫자,문자열 구별하기
		문자와 숫자가섞인 문자열을 입력받을때 구별하여출력해라
		input:"c910m6ia 1ho"
		output:
		str : cma ho
		int : 91061
 */
public class Exam01 {

	public static void main(String[] args) {
		System.out.println(ex01(new int[] {7, 9, 14}));
		System.out.println(ex01(new int[] {24, 31, 35, 49}));
		System.out.println(ex01(new int[] {17, 37, 37, 47, 57}));
		System.out.println();
		
		ex02(new int[] {7, 9, 14});
		ex02(new int[] {24, 31, 35, 49});
		ex02(new int[] {17, 37, 37, 47, 57});
		System.out.println();
	
		ex03(new int[] {60, 60, 60});
		ex03(new int[] {30, 60, 90});
		ex03(new int[] {20, 40, 120});
		ex03(new int[] {0, 90, 90});
		ex03(new int[] {60, 70, 80});
		ex03(new int[] {40, 40, 50, 50});
		System.out.println();
		
		System.out.println(ex04(5923));
		System.out.println(ex04(200));
		System.out.println(ex04(6719283));
		System.out.println();
		
		System.out.println(ex05(17,29,30));
		System.out.println(ex05(17,28,30));
		System.out.println(ex05(14,30,30));
		int t = ex05(14,30,30); // 초를 리턴
		// 초를 시, 분, 초로 변경
		int h  = t/3600;
		int m  = t%3600/60;
		int s  = t%60;
		System.out.println(h + ":" + m + ":" + s);
		
		System.out.println();
		
		ex06("c910m6ia 1ho");
	}
	// 중앙값 구하기
	public static int ex01(int[] ar) {
		int result = 0;
		Arrays.sort(ar); // 정렬
		if(ar.length%2==0) {
			result = (ar[ar.length/2-1] + ar[ar.length/2])/2; 
		}else {
			result = ar[ar.length/2]; 
		}
		return result;
	}
	// 홀수와 짝수의 개수 구하기
	public static void ex02(int[] ar) {
		int odd=0,even=0;
		for(int n : ar) {
			if(n%2==0) 
				even++;
			else
				odd++;
		}
		System.out.printf("홀수 : %d개, 짝수 : %d개\n", odd, even);
	}
	// 삼각형 구별하기
	public static void ex03(int[] ar) {
		String result="";
		if(ar.length!=3) 
			result = "삼각형이 아니다.";
		else if(ar[0]+ar[1]+ar[2]!=180) 
			result = "삼각형이 아니다.";
		else if(ar[0]<=0||ar[1]<=0||ar[2]<=0) 
			result = "삼각형이 아니다.";
		else if(ar[0]==90||ar[1]==90||ar[2]==90) 
			result = "직각삼각형이다.";
		else if(ar[0]>90||ar[1]>90||ar[2]>90) 
			result = "둔각삼각형이다.";
		else if(ar[0]<90&&ar[1]<90&&ar[2]<90) 
			result = "예각삼각형이다.";
		System.out.println(result);
	}
	// 각 자릿수의 합
	public static int ex04(int n) {
		int result = 0;
		while(n>0) {
			result += n%10; n/=10;
		}
		return result;
	}
	// 남은퇴근시간 계산기
	public static int ex05(int hh,int mm, int ss) {
		int es = 17*3600 + 30*60;//  (참고로 현우의퇴근시간은 17시30분이다)
		int cs = hh*3600 + mm*60 + ss;
		return es-cs;
	}
	// 문제6] 숫자,문자열 구별하기
	public static void ex06(String str) {
		String s="", n="";
		for(char ch : str.toCharArray()) {
			if(ch>='0' && ch<='9')
				n += ch;
			else
				s += ch;
		}
		System.out.println("str : " + s);
		System.out.println("int : " + n);
	}
}
