package kr.green.maven.Java1207;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WebPageSourceView {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			URL url = new URL("https://www.naver.com");
			sc = new Scanner(url.openStream());
			
			while(sc.hasNextLine()) { // 다음줄 있니?
				String line = sc.nextLine(); // 1줄 읽기
				System.out.println(line); // 화면에 출력
			}
			System.out.println("읽기완료!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
