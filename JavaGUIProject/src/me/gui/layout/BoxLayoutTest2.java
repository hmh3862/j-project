package me.gui.layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutTest2 extends JFrame{
	public BoxLayoutTest2() {
		super("BoxLayout Test2");
		setSize(400, 200);
		setLocationRelativeTo(null);
		
	    Box hBox = Box.createHorizontalBox();
	    hBox.add(new JButton("First"));
	    hBox.add(new JButton("Previous"));
	    hBox.add(Box.createHorizontalGlue());
	    hBox.add(new JButton("Next"));
	    hBox.add(new JButton("Last"));
	    getContentPane().add(hBox, BorderLayout.SOUTH);
	    
	    Box vBox = Box.createVerticalBox();
	    vBox.add(new JButton("First"));
	    vBox.add(new JButton("Previous"));
	    vBox.add(Box.createVerticalGlue());
	    vBox.add(new JButton("Next"));
	    vBox.add(new JButton("Last"));
	    getContentPane().add(vBox, BorderLayout.WEST);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BoxLayoutTest2();
	}
}
