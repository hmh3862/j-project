package me.gui;

import javax.swing.JFrame;

public class Swing_FirstGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("첫 번째 Swing GUI 프로그램");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
