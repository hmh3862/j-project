package kr.green.ex01;

public class MyUtil {
	public static int KB = 1024;
	
	public static void getKB2Byte(int kb) {
		System.out.println(kb + "KB는 " + (kb*KB) + "Byte입니다.");
	}
}
