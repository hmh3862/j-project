package me.gui.text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JTextAreaTest06 extends JFrame implements ActionListener {
	JTextArea text1;

	public JTextAreaTest06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextAreaTest06 - scroll");
		setSize(500, 300);
		setLocationRelativeTo(null);
		
		StringBuffer sb = new StringBuffer(100);
		for(int i=0;i<80;i++) sb.append("      ");
		for(int i=0;i<30;i++) sb.append("하하하 123\n");
		for(int i=0;i<80;i++) sb.append(" ");
		text1 = new JTextArea(sb.toString(), 13, 40);
		text1.setBorder(BorderFactory.createLineBorder(Color.gray));

		JScrollPane scrollPane = new JScrollPane(text1);
		add(scrollPane, BorderLayout.CENTER);
		
		JButton button1 = new JButton("Copy");
		JButton button2 = new JButton("Cut");
		JButton button3 = new JButton("Paste");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1,3));
		bottomPanel.add(button1);
		bottomPanel.add(button2);
		bottomPanel.add(button3);
		add(bottomPanel, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextAreaTest06();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Copy")) {
			text1.copy();// 복사
		} else if (e.getActionCommand().equals("Cut")) {
			text1.cut();// 잘라 내기
		} else if (e.getActionCommand().equals("Paste")) {
			text1.paste();// 붙여 넣기
		}
	}
}