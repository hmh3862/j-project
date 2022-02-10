import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DongEx {
	public static void main(String[] args) {
		try {
			List<String> dongList = Files.readAllLines(Paths.get("dong.txt")); // 줄단위로 읽어 리스트로 만듬
			System.out.println(dongList.size() + "개"); // 몇줄인지 출력
			dongList.remove(0); // 첫번째줄 삭제
			System.out.println(dongList.size() + "개");
			// 10개만 출력
			for(int i=0;i<10;i++) {
				System.out.println(dongList.get(i));
			}
			// 현재 존재하는 법정동의 개수를 출력하시오
			int count1 = 0;
			int count2 = 0;
			for(String line : dongList) {
				if(line.endsWith("존재"))
					count1++;
				else
					count2++;
					
			}
			System.out.println("존재 : " + count1);
			System.out.println("폐지 : " + count2);
			// 광역 자치단체의 개수는?
			System.out.println(dongList.get(0).split("\\t")[1]);
			System.out.println("---------------------------------------------");
			List<String> list1 = new ArrayList<String>();
			String oldString = dongList.get(0).split("\\t")[1]; // 첫번쨰 광역자치단체 이름을 저장
			list1.add(oldString); // 리스트에 추가
			for(int i=1;i<dongList.size();i++) { // 두번째 부터 끝까지 반복
				if(dongList.get(i).endsWith("존재")) { // 폐지되지 않은것만
					String line[] = dongList.get(i).split("\\t"); // 탭으로 구분하여 배열로 만듬
					if(!line[1].startsWith(oldString)) { // 광역자치단체 이름이 다르다면
						list1.add(line[1].split(" ")[0]); // 주소만 공백으로 구분하여 리스트에 넣기
						oldString = line[1]; // 이전 단체명 변경
					}
				}
			}
			// 출력
			System.out.println(list1.size() + "개");
			for(String t : list1) {
				System.out.println(t);
			}
			// 부산광역시의 구자치단체 목록을 구하시오!!!
			List<String> list2 = new ArrayList<String>();
			for(int i=1;i<dongList.size();i++) { // 두번째 부터 끝까지 반복
				if(dongList.get(i).endsWith("존재")) { // 폐지되지 않은것만
					String line[] = dongList.get(i).split("\\t"); // 탭으로 구분하여 배열로 만듬
					if(line[1].startsWith("부산광역시")) { // 광역자치단체 이름이 다르다면
						//System.out.println(line[1]);
						if(line[1].split(" ").length==2) list2.add(line[1].split(" ")[1]);
					}
				}
			}
			System.out.println(list2.size() + "개");
			Collections.sort(list2); // 정렬
			System.out.println(list2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Collection 객체들은 기본자료형을 쓸 수 없다. 객체형에만 사용 가능하다.
		// List<int> l = new ArrayList<int>();
	}
}
