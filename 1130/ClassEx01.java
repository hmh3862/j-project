import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 생성자 : 객체 생성시 불려지는 메서드
 * 소멸자 : 객체가 소멸시 자동을 불려지는 메서드. 자원의 반납에 주로 사용
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
class Some{
	private String name;
	
	// 자바의 소멸자
	@Override
	protected void finalize() throws Throwable {

		System.out.println(name + "님이 소멸되었습니다.");
	}
}
public class ClassEx01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Some s1 = new Some("한사람");
		Some s2 = new Some("두사람");
		Some s3 = new Some("세사람");
		
		s1 = null;
		s2 = null;
		System.gc(); // JVM(자바가상머신)아 빠른 시간내에 가비지켈렉터를 수행하여 메모리를 정리해줘!!!
		
	}
}
