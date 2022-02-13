package kr.green.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="programming_languages")
@Data
public class Languages {
	private List<Language> language;
}
