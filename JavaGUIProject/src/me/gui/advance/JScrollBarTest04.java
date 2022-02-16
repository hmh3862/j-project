package me.gui.advance;

import java.awt.*;
import javax.swing.*;


public class JScrollBarTest04 extends JFrame{
	public JScrollBarTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JScrollBarTest01 - ALWAYS");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		final JTextField textField = new JTextField();
	    JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
	    JPanel panel = new JPanel();
	    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	    BoundedRangeModel brm = textField.getHorizontalVisibility();
	    scrollBar.setModel(brm);
	    panel.add(textField);
	    panel.add(scrollBar);
	    add(panel, BorderLayout.NORTH);
	    
	    JTextArea textArea = new JTextArea();
	    JScrollPane pane = new JScrollPane(textArea, 
	    		                           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	    		                           JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    add(pane, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollBarTest04();
	}
}
