package me.gui.frame;

import javax.swing.JFrame;

class MyFrame extends JFrame{
	// JFrame클래스를 상속받아 만들기
	public MyFrame() {
		super("FrameTest02");
		// 크기지정
		setSize(300, 300);
		// 종료지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면 중앙에
		setLocationRelativeTo(null);
		// 화면에 보이기
		setVisible(true);
	}
}

public class FrameTest02{
	public static void main(String[] args) {
		// 상속받은 클래스 객체 생성
		new MyFrame(); 
	}
}
