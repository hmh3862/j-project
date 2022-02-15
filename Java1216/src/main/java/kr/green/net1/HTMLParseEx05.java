package kr.green.net1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParseEx05 {
	public static void main(String[] args) {
		// 3. URL파싱하기
		try {
			Document document = Jsoup.connect("https://comic-kingdom.tumblr.com/post/108528304898/%EB%AA%85%ED%83%90%EC%A0%95-%EC%BD%94%EB%82%9C-3%EA%B6%8C").get();
			
			// 코난 만화의 이미지 주소를 알아내 보자!!!
			Elements elements = document.select("div.detail-body img");
			System.out.println(elements.size() + "개"); 
			for(Element img : elements) {
				System.out.println(img.attr("data-original"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
