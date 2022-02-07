package kr.green.vo;

public class MinusAccountVO  extends CheckingAccountVO{
	protected int minus;
	
	public MinusAccountVO(String accountNo, String ownwerName, int balance, String cardNo, int minus) {
		super(accountNo, ownwerName, balance, cardNo);
		this.minus = minus;
	}
	
	// 출금을 변경해야 한다. -- 오버라이딩
	public int withdraw(int amount) throws Exception {
		if(balance + minus < amount)
			throw new Exception("예금 잔액이 부족합니다."); // 예외를 발생시킨다.
		balance -= amount;
		return amount;
	}

	@Override
	public String toString() {
		return super.toString() + "\n마이너스 한도 : " + minus;
	}
}
