package me.gui.text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.*;

public class JTextFieldTest04 extends JFrame {
	private JTextField nameTF, ageTF;

	public JTextFieldTest04() {
		super("JTextFieldTest04 - Action Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 100));
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 2));
		add(new JLabel("이름 : ", JLabel.RIGHT));
		nameTF = new JTextField(10);
		nameTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ageTF.requestFocus();
			}
		});
		add(nameTF);
		add(new JLabel("나이 : ", JLabel.RIGHT));
		ageTF = new JTextField(10);
		ageTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTF.requestFocus();
			}
		});
		add(ageTF);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextFieldTest04();
	}
}
