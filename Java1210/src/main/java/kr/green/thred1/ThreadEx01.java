package kr.green.thred1;
// 스레드를 만드는 방법 2가지
// 1. Thread클래스를 상속받아 run()메서드를 오버라이딩 한다.
class AlphabetThread extends Thread{
	@Override
	public void run() {
		super.run();
		for(int i=0;i<26;i++) {
			System.out.print((char)('A' + i));
			try { Thread.sleep(500);}catch (Exception e) { ; } // 0.5초 대기
		}
		System.out.println("\n알파벳스레드 종료!!!");
	}
}
// 2. Runnable인터페이스를 구현한다.
class KoreanThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<26;i++) {
			System.out.print((char)('ㄱ' + i));
			try { Thread.sleep(500);}catch (Exception e) { ; } // 0.5초 대기
		}
		System.out.println("\n한글스레드 종료!!!");
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {
		// 지금 까지의 메서드를 호출 하는 일반적인 방법 : 순차 처리가 된다.
		/*
		// 싱글 스레드
		Thread thread = new AlphabetThread();
		thread.run(); // run()을 호출하면 싱글 스레드
		KoreanThread thread2 = new KoreanThread();
		thread2.run();
		for(int i=0;i<26;i++) {
			System.out.print((i));
		}
		System.out.println("\n메인스레드 종료!!!");
		*/
		
		// 멀티 스레드 실행 방법
		Thread thread = new AlphabetThread(); // 상속받은 것은 객체를 직접 사용
		Thread thread2 = new Thread(new KoreanThread()); // 인터페이스를 구현한 것은 Thread의 생성자에 전달되어 객체 생성
		
		// 멀티스레드로 작동하게 하기 위해서는 반드시 start()메서드로 실행해야 한다.
		thread.start();
		thread2.start();
		for(int i=0;i<26;i++) {
			System.out.print((i));
			try { Thread.sleep(500);}catch (Exception e) { ; } // 0.5초 대기
		}
		System.out.println("\n메인스레드 종료!!!");
	}
}
