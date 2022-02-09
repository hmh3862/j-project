import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class OuterClass{
	int oi  =1;
	static int os = 2;
	
	class InstanceInner{ // 인스턴스 내부 클래스
		void  show() {
			System.out.println("oi = " + oi); // 외부 클래스의 변수에 쉽게 접근 가능하다.
			System.out.println("os = " + os);
		}
	}
	static class StaticInner{ // 정적 내부 클래스
		void show() {
			// System.out.println("oi = " + oi); // 에러!! Satic에서는 static멤버만 접근 가능하다.
			System.out.println("os = " + os);
		}
	}
	void show() {
		final int local = 3;
		class LocalInner{ // 로컬 내부 클래스 : 메서드 안에서 선언. 메서드 안에서만 사용
			void  show() {
				System.out.println("oi = " + oi); // 외부 클래스의 변수에 쉽게 접근 가능하다.
				System.out.println("os = " + os);
				System.out.println("local = " + local); // JDK 1.7까지는 final 지역변수에만 접근 가능하다. 
			}
		}
		LocalInner li = new LocalInner();
		li.show();
	}
}

interface Hello{
	void show(String name);
}

public class InnerClassEx01 {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.show();
		// 인스턴스 내부 클래스 객체 사용
		OuterClass.InstanceInner ii = outerClass.new InstanceInner(); // new의 위치 주의
		ii.show();
		
		// 정적 내부 클래스 객체 사용
		OuterClass.StaticInner si = new OuterClass.StaticInner(); // new의 위치 주의
		si.show();
		
		Hello hello = new Hello() {
			
			@Override
			public void show(String name) {
				System.out.println("반가워요!!" + name + "씨!!");
			}
		};
		
		hello.show("한사람");
		
		// 위의 hello는 단 1번만 사용된다. 그렇다면 굳이 이름을 만들필요가 있을까?
		// 인터페이스를 구현하자마자 바로 실행해 버리면 된다. 이때 익명 내부 클래스를 사용한다.
		// 익명 내부 클래스
		new Hello() {
			@Override
			public void show(String name) {
				System.out.println(name + "씨 방가방가!!!");
			}
		}.show("두사람");
		
		String[] names = "한사람,두사람,세사람,네사람,오사람".split(",");
		System.out.println(Arrays.toString(names));
		Arrays.sort(names); // 오름차순 정렬
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println(Arrays.toString(names));
		// 첫번째 인수는 객체 배열
		// 두번째 인수는 Comparator인터페이스를 구현한 객체
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 같으면 0, 앞에것이크면 양수 뒤에것이 크면 음수를 리턴하게 만들어 주면 된다.
				return o1.compareTo(o2); // 오름차순
			}
		});
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 같으면 0, 앞에것이크면 양수 뒤에것이 크면 음수를 리턴하게 만들어 주면 된다.
				return o2.compareTo(o1); // 내림차순
			}
		});
		System.out.println(Arrays.toString(names));
		
	}
}
