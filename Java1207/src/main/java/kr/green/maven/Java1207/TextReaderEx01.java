package kr.green.maven.Java1207;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReaderEx01 {
	public static void main(String[] args) {
		// 1. 참조 변수 준비 
		FileReader fr = null;
		try {
			// 2. 열기
			fr = new FileReader("src/main/resources/chunja.txt");
			// 3. 사용
			int n = 0;
			while((n=fr.read())>0) { // 1글자씩 읽기
				System.out.print((char)n);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4. 닫기
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// JDK 1.6부터는 자동 닫기 지원
		try(FileReader fr2 = new FileReader("src/main/resources/chunja2.txt")){ // try(열기)를 하면 자동 닫기가 된다.
			char[] data = new char[2048];
			int n = 0;
			// 한번에 여러글자읽기 여기서는 2048글자씩 읽는다. 읽은 글자수를 리턴해준다.
			while((n=fr2.read(data))>0) { // read()메서드는 파일의 끝에 도달하면 -1을 리턴한다.
				System.out.println(new String(data, 0, n));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
