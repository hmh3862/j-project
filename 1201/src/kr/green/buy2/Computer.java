package kr.green.buy2;

public class Computer extends Product {
	
	public Computer(int price, int bonusPoint) {
		super(price, bonusPoint);
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
