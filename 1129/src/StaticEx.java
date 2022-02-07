
class StaticClass{
	int iv = 100; // 인스턴스 변수 : 객체가 생성되어야 사용가능. "참조변수.변수명"으로 접근
	static int sv = 200; // 정적변수(클래스 변수) : 클래스가 로드되면 사용가능. "클래스명.변수명"으로 접근
	
	void instanceMethod() {
		System.out.println("iv = " + iv);
		System.out.println("sv = " + sv);
	}
	static void staticMethod() {
		// System.out.println("iv = " + iv); // Error : static 메서드에서는 static만 사용가능하다.
		System.out.println("sv = " + sv);
	}
}

public class StaticEx {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 정적(static) 멤버의 접근
		System.out.println(StaticClass.sv);
		StaticClass.staticMethod();
		// System.out.println(StaticClass.iv); // Error : 인스턴스 변수는 클래스 이름으로 접근 불가
		System.out.println();
		
		StaticClass s1 = new StaticClass();
		System.out.println(s1.iv);
		s1.instanceMethod();
		s1.staticMethod(); // 경고 : 정적멤버는 클래스 이름으로 접근하라.
		System.out.println();
		
		StaticClass s2 = new StaticClass();
		s2.iv = 10000;
		System.out.println(s2.iv);
		s2.instanceMethod();
		System.out.println();
		
		StaticClass.sv = 30000;
		s1.instanceMethod();
		s2.instanceMethod(); // s1이나 s2모두 sv가 30000으로 변경되었다.  정적변수는 모든 객체가 공유한다.
		
	}
}
