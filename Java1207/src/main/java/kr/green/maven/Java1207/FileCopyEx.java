package kr.green.maven.Java1207;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원본 파일 이름 입력 : ");
		String srcFile = sc.nextLine();
		System.out.print("저장 파일 이름 입력 : ");
		String destFile = sc.nextLine();
		
		try(FileInputStream fis = new FileInputStream("src/main/resources/" + srcFile);
			FileOutputStream fos = new FileOutputStream("src/main/resources/" + destFile);){
			
			byte[] datas = new byte[1024];
			int n = 0;
			while((n = fis.read(datas))>0) {
				fos.write(datas, 0, n);
				fos.flush();
			}
			System.out.println(srcFile +"을 " + destFile + "로 복사완료!!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		sc.close();
	}
}
