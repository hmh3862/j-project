package me.gui.frame;

import javax.swing.JFrame;

public class FrameTest09 extends JFrame{
	public FrameTest09() {
		super("FrameTest09");

		setSize(300, 300);// 크기지정
		setLocationRelativeTo(null);// 화면 중앙에
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setVisible(true);// 화면에 보이기
	}
	public static void main(String[] args) {
		FrameTest09 jf = new FrameTest09(); // 상속받은 클래스 객체 생성
		jf.setDefaultLookAndFeelDecorated(true);
		jf.setVisible(true);
	}
}
