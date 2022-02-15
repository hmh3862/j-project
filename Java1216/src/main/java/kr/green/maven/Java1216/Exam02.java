package kr.green.maven.Java1216;

import java.util.Arrays;

/*
카드 역배치(2015년 KOI 지역본선 고등)
1부터 20까지 숫자가 하나씩 쓰인 20장의 카드가 아래 그림과 같이 오름차순으로 한 줄로 놓여있다. 
각 카드의 위치는 카드 위에 적힌 숫자와 같 이 1부터 20까지로 나타낸다.
이제 여러분은 다음과 같은 규칙으로 카드의 위치 를 바꾼다: 
구간 [a,b] (단, 1≤a≤b≤20) 가 주어지면 위치 a부터 위치 b까지의 카드를 현 재의 역순으로 놓는다.

예를 들어, 현재 카드가 놓인 순서가 위의 그림과 같고 구간이 [5,10]으로 주어진다면, 
위치 5부터 위치 10까지의 카드 5,6,7,8,9,10을 역순으로 하여 10,9,8,7,6,5로 놓는다. 
이제 전체 카드가 놓인 순서는 아래 그림과 같다.
이 상태에서 구간 [9,13]이 다시 주어진다면, 
위치 9부터 위치 13까지의 카드 6,5,11,12,13 을 역순으로 하여 13,12,11,5,6으로 놓는다. 
이제 전체 카드가 놓인 순서는 아래 그림과 같다.

오름차순으로 한 줄로 놓여있는 20장의 카드에 대해 10개의 구간이 주어지면, 
주어진 구간의 순서대로 위의 규칙에 따라 순서를 뒤집는 작업을 연속해서 처리한 뒤 
마지막 카드들의 배치를 구하 는 프로그램을 작성하시오.
입력 총 10개의 줄에 걸쳐 한 줄에 하나씩 10개의 구간이 주어진 다.

i번째 줄에는 i번째 구간의 시작 위치 ai와 끝 위치 bi가 차례대로 주어진다.
이때 두 값의 범위는 1≤ai≤bi≤20이다.
출력 1부터 20 까지 오름차순으로 놓인 카드들에 대해, 
입력으로 주어진 10개의 구간 순서대로 뒤집는 작업을 했을 때 
마지막 카드들의 배치를 한 줄에 출력한다.

입력 예시:
1 1
2 2
3 3
4 4
5 5
6 6
7 7
8 8
9 9
10 10

출력 예시: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

출처: 2015 KOI지역본선 고등
*/
public class Exam02 {
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(Arrays.toString(ar));
		
		reverse(ar, 5, 10);
		System.out.println(Arrays.toString(ar));
		reverse(ar, 9, 13);
		System.out.println(Arrays.toString(ar));
		
		/*
		for(int i=1;i<=10;i++) {
			reverse(ar, i, i);
		}
		System.out.println(Arrays.toString(ar));
		*/
	}
	public static void reverse(int[] ar, int start, int end) {
		start--;end--; // 배열은 첨자가 0부터이므로 1씩 뺀다.
		int step = (end-start)/2; // 크기의 절반반 반복
		for(int i=0;i<=step;i++) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			System.out.println(ar[start] + " : " + ar[end]);
			start++; // 시작값은 증가
			end--;	 // 종료값은 감소
		}
	}
}
