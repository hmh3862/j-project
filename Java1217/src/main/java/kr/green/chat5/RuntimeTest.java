package kr.green.chat5;

import java.io.IOException;
import java.util.Scanner;

// 자바에서 외부프로세스 실행하는 방법
public class RuntimeTest {
	public static void main(String[] args) {
		// 1. JDK 1.4이전
		Runtime runtime = Runtime.getRuntime();
		Process process = null;
		try {
			// 그림판 실행
			// runtime.exec("mspaint.exe"); // 외부 명령어 실행
			
			// 외부 명령어 결과를 자바 프로그램 내부로 가져오기
			// process = runtime.exec("cmd /c dir c:\\"); // 내부 명령어를 실행 : cmd /c 내부명령어
			process = runtime.exec("cmd /c ipconfig"); // 내부 명령어를 실행 : cmd /c 내부명령어
			Scanner sc = new Scanner(process.getInputStream(), "MS949");
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 2. JDK 1.5이상
		try {
			// 외부 명령어 실행
			// new ProcessBuilder("notepad").start();
			
			process = new ProcessBuilder("cmd", "/c", "ipconfig").start();
			Scanner sc = new Scanner(process.getInputStream(), "MS949");
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			
			process = new ProcessBuilder("cmd", "/c", "tree", "/f").start();
			sc = new Scanner(process.getInputStream(), "MS949");
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
