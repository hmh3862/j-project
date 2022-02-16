package me.gui.advance;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JProgressBarTest06 extends JFrame{
	public JProgressBarTest06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBarTest06 - setIndeterminate");
		setSize(300, 400);
		setLocationRelativeTo(null);

		JProgressBar progressBar = new JProgressBar(JProgressBar.VERTICAL,0,100);
		progressBar.setIndeterminate(true);

	    add(progressBar, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JProgressBarTest06();
	}
}
