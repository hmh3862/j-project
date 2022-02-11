package kr.green.maven.Java1207;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropEx02 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		
		FileReader reader = null;
		FileInputStream fis = null;
		try {
			reader = new FileReader("db.properties");
			properties.load(reader); // 프로퍼티파일 읽기
			
			System.out.println("사용자 아이디 : " + properties.getProperty("userid"));
			System.out.println("사용자 이름 : " + properties.getProperty("username"));
			System.out.println("사용자 비밀번호 : " + properties.getProperty("password"));
			System.out.println("사용 데이터베이스 : " + properties.getProperty("db"));
			System.out.println();
			
			fis = new FileInputStream("db.xml");
			properties.loadFromXML(fis); // xml파일 읽기
			
			System.out.println("사용자 아이디 : " + properties.getProperty("userid"));
			System.out.println("사용자 이름 : " + properties.getProperty("username"));
			System.out.println("사용자 비밀번호 : " + properties.getProperty("password"));
			System.out.println("사용 데이터베이스 : " + properties.getProperty("db"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}	
