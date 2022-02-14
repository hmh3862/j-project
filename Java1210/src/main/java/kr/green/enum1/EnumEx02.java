package kr.green.enum1;

// 열거형을 특정 값으로 연결하기
enum Season {
    SPRING("봄"), SUMMER("여름"), AUTUMN("가을"), WINTER("겨울");
    // 값을 가지면 값을 저장하는 변수와 생성자를 만들어 주어야 한다.
    private final String value;
	
	Season(String value) {
		this.value = value;
	}
	// 값을 알아내는 getter작성
	public String getValue() {
		return value;
	}
}

enum Num {
	TEN(10, "열"), ONE(1, "하나"), TWO(2, "둘"), FIVE(5, "다섯"), NINE(9,"아홉");
	private final int value; 
	private final String name;
	
	Num(int value, String name){
		this.value = value;
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
}

public class EnumEx02 {
	public static void main(String[] args) {
		Season season = Season.AUTUMN;
		System.out.println(season);
		System.out.println(season.getValue());
		// System.out.println(Season.valueOf("SPRING"));
		System.out.println();
		
		for(Season s : Season.values()) {
			System.out.println(s + " : " + s.getValue());
		}
		System.out.println();
		
		for(Num n : Num.values()) {
			System.out.println(n + " : " + n.getValue() + ", " + n.getName());
			
		}
	}
}
