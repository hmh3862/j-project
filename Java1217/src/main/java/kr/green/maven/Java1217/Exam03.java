package kr.green.maven.Java1217;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
주식차트를 위한 ohlc 데이터 만들기
주식차트는 분,초,시,일 등의 가격 데이터를 O(open), H(high), L(low), C(close)를 가지고 
봉 형태로 표시해 줍니다. 이를 candlesticks chart라고 합니다.

그러면, 주식의 거래데이터가 아래와 가티 주어질 때 ohlc를 만듭니다.

예) 1분마다 open, high, low, close를 만듭니다.
분:초, 거래가격
1:02, 1100
1:20, 1170
1:59, 1090
2:30, 1030
2:31, 1110
2:42, 1150
2:55, 1210
2:56, 1190
3:02, 1120
3:09, 1100
4:15, 1090
4:20, 1080
4:55, 1050
4:56, 1020
4:57, 1000

[조건] 실제 주식 거래의 경우,, 분당 거래 회수가 10번, 100번, 1000번 등일 수 있으므로, 
high, low를 찾을 때 되도록 전체 데이터에서 찾지 않고,, 앞뒤 데이터를 비교하여 찾아주십시오.. 

답: 
open = [1100, 1030, 1120, 1090]
high = [1170, 1210, 1120, 1090]
low = [1090, 1030, 1100, 1000]
close = [1090, 1190, 1100, 1000]
*/
public class Exam03 {
	public static void main(String[] args) {
		List<Integer> openList = new ArrayList<Integer>();
		List<Integer> closeList = new ArrayList<Integer>();
		List<Integer> highList = new ArrayList<Integer>();
		List<Integer> lowList = new ArrayList<Integer>();
		try {
			List<String> data = Files.readAllLines(Paths.get("src/main/resources/data.txt"));
			String oldStr = "";
			int max=0, min=0;
			for(int i=0;i<data.size();i++ ) {
				String temp = data.get(i);
				if(!oldStr.equals(temp.split(":")[0])) { // temp.split(":")[0] : 데이터중 분만 취득 ==> 분이 바뀌었다면
					openList.add(Integer.parseInt(temp.split(",")[1].trim())); // 시작값 저장
					oldStr = temp.split(":")[0];// 현재 분을 oldStr에 저장
					if(i>0) { // 맨 첫번째는 제외
						// 분이 바뀌었을때 바로 이전의 값이다.
						closeList.add(Integer.parseInt(data.get(i-1).split(",")[1].trim()));
						// 분이 바뀌었을때 최대/최소값 저장
						highList.add(max); 
						lowList.add(min);
					}
					// 분이 바뀌었을때 초기화
					max = Integer.parseInt(temp.split(",")[1].trim());
					min = Integer.parseInt(temp.split(",")[1].trim());
				}else {
					// 최대/최소값 구하기
					if(max<Integer.parseInt(temp.split(",")[1].trim())) max = Integer.parseInt(temp.split(",")[1].trim());
					if(min>Integer.parseInt(temp.split(",")[1].trim())) min = Integer.parseInt(temp.split(",")[1].trim());
				}
			}
			System.out.println("open : " + openList);
			// 마지막에는 분이 변경되지 않았으므로 마지막분에대한 최대/최소/최종 값은 별도로 저장해 주어야 한다.
			highList.add(max);
			System.out.println("high : " + highList);
			lowList.add(min);
			System.out.println("low : " + lowList);
			closeList.add(Integer.parseInt(data.get(data.size()-1).split(",")[1].trim()));
			System.out.println("close : " + closeList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void test() {

	}
}
