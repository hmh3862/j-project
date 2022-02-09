package kr.green.buy2;

public class AppMain {
	public static void main(String[] args) {
		Buyer kimc = new Buyer(100_0000);
		Tv tv1 = new Tv(50_0000, 1000);
		Tv tv2 = new Tv(150_0000, 15000);
		Computer computer = new Computer(10_0000, 2000);		
		Audio audio = new Audio(10000, 200);
		
		System.out.println(kimc);
		kimc.buy(tv1);
		kimc.buy(tv2);
		kimc.buy(computer);
		kimc.buy(audio);
		System.out.println(kimc);
		
		
	}
}
