package kr.green.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.green.vo.MyVO;

// Jackson라이브러리를 사용하기 위해서는 pom.xml에 의존성을 추가해야 한다.
/*
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.11.2</version>
		</dependency>
 */
public class JacksonEx02 {
	public static void main(String[] args) {
		
		// JSON형태의 자료를 Java객체로 읽는 방법
		ObjectMapper mapper = new ObjectMapper();
		
		MyVO value = null;
		try {
			// 1. 파일에서 읽기 : mapper.readValue(파일객체, 읽을 클래스 타입)
			value = mapper.readValue(new File("src/main/resources/data.json"), MyVO.class);
			System.out.println(value);
			// 2. URL 에서 읽기
			// value = mapper.readValue(new URL("http://some.com/api/entry.json"), MyVO.class);
			
			// 3. String에서 읽기
			value = mapper.readValue("{\"name\":\"Bob\", \"age\":13}", MyVO.class);
			System.out.println(value);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
