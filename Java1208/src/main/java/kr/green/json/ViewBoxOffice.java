package kr.green.json;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

import kr.green.vo.BoxOfficeVO;
import kr.green.vo.BoxOfficeVO.MovieVO;

public class ViewBoxOffice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영화 순위를 보고 싶은 날짜를 입력하세요. 예) 2021 11 01 >> ");
		int yy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		String date = String.format("%04d%02d%02d", yy, mm, dd);
		sc.close();
		
		String addr = "	http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json";
		String key ="?key=f5eef3421c602c6cb7ea224104795888";
		String targetDate = "&targetDt=" + date;
		String urlAddress = addr + key + targetDate;
		
		
		try {
			Gson gson = new Gson();
			URL url = new URL(urlAddress);
			InputStreamReader isr = new InputStreamReader(url.openStream());
			
			BoxOfficeVO vo = gson.fromJson(isr, BoxOfficeVO.class);
			System.out.println(vo.getBoxOfficeResult().getBoxofficeType());
			System.out.println(vo.getBoxOfficeResult().getShowRange());
			for(MovieVO mv : vo.getBoxOfficeResult().getDailyBoxOfficeList()) {
				System.out.println(mv.getRank() + " : " + mv.getMovieNm() + "(" + mv.getOpenDt() + ")");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
