package kr.green.inter1;

// 아래 두개클래스의 관계를 의존성(깊은 관계)이 있다
// ClassB가 만들어지지 않으면 ClassA는 작성할할 수 없다. 작업 순서가 정해져 버린다.
// ClassB를 먼저 만들어야만 ClassA를 작성할 수 있다.
class ClassB{
	void show() {
		System.out.println("나는 B입니다.");
	}
}

class ClassA {
	public void method(ClassB b) { // ClassB를 직접 사용
		b.show();
	}
}

// 이럴때 중간에 인터페이스를 두어 깊은 관계를 느슨한 관계로 만들면 의존성이 줄어든다.
// 동시에 작업이 가능해 진다.
interface I {
	void method();
}
// 인터페이스를 만들었으므로 꺼꾸로 작업해도 된다. 동시에 작업이 가능하다.
class ClassC {
	public void method(I i) { // ClassD를 사용하지 않고 인터페이스를 사용하면 ClassD를 만들지 않고도 작업이 가능
		i.method();
	}
}
class ClassD implements I{
	@Override
	public void method() {
		System.out.println("나는 ClassD 입니다.");		
	}
}
class ClassE implements I{
	@Override
	public void method() {
		System.out.println("나는 ClassE 입니다.");		
	}
}
// 위와 같이(중간에 인터페이스를 두면) 하면 작업순서도 필요없고 동시에 작업이 가능해진다. 
// 그리고 인터페이스 I를 구현한 모든 클래스를 ClassC에서 사용 가능해진다.

public class InterfaceEx2{
	public static void main(String[] args) {
		// 직접 사용 : 깊은 관계
		ClassA a = new ClassA();
		a.method(new ClassB());
		
		// 인터페이스 사용 : 느슨한 관계
		ClassC c = new ClassC();
		c.method(new ClassD());
		c.method(new ClassE());
	}
}