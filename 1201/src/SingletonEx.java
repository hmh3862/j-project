import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 싱글톤 디자인 패턴 : 프로그램 내에서 객체를 1개만 만들어 재사용하는 방법
class Singleton{
	// 1. 자신의 객체를 정적 멤버로 가진다.
	private static Singleton instance = new Singleton();
	// 2. 밖에서 객체를 생성하지 못하도록 생성자를 private으로 만든다.
	private Singleton(){}
	// 3. 밖에서 객체를 사용할(얻을) 수 있는 정적 메서드를 만들어 준다.
	public static Singleton getInstance() {
		return instance;
	}
	// -----------------------------------------------------------------
	
}
class Some{
	
}
public class SingletonEx {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); // 에러!!! 생성자가 private이다. 호출할 수 없다.
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		// 해시코드란? 자바가상머신(JVM)이 객체를 구분하기 위하여 붙이는 일련번호
		// 아래 3개의 해시코드가 모두 동일하다는것은 세개가 모두 객체 1개를 공유한다는 뚯이다.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println();
		// 일반적인 클래스는 객체마다 고유한 해시코드값을 가진다.
		Some some1 = new Some();
		Some some2 = new Some();
		System.out.println(some1.hashCode());
		System.out.println(some2.hashCode());
		System.out.println();
		
		Date date1 = new Date();
		Date date2 = new Date(1,2,3);
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(calendar1.hashCode());
		System.out.println(calendar2.hashCode());
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(sdf.format(date1));
		System.out.println(sdf.format(date2));
		
		calendar1.set(Calendar.DAY_OF_MONTH, 11);
		System.out.println(sdf.format(calendar1.getTime()));
		System.out.println(sdf.format(calendar2.getTime()));
		System.out.println();
		
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(calendar1.hashCode());
		System.out.println(calendar2.hashCode());
		System.out.println();
		
	}
}
