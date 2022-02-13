package kr.green.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import kr.green.vo.DicVO;

public class DicRead {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		Gson gson = new Gson();
		String filename = "src/main/resources/dic.json";
		try {
			// 리스트로 읽기
			List<DicVO> list = gson.fromJson(new FileReader(filename), new TypeToken<List<DicVO>>(){}.getType());
			System.out.println(list.size() + "개 한자 읽음");
			// 10개만 샘플 출력
			for(int i=0;i<100;i++) {
				System.out.println(list.get(i));
			}
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
