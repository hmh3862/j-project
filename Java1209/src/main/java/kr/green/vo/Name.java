package kr.green.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.Data;

@XmlRootElement(name="name")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Name {
	@XmlAttribute
	private String korean;
	@XmlValue
	private String name;

}
