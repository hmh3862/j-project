package kr.green.vo;
// 내가 게임을 만들려고한다. 게임에서 몬스터를 모두 잡으면 게임을 승리하는것이다.
// 현재 몬스터의 마리수를 세는 기능이 필요하다. 어떻게 할까?
public class MonsterVO {
	private int count; // 마리수를 세어줄 변수
	private static int staticCount;
	public MonsterVO() {
		count++; // 생성될때 1증가
		staticCount++;
	}
	
	public int getCount() {
		return count; 
	}
	
	public static int getStaticCount() {
		return staticCount;
	}
	// 인스턴스 변수는 객체마다 1개씩 생성되므로 개수를 셀수 없다.
	// 이 문제를 해결하려면 개수를 세는 변수는 모든 객체가 공유하는 변수이어야 한다. 
	// 개수를 세는 변수는 클래스(static, 정적)변수 이어야 한다.
}
