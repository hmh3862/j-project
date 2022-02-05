import java.util.Scanner;

public class Ex07_switch {
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
			
			// 학점을 구해보자
			String grade = "F";
			switch (score/10) {
			case 10: case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
			}
			System.out.println("학점은 \"" + grade + "\"입니다.");
			if(score==100) 
				grade += "+";
			else if(score > 60) {
				if(score%10 >5)
					grade += "+";
				else
					grade += "-";
			}
			System.out.println("학점은 \"" + grade + "\"입니다.");
		}
		sc.close();
	}
}
