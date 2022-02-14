package kr.green.thred6;

// 공유영역 : 은행의 모든 계좌 정보
public class SharedArea {
    Account account1;   // 1번 계좌
    Account account2;   // 2번 계좌
    
    
    // 계좌를 가지고 처리하는 메서드들은 여기에 있느것이 더 적당하다.
    // 메서드 내용 전체가 동기화 블록이라면 메서드 자체를 동기화 메서드로 만들어 주면 좋다. 
    /*
    public int getTotal() {
    	synchronized (this) {
    		int result = 0;
    		result = account1.balance + account2.balance;
    		return result;
		}
    }
    
    public void transfer() {
    	synchronized (this) {
    		account1.withdraw(1000000);
    		System.out.print("이몽룡 계좌에서 1000000원 출금");
    		// 이분에서 작업 전환이 이루어지면 잔액이 29000000원 된다.
    		account2.deposit(1000000);
    		System.out.println("성춘향 계좌에 1000000원 입금");
		}
	}
	*/
    // 메서드 선언부에 synchronized를 쓰면 메서드 전체가 동기화 된다.
    synchronized public int getTotal() {
		int result = 0;
		result = account1.balance + account2.balance;
		return result;
    }
    
    synchronized public void transfer() {
		account1.withdraw(1000000);
		System.out.print("이몽룡 계좌에서 1000000원 출금");
		// 이분에서 작업 전환이 이루어지면 잔액이 29000000원 된다.
		account2.deposit(1000000);
		System.out.println("성춘향 계좌에 1000000원 입금");
    }
}
