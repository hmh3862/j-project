package kr.green.maven.Java1207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

// InputStreamReader를 이용한 텍스트 파일 읽기
public class TextReaderEx04 {
	public static void main(String[] args) {
		String fileName = "src/main/resources/song_utf8.txt";
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8);
			br = new BufferedReader(isr);
			String line = "";
			while((line = br.readLine())!=null)
				System.out.println(line);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
