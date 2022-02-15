package kr.green.maven.Java1213;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
문제 2] Two Printers
John과 Mary는 "J&M 출판사"를 설립하고 낡은 프린터 2대를 구입하였다.
그들이 첫번째로 성사시킨 거래는 N개의 페이지로 구성된 문서를 출력하는 일이었다.
그들이 구입한 두 대의 프린터는 각기 다른 속도록 문서를 출력하고 있다고 한다. 
하나는 한 페이지를 출력하는 데 X초가 걸리고 다른 하나는 Y초가 소요된다고 한다.
John과 Mary는 두 대의 프린터를 이용하여 전체 문서를 출력하는 데 드는 최소한의 시간이 알고 싶어졌다.

입력과 출력
입력데이터의 첫번 째 라인은 테스트케이스의 갯수를 뜻하고 그 갯수만큼의 라인이 추가로 입력된다. 
추가되는 각 라인은 세 개의 정수값 X Y N 으로 구성된다. 
X는 첫번째 프린터가 한 페이지를 출력하는 데 드는 소요시간, 
Y는 두번째 프린터가 한 페이지를 출력하는 데 드는 소요시간을 뜻하고 
N은 출력할 문서의 총 페이지 수를 의미한다. 
(단, 출력할 문서의 총 페이지 수는 1,000,000,000개를 초과하지 않는다.)

출력은 프린팅에 드는 최소한의 시간을 테스트케이스의 갯수만큼 공백으로 구분하여 출력하도록 한다.

입출력의 예는 다음과 같다:
input data:
2
1 1 5
3 5 4
answer:
3 9
*/
public class Exam02 {
	public static void main(String[] args) {
		System.out.println(ex01(1,1,5));
		System.out.println(ex01(3,5,4));
		
		System.out.println(ex02(1,1,5));
		System.out.println(ex02(3,5,4));
	}
	@Test
	public void test() {
		assertEquals(ex01(1,1,5), 3);
		assertEquals(ex01(3,5,4), 9);
		
		assertEquals(ex02(1,1,5), 3);
		assertEquals(ex02(3,5,4), 9);
	}
	//  이차 방정식을 이용한 풀이
	public static int ex01(int x, int y, int n) {
		int num = x*n / (x+y);
		int r1 = x*n - x*num;
		int r2 = y * (num+1);
		return (r1>=r2) ? r2 : r1;
	}
	
	public static int ex02(int x, int y, int n) {
		int n1,n2,count;
		n1 = n2 = count = 0;
		while(count < n) {
			n1++;
			n2++;
			if(n1%x==0) count++;
			if(n2%y==0) count++;
		}
		return n1<n2 ? n1 : n2;
	}
	
	
}
