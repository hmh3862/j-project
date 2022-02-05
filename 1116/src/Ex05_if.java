import java.util.Scanner;

public class Ex05_if {
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
			// String grade=""; 
			String grade= "F"; // 초기값을 무엇으로 주느냐에 따라 if문 1개가 줄어들 수 있다.
			// 1. 멍청한 방법 1
			// if(90<=score<=100) grade = "A";
			// 2. 멍청한 방법 2
			if(score >=90 && score<=100) grade = "A";			
			if(score >=80 && score<90) grade = "B";			
			if(score >=70 && score<80) grade = "C";			
			if(score >=60 && score<70) grade = "D";
			// if(score >= 0 && score<60) grade = "F";
			System.out.println("학점은 \"" + grade + "\"입니다.");
			// 3. 멍청한 방법 3
			if(score >=90 && score<=100) grade = "A";			
			else if(score >=80 && score<90) grade = "B";			
			else if(score >=70 && score<80) grade = "C";			
			else if(score >=60 && score<70) grade = "D";
			else grade = "F";
			System.out.println("학점은 \"" + grade + "\"입니다.");
			// 현명한 방법
			// 여기까지 왔다라는 것은 접수가 0~100점사이라고 보장이된다.
			grade = "F";
			if(score >=90) grade = "A";			
			else if(score >=80) grade = "B";			
			else if(score >=70) grade = "C";			
			else if(score >=60) grade = "D";
			System.out.println("학점은 \"" + grade + "\"입니다.");
			
		}
		sc.close();
	}
}
