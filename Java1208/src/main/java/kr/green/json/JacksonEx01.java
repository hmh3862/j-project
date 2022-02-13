package kr.green.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class JacksonEx01 {
	public static void main(String[] args) {
		
		// Java객체를 JSON형태의 문자열로 만드는 방법
		ObjectMapper mapper = new ObjectMapper();
		
		MyVO vo1 = new MyVO("두사람", 45);
		
		try {
			// 1. String으로 만들기
			String jsonStr = mapper.writeValueAsString(vo1);
			System.out.println(jsonStr);
			
			// 2. 파일로 저장
			mapper.writeValue(new File("src/main/resources/data2.json"), vo1);
			
			// 3. 바이트 배열로 저장
			byte[] data = mapper.writeValueAsBytes(vo1);
			System.out.println(new String(data));
			
			
			// 4. 리스트를 자장하면 어떻게 될까요?
			List<MyVO> list = new ArrayList<>();
			list.add(vo1);
			list.add(new MyVO("나그네", 21));
			list.add(new MyVO("지나는이", 32));
			
			jsonStr = mapper.writeValueAsString(list);
			System.out.println(jsonStr);
			
			mapper.writeValue(new File("src/main/resources/data3.json"), list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
