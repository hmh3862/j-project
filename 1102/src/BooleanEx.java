// 논리 자료형 : true/false만 저장 가능한 자료형 ==> 성별, 음양력, 합격/불합격 ....
//            1Byte를 확보하지만 내부적으로 1비트만 사용
public class BooleanEx {
	public static void main(String[] args) {
		boolean gender = true;
		
		System.out.println("성별 : " + gender);
		// 보통의 경우 연산자와 같이 사용된다.
		// 삼항연산자 : 연산 대상이 3개인 연산자
		//           논리식 ? 참 : 거짓
		System.out.println("성별 : " + (gender? "남자" : "여자"));
		// ! : NOT 연산자
		System.out.println("성별 : " + (!gender? "남자" : "여자"));
	}
}
