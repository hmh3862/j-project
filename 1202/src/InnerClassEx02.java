import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class InnerClassEx02 {
	public static void main(String[] args) {
		JFrame win = new JFrame("내가 만든 윈도우"); // 윈도우 만들고
		win.setSize(500,400); // 크기지정하고
		win.setLocationRelativeTo(null); // 나타날 위치 지정하고 :  화면 중앙
		
		// 윈도우 종료를 외부 클래스로 만들어 지정
		// win.addWindowListener(new WinClose());
		
		// 윈도우 종료를 내부 클래스로 만들어 지정 : 관리가 더 편해진다.
		// win.addWindowListener(new WinClose());
		
		// 윈도우 종료 지정은 1회만 한다. 그렇다면 익명 내부클래스가 더 좋다.
		win.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0); // 프로그램 강제 종료
			}
		});
		
		win.setVisible(true); // 보여줘
	}
	
	// 윈도우 종료를 지정하는 내부 클래스
	static class WinClose extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			super.windowClosing(e);
			System.exit(0); // 프로그램 강제 종료
		}
	}
}

// 윈도우 종료를 지정하는 클래스
class WinClose extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
		System.exit(0); // 프로그램 강제 종료
	}
}