package me.gui.advance;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JProgressBarTest02 extends JFrame implements ActionListener {
	JProgressBar hpb;
	public JProgressBarTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBarTest01 - ActionListener");
		setSize(300, 400);
		setLocationRelativeTo(null);
		hpb = new JProgressBar();
		add(hpb, BorderLayout.NORTH);
		JButton btn = new JButton("Step");
		btn.addActionListener(this);
		add(btn, BorderLayout.SOUTH);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int value = hpb.getValue() + 7;
		if (value > hpb.getMaximum()) {
			value = hpb.getMaximum();
		}
		hpb.setValue(value);
	}
	public static void main(String[] args) {
		new JProgressBarTest02();
	}
}
