package kr.green.vo;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="dailyBoxOffice")
@Data
public class DailyBoxOffice {
	private String rank;
	private String movieNm;
	private String openDt;

}
