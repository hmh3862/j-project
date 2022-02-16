package me.gui.text;

import java.awt.*;

import javax.swing.*;

public class JTextAreaTest04 extends JFrame {

	public JTextAreaTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextAreaTest04 - Margin");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		// 텍스트를 작성
		JTextArea text1 = new JTextArea("텍스트 1", 5, 20);
		JTextArea text2 = new JTextArea("텍스트 2", 5, 20);
		JTextArea text3 = new JTextArea("텍스트 3");
		JTextArea text4 = new JTextArea("텍스트 4", 5, 10);
		JTextArea text5 = new JTextArea("텍스트 5", 5, 10);
		JTextArea text6 = new JTextArea("텍스트 6", 3, 30);

		// 여백을 설정
		text1.setMargin(new Insets(10, 10, 10, 10));
		text2.setMargin(new Insets(10, 10, 10, 10));

		// 크기를 설정
		text3.setPreferredSize(new Dimension(100, 50));

		// text1 만 테두리 설정
		text1.setBorder(BorderFactory.createLineBorder(Color.gray));

		// 편집 불가
		text4.setEditable(false);

		// 비활성화
		text5.setEnabled(false);

		// 탭 크기를 설정
		text6.setTabSize(12);

		// 알기 쉽도록 배경색을 설정
		text1.setBackground(Color.LIGHT_GRAY);
		text2.setBackground(Color.LIGHT_GRAY);
		text3.setBackground(Color.LIGHT_GRAY);
		text4.setBackground(Color.LIGHT_GRAY);
		text5.setBackground(Color.LIGHT_GRAY);
		text6.setBackground(Color.LIGHT_GRAY);

		add(text1);
		add(text2);
		add(text3);
		add(text4);
		add(text5);
		add(text6);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextAreaTest04();
	}

}