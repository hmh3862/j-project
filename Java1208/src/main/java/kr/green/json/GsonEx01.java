package kr.green.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import kr.green.vo.MyVO;

public class GsonEx01 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		// 기본 자료형을 JSON으로 출력해보자
		int i=123;
		String jsonStr = gson.toJson(i); 
		System.out.println(jsonStr);
		
		String str= "안녕";
		jsonStr = gson.toJson(str); 
		System.out.println(jsonStr);

		jsonStr = gson.toJson(3.14); 
		System.out.println(jsonStr);
		
		jsonStr = gson.toJson(true); 
		System.out.println(jsonStr);
		
		// 배열 출력
		String[] names = "한사람,두사람,세사람,네사람,오사람".split(",");
		jsonStr = gson.toJson(names); 
		System.out.println(jsonStr);
		
		// 객체를 출력해보자
		MyVO vo = new MyVO("홍길동", 33);
		jsonStr = gson.toJson(vo); 
		System.out.println(jsonStr);
		
		// 객체를 파일로 저장해보자!!!
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("src/main/resources/data4.json");
			gson.toJson(vo, pw);
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			pw.close();
		}
		
		
		
		
				
				
		

	}
}
