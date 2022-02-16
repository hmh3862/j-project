package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;

public class JComboBoxTest02 extends JFrame implements ActionListener {
	JLabel imageLabel;
	Icon man, woman, robot;
	JComboBox<String> combo;

	public JComboBoxTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JComboBoxTest02 - ActionListener");
		setSize(300, 300);
		setLocationRelativeTo(null);

		String[] gender = { "남자", "여자", "넌누구냐?" };
		combo = new JComboBox<String>(gender);
		combo.addActionListener(this);
		add(combo, BorderLayout.NORTH);

		man = new ImageIcon("images/man.png");
		woman = new ImageIcon("images/woman.png");
		robot = new ImageIcon("images/robot.png");

		imageLabel = new JLabel("남자", JLabel.CENTER);
		imageLabel.setIcon(man);
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		add(imageLabel, BorderLayout.CENTER);

		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object contents = combo.getSelectedItem();
		if (contents.equals("남자")) {
			imageLabel.setIcon(man);
			imageLabel.setText("남자");
		} else if (contents.equals("여자")) {
			imageLabel.setIcon(woman);
			imageLabel.setText("여자");
		} else {
			imageLabel.setIcon(robot);
			imageLabel.setText("넌누구냐?");
		}
	}
	public static void main(String[] args) {
		new JComboBoxTest02();
	}
}
