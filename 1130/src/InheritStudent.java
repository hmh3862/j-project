class Human{ // 부모 클래스
	String name;
	public Human(String name) {
		this.name = name;
	}
	public void intro() { System.out.println(name); }
	public void think() { System.out.println("오늘 점심 뭐먹지?"); }
}
class Student extends Human{ // Human을 상속받아 Student자식 클래스를 작성
	String stuNum; // 학번 추가
	public Student(String stuNum, String name) {
		super(name); // 부모의 생성자 호출
		this.stuNum = stuNum;
	}
	public void intro() { System.out.println(name + "(" + stuNum + ")"); } // 오버라이딩(재정의) : 기능 변경
	public void think() { System.out.println("기말고사를 잘봐야 할텐데..."); } // 기능 변경
	public void study() { System.out.println("하늘천 따지 검을현 누를황....."); } // 기능 추가
}

public class InheritStudent {
	public static void main(String[] args) {
		Human human = new Human("한사람");
		human.intro();
		human.think();
		System.out.println();
		
		Student student = new Student("2101001", "두사람");
		student.intro();
		student.think();
		student.study();
	}
}
