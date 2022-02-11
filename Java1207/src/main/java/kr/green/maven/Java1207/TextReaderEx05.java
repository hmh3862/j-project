package kr.green.maven.Java1207;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

// google guava라이브러리 사용하기
// pom.xml에 의존성 추가해야 한다.
/*
		<dependency>
			<groupId>com.google.guava</groupId>
			<artifactId>guava</artifactId>
			<version>31.0.1-jre</version>
		</dependency>
 */
public class TextReaderEx05 {
	public static void main(String[] args) {
		String fileName = "src/main/resources/song_utf8.txt";
		
		try {
			List<String> lines = Files.readLines(new File(fileName), Charsets.UTF_8);
			for(String line : lines) {
				System.out.println(line);
			}
			System.out.println("------------------------------");
			String data = Files.asCharSource(new File(fileName), Charsets.UTF_8).read();
			System.out.println(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
