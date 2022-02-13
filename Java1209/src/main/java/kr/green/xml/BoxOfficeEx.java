package kr.green.xml;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import kr.green.vo.BoxOfficeResult;
import kr.green.vo.DailyBoxOffice;

public class BoxOfficeEx {
	// 영화 순위를 뉴스를 읽어보자!!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영화 순위를 보고 싶은 날짜를 입력하세요. 예) 2021 11 01 >> ");
		int yy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		String date = String.format("%04d%02d%02d", yy, mm, dd);
		sc.close();
		
		String addr = "	http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml";
		String key ="?key=f5eef3421c602c6cb7ea224104795888";
		String targetDate = "&targetDt=" + date;
		String urlAddress = addr + key + targetDate;
		
		try {
			// 1. JAXB 컨텍스트 객체 생성 :  인수로 클래스 타입을 전달
			JAXBContext context = JAXBContext.newInstance(BoxOfficeResult.class);
			// 2. Unmarshaller 객체를 만든다.
			Unmarshaller unmarshaller = context.createUnmarshaller();
			// 3. URL로부터 읽어서 자바 객체를 만든다.
			URL url = new URL(urlAddress);
			BoxOfficeResult result = (BoxOfficeResult) unmarshaller.unmarshal(url.openStream());
			
			System.out.println(result.getBoxofficeType());
			System.out.println(result.getShowRange());
			for(DailyBoxOffice vo : result.getList()) {
				System.out.println(vo.getRank() + " : " + vo.getMovieNm() + "(" + vo.getOpenDt() + ")");
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
