package kr.green.howtodoinjava;

import java.time.Instant;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex11_Java8_Instant4 {
	// Instant와 ZonedDateTime 간 상호 변환하기
	public static void main(String[] args) {
		ZonedDateTime zdtSeoul = Year.of(2018).atMonth(2).atDay(9).atTime(20, 00).atZone(ZoneId.of("Asia/Seoul"));
		System.out.println("Time in Seoul = " + zdtSeoul);

		Instant instant = zdtSeoul.toInstant();
		System.out.println("Instant = " + instant + ", Timestamp = " + instant.getEpochSecond());

		ZonedDateTime zdtVancouver = instant.atZone(ZoneId.of("America/Vancouver"));
		// ZonedDateTime zdtVancouver = ZonedDateTime.ofInstant(instant, ZoneId.of("America/Vancouver")); 와 동일
		System.out.println("Tine in Vancouver = " + zdtVancouver);
	}
}
