package me.gui.text;

import java.awt.*;
import javax.swing.*;

public class JTextAreaTest03 extends JFrame {

	public JTextAreaTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextAreaTest03 - LineWrap");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		// 텍스트를 작성
		JTextArea text1 = new JTextArea("Text1 01234567890ABCDE 한글", 5, 10);
		JTextArea text2 = new JTextArea("Text2 01234567890ABCDE 한글", 5, 10);
		JTextArea text3 = new JTextArea("Text3 01234567890ABCDE 한글", 5, 10);

		// 줄 바꿈 여부를 설정
		text1.setLineWrap(true);
		text2.setLineWrap(true);
		text3.setLineWrap(false);

		// 단어 단위로 줄 바꿈
		text2.setWrapStyleWord(true);

		text1.setBorder(BorderFactory.createLineBorder(Color.gray));
		text2.setBorder(BorderFactory.createLineBorder(Color.gray));
		text3.setBorder(BorderFactory.createLineBorder(Color.gray));

		add(text1);
		add(text2);
		add(text3);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextAreaTest03();
	}

}