// 클래스 : 클래스는 사용자 정의 "자료형"이다.
// 캡슐화(묶는다) : 연관성있는 데이터를 묶어 사용자가 만든 새로운 자료형을 만든다.
// 값을 저장하는 필드와 그 값을 이용하는 메서드로 구성된다.
class Person {
	// 사람을 표현하기 위해 이름, 나이, 성별을 묶어 하나의 자료형을 만들었다.
	// Field, 속성, 멤버변수
	String name;
	int age;
	boolean gender;
	
	public void showPerson() {
		System.out.println(name + "(" + age + ", " + (gender?"남":"여") + ")");
	}
	
	@Override
	public String toString() {
		return name + "(" + age + ", " + (gender?"남":"여") + ")";
	}
}

public class ClassEx01 {
	public static void main(String[] args) {
		// 클래스를 사용하기 위해서는 new 연산자를 이용하여 객체를 선언해야 한다.
		Person kimc = new Person();
		
		// 멤버에 접근하기위해서는 Dot(.)연산자를 사용한다.
		kimc.name = "김종서";
		kimc.age = 34;
		kimc.gender = true;
		System.out.println(kimc.name + "(" + kimc.age + ", " + (kimc.gender?"남":"여") + ")");
		showPerson(kimc);
		kimc.showPerson();
		System.out.println();
		
		System.out.println(kimc); // 이렇게 출력할 수 있으면 얼마나 좋을까? ---- toString()메서드를 오버라이딩(재정의)해줘야 한다.
		System.out.println(kimc.toString());
		System.out.println(kimc.getClass().getName() + "@" + Integer.toHexString(kimc.hashCode()));
		// 위의 3개의 출력결과가 동일하다.
		// 그렇다면 객체를 출력하면 자동으로 toString()이라는 메서드가 불려지고 toString()메서드의 내용은
		// 세번째 것 처럼 만들어져 있을 거라고 예측이 가능하다.
		// 그렇다면 toString의 메서드를 바꿔주면 객체를 원하는 모양으로 출력이 가능하겠구나라고 생각할 수 있다.
		System.out.println();
		
		Person leec = new Person();
		leec.name = "이순신";
		leec.age = 45;
		leec.gender = false;
		System.out.println(leec.name + "(" + leec.age + ", " + (leec.gender?"남":"여") + ")");
		showPerson(leec);
		leec.showPerson();
		System.out.println(leec);

	}
	// 일반 자료형 처럼 넘겨주고 넘겨받고 모두 가능하다.
	public static void showPerson(Person person) {
		System.out.println(person.name + "(" + person.age + ", " + (person.gender?"남":"여") + ")");
	}
}
