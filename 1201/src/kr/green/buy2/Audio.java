package kr.green.buy2;

public class Audio extends Product {
	
	public Audio(int price, int bonusPoint) {
		super(price, bonusPoint);
	}

	@Override
	public String toString() {
		return "Audio [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
