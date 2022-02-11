package kr.green.maven.Java1207;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// 텍스트 파일 저장하기
public class TextWriterEx01 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("src/main/resources/test01.txt")){
			
			fw.write("정말 저장이 될까?\n");
			fw.write("저장되지 않으면 낭패인데....\n");
			fw.write("오늘 점심 뭐먹지!!!!\n");
			fw.append("오늘 점심 뭐먹지!!!!\n");
			fw.append("오늘 점심 뭐먹지!!!!\n");
			fw.append("오늘 점심 뭐먹지!!!!\n");
			
			fw.flush(); // 출력버퍼의 내용을 내보낸다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		try(PrintWriter pw = new PrintWriter("src/main/resources/test02.txt")){
			
			pw.write("정말 저장이 될까?\n");
			pw.write("저장되지 않으면 낭패인데....\n");
			pw.write("오늘 점심 뭐먹지!!!!\n");
			
			// printf를 지원한다.
			pw.printf("%5d %5d %5d", 12,45,67);
			
			pw.flush(); // 출력버퍼의 내용을 내보낸다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("저장완료");
	}
}
