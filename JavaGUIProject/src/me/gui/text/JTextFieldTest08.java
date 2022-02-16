package me.gui.text;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class JTextFieldTest08 extends JFrame {
	final JTextField textField = new JTextField(15);
	JButton cutBtn = new JButton("잘라내기");
	JButton pasteBtn = new JButton("붙여넣기");
	JButton copyBtn = new JButton("복사하기");

	public JTextFieldTest08() {
		super("JTextFieldTest08 - Copy & Cut & Paste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(new Dimension(300, 100));
		
		cutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				textField.cut();
			}
		});

		pasteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				textField.paste();
			}
		});

		copyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				textField.copy();
			}
		});

		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent ce) {
				System.out.println("All text: " + textField.getText());
				if (textField.getSelectedText() != null)
					System.out.println("Selected text: "
							+ textField.getSelectedText());
				else
					System.out.println("Selected text: ");
			}
		});
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1,3));
		bottomPanel.add(cutBtn);
		bottomPanel.add(pasteBtn);
		bottomPanel.add(copyBtn);
		add(textField, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextFieldTest08();
	}
}
