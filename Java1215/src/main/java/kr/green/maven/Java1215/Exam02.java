package kr.green.maven.Java1215;

import java.util.Arrays;
import java.util.List;

/*
주식투자
초기 투자액과 투자 기간, 그리고 투자 기간 중 날짜별 가치 변동율이 주어질 때 
순이익과 이익 여부를 구합니다.

입력
첫째 줄에 투자액이 정수로 주어집니다. 
두번째 줄에 투자기간이 정수로 주어집니다. 
세번째 줄에 투자기간 중 일별 전일 대비 가치 변동이 각각 퍼센트 단위의 정수로 주어집니다.

투자액은 100 이상 10000 이하의 정수입니다.
투자 기간은 1 이상 10 이하의 정수입니다.
일별 변동폭은 -100 이상 100 이하의 정수로 주어집니다.

출력
첫째 줄에 순이익을 소수점 첫째자리에서 반올림한 값으로 나타냅니다. 
두번째 줄에 이익인지 손해인지 여부를 good, same, bad로 나타냅니다. 
이익이면 good, 손해이면 bad, 첫째줄에서 출력한 순이익이 0이면 same울 출력합니다.

예시
입력 예시
10000
4
10 -10 5 -5

출력 예시
-125
bad
*/
public class Exam02 {
	public static void main(String[] args) {
		exam01(10000, 4, new int[] {10,-10,5,-5});
		List<Integer> list = Arrays.asList(10,-10,5,-5);
		System.out.println(list);
	}
	public static void exam01(int m, int day, int[] ar) {
		double money = m;
		for(int i=0;i<day;i++) {
			money = money + (money * (ar[i]/100.0));
			System.out.println(i+1 + "일 : " + money);
		}
		System.out.println(Math.round(money-m));
		if(m<money) 
			System.out.println("good");
		else if(m>money)
			System.out.println("bad");
		else
			System.out.println("same");
			
		
	}
}
