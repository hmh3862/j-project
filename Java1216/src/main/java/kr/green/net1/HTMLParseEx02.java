package kr.green.net1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTMLParseEx02 {
	public static void main(String[] args) {
		// 2. body안의 HTML 문자열 파싱하기
		String html =  "<p align='center'>Parsed <b>HTML</b> into a doc.</p>";
		Document doc = Jsoup.parseBodyFragment(html); // 파싱해서 문서 객체로 만든다.
		System.out.println(doc.body());
		System.out.println(doc.body().select("b").get(0).text());
	}
}
