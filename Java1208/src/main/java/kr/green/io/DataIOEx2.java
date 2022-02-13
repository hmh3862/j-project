package kr.green.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOEx2 {
	// 데이터 타입에 맞추어 저장하고 읽기
	public static void main(String[] args) {
		DataOutputStream dos = null;
		
		String filename = "src/main/resources/data2.dat";
		// 출력
		try {
			dos = new DataOutputStream(new FileOutputStream(filename));
			dos.writeInt(0x12345678); // int를 16진수로 저장
			dos.flush();
			System.out.println("저장완료!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { dos.close(); } catch (IOException e) { ; }
		}
		
		// 읽기
		try(DataInputStream dis = new DataInputStream(new FileInputStream(filename))){
			System.out.printf("%X\n", dis.readByte()); // 16진수로 출력해라
			System.out.printf("%X\n", dis.readByte()); 
			System.out.printf("%X\n", dis.readByte()); 
			System.out.printf("%X\n", dis.readByte()); 
			System.out.println("읽기 완료!!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
