package kr.green.maven.Java1206;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
// List인터페이스를 구현한 리스트 : 순서가 중요할때 사용. 싱글스레드에 안전하게 설계됨
public class ListEx01 {
	public static void main(String[] args) {
		ArrayList<Integer> v1 = new ArrayList<>(); // 기본 10개의 공간이 만들어 진다.
		
		// 멀티스레드 환경에서는 다음과 같이 하면 멀티스레드로 지원합니다.
		Collections.synchronizedCollection(v1);
		
		System.out.println("개수 : " + v1.size() + " : " + v1); // toString()이 오버라이딩 되어있다.

		// 추가
		for(int i=0;i<20;i++) v1.add((i+1)*2-1); // 20개 추가
		System.out.println("개수 : " + v1.size() + " : " + v1);
		
		// 1개 얻기
		System.out.println("세번째 데이터 : " + v1.get(2));
		
		// 수정
		v1.set(0, 88); // 0위치의 값을 88로 변경
		System.out.println("개수 : " + v1.size() + " : " + v1);

		// 삭제
		v1.remove(4); // 5번째 값을 삭제
		System.out.println("개수 : " + v1.size() + " : " + v1);
		
		// 반복
		for(int i=0;i<v1.size();i++) System.out.printf("%3d", v1.get(i));
		System.out.println();

		for(int i : v1) System.out.printf("%3d", i);
		System.out.println();
		
		Iterator<Integer> it = v1.iterator();
		while(it.hasNext()) System.out.printf("%3d", it.next());
		System.out.println();
		/* 새롭게 만들어진 클래스들은 지원하지 않는다.
		Enumeration<Integer> em = v1.elements();
		while(em.hasMoreElements()) System.out.printf("%3d", em.nextElement());
		System.out.println();
		*/
		// 정렬
		v1.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// return o1-o2; // 오름 차순
				return o2-o1; // 내림 차순
			}
		});
		System.out.println("개수 : " + v1.size() + " : " + v1);
	}
}
