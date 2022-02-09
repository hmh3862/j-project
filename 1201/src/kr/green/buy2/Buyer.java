package kr.green.buy2;

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

	// 구매하는 메서드 : 
	// 매개변수의 다형성
	// 매개변수를 부모타입의 변수로 선언했기때문에 Product를 상속한 모든 제품은 이메서드 1개로 모두 구매가 가능하다 
	public void buy(Product product) {
		if(this.money>product.getPrice()) {
			this.money -= product.getPrice();
			this.bonusPoint += product.getBonusPoint();
			System.out.println( product.getClass().getName() +  "구매 성공!");
		}else {
			System.out.println( product.getClass().getName() +  "구매 실패!!");
		}
	}


	@Override
	public String toString() {
		return "Buyer [money=" + money + ", bonusPoint=" + bonusPoint + "]";
	}
	
	
}
