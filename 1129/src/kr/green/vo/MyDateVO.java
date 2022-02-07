package kr.green.vo;
/*
 * VO(Value Object) : 값을 저장하기 위한 용도의 클래스
 * DTO(Data Transfer Object) : 데이터를 넘겨주고 넘겨받기 위한 용도의 클래스
 * Domain Class
 */
// 클래스 1개당 파일 1개씩으로 작성한다.
public class MyDateVO {
	// 1. 데이터를 저장할 변수를 선언한다.
	// public : 외부로 공개한다.
	// private : 클래스 내부에서만 사용가능하도록 한다. --- 정보의 은폐
	private int year, month, date;

	// 2. 생성자를 만든다.
	//    생성자는 데이터의 휴효성을 검사해주면 더 안정적이다.
	public MyDateVO() {
		// super();
		this(1,1,1); // this()나 super()는 반드시 맨 첫줄에 나와야 한다. 같이 쓸 수 없다.
	}
	public MyDateVO(int year) {
		this(year, 1, 1);
	}
	public MyDateVO(int year, int month) {
		this(year, month, 1);
	}
	public MyDateVO(int year, int month, int date) {
		if(year<=0) year = 1;
		this.year = year;
		if(month<1 || month>12) month = 1;
		this.month = month;
		if(date<1 || date>31) date = 1;
		this.date = date;
	}
	
	// 3. getter & setter를 만들어 준다.
	// get필드명() : getter라 한다.
	// set필드명(값) : setter라 한다.
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<=0) year = 1;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<1 || month>12) month = 1;
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		if(date<1 || date>31) date = 1;
		this.date = date;
	}
	// 4. toString을 오버라이딩 한다.
	@Override
	public String toString() {
		return String.format("%04d년 %02d월 %02d일", year, month, date);
	}
	
	// 4. 필요한 메서드들을 추가한다.
	// 월을 더해주는 메서드
	public void addMonth(int month) {
		this.month += month;
		this.year += this.month / 12;

		if(this.month<0) {
			this.month = this.month % 12;
			this.month = 12 + this.month;
		}else {
			this.month = this.month % 12 + 1;
			
		}
	}
}
