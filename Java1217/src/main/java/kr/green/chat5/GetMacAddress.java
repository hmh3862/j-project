package kr.green.chat5;

import java.io.IOException;
import java.util.Scanner;

// 자바에서 외부프로세스 실행하는 방법
public class GetMacAddress {
	public static void main(String[] args) {
		Process process = null;
		try {
			process = new ProcessBuilder("cmd", "/c", "ipconfig","/all").start();
			Scanner sc = new Scanner(process.getInputStream(), "MS949");
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				// System.out.println(line);
				if(line.trim().startsWith("물리")) {
					System.out.println(line.split(":")[1].trim());
				}
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
