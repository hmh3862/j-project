package kr.green.maven.List;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {
	public static void main(String[] args) {
		// Set<Integer> lotto = new HashSet<>();
		Set<Integer> lotto = new TreeSet<>(); // TreeSet : 정렬이 지원되는 Set이다.
		Random rnd = new Random();
		while(lotto.size()<6) {
			lotto.add(rnd.nextInt(45)+1);
		}
		
		System.out.println("로또 번호 : " + lotto);
		
		// 반복 1
		Iterator<Integer> it= lotto.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
		
		// 반복 2
		for(int i : lotto) System.out.println(i);
	}
}
