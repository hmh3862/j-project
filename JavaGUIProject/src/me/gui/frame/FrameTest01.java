package me.gui.frame;

import javax.swing.JFrame;

public class FrameTest01 {
	public static void main(String[] args) {
		// 직접 JFrame객체 생성하여 만들기
		// JFrame객체 생성
		JFrame frame = new JFrame("FrameTest01");
		// 크기지정
		frame.setSize(300, 300);
		// 종료지정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면 중앙에
		frame.setLocationRelativeTo(null);
		// 화면에 보이기
		frame.setVisible(true);
	}
}
