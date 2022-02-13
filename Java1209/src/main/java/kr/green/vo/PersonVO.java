package kr.green.vo;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="사람") // name속성으로 루트 태그의 이름을 변경 가능하다.
// @XmlAccessorType(XmlAccessType.FIELD) // 태그 지정을 필드에다 사용하겠다.
@XmlType(propOrder = {"name","age","gender","register"}) // 태그 순서를 지정한다.
public class PersonVO {
	private String name;
	private int age;
	private Boolean gender;
	private Date  register;
	
	
	public PersonVO() {
		
	}
	
	public PersonVO(String name, int age, Boolean gender, Date register) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.register = register;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@XmlElement
	@XmlJavaTypeAdapter(GenderAdapter.class)
	public Boolean isGender() {
		return gender;
	}
	
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	@XmlElement
	@XmlJavaTypeAdapter(RegisterAdapter.class) // XML데이터를 읽기/저장 시 형변환에 사용할 어뎁터 지정
	public Date getRegister() {
		return register;
	}
	public void setRegister(Date register) {
		this.register = register;
	}
	
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", age=" + age + ", gender=" + gender + ", register=" + register + "]";
	} 
}
