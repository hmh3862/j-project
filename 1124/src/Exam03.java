import java.util.Scanner;

/*
 * 주민번호 유효성 검사하기
 * ------------------------
 * 생년월일-성별지역번호일련번호체크번호
 * 
 * OOOOOO - OOOOOOX
 * 
 * 1. 앞의 12개자리에 각각 2 3 4 5 6 7 8 9 2 3 4 5를 곱한 합을 구한다.
 * 2. 합을 11로 나눈 나머지를 구한다.
 * 3. 나머지를 11에서 뺀다.
 * 4. 3의 결과를 10으로 아눈 나머지를 구한다.
 * 5. 4의 결과와 13번째 자리의 값이 같으면 맞는 주민번호이다.
 */
public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주민번호 입력(-없이, 0은 종료)");
			String jj = sc.nextLine();
			if(jj.equals("0")) break;
			if(jj.length()!=13) {
				System.out.print("13자리가 아니네요 다시 입력해!!!");
				continue;
			}
			try {
				Long.parseLong(jj); // 입력값을 숫자로 변경
			}catch (Exception e) {
				System.out.print("숫자가 아닌 문자가 있네요 다시 입력해!!!");
				continue;
			}
			// 여기까지 내여오면 숫자로만 13자리 입력이 보장된다.
			// 1번 해결
			int sum = 0;
			for(int i=0;i<12;i++) {
				sum += (jj.charAt(i) - '0') * (i%8+2);
				// '1' - '0' = 1
				//  1  + '0' = '1'
				System.out.println((jj.charAt(i) - '0') + " * " + (i%8+2) + " = " + (jj.charAt(i) - '0') * (i%8+2));
			}
			// 2~4번 해결
			sum = (11 - sum%11) % 10;
			// 5번 해결
			if(sum == jj.charAt(12)-'0') {
				// 문자열.substring(시작위치, 끝위치+1)  : 시작위치부터 끝위치까지
				// 문자열.substring(시작위치) : 시작위치부터 끝까지 
				System.out.println(jj.substring(0, 6) + "-" + jj.substring(6) + "은 맞는 주민번호");
			}else {
				System.out.println(jj.substring(0, 6) + "-" + jj.substring(6) + "은 틀린 주민번호");
			}
		}
		sc.close();
	}
}
