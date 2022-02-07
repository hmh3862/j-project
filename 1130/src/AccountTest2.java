import kr.green.vo.CheckingAccountVO;

public class AccountTest2 {
	public static void main(String[] args) {
		CheckingAccountVO acc1 = new CheckingAccountVO("352-111-1234", "이몽룡", 300_0000,"100-1234-001");
		CheckingAccountVO acc2 = new CheckingAccountVO("352-111-1235", "성춘향", 10_0000, "100-1234-002");
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println();
		
		try {
			// 몽룡이가 춘향이 한테 100_0000원 이체
			acc2.deposit(acc1.withdraw(100_0000));
		} catch (Exception e) {
			// e.printStackTrace(); 예외 추적
		} 
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println();
		
		try {
			// 몽룡이가 춘향이 한테 300_0000원 이체
			acc2.deposit(acc1.withdraw(300_0000));
		} catch (Exception e) {
			// e.printStackTrace(); 예외 추적
			System.out.println(e.getMessage()); // 예외 메세지 출력
		} 
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println();
		
		
		// 카드 출금을 해보자
		try {
			// 몽룡이가 춘향이 한테 카드로 100_0000원 이체 --- 카드번호가 틀리면 -- 예외 발생
			acc2.deposit(acc1.pay("100-1234-002", 100_0000));
		} catch (Exception e) {
			// e.printStackTrace(); 예외 추적
			System.out.println(e.getMessage()); // 예외 메세지 출력
		} 
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println();
		
		try {
			// 몽룡이가 춘향이 한테 카드로 100_0000원 이체 --- 카드번호가 맞으면 -- 정상 작동
			acc2.deposit(acc1.pay("100-1234-001", 100_0000));
		} catch (Exception e) {
			// e.printStackTrace(); 예외 추적
			System.out.println(e.getMessage()); // 예외 메세지 출력
		} 
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println();
	}
}
