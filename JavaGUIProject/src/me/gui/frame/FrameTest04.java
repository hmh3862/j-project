package me.gui.frame;

import java.awt.EventQueue;

import javax.swing.*;

public class FrameTest04 implements Runnable {
	JFrame frame;
	
    private void initialize() {
    	frame = new JFrame("FrameTest04");
    	frame.setSize(300, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
    	initialize();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new FrameTest04());
    }
}