package kr.green.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.green.vo.SomeVO;

public class ObjectIOEx3 {
	// 객체를 저장하고 읽기
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ObjectOutputStream oos = null;
		
		String filename = "src/main/resources/object3.dat";
		/*
		// 출력
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(new SomeVO("안녕하세요", 123456));
			oos.flush();
			System.out.println("저장완료!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { oos.close(); } catch (IOException e) {;}
		}
		*/
		// 읽기
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			SomeVO someVO = (SomeVO) ois.readObject();
			System.out.println( someVO );
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
