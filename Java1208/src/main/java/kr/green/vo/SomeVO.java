package kr.green.vo;

import java.io.Serializable;

// 객체가 직렬화/역직렬화 되면 어떤것이 저장/읽기가 될까요? 인스턴스 변수만 해당 됩니다.

public class SomeVO implements Serializable{

	// 자바는 컴파일될때마다 버전번호를 임의로 할당을 합니다. 그래서 객체의 입출력시에 버전 번호를 비교하여
	// 같으면 같은 타입으로 인식을 한다. 그래서 클래스를 수정할때마다 버전 번호가 변경이 됩니다.
	// 이전 버전에서 저장한 파일의 내용은 수정된 클래스로 읽을 수 없어진다.
	// 클래스를 수정하고도 옛날늬 데이터를 읽으려면 클래스 작성할때 사용자가 버전아이디를 임의로 지정해주면 
	// 읽지 못하는 경우를 방지할 수 있다.
	
	// 결론은 Serializable인터페이스를 구현하면 serialVersionUID도 반드시 만들어 주어야 좋다.
	private static final long serialVersionUID = 7633379020644872884L;

	String message;
	transient int password; // transient : 직렬화/역직렬화에 제외해라!!!!
	static double PI = 3.1415;
	
	public SomeVO(String message, int password) {
		this.message = message;
		this.password = password;
	}

	// 데이터와는 상관 없는 메서드만 변경했다.... 그렇다면 이전에 저장한 데이터는 읽을 수 있어야 한다
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SomeVO [message=" + message + "]";
	}


}
