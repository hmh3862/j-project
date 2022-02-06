import java.util.Scanner;

/*
사업자 등록번호는 000-00-00000 의 구조로 만들어져 있습니다.

[ 사업자 등록번호 자리수의 의미]
앞의 세 자리 수는 국세청과 세무서별 코드이며,
가운데 두 자리 수는 개인과 법인을 구분하는 코드이다.
끝의 다섯 자리 수 중 앞에서부터 네 번째까지의 수는 과세사업자나 면세사업자
또는 법인사업자별로 등록 또는 지정일자를 일련번호로 나타낸 것이고,
맨끝 자리 수는 전산시스템으로 오류를 검증하기 위해 부여되는 검증번호이다.

[ 계산법 ]
1 1 0 8 1 4 1 2 7
x x x x x x x x x
1 3 7 1 3 7 1 3 5
—————
+ + + + + + + + +

즉, (1*1)+(1*3)+(0*7)+(8*1)+(1*3)+(4*7)+(1*1)+(2*3)+(7*5) = 85
그러면 85 이란 수가 나온다. 여기에 마지막에서 두번째 숫자인 7에 5를 곱하고 10으로
나누어 나온 값의 몫을 더한다.

(7 * 5) / 10 = 3.5

이 88 을 매직키인 

88 / 10 = 몫: 8 <– 버림

나머지: 8

마지막 단계로 매직키인 10에서 나머지 8을 빼면 2이란 수가 나오
는데, 이숫자가 사업자등록번호 마지막 자리의 숫자와 일치하면 대한민국 사업자이다.

10 – 8 = 2 –> 정상적인 사업자등록번호임
 */
public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("사업자 등록번호 입력(-없이, 0은 종료)");
			String jj = sc.nextLine();
			if(jj.equals("0")) break;
			if(jj.length()!=10) {
				System.out.print("10자리가 아니네요 다시 입력해!!!");
				continue;
			}
			try {
				Long.parseLong(jj); // 입력값을 숫자로 변경
			}catch (Exception e) {
				System.out.print("숫자가 아닌 문자가 있네요 다시 입력해!!!");
				continue;
			}
			// 여기까지 내려오면 숫자로만 10자리 입력이 보장된다.
			String mask = "137137135"; // 규칙적이지 않으므로 그냥 입력해서 빼온다.
			int sum = 0;
			for(int i=0;i<jj.length()-1;i++) {
				sum += (jj.charAt(i)-'0') * (mask.charAt(i)-'0');
				//System.out.println((jj.charAt(i)-'0') + " * " + (mask.charAt(i)-'0') + " = " 
				//                    + ((jj.charAt(i)-'0') * (mask.charAt(i)-'0')));
			}
			//  마지막에서 두번째 숫자에 5를 곱하고 10으로 나누어 나온 값의 몫을 더한다.
			sum += (jj.charAt(8)-'0') * 5 / 10;
			// 10로 나누어 나머지만 취한다.
			sum %= 10;
			// 마지막 단계로 매직키인 10에서 나머지를 빼면
			sum = 10 - sum;
			
			if(sum == jj.charAt(9)-'0') {
				System.out.println("맞는 사업자 번호");
			}else {
				System.out.println("틀린 사업자 번호");
			}
		}
		sc.close();
		// 217-81-36347 : 그누보드 사업자 번호
		// 220-81-62517 : 네이버 사업자 번호
	}
}
