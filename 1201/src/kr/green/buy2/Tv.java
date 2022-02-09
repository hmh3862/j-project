package kr.green.buy2;

public class Tv extends Product {
	
	public Tv(int price, int bonusPoint) {
		super(price, bonusPoint);
	}

	@Override
	public String toString() {
		return "Tv [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
