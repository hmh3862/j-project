package kr.green.maven.Java1207;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class PropEx01 {
	public static void main(String[] args) {
		// Hashtable<Object,Object>를 상속받아 만든 맵
		// 자바프로그램 환경설정 파일로 많이 이용됩니다.
		Properties properties = new Properties();
		
		properties.put("userid", "top2blue");
		properties.put("username", "최고관리자");
		properties.put("password", "123456");
		properties.put("db", "oracle");
		
		System.out.println("사용자 아이디 : " + properties.getProperty("userid"));
		System.out.println("사용자 이름 : " + properties.getProperty("username"));
		System.out.println("사용자 비밀번호 : " + properties.getProperty("password"));
		System.out.println("사용 데이터베이스 : " + properties.getProperty("db"));
		
		PrintWriter pw = null;
		FileOutputStream fos = null;
		try {
			pw = new PrintWriter("src/main/resources/db.properties");
			properties.store(pw, "데이터베이스 설정 파일"); // 프로퍼티 파일로 저장
			
			fos = new FileOutputStream("src/main/resources/db.xml");
			properties.storeToXML(fos, "데이터베이스 설정 파일"); // XML파일로 저장
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
