package kr.green.buy1;

public class AppMain {
	public static void main(String[] args) {
		Buyer kimc = new Buyer(100_0000);
		Tv tv1 = new Tv(50_0000, 1000);
		Tv tv2 = new Tv(150_0000, 15000);
		Audio audio = new Audio(30_0000, 500);
		
		
		System.out.println(kimc);
		kimc.buy(tv1);
		kimc.buy(tv2);
		kimc.buy(audio); 
		System.out.println(kimc);
		
		
	}
}
