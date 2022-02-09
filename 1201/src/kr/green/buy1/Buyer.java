package kr.green.buy1;

public class Buyer {
	private int money;
	private int bonusPoint;
	
	public Buyer(int money) {
		this.money = money;
		this.bonusPoint = 0;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	// 제품이 추가될때마다 여기에 buy라는 메서드를 일일히 추가해주어야 한다.
	
	// TV를 구매하는 메서드
	public void buy(Tv vo) {
		if(this.money>vo.getPrice()) {
			this.money -= vo.getPrice();
			this.bonusPoint += vo.getBonusPoint();
			System.out.println( vo.getClass().getName() +  "구매 성공!");
		}else {
			System.out.println( vo.getClass().getName() +  "구매 실패!!");
		}
	}
	// 컴퓨터를 구매하는 메서드
	public void buy(Computer vo) {
		if(this.money>vo.getPrice()) {
			this.money -= vo.getPrice();
			this.bonusPoint += vo.getBonusPoint();
			System.out.println( vo.getClass().getName() +  "구매 성공!");
		}else {
			System.out.println( vo.getClass().getName() +  "구매 실패!!");
		}
	}
	// 오디오를 구매하는 메서드
	public void buy(Audio vo) {
		if(this.money>vo.getPrice()) {
			this.money -= vo.getPrice();
			this.bonusPoint += vo.getBonusPoint();
			System.out.println( vo.getClass().getName() +  "구매 성공!");
		}else {
			System.out.println( vo.getClass().getName() +  "구매 실패!!");
		}
	}

	@Override
	public String toString() {
		return "Buyer [money=" + money + ", bonusPoint=" + bonusPoint + "]";
	}
	
	
}
