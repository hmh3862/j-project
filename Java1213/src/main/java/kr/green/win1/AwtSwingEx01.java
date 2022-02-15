package kr.green.win1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class AwtSwingEx01 {
	public static void main(String[] args) {
		// AWT
		Frame frame1 = new Frame("win01"); // 프레임 만들고
		frame1.setSize(300, 400); // 크기 지정
		frame1.setLocation(100, 200); // 나타날 위치 지정
		// 종료지정 이벤트 등록
		frame1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 강제 종료
			}
		});
		frame1.setVisible(true); // 보여줘
		
		// SWING : 컴포넌트 클래스이름이 모두 J로 시작된다.
		JFrame frame2 = new JFrame("win02");
		frame2.setSize(300, 400);
		frame2.setLocation(400, 200);
		// frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료 지정 -- 위의 것처럼 해도 된다.
		frame2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame2.dispose(); // 자원을 반납해라!!! -- 현제 윈도우만 종료
				// System.exit(0); // 프로그램 강제 종료
				
			}
		});
		frame2.setVisible(true);
	}
}
