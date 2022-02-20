package kr.green.howtodoinjava;

import java.time.Duration;

public class Ex14_Java8_Duration2 {
	public static void main(String[] args) {
		Duration ofMinutes = Duration.ofMinutes(1);
		System.out.println(String.format("%s : 1분은 %d초", ofMinutes, ofMinutes.getSeconds()));

		Duration ofHours = Duration.ofHours(1);
		System.out.println(String.format("%s : 1시간은 %d초", ofHours, ofHours.getSeconds()));

		Duration ofDays = Duration.ofDays(1);
		System.out.println(String.format("%s : 1일은 %d초", ofDays, ofDays.getSeconds()));
		
		Duration duration = Duration.parse("PT10H12M30.008S");
		System.out.println(duration);
		System.out.printf("Seconds: %d, Nano Seconds: %d\n", duration.getSeconds(), duration.getNano());
	}
}
