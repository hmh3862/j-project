package kr.manamana.time;

import java.util.Random;

public class Ex02_CurrentTimeMillis2 {
	public static void main(String[] args) {
		// 경과 시간 계산
		long startTime = System.currentTimeMillis();
        doHardWork(); // 작업 수행
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("경과시간 : " + elapsedTime);
	}
	// 어느 정도 시간을 요하는 작업
	public static void doHardWork() {
		try {
			Thread.sleep(new Random().nextInt(10)*1000); // 0~9초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
