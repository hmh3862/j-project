package kr.green.maven.Java1208;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File file = new File("");
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		System.out.println("Path 구분자 : " + File.pathSeparator);
		System.out.println("경로 구분자 : " + File.separator);
		
		File file2 = new File("conan/001/001");
		System.out.println(file2.exists() ? "있다" : "없다");
		if(!file.exists()) {
			file2.mkdirs();
		}
		
		File file3 = new File("src/main/resources/time.txt");
		System.out.println("파일 크기 : " + file3.length() + "Byte");
		
		// 환경변수값
		System.out.println("user.dir : " + System.getProperty("user.dir"));

	}
}
