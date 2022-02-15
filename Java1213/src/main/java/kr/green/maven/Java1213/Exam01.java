package kr.green.maven.Java1213;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

/* 문제 1] Josephus Problem
2,000년 전에는 전쟁에서 병사들이 적들에 의해 동굴에 갇히게 되는 경우가 종종 있었다고 한다.
그들은 포로가 되는것을 방지하기 위해 동그랗게 서서 마지막 한 사람이 남을 때 까지 순서대로 돌아가며 
세번째에 해당되는 사람을 죽여 나갔다고 한다.
마지막으로 남게되는 사람은 자살하기로 약속되어 있었지만 보통 적들에게 항복을 하는 경우가 많았다고 한다.
여러분이 풀어야 할 문제는 총 인원수(N)와 간격(K)이 주어졌을 때 가장 마지막에 살아남는 
병사의 위치(the safe position)를 알아내는 것이다.

예를 들어 병사수가 총 10명이고 돌아가며 세번째에 해당되는 병사를 제거하는 경우는 다음과 같다:

N = 10, K = 3
위의 경우 다음과 같은 순서로 병사들이 제거된다. (괄호는 제거되는 병사를 의미한다)
1st round: 1 2 (3) 4 5 (6) 7 8 (9) 10
2nd round:                            1 (2) 4 5 (7) 8 10
3rd round:                                                (1) 4 5 (8) 10
4th round:                                                               4 (5) 10
5th round:                                                                        4 (10)

위 예에서 끝가지 살아남는 병사는 4, 즉 4번째 병사이다.

입력 데이터는 총 병사수 N과 간격 K이다.
출력 데이터는 마지막까지 살아남는 병사의 위치이다.

(단, 최초 시작은 1번 병사부터이다.)

입출력 예는 다음과 같다:

initial data:
10 3
answer:
4
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("답 : " + josephusProblem(10, 3));
	}
	@Test
	public void test() {
		assertEquals(josephusProblem(10, 3), 4);
	}
	public static int josephusProblem(int n, int k) {
		LinkedList<Integer> list = new LinkedList<Integer>(); // 리스트 만들기
		for(int i=0;i<n;i++) list.add(i+1); // 1~n까지 채우기
		int count = 0; // 순서를 세어줄 변수
		while(list.size()>1) { // 개수가 1이 될때까지
			Iterator<Integer> it = list.iterator(); // 반복자 만들기
			while(it.hasNext()) { // 있으면
				++count; // 순서 증가
				int x = it.next(); // 값 얻기
				if(count%k==0) { // 배수가 되면
					System.out.print(x + " "); // 찍고(지울것)
					it.remove(); // 제거
				}
			}
			System.out.println(); // 줄바꿈(지울것)
		}
		return list.get(0); // 1개 남았으니 첫번째가 답!!!
	}
}
