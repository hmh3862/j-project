package kr.green.maven.Java1207;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// 텍스트 파일 읽기 2 : Scanner객체 사용
public class TextReaderEx02 {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter pw = null;
		try {
			sc = new Scanner(new File("src/main/resources/song.txt"),"MS949");
			pw = new PrintWriter("src/main/resources/song_utf8.txt");
			
			while(sc.hasNextLine()) { // 다음줄 있니?
				String line = sc.nextLine(); // 1줄 읽기
				System.out.println(line); // 화면에 출력
				pw.write(line + "\n"); // 파일로 저장
				pw.flush();
			}
			System.out.println("복사완료!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
			pw.close();
		}
	}
}
