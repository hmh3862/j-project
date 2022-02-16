package me.gui.text;

import java.awt.*;
import javax.swing.*;

public class JTextAreaTest01 extends JFrame {

	public JTextAreaTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextAreaTest01 - Constructor");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JTextArea text1 = new JTextArea();
		JTextArea text2 = new JTextArea("텍스트 2");
		JTextArea text3 = new JTextArea(5, 20);
		JTextArea text4 = new JTextArea("텍스트 4", 5, 20);

		text1.setBorder(BorderFactory.createLineBorder(Color.gray));
		text2.setBorder(BorderFactory.createLineBorder(Color.gray));
		text3.setBorder(BorderFactory.createLineBorder(Color.gray));
		text4.setBorder(BorderFactory.createLineBorder(Color.gray));

		add(text1);
		add(text2);
		add(text3);
		add(text4);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextAreaTest01();
	}

}