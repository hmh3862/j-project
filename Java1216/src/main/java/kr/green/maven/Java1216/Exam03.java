package kr.green.maven.Java1216;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
가성비 최대화
기계를 구입하려 하는데 이 기계는 추가 부품을 장착할 수 있다. 
추가 부품은 종류당 하나씩만 장착 가능하고, 모든 추가 부품은 동일한 가격을 가진다.
원래 기계의 가격과 성능, 추가 부품의 가격과 각 부품의 성능이 주어졌을 때, 
추가 부품을 장착하여 얻을 수 있는 최대 가성비를 정수 부분까지 구하시오
(가격 및 성능은 상대적인 값으로 수치화되어 주어진다).

e.g.)
원래 기계의 가격 : 10
원래 기계의 성능 : 150
추가 부품의 가격 : 3
추가 부품의 성능 : 각각 30, 70, 15, 40, 65
추가 부품을 장착하여 얻을 수 있는 최대 가성비 : 17.81... → 17
(성능이 70과 65인 부품을 장착하면 됨)
*/
public class Exam03 {
	public static void main(String[] args) {
		System.out.println(costPerformance(10, 150, 3, new int[] {30, 70, 15, 40, 65}));
	}
	@Test
	public void test() {
		assertEquals(costPerformance(10, 150, 3, new int[] {30, 70, 15, 40, 65}), 17,0);
	}
	public static int costPerformance(int price, int performance, int priceP, int[] performanceP) {
		int totalPrice = price;
		int totalPerformance = performance;
		for(int i=0;i<performanceP.length;i++) {
			// 기계의 가성비보다 적으면 않되므로 가성비가 높은것만 더한다.
			if(performanceP[i] > (performance/price)*priceP) {
				totalPrice += priceP;
				totalPerformance += performanceP[i];
				// System.out.println(performanceP[i]);
			}
		}
		return totalPerformance/totalPrice; // 총성능/총가격 = 최대 가성비
	}
}
