package kr.green.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import kr.green.vo.HanjaVO;

public class HanjaRead {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		Gson gson = new Gson();
		String filename = "src/main/resources/hanja.json";
		
		try {
			// 배열로 읽기
			HanjaVO[] hanjaArray = gson.fromJson(new FileReader(filename), HanjaVO[].class);
			System.out.println(hanjaArray.length + "개 사자성어 읽음");
			// 10개만 샘플 출력
			for(int i=0;i<10;i++) {
				System.out.println(hanjaArray[i]);
			}
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		try {
			// 리스트로 읽기
			List<HanjaVO> list = gson.fromJson(new FileReader(filename), new TypeToken<List<HanjaVO>>(){}.getType());
			System.out.println(list.size() + "개 사자성어 읽음");
			// 10개만 샘플 출력
			for(int i=0;i<10;i++) {
				System.out.println(list.get(i));
			}
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
