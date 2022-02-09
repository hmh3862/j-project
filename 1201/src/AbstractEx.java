
// 추상 클래스 : 1개 이상의 추상 메서드를 포함한 클래스. 앞에 abstract지시자가 붙는다.
//               미완성 클래스이다.
//               객체를 생성할 수 없다.
//               규칙을 정할때 사용한다. 자식클래스는 반드시 오버라이딩해서 써라!!!!!
abstract class Shape{ 
	int x, y;
	
	public abstract void draw(); // 추상 메서드 : 내용이 없는 메서드. 앞에 abstract지시자가 붙는다.
	
	public void show() {}; // 일반메서드
	
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("선을 그립니다.");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}


public class AbstractEx {
	public static void main(String[] args) {
		Shape shape = new Shape() {
			@Override
			public void draw() {
				System.out.println("원을 그립니다.");
			}
		};
		shape.draw();
		
		Shape s[] = {new Line(), new Circle(), new Rect()};
		for(Shape shape2 : s) shape2.draw();
	}
}
