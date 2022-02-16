package me.gui.advance;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JProgressBarTest04 extends JFrame implements Runnable {
	JProgressBar vPprogress;
	JProgressBar hPprogress;

	public void run() {
		int minimum = vPprogress.getMinimum();
		int maximum = vPprogress.getMaximum();
		for (int i = minimum; i < maximum; i++) {
			try {
				int value = vPprogress.getValue();
				vPprogress.setValue(value + 1);
				hPprogress.setValue(value + 1);
				Thread.sleep(100);
			} catch (InterruptedException ignoredException) {
			}
		}
	}

	public JProgressBarTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBarTest04 - label Printing");
		setSize(300, 400);
		setLocationRelativeTo(null);

		vPprogress = new JProgressBar(JProgressBar.VERTICAL,0, 100);
		vPprogress.setStringPainted(true);
		hPprogress = new JProgressBar(JProgressBar.HORIZONTAL,0, 100);
		hPprogress.setStringPainted(true);
		add(vPprogress, BorderLayout.WEST);
		add(hPprogress, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		JProgressBarTest04 win = new JProgressBarTest04();
		Thread thread = new Thread(win);
		thread.start();
	}
}
