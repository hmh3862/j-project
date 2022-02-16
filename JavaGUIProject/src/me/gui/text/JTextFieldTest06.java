package me.gui.text;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class JTextFieldTest06 extends JFrame {
	JTextField textField;

	public JTextFieldTest06() {
		super("JTextFieldTest06 - Save");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 100));
		setLocationRelativeTo(null);
		JPanel panel = new JPanel(new BorderLayout());
		JLabel label = new JLabel("Name: ");
		label.setDisplayedMnemonic(KeyEvent.VK_N);
		textField = new JTextField();
		textField.setText("");
		textField.setToolTipText("이름을 입력하세요");
		label.setLabelFor(textField);
		panel.add(label, BorderLayout.WEST);
		panel.add(textField, BorderLayout.CENTER);
		add(panel, BorderLayout.NORTH);
		
		JButton saveBtn = new JButton("저장하기");
		saveBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String filename = textField.getText().substring(0, 2)+".txt";
				try(FileWriter writer = new FileWriter(filename)){
					textField.write(writer);
				} catch (IOException exception) {
					System.err.println("저장못함");
				}
			}
		});
		add(saveBtn, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest06();
	}
}
