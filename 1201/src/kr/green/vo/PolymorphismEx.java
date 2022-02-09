package kr.green.vo;
abstract class Shape{
	int x,y;
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Point extends Shape{
	public Point(int x, int y) {
		super(x, y);
	}
	
	public void draw() {
		System.out.println("(" + x + ", " + y + ")점입니다.");
	}
}
class Line extends Shape{
	public int width, height;
	public Line(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("(" + x + ", " + y + ")~" + "(" + (x+width) +", " + (y+height) + ")선입니다.");
	}
}
class Circle extends  Shape{
	public int width, height;
	public Circle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("(" + x + ", " + y + ")~" + "(" + (x+width) +", " + (y+height) + ")내접하는 원입니다.");
	}
}
class Rect extends Shape{
	public int width, height;
	public Rect(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("(" + x + ", " + y + ")~" + "(" + (x+width) +", " + (y+height) + ")사각형입니다.");
	}
}
// 다형성 : 1개의 메서드가 여러가지의 형태로 발현된다.
// 1. 부모의 메서드를 오버라이딩 한다.(공통의 메서드를 구현한다.)
// 2. 부모의 변수에 자식 객체를 대입한다.
// 3. 부모의 변수로 자식의 메서드를 호출한다.
public class PolymorphismEx {
	public static void main(String[] args) {
		Shape[] shapes = {new Point(10,10), new Line(10,25, 100, 100), new Circle(20,20,50,100), new Rect(10,10, 200,100)};
		for(Shape s : shapes) s.draw();
		
		shapes[1].move(10, 10);
		shapes[1].draw();
		shapes[0].move(30, 60);
		shapes[0].draw();
	}
}
