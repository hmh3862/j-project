package kr.green.xml;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import kr.green.vo.Covid19Item;
import kr.green.vo.Covid19Response;

public class ApiExplorer2 {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=Z4uCridIALZt7Mtx3%2Fp2iKR3FCCLa1kLaCW2pLceTr%2F41ibB6PO3BZt4vfFJHLRrj7v0ACBEwptVEJV9bny1iA%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("startCreateDt","UTF-8") + "=" + URLEncoder.encode("20211201", "UTF-8")); /*검색할 생성일 범위의 시작*/
        urlBuilder.append("&" + URLEncoder.encode("endCreateDt","UTF-8") + "=" + URLEncoder.encode("20211209", "UTF-8")); /*검색할 생성일 범위의 종료*/
        URL url = new URL(urlBuilder.toString());
        
        try {
			JAXBContext context = JAXBContext.newInstance(Covid19Response.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Covid19Response response = (Covid19Response) unmarshaller.unmarshal(url.openStream());
			
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