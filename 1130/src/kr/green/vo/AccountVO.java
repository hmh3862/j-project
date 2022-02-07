package kr.green.vo;

// 은행의 계좌 정보를 나타내는 클래스
public class AccountVO {
	protected String accountNo;  // 계좌번호
	protected String ownwerName; // 예금주
	protected int balance;		 // 예금 잔액	
	// 생성자
	public AccountVO(String accountNo, String ownwerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownwerName = ownwerName;
		this.balance = balance;
	}
	// Getter만 만든다.
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwnwerName() {
		return ownwerName;
	}
	public int getBalance() {
		return balance;
	}
	// 입금
	public void deposit(int amount) {
		balance += amount;
	}
	// 출금
	public int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("예금 잔액이 부족합니다."); // 예외를 발생시킨다.
		balance -= amount;
		return amount;
	}
	// 필요한 몇가지 메서드를 오버라이딩 한다. 
	// 아래의 메서드들은 Object클래스의 메서드들이다.
	@Override
	public String toString() {
		return accountNo + "(" + ownwerName + ") : " + balance + "원";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountVO other = (AccountVO) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		return true;
	}
	
}
