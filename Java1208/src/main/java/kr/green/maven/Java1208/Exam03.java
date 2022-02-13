package kr.green.maven.Java1208;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/*
문제 3] 그 시간 사무실에 몇 명이 있었나?(아마존 면접문제)
A사무실에는 특정일자의 출퇴근 시간이 기록된 거대한 로그파일이 있다고 한다.
파일의 형식은 다음과 같다. 
(한 라인에서 앞부분은 출근시간(HH:MM:SS), 뒷부분은 퇴근시간이다)

09:12:23 11:14:35
10:34:01 13:23:40
10:34:31 11:20:10

특정시간을 입력(예:11:05:20)으로 주었을 때 그 시간에 총 몇 명이 사무실에 있었는지 
알려주는 함수를 작성하시오.
*/
public class Exam03 {
	public static void main(String[] args) {
		// System.out.println(getSec("09:12:23"));
		// System.out.println(getSec("11:14:35"));
		// System.out.println(getSec("11:05:20"));
		System.out.println("회사에 있는 직원수 : " + getCount("11:05:20") + "명");
		System.out.println("회사에 있는 직원수 : " + getCount("11:15:20") + "명");
	}
	// 현재 시간에 회사에 있는 직원 수 구하기
	public static int getCount(String time) {
		int count = 0;
		int checkTime = getSec(time); // 점검하시 시간을 초로 환산
		try {
			List<String> lineList = Files.readAllLines(Paths.get("src/main/resources/time.txt")); // 파일을 읽고
			for(String line : lineList) { // 줄만큼 반복
				String t[]  = line.split(" "); // 공백으로 구분하여 배열로 만들고
				int startTime = getSec(t[0].trim()); // 첫번째 시간(출근시간)을 초로 환산
				int endTime = getSec(t[1].trim()); // 두번째 시간(퇴근시간)을 초로 환산하고
				// 두 수 사이에 있다면 회사에 있는 사람이다. 인원수 증가
				if(checkTime>=startTime && checkTime<=endTime) count++; 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	// 시간을 입력받아 초로 리턴하는 메서드를 만들자
	public static int getSec(String time) {
		String t[] = time.split(":");
		int hh = Integer.parseInt(t[0]);
		int mm = Integer.parseInt(t[1]);
		int ss = Integer.parseInt(t[2]);
		return hh*3600+mm*60+ss;
	}
}
