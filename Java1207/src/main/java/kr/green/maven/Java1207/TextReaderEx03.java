package kr.green.maven.Java1207;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// java.nio패키지의 사용 : JDK 1.7에 추가
public class TextReaderEx03 {
	public static void main(String[] args) {
		String fileName = "src/main/resources/song_utf8.txt";
		
		try {
			// 텍스트 파일을 리스트로 읽기
			List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			System.out.println(lines.size() + "줄");
			for(String line : lines) System.out.println(line);
			
			
			System.out.println("--------------------------------------------------------------------------");
			
			// JDK1.8에 추가된 스트림 기능 사용
			Files.lines(Paths.get(fileName)).forEachOrdered(System.out::println);
			System.out.println("--------------------------------------------------------------------------");
			
			// 파일 전체를 String으로 읽는다.
			String song = Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);
			System.out.println(song);
			System.out.println("--------------------------------------------------------------------------");
			
			// 파일 전체를 바이트 배열로 읽기
			byte[] bytes = Files.readAllBytes(Paths.get(fileName));
			System.out.println(new String(bytes)); // 바이트 배열을 String으로 변환해서 출력
			System.out.println("--------------------------------------------------------------------------");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
