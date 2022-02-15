package kr.green.win1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// 상속 받아서 사용
public class WinEx02  extends JFrame implements ActionListener {

	private static final long serialVersionUID = -8169645444846386559L;

	// 생성자에서 디자인을 한다.
	public WinEx02() {
		this("나의 첫번째 윈도우");
	}
	public WinEx02(String title) {
		super(title); // 제목지정
		setSize(400, 400); // 크기 지정
		setLocationRelativeTo(null); // 화면의 정 중앙에 표시되어라
		
		// 배치 관리자 등록
		setLayout(new FlowLayout());
		
		// 프레임은 컨테이너 이기 때문에 다른 컴포넌트를 가질 수 있다.
		JButton jButton = new JButton("Exit"); // 버튼 컴포넌트 객체 생성
		jButton.addActionListener(this); // 이벤트 등록 : 할일을 지정한다.
		add(jButton); // 프레임에 추가
		
		JButton jButton2 = new JButton("배경색 바꾸기"); // 버튼 컴포넌트 객체 생성
		jButton2.addActionListener(this); // 이벤트 등록 : 할일을 지정한다.
		add(jButton2); // 프레임에 추가
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 종료
		setVisible(true); // 보여줘
	}
	
	public static void main(String[] args) {
		new WinEx02();
	}
	
	private static final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN};
	private static int index = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String title = e.getActionCommand(); // 현재 이벤트를 발생한 컴포넌트의 제목을 가져온다.
		switch (title) {
		case "Exit":
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		case "배경색 바꾸기":
			this.getContentPane().setBackground(colors[index]); // 윈도우 배경색 변경하기
			index = ++index%colors.length;
			break;
		}
	}
}

