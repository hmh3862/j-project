package kr.green.json;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import kr.green.vo.MovieListVO;

public class ViewMovieList {
	public static void main(String[] args) {
		String addr = "	http://kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.json";
		String key = "?key=f5eef3421c602c6cb7ea224104795888";
		String urlAddress = addr + key;
		
		
		try {
			Gson gson = new Gson();
			URL url = new URL(urlAddress);
			InputStreamReader isr = new InputStreamReader(url.openStream());
			
			MovieListVO movieListVO = gson.fromJson(isr, MovieListVO.class);
			
			System.out.println("영화목록 : " + movieListVO.getMovieListResult().getTotCnt() + "개");
			
			int totalPage = (movieListVO.getMovieListResult().getTotCnt()-1)/100 + 1;
			
			List<MovieListVO.Movie> movieList = new ArrayList<>();
			for(int i=1;i<=totalPage;i++) {
				urlAddress = addr + key + "&curPage=" + i + "&itemPerPage=100";
				
				url = new URL(urlAddress);
				isr = new InputStreamReader(url.openStream());
				
				MovieListVO vo = gson.fromJson(isr, MovieListVO.class);
				movieList.addAll(vo.getMovieListResult().getMovieList());
				System.out.println(i*100 + "개 읽음");
			}
			System.out.println("전체 영화 : " + movieList.size() + "편");
			
			PrintWriter pw = new PrintWriter("src/main/resources/movieList.json");
			gson.toJson(movieList, pw);
			pw.flush();
			pw.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
