package kr.green.thred3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// 소비자 스레드 : 공유 영역의 데이터를 소모하는 스레드
@NoArgsConstructor
@Getter
@Setter
public class PrintThread extends Thread {
    private volatile SharedArea sharedArea;
    public void run() {
    	// 이 반복은 문제가 있다. 
    	// 뭐지? 반복문의 종료를 나타내는 변수 isReady값이 반복문 안에서 변경되지 않는다.
    	// 그러면 자바 컴파일러가 알아서 무한반복문으로 바꿔서 컴파일을 한다. ==> while(true){}
    	// 반복문 내에서는 isReady값이 바뀌지 않지만 외부에 의해서 변경되어 종료가 되어야만 정상 작동을 한다.
    	// 그렇다면 컴파일러보고 코드 제멋대로 해석하지 말라고 지정해 주어야 한다.
    	// 이때 사용하는 지시어가 "volatile"이다.
    	while(sharedArea.isReady() != true){
    		
			continue;
		}
		System.out.println(sharedArea.getResult());
    }
}
