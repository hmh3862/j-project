package kr.green.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.green.vo.Person;

public class ObjectIOEx2 {
	// 객체를 저장하고 읽기
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		String filename = "src/main/resources/object2.dat";
		// 출력
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filename));
			// 사용자가 만든 객체를 저장 가능 할까요?
			/*
			 * 직렬화 : 자바 객체를 스트림으로 변환하는 과정
			 * 역직렬화 : 스트림을 자바 객체로 변환하는 과정
			 * 
			 * 사용자가 작성한 클래스가 직렬화/역직렬화를 지원해야만 입출력이 가능하다.
			 */
			oos.writeObject(new Person("한사람", 22, false));
			oos.flush();
			System.out.println("저장완료!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { oos.close(); } catch (IOException e) {;}
		}
		// 읽기
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			Person person = (Person) ois.readObject();
			System.out.println( person );
			System.out.println("읽기 완료!!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
