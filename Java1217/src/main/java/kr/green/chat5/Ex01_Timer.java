package kr.green.chat5;

import java.util.Timer;
import java.util.TimerTask;

/*
JDK 1.3에 추가되었던 java.util.Timer 클래스와 java.util.TimerTask 클래스를 이용하면 
백그라운드에서 특정한 시간 또는 일정 시간을 주기로 반복적으로 특정 작업을 실행할 수 있도록 해준다.

java.util.Timer 클래스
Timer 클래스는 아래와 같이 3가지의 메소드를 제공한다.
schedule
scheduleAtFixedRate
cancel

이 중, schedule 메소드는 4가지 형태로 오버로딩 되어있다.
void schedule(TimerTask task, Date time) - 설정한 time 시간에, 설정한 task 작업을 수행한다.
void schedule(TimerTask task, Date firstTime, long period) - firstTime 부터 period 간격으로 task 작업을 수행한다.
void schedule(TimerTask task, long delay) - delay 시간이 지난 후에, task를 수행한다.
void schedule(TimerTask task, long delay, long period) - dealy 시간이 지난 후에, period 간격으로 task를 수행한다.

scheduleAtFixedRate 메소드는 fixed-delay 방식이 아니므로, 정확학게 일정 시간 간격으로 작업을 실행해야 할 때 적합하다.
void scheduleAtFixedRate(TimerTask task, Date firstTime, long period) - 지정한 시간부터 일정한 간격으로 task를 수행한다.
void scheduleAtFixedRate(TimerTask task, long delay, long period) - 일정한 시간(delay)가 지난 후 일정한 간격으로 task를 수행한다.

cancel() 메소드는 Timer를 중지시키며, 실행 중인 task 작업을 제외한 예정된 작업들은 모두 취소한다.
*/
public class Ex01_Timer {
	public static void main(String[] args) {
		// 실행기
		Timer timer = new Timer();
		// 실행할 내용
		TimerTask task = new TimerTask() {
			int count = 0;

			@Override
			public void run() {
				// 여기에 실행시키고 싶은 내용을 코딩한다.
				if (++count <= 5) {
					System.out.println("실행~~~~" + System.currentTimeMillis());
				} else {
					timer.cancel(); // 취소
				}
			}
		};
		// 스케쥴 등록
		timer.schedule(task, 1000, 1000); // 1초 후에 1초 간격으로 run()안의 내용이 실행.... 5번
		// 3초후에 1회
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("난 3초후에 실행되지롱!!!!");
			}
		}, 3000);
		// 10초 후에 자동저장을 10초마다 해라
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("자동 저장 했습니다.");
			}
		}, 1000 * 10, 10 *1000 );
	}
}
