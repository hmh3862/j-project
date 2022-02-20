package kr.green.howtodoinjava;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ex15_Java8_Duration3 {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		Duration duration = Duration.ofMinutes(1);
		System.out.println(localDateTime);
		System.out.println(duration);
		
		localDateTime = localDateTime.minus(duration);
		System.out.println(localDateTime);

		localDateTime = localDateTime.plus(duration);
		System.out.println(localDateTime);
		
		Duration duration2 = Duration.ofDays(1);
		Duration duration3 = Duration.ofHours(2);
		Duration duration4 = Duration.ofMinutes(3);
		Duration duration5 = Duration.ofSeconds(4);
		duration = duration.plus(duration2);
		duration = duration.plus(duration3);
		duration = duration.plus(duration4);
		duration = duration.plus(duration5);
		System.out.println(duration);
		
		localDateTime = localDateTime.plus(duration);
		System.out.println(localDateTime);
	}
}
