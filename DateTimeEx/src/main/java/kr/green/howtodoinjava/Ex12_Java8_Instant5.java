package kr.green.howtodoinjava;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Ex12_Java8_Instant5 {
	// 그 밖에 유용한 메소드들
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println("현재 : " + instant);
		System.out.println("100초 후 : " + instant.plusSeconds(100));
		System.out.println("100초 전 : " + instant.minusSeconds(100));
		
		System.out.println("4분 후 : " + instant.plus(Duration.ofMinutes(4)));
		System.out.println("4분 전 : " + instant.minus(Duration.ofMinutes(4)));
		
		System.out.println("10일 후 : " + instant.plus(10, ChronoUnit.DAYS));
		System.out.println("10일 전 : " + instant.minus(10,ChronoUnit.DAYS));
		System.out.println();
		
		Instant instant2 = Instant.parse("2021-10-18T03:45:09.652967800Z");
		System.out.println("instant : " + instant);
		System.out.println("instant2 : " + instant2);
		System.out.println(instant.isBefore(instant2));
		System.out.println(instant.isAfter(instant2));
		
	}
}
