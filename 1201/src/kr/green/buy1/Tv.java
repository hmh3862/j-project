package kr.green.buy1;

public class Tv {
	private int price;
	private int bonusPoint;
	
	public Tv(int price, int bonusPoint) {
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	@Override
	public String toString() {
		return "Tv [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
