package kr.green.vo;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="language")
@Data
public class Language {
	private Name name; // 타입이 객체 타입
	private String category;
	private String developer;
	private Version version; // 타입이 객체 타입
	private Priority priority; // 타입이 객체 타입
}
