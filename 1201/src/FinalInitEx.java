import kr.green.vo.FinalVO;

public class FinalInitEx {
	public static void main(String[] args) {
		// 초기화 되지 않은 상수를 가지는 클래스는 객체 생성시 값을 꼭 전달해서 초기화를 해야 한다.
		FinalVO vo1 = new FinalVO(3.14);
		FinalVO vo2 = new FinalVO(3.1415);
		FinalVO vo3 = new FinalVO(3.141592);
		
		// 초기화 하지 않은 상수는 상수성은 유지하면서 객체마다 다른 상수를 사용할때 사용한다. 
		System.out.println(vo1.PI);
		System.out.println(vo2.PI);
		System.out.println(vo3.PI);
		
		// vo3.PI = 3.14; // 에러다!!! 상수는 변경 불가. 
	}
}
