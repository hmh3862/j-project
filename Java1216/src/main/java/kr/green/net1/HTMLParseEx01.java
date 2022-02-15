package kr.green.net1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParseEx01 {
	public static void main(String[] args) {
		// 1. 문자열 파싱하기
		String html = "<html><head><title>First parse</title></head>"
				  + "<body><p align='center'>Parsed <b>HTML</b> into a doc.</p></body></html>";
		Document doc = Jsoup.parse(html); // 파싱해서 문서 객체로 만든다.
		
		System.out.println("제목 : " + doc.title()); // title태그의 내용을 가져온다.
		
		Elements ps = doc.select("p"); // 모든 p 태그를 얻어온다.
		System.out.println("p태그 갯수 : " + ps.size() + "개");
		
		for(Element e : ps) {
			System.out.println(e.html()); // p태그안의 모든 내용을 태그로 읽기
			System.out.println(e.text()); // p태그안의 글자만 읽기
			System.out.println(e.attr("align")); // p태그의 align속성값 읽기
		}
	}
}
