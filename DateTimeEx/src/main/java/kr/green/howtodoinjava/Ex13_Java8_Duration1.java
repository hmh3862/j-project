package kr.green.howtodoinjava;

import java.time.Duration;
import java.time.LocalTime;

public class Ex13_Java8_Duration1 {
	public static void main(String[] args) {
		LocalTime startTime = LocalTime.of(10, 35, 40);
		LocalTime endTime = LocalTime.of(10, 36, 50, 800);
		System.out.println(startTime);
		System.out.println(endTime);
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println(duration);
		System.out.println("Seconds: " + duration.getSeconds());
		System.out.println("Nano Seconds: " + duration.getNano());
	}
}
