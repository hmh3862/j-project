package kr.green.maven.Java1207;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ImageDownloadEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("다운로드 받을 파일의 URL을 입력 : ");
		String srcFile = sc.nextLine();
		
		System.out.print("저장 파일 이름 입력 : ");
		String destFile = sc.nextLine();
		URL url = null;

		try {
			url = new URL(srcFile);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		
		try(InputStream is = url.openStream();
			FileOutputStream fos = new FileOutputStream("src/main/resources/" + destFile);){
			
			byte[] datas = new byte[1024*1024];
			int n = 0;
			while((n = is.read(datas))>0) {
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
