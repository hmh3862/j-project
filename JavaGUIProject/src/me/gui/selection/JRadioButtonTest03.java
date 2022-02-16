package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;

public class JRadioButtonTest03 extends JFrame implements ActionListener {
	JLabel imageLabel;
	Icon man, woman, robot;
	ButtonGroup bg;

	public JRadioButtonTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JRadioButtonTest03 - selected");
		setSize(300, 300);
		setLocationRelativeTo(null);

		JRadioButton b1 = new JRadioButton("남자", true);
		JRadioButton b2 = new JRadioButton("여자");
		JRadioButton b3 = new JRadioButton("넌누구냐?");

		bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);

		JPanel top = new JPanel();
		top.add(b1);
		top.add(b2);
		top.add(b3);
		add(top, BorderLayout.NORTH);

		man = new ImageIcon("images/man.png");
		woman = new ImageIcon("images/woman.png");
		robot = new ImageIcon("images/robot.png");

		imageLabel = new JLabel("남자", JLabel.CENTER);
		imageLabel.setIcon(man);
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		add(imageLabel, BorderLayout.CENTER);

		JPanel bottomPanel = new JPanel();
		JButton checkBtn = new JButton("확인하기");
		checkBtn.addActionListener(this);
		bottomPanel.add(checkBtn);
		add(bottomPanel, BorderLayout.SOUTH);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Enumeration g = bg.getElements();
		while (g.hasMoreElements()) {
			JRadioButton b = (JRadioButton) g.nextElement();
			if (b.isSelected()) {
				imageLabel.setText(b.getText());
				if (b.getText().equals("남자"))
					imageLabel.setIcon(man);
				else if (b.getText().equals("여자"))
					imageLabel.setIcon(woman);
				else
					imageLabel.setIcon(robot);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new JRadioButtonTest03();
	}
}
