package kr.green.maven.Java1207;

import java.util.Scanner;

/*
문제 1] 배스킨라빈스31게임
게임규칙
게임의 참여자들은 차례를 정해 1부터 31까지의 수를 순차적으로 부른다. 
한번에 1~3개까지 수를 연달아 부를 수 있으며, 마지막 31을 부른 사람이 진다.
컴퓨터가 무조건 먼저 시작하고,1P는 무조건 2번째로 말한다.컴퓨터가 무조건 이기게 만들어라.
LEVEL1 예상
힌트1:4n-2라는 공식을 사용하면 됩니다.
힌트2:이 게임은 31을 부르면 지는 게임이니 30을 부르면 이깁니다.

문제 2] 기계의 마라톤 기록
항상 일정한 속도로 달리는 기계가 있다고 합시다. 
이 기계의 100m 달리기 기록을 입력받으면 마라톤에서의 기록을 구하시면 됩니다. 
마라톤 경기에서 달리는 거리는 42.195km입니다. 100m 달리기와 마라톤의 코스는 
모두 직선이라고 합니다(회전 시 걸리는 시간을 고려하지 않습니다). 
기계의 파손 및 배터리 방전 시간도 고려하지 않습니다.

문제 3] 수 암호화 프로그램
0~25만의 수 1개를 입력으로 받으면 그 수를 암호화하여 출력하는 프로그램을 작성하세요. 
방법은 다음과 같습니다. 
1. 입력받은 수의 제곱근에 1000을 곱한다. (예시: 2 => 1.414213... * 1000 => 1414.213...) 
2. 1의 결과에서 소수점 이하를 버림한다. (예시: 1414.213... => 1414) 
3. 2의 결과에서 입력받은 수를 뺀다.(예시: 1414 => 1414 - 2 => 1412) 이렇게 하면 2를 입력받았을 때 1412를 출력합니다. 다음 결과로 테스트하세요.
>>> password(2)
1412
>>> password(125000)
228553
>>> password(250000)
250000
>>> password(100000)
216227
난이도 Lv.1 예상합니다.

문제 4] 업앤다운 UP&Down 숫자맞추기 게임
컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
사용자는 이 숫자를 맞추어야 합니다.
입력한 숫자보다 정답이 크면 → "UP" 출력,
입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.
코딩 초보자라도 if 함수와 while함수, 랜덤 모듈 정도까지만 배워도 재미있게 풀 수 있는 문제입니다.

(예시)
컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다.
이 숫자를 맞춰주세요.
1~100 숫자 입력:50
DOWN
1~100 숫자 입력:25
UP
1~100 숫자 입력:38
DOWN
1~100 숫자 입력:32
UP
1~100 숫자 입력:35
UP
1~100 숫자 입력:37
DOWN
1~100 숫자 입력:36
정답입니다! 7회 만에 맞췄어요.
*/
public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배스킨라빈스31게임");
		int num = 2;
		System.out.println("컴퓨터 : 1 2");// 제일  먼저 2개를 부르고 : 30-2 = 28 = 4*7
		loop:
		while(num<=31) {
			System.out.print("정수 개수 입력(1~3개)");
			int n = sc.nextInt();
			System.out.print("사람 : ");
			for(int i=0;i<n;i++) {
				System.out.print(++num + " ");
				if(num==31) {
					System.out.println("사람이 졌습니다.");
					break loop;
				}
			}
			System.out.println();
			int t = 4-n; // 부르는 수의 개수가 합쳐서 4가되게 부른다.
			System.out.print("컴퓨터 : ");
			for(int i=0;i<t;i++) {
				System.out.print(++num + " ");
				if(num==31) {
					System.out.println("컴퓨터가 졌습니다.");
					break loop;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
