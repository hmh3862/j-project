package kr.green.net1;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Scanner;

public class NetworkEx02 {
	public static void main(String[] args) {
		String address="https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EA%BD%83%EB%B0%B0%EB%8B%AC&oquery=JSP&tqi=hkrSzsprvTossAEFFDhsssssspK-178650";
		// String address="https://sir.kr/guin/4346";
		try {
			URL url = new URL(address);
			
			System.out.println(url.getProtocol()); // 프로토콜(통신규약)을 알아낸다.
			System.out.println(url.getHost()); // 호스트명을 알아낸다.
			System.out.println(url.getPort()); // 열려진 포트번호를 알아낸다.(webServer의 기본포트 80)
											   // port번호가 80이 아니경우는 "호스트이름:포트번호"로 접근	
			System.out.println(url.getPath()); // 서버의 경로를 알려준다.
			System.out.println(url.getFile()); // 파일명을 알려준다.
			System.out.println(url.getQuery()); // 요청정보를 알려준다.
			// url주소는 인코딩되어야 한다. 내용을 보려면 디코딩을 해야 한다.
			System.out.println(URLDecoder.decode(url.getQuery(),"UTF-8") ); // 요청정보를 알려준다.
			
			// 인코딩/디코딩하는 방법
			String name = "한사람";
			String encodeStr = URLEncoder.encode(name,"UTF-8");
			String decodeStr = URLDecoder.decode(encodeStr,"UTF-8");
			System.out.println();
			System.out.println(name + " : " + encodeStr + " : " + decodeStr);

			// 요청 정보를 분석해 보자
			String queryStr[] = URLDecoder.decode(url.getQuery(),"UTF-8").split("&");
			for(String query : queryStr) {
				System.out.println(Arrays.toString(query.split("=")));
			}
			
			URL url2 = new URL("https","www.naver.com",8080,"/board/list.jsp?idx=123");
			System.out.println(url2.toString());
			
			// 웹페이지 소스를 얻어보자1
			URL url3 = new URL("https://sir.kr/guin/4346");
			Scanner sc = new Scanner(url3.openStream(), "UTF-8"); // URL객체의 openStream을 이용하여 스트림을 만들어 읽기!!!
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
			sc.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
