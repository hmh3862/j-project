package kr.green.vo;
/*
<body>
		<items>
			<item></item>
			<item></item>
			<item></item>
			<item></item>
		</items>
</body>
 */

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Covid19Body {
	@XmlElementWrapper(name="items")
	@XmlElement(name="item")
	private List<Covid19Item> item;
}
