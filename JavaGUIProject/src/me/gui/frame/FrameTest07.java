package me.gui.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class FrameTest07 extends JFrame{
	public FrameTest07() {
		super("FrameTest07");
		setSize(300, 300);// 크기지정
		setLocationRelativeTo(null);// 화면 중앙에
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 종료지정
		
		JLabel label = new JLabel("Hello Swing!!", JLabel.CENTER);
		Container pane = getContentPane(); // ContentPane얻기
		pane.add(label, BorderLayout.NORTH); // ContentPane에 JLabel 붙이기
		
		JLabel label2 = new JLabel("Hello Java!!", JLabel.CENTER);
		add(label2, BorderLayout.SOUTH); // JFrame에 JLabel 붙이기
		
		setVisible(true);// 화면에 보이기
	}
	public static void main(String[] args) {
		new FrameTest07(); // 상속받은 클래스 객체 생성
	}
}
