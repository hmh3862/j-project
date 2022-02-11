package kr.green.maven.Java1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random rnd = new Random();
		for(int i=0;i<15;i++) list.add(rnd.nextInt(101)); // 난수로 초기화
		System.out.println(list.size() + " : " + list);
		
		// 삭제시 주의할 사항!!!!!
		// 50이상인 데이터를 모두 삭제하시오!!!
		// 삭제를 하면 index값이 당겨진다. 그래서 연속적으로 50이상인 수가 있으면 뒤에것은 
		// 지워지지 않는다. 그럼 어떻게 하지? 뒤에서 부터 지우면 된다.
		/*
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>=50) {
				list.remove(i);
			}
		}
		*/
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i)>=50) {
				list.remove(i);
			}
		}
		
		// 헐 ~~~ 뭐가 문제일까요?
		System.out.println(list.size() + " : " + list);
	}
}
