package me.gui.frame;

import java.awt.EventQueue;
import javax.swing.*;

public class FrameTest05{
	JFrame frame;
    private void FrameTest05() {
    	frame = new JFrame("FrameTest05");
    	frame.setSize(300, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				FrameTest05 win = new FrameTest05();
				win.frame.setVisible(true);
			}
		});
    }
}