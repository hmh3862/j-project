package kr.green.xml;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import kr.green.vo.ClassVO;
import kr.green.vo.PersonVO;

// Marshalling : 자바객체를 XML로 만드는 과정
// UnMarshalling : XML을 자바 객체로 만드는 과정
public class JAXBEx03 {
	public static void main(String[] args) {
		
		PersonVO vo1 = new PersonVO("한사람", 25, true, new Date());
		PersonVO vo2 = new PersonVO("두사람", 11, true, new Date());
		PersonVO vo3 = new PersonVO("세사람", 22, false, new Date());
		PersonVO vo4 = new PersonVO("네사람", 33, true, new Date());
		
		List<PersonVO> list = Arrays.asList(vo1, vo2, vo3, vo4);
		PersonVO[] personVOs = {vo1,vo2};
		
		ClassVO classVO = new ClassVO();
		classVO.setName("진달래반");
		classVO.setList(list);
		classVO.setPersonVOs(personVOs);
		
		
		try {
			// 1. JAXB 컨텍스트 객체 생성 :  인수로 클래스 타입을 전달
			JAXBContext context = JAXBContext.newInstance(ClassVO.class);
			// 2. Marshaller객체를 만든다.
			Marshaller marshaller = context.createMarshaller();
			// 속성을 지정한다. 선택사항! 여기서는 이쁘게 보여라
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			// 3. 자바 객체를 XML로 만든다.(Marshalling)
			marshaller.marshal(classVO, System.out); // 화면에 출력 해라!!!
			//    파일로 출력!!
			marshaller.marshal(classVO, new File("src/main/resources/classVO.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
