package kr.green.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import kr.green.vo.Language;
import kr.green.vo.Languages;

// Marshalling : 자바객체를 XML로 만드는 과정
// UnMarshalling : XML을 자바 객체로 만드는 과정
public class JAXBEx04 {
	public static void main(String[] args) {
		
		try {
			// 1. JAXB 컨텍스트 객체 생성 :  인수로 클래스 타입을 전달
			JAXBContext context = JAXBContext.newInstance(Languages.class);
			// 2. Unmarshaller 객체를 만든다.
			Unmarshaller unmarshaller = context.createUnmarshaller();
			// 3. XML 파일로부터 읽어서 자바 객체를 만든다. 
			Languages vo = (Languages) unmarshaller.unmarshal(new File("src/main/resources/language.xml"));
			
			for(Language language : vo.getLanguage()) {
				System.out.println(language.getName().getName() + " : " + language.getDeveloper()
				 + " : " + language.getCategory() + "(" + language.getVersion().getVersion() + ")");
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
