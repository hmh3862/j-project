package kr.green.vo;

import java.util.List;

import lombok.Data;

/*
{
	movieListResult: {
		totCnt: 85363,
		source: "영화진흥위원회",
		movieList: [
			{
				movieCd: "20211685",
				movieNm: "영화는 이미 완성되었다",
				movieNmEn: "",
				prdtYear: "2021",
				openDt: "",
				typeNm: "단편",
				prdtStatNm: "기타",
				nationAlt: "한국",
				genreAlt: "코미디",
				repNationNm: "한국",
				repGenreNm: "코미디",
				directors: [
					{ peopleNm: "이정하" }
				],
				companys: [
					{
						companyCd: "20111289",
						companyNm: "(주)엠픽처스",
					}
				]
			}
		]
	}
}
*/
@Data
public class MovieListVO {
	private MovieList  movieListResult;
	@Data
	public class MovieList{
		private int totCnt;
		private String source;
		private List<Movie> movieList;
	}
	@Data
	public class Movie{
		private String movieCd;
		private String movieNm;
		private String movieNmEn;
		private String prdtYear;
		private String openDt;
		private String typeNm;
		private String prdtStatNm;
		private String nationAlt;
		private String genreAlt;
		private String repNationNm;
		private String repGenreNm;
		private List<Director> directors;
		private List<Company> companys;
	}
	@Data
	public class Director{
		private String peopleNm;
	}
	@Data
	public class Company{
		private String companyCd;
		private String companyNm;
	}
}
