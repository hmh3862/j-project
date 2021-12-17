package kr.green.chat5;

import java.io.IOException;

public class JavaRunnerEx {
	public static void main(String[] args) {
		try {
			// 자바에서 외부 프로그램 실행 
			// JDK 1.4까지
			Runtime.getRuntime().exec("mspaint.exe");
			Runtime.getRuntime().exec("notepad.exe");
			Runtime.getRuntime().exec("calc.exe");
			
			// JDK 1.5부터 지원
			new ProcessBuilder("mspaint.exe").start();new ProcessBuilder("notepad").start();
			new ProcessBuilder("notepad.exe").start();
			new ProcessBuilder("calc.exe").start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
