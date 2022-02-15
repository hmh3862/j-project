package kr.green.win2;
// GridLayout : 바둑판식 배치한다.

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutEx2 extends JFrame{

	private static final long serialVersionUID = -3978598239129756515L;
	JButton buttons[] = new JButton[16];
	String title = "123X456/789*C0=-";
	
	public GridLayoutEx2() {
		super("GridLayout 연습");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 크기 변경 못함
		
		// 배치 관리자를 지정한다.
		// 지정하지 않으면 기본값이 카드레이아웃이라 겹쳐 보인다.
		setLayout(new GridLayout(4, 4));
		
		
		for(int i=0;i<buttons.length;i++) {
			if(i!=12) {
				buttons[i] = new JButton(title.charAt(i) + "");
				if((i+1)%4==0) {
					buttons[i].setBackground(Color.magenta);
				}
				if(i==12) buttons[i].setBackground(Color.ORANGE);
				if(i==14) buttons[i].setBackground(Color.ORANGE);
				buttons[i].addActionListener((e)->{
					System.out.println(e.getActionCommand() + "를 눌렀다.");
				});
				add(buttons[i]);
			}else {
				add(new JLabel(""));
			}
		}
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GridLayoutEx2();
	}
}
