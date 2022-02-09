import kr.green.vo.VarVO;

public class VarEx {
	public static void main(String[] args) {
		VarVO vo = new VarVO();
		// public 은 어디서든 접근 가능하다.
		System.out.println("public : " + vo.pubVar);
		// protected : 다른 패키지의 자식은 사용가능하다.
		// System.out.println("protected : " + vo.proVar); // 다른 패키지, 자식도 아니라 접근 불가
		// default : 같은 패키지내에서 접근 가능
		// System.out.println("default : " + vo.defVar); // 다른 패키지 접근 불가
		// private : 클래스 내부에서만 사용가능
		// System.out.println("private : " + vo.priVar); // 다른 클래스 접근 불가
	}
}
