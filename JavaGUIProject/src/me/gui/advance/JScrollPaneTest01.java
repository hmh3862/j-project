package me.gui.advance;

import java.awt.*;

import javax.swing.*;

public class JScrollPaneTest01 extends JFrame {
	public JScrollPaneTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JScrollBarTest01 - Constructor");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(5,1));
		
		JScrollPane sp1  = new JScrollPane();
		add(sp1);
		
		JTextArea description = new JTextArea(10, 60); 
		JScrollPane sp2  = new JScrollPane(description);
		add(sp2);
		
		JTextArea comments1 = new JTextArea(10, 60); 
		JScrollPane sp3  = new JScrollPane(comments1, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(sp3);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollPaneTest01();
	}
}
