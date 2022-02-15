package kr.green.win2;
// FloaLayout : 흐르드록 배치한다.

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	private static final long serialVersionUID = -3978598239129756515L;
	JButton buttons[] = new JButton[15];
	
	public FlowLayoutEx() {
		super("FlowLayout 연습");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 배치 관리자를 지정한다.
		// 지정하지 않으면 기본값이 카드레이아웃이라 겹쳐 보인다.
		// setLayout(new FlowLayout(FlowLayout.LEADING));
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 50));
		
		
		for(int i=0;i<buttons.length;i++) {
			buttons[i] = new JButton(i+1 + "번째 버튼");
			buttons[i].addActionListener((e)->{
				System.out.println(e.getActionCommand() + "를 눌렀다.");
			});
			add(buttons[i]);
		}
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
