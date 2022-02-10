
public class SpeedEx {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String str = "";
		// String 연산 : 불변객체로 스스로는 변하지 않고 연산을 수행할때마다 새로운 객체를 만들어서 리턴
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			str += "꽝!"; // 연산 결과를 한상 변수에 대입을 해줘야 한다.
		}
		//System.out.println(str);
		System.out.println("실행시간 : " + (System.currentTimeMillis()-start) + "ms");
		
		
		// StringBuffer 연산 : 연산시 스스로 변합니다. 멀티스레드 프로그램에서도 안정적이다.
		StringBuffer stringBuffer = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			stringBuffer.append("꽝!"); // 메서드를 호출하면 자기 자신이 변경되므로 대입이 필요 없다.
		}
		//System.out.println(stringBuffer);
		System.out.println("실행시간 : " + (System.currentTimeMillis()-start) + "ms");
		
		
		// StringBuilder 연산: 연산시 스스로 변합니다. 멀티스레드 프로그램 지원하지 않는다.
		StringBuilder stringBuilder = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			stringBuilder.append("꽝!");
		}
		//System.out.println(stringBuilder);
		System.out.println("실행시간 : " + (System.currentTimeMillis()-start) + "ms");
	}
}
