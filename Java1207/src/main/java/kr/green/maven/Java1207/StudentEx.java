package kr.green.maven.Java1207;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.green.maven.vo.StudentVO;

public class StudentEx {
	public static void main(String[] args) {
		String srcFile = "src/main/resources/score.txt";
		String targetFile = "src/main/resources/result.txt";
		PrintWriter pw = null;
		try {
			List<String> list = Files.readAllLines(Paths.get(srcFile)); // 전체를 리스트로 읽기
			Scanner sc = null;
			List<StudentVO> stuList = new ArrayList<StudentVO>();
			for(String line : list) { // 1줄씩 처리
				sc = new Scanner(line); // String에서 읽기 : 자료형에 맞추어 읽기가 가능하다.
				// 읽어서 객체를 만들고
				StudentVO vo = new StudentVO(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()); 
				stuList.add(vo); // 리스트에 추가하고 
			}
			sc.close();
			// 석차 구하고
			for(int i=0;i<stuList.size()-1;i++) {
				for(int j=i+1;j<stuList.size();j++) {
					if(stuList.get(i).getTotal() > stuList.get(j).getTotal()) {
						stuList.get(j).setRank(stuList.get(j).getRank()+1);
					}else if(stuList.get(i).getTotal() < stuList.get(j).getTotal()) {
						stuList.get(i).setRank(stuList.get(i).getRank()+1);
					}
				}
			}
			// 저장
			pw = new PrintWriter(targetFile);
			for(StudentVO vo :  stuList) {
				System.out.println(vo);
				pw.write(vo.toString() + "\n");
				pw.flush();
			}
			System.out.println("저장완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
}
