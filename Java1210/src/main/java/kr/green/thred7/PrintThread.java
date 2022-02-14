package kr.green.thred7;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// 소비자 스레드 : 공유 영역의 데이터를 소모하는 스레드
@NoArgsConstructor
@Getter
@Setter
public class PrintThread extends Thread {
    private SharedArea sharedArea;
    public void run() {
    	if(!sharedArea.isReady()) { // 계산이 종료되었는지 1번 물어보고
    		// 대기 상태로 들어간다.
    		try {
    			// wait()나 notify() 반드시 동기화를 해두어야 한다. 그렇지 않으면 예외 발생!!!!
    			synchronized (sharedArea) {
    				sharedArea.wait(); // 스레드를 대기 상태로 만든다.
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
        System.out.println(sharedArea.getResult());
    }
}
