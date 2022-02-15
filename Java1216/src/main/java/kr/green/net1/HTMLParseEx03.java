package kr.green.net1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParseEx03 {
	public static void main(String[] args) {
		// 3. URL파싱하기
		try {
			Document document = Jsoup.connect("https://www.naver.com").get();
			System.out.println(document.title());
			
			// 네이버 메인페이지의 모든 이미지 주소를 가져와 보자
			
			 Elements imgs = document.select("img");
			 System.out.println(imgs.size() + "개");
			 for(Element img : imgs ) {
				 System.out.println(img.attr("src"));
			 }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
