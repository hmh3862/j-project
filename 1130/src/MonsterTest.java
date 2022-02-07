import kr.green.vo.MonsterVO;

public class MonsterTest {
	public static void main(String[] args) {
		// 몬스터의 마리수를 세어보자
		System.out.println("현재 몬스터는 " + MonsterVO.getStaticCount() + "마리");
		MonsterVO monsterVO1 = new MonsterVO();
		System.out.println(monsterVO1.getCount() + "마리");
		MonsterVO monsterVO2 = new MonsterVO();
		System.out.println(monsterVO2.getCount() + "마리");
		MonsterVO monsterVO3 = new MonsterVO();
		System.out.println(monsterVO3.getCount() + "마리");
		System.out.println("현재 몬스터는 " + MonsterVO.getStaticCount() + "마리");
	}
}
