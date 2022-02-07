class MyDate{
	// 같은 자료형만으로도 만들 수 있다.
	int year, month, date;
	
	// 생성자 메서드 : 객체를 생성할때 불러주는 메서드
	//                 1. 클래스 이름과 같다.
	//                 2. 메서드지만 리턴타입이 없다.
	//                 3. 1개 이상의 생성자 메서드는 반드시 존재해야 한다.
	//                 4. 1개도 만들지 않으면 자동으로 기본 생성자를 생성한다.
	//                    기본 생성자는 인수가 없는 생성자이다.
	//                    하지만 다른 생성자를 만들면 기본 생성자는 자동생성 되지 않는다.
	//                 5. 객체의 초기화에 사용된다.
	
	public MyDate() { // 기본 생성자
		 // year = month = date = 1;
		this(1,1,1);
	}
	// 사용자 정의 생성자
	public MyDate(int year) {
		// 모든 클래스에는 자기 자신을 나타내는 this라는 참조 변수가 숨겨져 있다.
		// this.year  = year;
		// month = date = 1;
		this(year, 1, 1);
	}
	public MyDate(int year, int month) {
		// 모든 클래스에는 자기 자신을 나타내는 this라는 참조 변수가 숨겨져 있다.
		// this.year  = year;
		// this.month = month;
		// date = 1;
		this(year, month, 1); // this()는 자신의 생성자를 호출한다.
	}
	public MyDate(int year, int month, int date) {
		// 모든 클래스에는 자기 자신을 나타내는 this라는 참조 변수가 숨겨져 있다.
		this.year  = year;
		this.month = month;
		this.date  = date;
	}
	
	// 객체를 직접 출력하기 위해서 오버라이딩 해준다.
	@Override
	public String toString() {
		return String.format("%04d년 %02d월 %02d일", year, month, date);
	}
}

public class ClassEx02 {
	public static void main(String[] args) {
		MyDate today = new MyDate(); // 기본 생성자를 호출하여 객체를 생성
		today.year = 2021;
		today.month = 11;
		today.date = 29;
		
		System.out.println(today);
		
		@SuppressWarnings("unused")
		int i = 100; // 선언과 동시에 초기값을 지정 가능하다.
		
		MyDate date1 = new MyDate(2022, 1, 1);  // 이렇게 초기화를 한다면 얼마나 편리할까? 
												// --> 생성자 메서드를 만들어 주면 된다.
		System.out.println(date1);
		
		MyDate date2 = new MyDate(2022);
		MyDate date3 = new MyDate(2022, 11);
		MyDate date4 = new MyDate(2023, 12, 21);
		MyDate date5 = new MyDate();
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println(date5);
		
	}
}
