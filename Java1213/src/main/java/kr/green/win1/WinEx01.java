package kr.green.win1;

import javax.swing.JFrame;
// 상속 받아서 사용
public class WinEx01  extends JFrame {

	private static final long serialVersionUID = -8169645444846386559L;

	// 생성자에서 디자인을 한다.
	public WinEx01() {
		this("나의 첫번째 윈도우");
	}
	public WinEx01(String title) {
		super(title); // 제목지정
		setSize(400, 400); // 크기 지정
		setLocationRelativeTo(null); // 화면의 정 중앙에 표시되어라
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 종료
		setVisible(true); // 보여줘
	}
	
	public static void main(String[] args) {
		new WinEx01();
	}
}
