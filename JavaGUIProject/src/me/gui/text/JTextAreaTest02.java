package me.gui.text;

import java.awt.*;
import javax.swing.*;

public class JTextAreaTest02 extends JFrame {
	JTextArea text1,text2,text3,text4;
	
	public JTextAreaTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextAreaTest02 - Setting");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		text1 = new JTextArea("문자열1 문자열1", 5, 20);
		text2 = new JTextArea("문자열2 문자열2", 5, 20);
		text3 = new JTextArea("문자열3 문자열3", 5, 20);
		text4 = new JTextArea("문자열4 문자열4", 5, 20);
		
		text1.setForeground(Color.RED);
		text1.setBackground(Color.YELLOW);
		
		text2.setFont(new Font("나눔코딩", Font.BOLD, 15));
		
		text3.setSelectionColor(Color.GREEN);
		text3.setSelectedTextColor(Color.YELLOW);
		text3.setSelectionStart(2);
		text3.setSelectionEnd(6);
		
		text4.setCursor(new Cursor(Cursor.HAND_CURSOR));	

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
		new JTextAreaTest02().text3.requestFocus();;
	}

}