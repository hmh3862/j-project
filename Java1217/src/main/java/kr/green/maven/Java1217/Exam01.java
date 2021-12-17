package kr.green.maven.Java1217;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
h-index & g-index
연구자의 연구업적을 평가할 때 사용되는 지표 중 
h-index와 g-index라는 것이 있다.

h-index : 인용 횟수가 h번 이상인 논문이 h개일 때 가능한 h의 최댓값
g-index : 인용 횟수가 높은 상위 g개 논문의 인용 횟수 총합이 g²이상일 때 
          가능한 g의 최댓값
어떤 학자가 쓴 논문 각각의 인용 횟수가 주어질 때, h-index와 g-index를 계산하시오.

e.g.)
입력 : 0 15 4 0 7 10 0
h-index : 4
g-index : 6

 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("h-index : " + getHIndex(Arrays.asList(0,15,4,0,7,10,0)));
		System.out.println("g-index : " + getGIndex(Arrays.asList(0,15,4,0,7,10,0)));
	}
	@Test
	public void test() {
		assertEquals(getHIndex(Arrays.asList(0,15,4,0,7,10,0)), 4);
		assertEquals(getGIndex(Arrays.asList(0,15,4,0,7,10,0)), 6);
	}
	public static int getHIndex(List<Integer> list) {
		int hIndex=0;
		for(int i=list.size()-1;i>=0;i--) {
			int count = 0;
			for(int j=0;j<list.size();j++) {
				if(i<=list.get(j)) count++;
			}
			if(i==count) {
				hIndex = count;
			}
		}
		return hIndex;
	}
	public static int getGIndex(List<Integer> list) {
		int gIndex=0;
		for(int i=1;i<list.size();i++) {
			int sum = 0;
			for(int j=1;j<=i;j++) {
				sum += list.get(list.size()-j); 
			}
			if((i*i)==sum) {
				gIndex = i;
				break;
			}
		}
		return gIndex;
	}
}
