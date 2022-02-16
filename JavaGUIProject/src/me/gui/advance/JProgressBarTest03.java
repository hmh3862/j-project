package me.gui.advance;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JProgressBarTest03 extends JFrame{
	final Timer timer;
	final JProgressBar progressBar = new JProgressBar();
	final JButton button = new JButton("Start");

	public JProgressBarTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBarTest01 - ActionListener");
		setSize(300, 400);
		setLocationRelativeTo(null);
		ActionListener updateProBar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				int val = progressBar.getValue();
				if (val >= 100) {
					button.setText("End");
					return;
				}
				progressBar.setValue(++val);
			}
		};
		timer = new Timer(50, updateProBar);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (timer.isRunning()) {
					timer.stop();
					button.setText("Start");
				} else if (button.getText() != "End") {
					timer.start();
					button.setText("Stop");
				}
			}
		});
		
	    setLayout(new FlowLayout());
	    add(progressBar);
	    add(button);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JProgressBarTest03();
	}
}
