import kr.green.vo.AccountVO;

public class AccountTest {
	public static void main(String[] args) {
		AccountVO acc1 = new AccountVO("352-111-1234", "이몽룡", 300_0000);
		AccountVO acc2 = new AccountVO("352-111-1235", "성춘향", 10_0000);
		
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
		
	}
}
