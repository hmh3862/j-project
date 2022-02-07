
class Parent{
//	public Parent() {
//		System.out.println("나는 부모 클래스 기본 생성자 입니다.");
//	}
	int x = 100;
	public Parent(int dummy) {
		super(); // 자바의 모든 클래스는 기본적으로 Object클래스를 자동으로 상속 받는다.
		System.out.println("나는 부모 클래스 인수가 있는 생성자 입니다.");
	}
}

class Child extends Parent{ // 1차 상속
	int x = 200;
	public Child() {
		// 이자리에 super()가 자동으로 삽입된다.
		// super()는 부모의 기본 생성자가 없어서 생기는 에러
		// 1. 부모에 기본 생성자를 만들어 주거나
		// 2. 자식에서 부모의 인수가 있는 생성자를 호출해 주거나
		super(1);
		System.out.println("나는 자식 클래스 입니다.");
	}
	public int getX() {
		return x;
	}
	public int getParentX() {
		return super.x; // super는 부모를 나타내는 숨겨진 참조 변수
		                // this는  나를  나타내는 숨겨진 참조 변수
	}
}

class GrandChild extends Child{ // 2차 상속
	public GrandChild() {
		System.out.println("나는 2차상속을 받은 손자 클래스의 기본 생성자 입니다.");
	}
}
public class ConstructorEx {
	public static void main(String[] args) {
		Parent parent = new Parent(1);
		Child  child  = new Child(); // 자식 객체를 만들면 부모생성자 - 자식 생성자 순서대로 실행이 된다.
		System.out.println(parent.x);
		System.out.println(child.x);
		System.out.println();
		System.out.println(child.getX());
		System.out.println(child.getParentX());
		System.out.println();
		@SuppressWarnings("unused")
		GrandChild grandChild = new GrandChild();
	}
}
