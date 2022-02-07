import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ConanEx {
	public static void main(String[] args) throws IOException {
		String address="https://comic-kingdom.tumblr.com/post/110080111518/%EB%AA%85%ED%83%90%EC%A0%95-%EC%BD%94%EB%82%9C-2%EA%B6%8C";

		Document doc = Jsoup.connect(address).get();
		System.out.println(doc.title());
		
		Elements elements = doc.select("div.detail-body img");
		System.out.println(elements.size() + "장");
		int i=0;
		for(Element e : elements) {
			System.out.println(e.attr("data-original"));
			FileOutputStream fos = new FileOutputStream(String.format("conan2/%03d.jpg", ++i));
			URL url = new URL(e.attr("data-original"));
			InputStream is = url.openStream();
			
			byte[] data = new byte[4096];
			int n = 0;
			while((n=is.read(data))>0) {
				fos.write(data, 0, n);
				fos.flush();
			}
			is.close();
			fos.close();
		}
	}
}
