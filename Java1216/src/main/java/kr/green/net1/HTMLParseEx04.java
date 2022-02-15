package kr.green.net1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParseEx04 {
	public static void main(String[] args) {
		// 3. URL파싱하기
		try {
			Document document = Jsoup.connect("https://astro.kasi.re.kr/life/pageView/5").get();
			System.out.println(document.title());
			
			// 음양력 대조표에서 음양력 데이터만 읽다
			
			 Elements trs = document.select("table tbody tr");
			 System.out.println(trs.size() + "개");
			 for(Element tr : trs ) {
				 // System.out.println(tr.text());
				 Elements tds = tr.select("td");
				 if(tds.size()>0) {
					 for(int i=0;i<tds.size();i++) {
						 Element td = tds.get(i);
						 if(i==0) {
							 System.out.println("양력 : " + td.text());
						 }else if(i==1) {
							 System.out.println("음력 : " + td.text());
						 }else if(i==2) {
							 System.out.println("간지 : " + td.text());
						 }
					 }
					 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 }
			 }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
