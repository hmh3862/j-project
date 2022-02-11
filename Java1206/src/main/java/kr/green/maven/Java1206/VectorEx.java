package kr.green.maven.Java1206;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
// List인터페이스를 구현한 리스트 : 순서가 중요할때 사용. 멀티스레드에 안전하게 설계됨
public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(); // 기본 10개의 공간이 만들어 진다.
		System.out.println("용량 : " + v1.capacity());
		System.out.println("개수 : " + v1.size() + " : " + v1); // toString()이 오버라이딩 되어있다.

		// 추가
		for(int i=0;i<20;i++) v1.add((i+1)*2-1); // 20개 추가
		System.out.println("용량 : " + v1.capacity()); // 용량이 자동으로 늘어난다.
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
		
		Enumeration<Integer> em = v1.elements();
		while(em.hasMoreElements()) System.out.printf("%3d", em.nextElement());
		System.out.println();
	}
}
