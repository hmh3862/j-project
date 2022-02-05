import java.util.Scanner;

public class Ex04_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0~100사이 점수를 입력하시오(음수는 종료) ");
			int score = sc.nextInt();

			if(score < 0) break; // 참인 경우 실행할 명령이 1줄이라면 {} 생략 가능

			if(score>100) {
				System.out.println("너 한글 모르지? 다시 입력해!!!");
				continue;
			}
			System.out.println("당신이 입력한 점수는 " + score + "입니다.");
			if(score>=60) {
				System.out.println("합격!!!");
			}else {
				System.out.println("불합격!!!");
			}
		}
		sc.close();
	}
}
