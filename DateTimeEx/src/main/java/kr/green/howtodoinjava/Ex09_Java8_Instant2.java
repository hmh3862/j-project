package kr.green.howtodoinjava;

import java.time.Instant;

/*
Instant class

UTC 기준시인 1970년 1월 1일 0시 0분 0초에 해당하는 Instant 객체는 Instant.EPOCH라는 정적 필드에 저장되어 있습니다. 
그리고 Instant.ofEpochSecond() 정적 메소드를 통해서 타임스탬프를 나타내는 Instant 객체를 만들 수 있습니다. 
*/
public class Ex09_Java8_Instant2 {
	public static void main(String[] args) {
		Instant instant1 = Instant.EPOCH;
		Instant instant2 = Instant.ofEpochSecond(0);
		Instant instant3 = Instant.MIN;
		Instant instant4 = Instant.MAX;
		Instant instant5 = Instant.now();
		Instant instant6 = Instant.ofEpochMilli(System.currentTimeMillis());
		Instant instant7 = Instant.ofEpochSecond(System.currentTimeMillis()/1000);
		Instant instant8 = Instant.ofEpochSecond(16_0000_0000L);
		Instant instant9 = Instant.ofEpochSecond(-16_0000_0000L);
		
		System.out.println(instant1);
		System.out.println(instant2);
		System.out.println(instant3);
		System.out.println(instant4);
		System.out.println(instant5);
		System.out.println(instant6);
		System.out.println(instant7);
		// 타임스탬프 값은 사람이 눈으로만 봤을 때는 계산기 없이는 바로 시간을 파악하기가 어렵기 때문에 
		// Instant 객체로 변환해서 다루면 편리합니다.		
		System.out.println(instant8);
		System.out.println(instant9);
		
	}
}
