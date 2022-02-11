package kr.green.maven.Java1207;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ConanDownload {
	public static void main(String[] args) {
		String urlAddress = "https://comic-kingdom.tumblr.com/post/110080111518/%EB%AA%85%ED%83%90%EC%A0%95-%EC%BD%94%EB%82%9C-2%EA%B6%8C";
		
		try {
			Document document = Jsoup.connect(urlAddress).get();
			
			Elements elements = document.select("div.detail-body img");
			System.out.println(elements.size() + "장!!");
			int count = 0;
			byte[] data = new byte[10000];
			for(Element element : elements) {
				// System.out.println(e.attr("data-original"));
				InputStream is = new URL(element.attr("data-original")).openStream();
				
				// 폴더를 자동으로 만들자
				File file = new File("conan2"); // 파일 객체 생성
				if(!file.exists()) { // 파일이 없다면
					file.mkdirs(); // 폴더를 만들어라
				}
				
				FileOutputStream fos = new FileOutputStream("conan2/" + String.format("%03d.jpg", ++count));
				int n = 0;
				while((n=is.read(data))>0) {
					fos.write(data, 0, n);
					fos.flush();
				}
				is.close();
				fos.close();
				System.out.println(count + "번째 그림 저장 완료");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
