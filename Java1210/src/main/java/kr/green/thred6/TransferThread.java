package kr.green.thred6;

public class TransferThread extends Thread {
    SharedArea sharedArea;
    TransferThread(SharedArea area) {   // 생성자
        sharedArea = area;
    }
    public void run() {
       // 은행 업무 창구에서 입출금이 이루어지고 있다. 
       for (int cnt = 0; cnt < 12; cnt ++) {
    	   // 작업 전환이 이루어지면 안되는 부분을 반드시 synchronized블록으로 감싸줘야 한다.
    	   sharedArea.transfer();
        }
    }
}
