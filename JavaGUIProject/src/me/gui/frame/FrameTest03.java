package me.gui.frame;

import javax.swing.JFrame;

public class FrameTest03 extends JFrame{
	// JFrame클래스를 상속받아 만들기
	public FrameTest03() {
		super("FrameTest03");
		// 크기지정
		setSize(300, 300);
		// 종료지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면 중앙에
		setLocationRelativeTo(null);
		// 화면에 보이기
		setVisible(true);
	}
	public static void main(String[] args) {
		// 상속받은 클래스 객체 생성
		new FrameTest03(); 
	}
}
