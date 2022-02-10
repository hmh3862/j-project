
public class NullEx {
	public static void main(String[] args) {
		String str1="";   // 빈 문자열이 생기고 그 위치를 str1이 가리킨다. 참조 변수가 초기화가 되었다
		String str2=null; // 초기화는 되지만 아무것도 가리키고 있지 않다.
		@SuppressWarnings("unused")
		String str3; //  초기화가 이루어 지지 않았다.
		
		System.out.println(str1);
		System.out.println(str2);
		// System.out.println(str3); // 에러!!! 초기화 하지 않은 지역 변수는 사용할 수 없다.
		
		System.out.println(str1.toUpperCase()); // 문자열을 대문자로 만들어라
		// System.out.println(str2.toUpperCase()); // NullPointerException 예외 발생
		
		String str4 = "10000";
		// 둘다 숫자로 바꾼다.
		System.out.println(Integer.parseInt(str4)*2); // 기본자료형인 int로 변경
		System.out.println(Integer.valueOf(str4)*2);  // 참조형인 Integer로 변경
		
		int i = 100;
		@SuppressWarnings("unused")
		Integer j = i; // JDK 1.5이상 이상부터 지원 ==> Boxing : 기본자료형을 객체형으로 만든다.
		@SuppressWarnings("deprecation")
		Integer k = new Integer(i); // JDK 1.4까지의 Boxing, JDK1.5부터는 Auto Boxing/UnBoxing을 지원한다.
		int ii = k;// UnBoxing : 객체형을 기본자료형으로 만든다.
		@SuppressWarnings("unused")
		int jj = Integer.parseInt(ii+"");
	}
}
