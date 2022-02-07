import lombok.Getter;

@Getter
class Point{
	private int x,y;
	public Point() { ; }
	public Point(int x, int y) {
		this.x = x<0 || x>80 ? 0 : x;
		this.y = y<0 || y>25 ? 0 : y;
	}
	public void setX(int x) {
		this.x = x<0 || x>80 ? 0 : x;
	}
	public void setY(int y) {
		this.y = y<0 || y>25 ? 0 : y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
@Getter
class Circle extends Point{
	private int r;
	public Circle() {
		
	}
	public Circle(int x, int y, int r) {
		super(x, y); // 부모의 생성자를 불러준다.
		this.r = r<0 ? 0 : r;
	}
	public void setZ(int r) {
		this.r = r<0 ? 0 : r;
	}
	@Override
	public String toString() {
		return "원점 : " + super.toString() + ", 반지름 : " + r;
	}
}
public class ShapeEx {
	public static void main(String[] args) {
		Point point1 = new Point();
		System.out.println(point1);
		Circle circle = new Circle(10, 10, 25);
		System.out.println(circle); // 부모의 toString()이 호출
	}
}
