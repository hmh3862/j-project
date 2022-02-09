package kr.green.inter1;

class Point{
	int x, y;
}
// abstract class Shape{
//	 public abstract void draw();
// }

// 위의 클래스 두개를 모두 상속받고 싶다.
// class Line extends Point, Shape{} // 에러다!!! 자바는 다중 상속을 지원하지 않는다.
// 두개를 모두 사용하려면 1개를 인터페이스로 만들어 주면된다.

// 인터페이스는 상수와 추상메서드 만으로 구성된 특별한 클래스로 class 대신 interface로 작성한다.
interface Shape{
	double PI = 3.14; // 앞에 public static final이 자동으로 붙여진다.
	void draw(); // 앞에 public이  자동으로 붙여진다.
}

// 클래스는 상속(extends)받고 인터페이스 구현(implements)하면 2개를 다 사용이 가능하다.
class ShapeImpl extends Point implements Shape{

	@Override
	public void draw() {
		System.out.println(x + ", " + y + "선을 그립니다.");
	}
	
}

interface Shape2{
	void move();
	void resize();
}
// 인터페이스는 다중 구현이 가능하다.
class ShapeImpl2 extends Point implements Shape, Shape2{

	@Override
	public void draw() {
		System.out.println(x + ", " + y + "선을 그립니다.");
	}
	// 인터페이스를 구현하려면 내용이 없어도 만들어 주어야한다. 
	@Override
	public void move() { ; }

	@Override
	public void resize() { ; }
	
}

// 인터페이스가 인터페이스를 상속 받을 수 있다. 다중 상속(extends)도 가능하다.
interface Graphics extends Shape, Shape2{
	void remove();
}

// Graphics인터페이스를 구현해보자
class GraphicsImpl implements Graphics{

	@Override
	public void draw() {;}

	@Override
	public void move() {;}

	@Override
	public void resize() {;}

	@Override
	public void remove() {;}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		ShapeImpl shapeImpl = new ShapeImpl();
		System.out.println("원주율 : " + ShapeImpl.PI);
		// ShapeImpl.PI = 3.1415; // 상수다 변경 금지
		shapeImpl.draw();
	}
}
