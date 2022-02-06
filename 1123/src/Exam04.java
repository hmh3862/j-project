import java.util.Scanner;

/*
Duplicate Numbers
일전에 뭐 게임 회사에서 본 간단한 퀴즈 테스트 입니다.
0~9까지의 문자로 된 숫자를 입력 받았을 때, 
이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
sample outputs: true false false true false

// 아래의 문제는 0을 앞에붙여서 입력하면 않된다. 0으로 시작하면 자바는 8진수로 인식한다.
// 원래는 String으로 입력받아 처리해야 완벽하게 해결이 가능하다.
*/
public class Exam04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("양의 정수를 입력하시오(0은 종료) ");
			long n = scanner.nextLong();
			if(n==0) break;
			if(n<0) {
				System.out.println("정확한 값(양의 정수)을 입력하세요");
				continue;
			}
			// 여기에 코드를 입력한다.
			long cnt=0, temp;
			boolean flag = true; // 일단을 맞다고 가정
			for(int i=0;i<10;i++) { // 0~9까지 숫자
				cnt = 0;
				temp = n;
				while(temp>0) { // 뒤에서 1자리씩 잘라내어 버리면서 끝까지 
					if(temp%10==i) { // 뒤에서 1자리 잘라서 i와 같으면 
						cnt++; // 개수를 센다.
					}
					temp/=10; // 뒤의 1자리 버린다.
				}
				if(cnt!=1) { // 개수가 1이 아니라면 안나왔거나 2번 이상 사용되었다.
					flag=false; // 거짓이라고 표시
					break; // 더이상 알아볼 필요가 없다.
				}
			}
			System.out.println(flag);
		}
		scanner.close();
	}
}
