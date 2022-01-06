import java.util.Date;
import kr.green.ex01.MyUtil;

// 클래스이름으로 .java를 붙여서 저장해야 하고
public class Ex01 {
	// 실행이 되려면 반드시 main메서드가 존재해야 한다.
	// main 메서드는 프로그램 시작점이다.
	// public static void main(String[] args) {
	public static void main(String...args) {
		System.out.println("Hello World!!!");
		say("한사람");
		MyUtil.getKB2Byte(20);
	}
	@SuppressWarnings("deprecation")
	public static void say(String name) {
		System.out.println(name + "씨 반가워요!!!");
		System.out.println("오늘 : " + new Date().toLocaleString());
	}
}
