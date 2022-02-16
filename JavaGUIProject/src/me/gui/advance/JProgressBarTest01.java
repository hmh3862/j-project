package me.gui.advance;

import java.awt.*;
import javax.swing.*;

public class JProgressBarTest01 extends JFrame {
	public JProgressBarTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBarTest01 - Constructor");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JProgressBar hpb1  = new JProgressBar();
		JProgressBar hpb2  = new JProgressBar(SwingConstants.HORIZONTAL);
		JProgressBar hpb3  = new JProgressBar(SwingConstants.HORIZONTAL, 20,   200);
		JProgressBar vpb1  = new JProgressBar(SwingConstants.VERTICAL);
		JProgressBar vpb2  = new JProgressBar(SwingConstants.VERTICAL, 5, 50);
		DefaultBoundedRangeModel model = new DefaultBoundedRangeModel(0, 0, 0, 250);
		JProgressBar hpb4 = new JProgressBar(model);
		JPanel centerPanel = new JPanel();
		add(vpb1,BorderLayout.WEST);
		add(vpb2,BorderLayout.EAST);
		centerPanel.add(hpb1);
		centerPanel.add(hpb2);
		centerPanel.add(hpb3);
		add(centerPanel,BorderLayout.CENTER);
		add(hpb4,BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JProgressBarTest01();
	}
}
