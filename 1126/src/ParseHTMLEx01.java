import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseHTMLEx01 {
	public static void main(String[] args) throws IOException {
		String urlAddress = "https://astro.kasi.re.kr/life/pageView/5";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년월을 입력하시오");
		int year = sc.nextInt();
		int month = sc.nextInt();
		sc.close();
		
		// 쿼리 문자열 완성
		String query = String.format("?search_year=%04d&search_month=%02d", year, month);
		
		Document doc = Jsoup.connect(urlAddress + query).get();
		System.out.println(doc.title());
		
		Elements trs = doc.select("table tbody tr");
		// System.out.println(trs.size() + "일 분");
		
		for(Element e : trs) {
			// System.out.println(e.text());
			System.out.println(e.select("td").get(0).text());
			System.out.println(e.select("td").get(1).text());
			System.out.println(e.select("td").get(2).text());
			System.out.println("--------------------------------------------");
		}
		
	}
}
