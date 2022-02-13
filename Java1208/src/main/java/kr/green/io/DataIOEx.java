package kr.green.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOEx {
	// 데이터 타입에 맞추어 저장하고 읽기
	public static void main(String[] args) {
		DataOutputStream dos = null;
		
		String filename = "src/main/resources/data.dat";
		// 출력
		try {
			dos = new DataOutputStream(new FileOutputStream(filename));
			dos.writeBoolean(true);
			dos.writeByte(11);
			dos.writeInt(255);
			dos.writeDouble(3.14);
			dos.writeUTF("문자열");
			dos.flush();
			System.out.println("저장완료!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 읽기
		try(DataInputStream dis = new DataInputStream(new FileInputStream(filename))){
			System.out.println(!dis.readBoolean());
			System.out.println(dis.readByte() * 2);
			System.out.println(dis.readInt() * 2);
			System.out.println(dis.readDouble() * 2);
			System.out.println(dis.readUTF());
			System.out.println("읽기 완료!!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
