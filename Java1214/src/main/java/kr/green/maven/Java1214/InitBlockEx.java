package kr.green.maven.Java1214;

class InitBlock{
	// 아래의 두개 변수의 초기화 과정
	// 1. 제일 먼저 초기화됨
	int i = 1; // 인스턴스 변수
	static int si = 2; // 정적 변수
	
	// 3. 세번째 초기화됨
	{ // 인스턴스 초기화 블록
		System.out.println("인스턴스 초기화블록 초기화 전");
		System.out.println("i = " + i);
		System.out.println("si = " + si);
		i = 11;
		si = 22;
		System.out.println("인스턴스 초기화블록 초기화 후");
		System.out.println("i = " + i);
		System.out.println("si = " + si);
	}
	// 2. 두번째 초기화됨
	static { // 정적 초기화 블록 : 정적 변수의 초기화가 1줄로 안될때 사용해야 한다. 생성자를 호출하기 전에도 사용해야 하기 때문에
		// 인스 턴스 변수 사용못함
		System.out.println("정적 초기화블록 초기화 전");
		System.out.println("si = " + si);
		si = 22;
		System.out.println("정적 초기화블록 초기화 후");
		System.out.println("si = " + si);
	}
	// 4. 네번째 초기화됨
	public InitBlock() {
		System.out.println("생성자에서 초기화 전");
		System.out.println("i = " + i);
		System.out.println("si = " + si);
		
		i = 100;
		si = 200;
		System.out.println("생성자에서 초기화 후");
		System.out.println("i = " + i);
		System.out.println("si = " + si);
	}
}
public class InitBlockEx {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		InitBlock initBlock = new InitBlock();
	}
}
