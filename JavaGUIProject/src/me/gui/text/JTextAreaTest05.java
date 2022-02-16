package me.gui.text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JTextAreaTest05 extends JFrame implements ActionListener {
	JTextArea text1, text2;

	public JTextAreaTest05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextAreaTest05 - Action");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		// 텍스트를 작성
		text1 = new JTextArea("텍스트 1", 5, 40);
		text2 = new JTextArea("", 5, 40);

		// 알기 쉽도록 테두리 설정
		text1.setBorder(BorderFactory.createLineBorder(Color.gray));
		text2.setBorder(BorderFactory.createLineBorder(Color.gray));

		// 버튼을 만들
		JButton button1 = new JButton("GetText");
		JButton button2 = new JButton("GetSelect");
		JButton button3 = new JButton("GetLine");
		JButton button4 = new JButton("Add");
		JButton button5 = new JButton("Insert");
		JButton button6 = new JButton("Replace");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);

		// 텍스트 버튼을 추가
		add(text1);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(text2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextAreaTest05();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("GetText")) {
			// 텍스트 1의 내용을 텍스트 2에 표시
			text2.setText(text1.getText());
		} else if (e.getActionCommand().equals("GetSelect")) {
			// 텍스트 1 선택되어있는 내용을 텍스트 2에 표시
			text2.setText(text1.getSelectedText());
		} else if (e.getActionCommand().equals("GetLine")) {
			// 텍스트 1 행 수를 텍스트 2에 표시
			text2.setText("" + text1.getLineCount());
		} else if (e.getActionCommand().equals("Add")) {
			// 텍스트 1의 끝에 문자열을 추가
			text1.append("[ADD]");
		} else if (e.getActionCommand().equals("Insert")) {
			// 텍스트 1의 선두에 문자열을 삽입
			text1.insert("[INSERT]", 0);
		} else if (e.getActionCommand().equals("Replace")) {
			// 텍스트 1의 첫 번째 문자를 대체
			text1.replaceRange("[REPLACE]", 0, 1);
		}

	}

}