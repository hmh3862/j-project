package kr.green.vo;

import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"name","list","personVOs"})
public class ClassVO {
	private String name;
	private List<PersonVO> list;
	private PersonVO[] personVOs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElementWrapper(name="list") // 여러개의 항목 전체를 지정한 태그로 감싸준다.
	@XmlElement(name="PersonVO")
	public List<PersonVO> getList() {
		return list;
	}
	public void setList(List<PersonVO> list) {
		this.list = list;
	}
	@XmlElementWrapper(name="arrays")
	@XmlElement(name="PersonVO")
	public PersonVO[] getPersonVOs() {
		return personVOs;
	}
	public void setPersonVOs(PersonVO[] personVOs) {
		this.personVOs = personVOs;
	}
	@Override
	public String toString() {
		return "ClassVO [name=" + name + ", list=" + list + ", personVOs=" + Arrays.toString(personVOs) + "]";
	}
}
