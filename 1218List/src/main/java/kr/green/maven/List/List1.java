package kr.green.maven.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List1 {
	public static void main(String[] args) {
		ArrayList<Integer> v1 = new ArrayList<>();
		
		Collections.synchronizedCollection(v1);
		
		System.out.println("개수 : " + v1.size() + " : " + v1);
		
		// 추가
		for(int i=0;i<20;i++) v1.add((i+1)*2-1); // 20개 추가
		System.out.println("개수 : " + v1.size() + " : " + v1);
		
		// 1개 얻기
		System.out.println("세번째 데이터 : " + v1.get(2));
		
		// 수정
		v1.set(0, 88);
		System.out.println("개수 : " + v1.size() + " : " + v1);
		
		//삭제
		v1.remove(4);
		System.out.println("개수 : " + v1.size() + " : " + v1);
		
		// 반복
		for(int i=0;i<v1.size();i++) System.out.printf("%3d", i);
		System.out.println();
		
		for(int i : v1) System.out.printf("%3d", i);
		System.out.println();
		
		Iterator<Integer> it = v1.iterator();
		while(it.hasNext()) System.out.printf("%3d", it.next());
		System.out.println();
		
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
