package kr.green.vo;

public class FinalVO {
	// 초기값이 없는 상수의 선언
	// 특별한 경우에 static이 없는 상수를 선언할 수도 있다.
	final public double PI;

	// 이때는 생성자에서 초기화를 반드시 해줘야 한다.
	public FinalVO(double pI) {
		PI = pI;
	}
	
	// 상수는 상수인데 객체마다 상수의 값을 다르게 사용하고 싶은 경우에 사용한다.
	
}
