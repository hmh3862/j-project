package kr.green.vo;

public class VarVO {
	public int pubVar = 1;
	protected int proVar = 2;
	int defVar = 3;
	private int priVar = 4;
	
	// private : 클래스 내부에서만 사용 가능한 변수
	public void view() {
		System.out.println("public : " + pubVar);
		System.out.println("protected : " + proVar);
		System.out.println("default : " + defVar);
		System.out.println("private : " + priVar);
	}
	
}
