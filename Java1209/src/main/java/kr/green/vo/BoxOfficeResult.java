package kr.green.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="boxOfficeResult")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class BoxOfficeResult {
	@XmlElement
	private String boxofficeType;
	
	@XmlElement
	private String showRange;
	
	@XmlElementWrapper(name="dailyBoxOfficeList")
	@XmlElement(name="dailyBoxOffice")
	private List<DailyBoxOffice> list;
	
}
