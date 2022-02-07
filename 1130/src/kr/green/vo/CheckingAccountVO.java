package kr.green.vo;

public class CheckingAccountVO extends AccountVO {
	protected String cardNo; // 카드 번호
	
	public CheckingAccountVO(String accountNo, String ownwerName, int balance, String cardNo) {
		super(accountNo, ownwerName, balance); // 부모의 생성자를 불러 계좌 정보를 초기화
		this.cardNo = cardNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}

	// 카드 출금 메서드 : 새로운 기능을 추가
	public int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || balance < amount)
			throw new Exception("지급이 불가능 합니다.");
		
		return withdraw(amount);
	}
	@Override
	public String toString() {
		return super.toString() + ", 카드번호 : " + cardNo;
	}
}
