package me.gui.advance;

import java.awt.*;
import javax.swing.*;

public class JScrollBarTest01 extends JFrame {
	public JScrollBarTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JScrollBarTest01 - Constructor");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JScrollBar hJScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
		add(hJScrollBar,BorderLayout.SOUTH);
		JScrollBar vJScrollBar = new JScrollBar(JScrollBar.VERTICAL);
		add(vJScrollBar,BorderLayout.EAST);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollBarTest01();
	}
}
