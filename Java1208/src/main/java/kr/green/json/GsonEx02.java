package kr.green.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import kr.green.vo.MyVO;

public class GsonEx02 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		// String에서 읽기 -- 기본타입으로
		@SuppressWarnings("unused")
		int i = gson.fromJson("123", int.class);
		@SuppressWarnings("unused")
		double d = gson.fromJson("3.141592", double.class);
		@SuppressWarnings("unused")
		String str = gson.fromJson("하하하하", String.class);
		
		// 배열로 읽기
		int[] ar = gson.fromJson("[11,22,33,44,55,66]", int[].class);
		System.out.println(Arrays.toString(ar));
		
		String[] names = gson.fromJson("[\"한사람\",\"두사람\",\"세사람\",\"네사람\",\"오사람\"]", String[].class);
		System.out.println(Arrays.toString(names));
		
		// 파일에서 읽기
		try(FileReader fr = new FileReader("src/main/resources/data2.json")){
			MyVO myVO = gson.fromJson(fr, MyVO.class); 
			System.out.println("출력 : " + myVO);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Json객체 만들기 : 1회용이면 굳이 VO를 만들지 않고 가능
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "한사람");
		jsonObject.addProperty("age", 33);
		jsonObject.addProperty("gender", false);
		
		System.out.println(gson.toJson(jsonObject));
	}
}
