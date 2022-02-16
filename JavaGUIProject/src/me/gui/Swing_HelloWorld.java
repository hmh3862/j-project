package me.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing_HelloWorld {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing HelloWorld!!!!");
		frame.setSize(300, 300);

		// 윈도우 중앙에 배치하기
		frame.setLocationRelativeTo(null);
		
		JLabel helloLbl = new JLabel("안녕!! Java Swing", JLabel.CENTER);
		helloLbl.setFont(new Font("굴림체", Font.BOLD, 25));
		helloLbl.setForeground(Color.RED);
		Container pane = frame.getContentPane();
		pane.add(helloLbl);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
