package kr.green.thred7;

public class ProgressThread  extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.print("계산중");
		while(true) {
			System.out.print(".");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
