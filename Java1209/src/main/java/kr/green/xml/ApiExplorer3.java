package kr.green.xml;
import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import kr.green.vo.Covid19Item;
import kr.green.vo.Covid19Response;

public class ApiExplorer3 {
    public static void main(String[] args) throws IOException {
         try {
			JAXBContext context = JAXBContext.newInstance(Covid19Response.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Covid19Response response = (Covid19Response) unmarshaller.unmarshal(new File("src/main/resources/data.xml"));
			
			for(Covid19Item item : response.getBody().getItem()) {
				System.out.println("날짜 : " + item.getCreateDt());
				System.out.println("검사횟수 : " + item.getAccExamCnt());
				System.out.println("확진자수 : " + item.getDecideCnt());
				System.out.println("사망자수 : " + item.getDeathCnt());
				System.out.println("-----------------------------------");
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
    }
}