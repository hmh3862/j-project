package kr.green.maven.Java1207;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import kr.green.maven.vo.HanjaVO;

public class MapEx06 {
	public static void main(String[] args) {
		Map<String, HanjaVO> map = readHanja();
		System.out.println(map.size()+ "개 읽음");
		Scanner sc = new Scanner(System.in);
		System.out.println("천자문 검색 프로그램");
		while(true) {
			System.out.print("찾고자하는 한글를 입력하시오(0은 종료)");
			String key = sc.nextLine();
			if(key.equals("0")) break;
			int count = 0;
			// 순차 검색
			for(HanjaVO vo : map.values()) {
				if(vo.getK().equals(key)) {
					System.out.println(vo.getH() + "(" + vo.getK() + ") : " + vo.getM());
					++count;
				}
			}
			System.out.println(count + "개가 있습니다.");
		}
		sc.close();
	}
	
	public static Map<String, HanjaVO> readHanja(){
		Scanner sc = null;
		Map<String, HanjaVO> map = new HashMap<>();
		try {
			sc = new Scanner(new File("src/main/resources/chunja.txt"));
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split("\\|");
				HanjaVO vo = new HanjaVO();
				vo.setIndex(Integer.parseInt(line[0]));
				vo.setH(line[1]);
				vo.setK(line[2]);
				vo.setM(line[3]);
				// 한자를 키로 사용
				map.put(vo.getH(), vo);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		return map;
	}
}
