package kr.green.vo;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="item")
@Data
public class NewsItem {
	private String title;
	private String link;
}
