package kr.green.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjectIOEx1 {
	// 객체를 저장하고 읽기
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		String filename = "src/main/resources/object.dat";
		// 출력
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeBoolean(true);
			oos.writeByte(11);
			oos.writeInt(255);
			oos.writeDouble(3.14);
			oos.writeUTF("문자열");
			oos.writeObject(new Date()); // 객체도 저장 가능하다.
			oos.flush();
			System.out.println("저장완료!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(3000); // 프로그램을 일시 정지한다. 1/1000초 단위로 시간 입력
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		// 읽기
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			System.out.println(!ois.readBoolean());
			System.out.println(ois.readByte() * 2);
			System.out.println(ois.readInt() * 2);
			System.out.println(ois.readDouble() * 2);
			System.out.println(ois.readUTF());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println("현재시간 : " + sdf.format(new Date()));
			// 객체 읽기 : 형변환하고 ClassNotFoundException예외처리를 해야 한다.
			Date date = (Date) ois.readObject();
			System.out.println("저장된 시간 : " + sdf.format(date));
			
			
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
