// Method (Function) : 자주 사용하는 코드(기능)를 별도로 만들어 놓고 필요시 불러서 사용한다. 
//                     코드의 중복을 제거할 수 있다.  
public class MethodEx01 {
	public static void main(String[] args) {
		System.out.println("재미없는 JAVA");
		line();
		
		System.out.println("정말 재미없는 JAVA");
		line(18);

		System.out.println("진짜진짜 재미없는 JAVA");
		line('*');
		line("@");
		line("~^", 11);
		line(11, "=^");
	}
	// 메서드 오버로딩 : 동일한 이름의 메서드를 여러개 만들어서 사용하는 방법.
	//                   반드시 인수의 개수나 타입이 달라야 한다.
	private static void line() {
		for(int i=0;i<80;i++) System.out.print("-");
		System.out.println();
	}
	private static void line(char ch) {
		for(int i=0;i<80;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(String ch) {
		for(int i=0;i<80;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(String ch, int count) {
		for(int i=0;i<count;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(int count, String ch) {
		for(int i=0;i<count;i++) System.out.print(ch);
		System.out.println();
	}
	private static void line(int count) { // int count : 인수, 가인수, 매개변수, parameter
										  // 호출할때 int타입의 숫자 1개 넘겨주어야 한다.
		for(int i=0;i<count;i++) System.out.print("-");
		System.out.println();
	}
}
