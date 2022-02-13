package kr.green.xml;

import java.io.IOException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import kr.green.vo.NewsItem;
import kr.green.vo.NewsRss;

public class HYNewsEx {
	// 한경닷컴 뉴스를 읽어보자!!!
	public static void main(String[] args) {
		// String urlAddress="https://rss.hankyung.com/feed/headline.xml";
		// String urlAddress="https://rss.hankyung.com/feed/land.xml";
		String urlAddress="http://rss.ohmynews.com/rss/society.xml";
		
		try {
			// 1. JAXB 컨텍스트 객체 생성 :  인수로 클래스 타입을 전달
			JAXBContext context = JAXBContext.newInstance(NewsRss.class);
			// 2. Unmarshaller 객체를 만든다.
			Unmarshaller unmarshaller = context.createUnmarshaller();
			// 3. URL로부터 읽어서 자바 객체를 만든다.
			URL url = new URL(urlAddress);
			NewsRss rss = (NewsRss) unmarshaller.unmarshal(url.openStream());
			
			System.out.println(rss.getChannel().getTitle() + "(" + rss.getChannel().getLink() + ")");
			
			for(NewsItem item : rss.getChannel().getItem()) {
				System.out.println(item.getTitle());
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
