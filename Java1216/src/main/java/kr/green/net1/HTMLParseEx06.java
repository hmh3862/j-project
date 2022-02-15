package kr.green.net1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParseEx06 {
	public static void main(String[] args) {
		// 3. URL파싱하기
		try {
			Document document = 
					Jsoup.connect("http://fleeckr1.blogspot.com/2015/03/1_7.html").get();
			
			// 코난 만화의 이미지 주소를 알아내 보자!!!
			Elements elements = document.select("div#post-body-9062801512531280670 div");
			System.out.println(elements.size() + "개"); 
			for(Element div : elements) {
				Elements elements2 = div.select("a img");
				// System.out.println(elements2.size() + "개");
				if(elements2.size()==1) {
					System.out.println("<img src='" + elements2.get(0).attr("src") + "'/>");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
