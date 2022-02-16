package me.gui.layout;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutTest extends JFrame{
	public BoxLayoutTest() {
		super("BoxLayout Test");
		setSize(400, 300);
		setLocationRelativeTo(null);
		
		JPanel bottomPanel = new JPanel();
	    BoxLayout boxLayout = new BoxLayout(bottomPanel, BoxLayout.X_AXIS);
	    bottomPanel.setLayout(boxLayout);
	    for (int i = 0; i < 5; i++) {
	    	bottomPanel.add(new JButton("버튼  " + (i+1)));
	    }
	    getContentPane().add(bottomPanel, BorderLayout.SOUTH);
	    
		JPanel leftPanel = new JPanel();
	    BoxLayout boxLayout2 = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
	    leftPanel.setLayout(boxLayout2);
	    for (int i = 0; i < 5; i++) {
	    	leftPanel.add(new JButton("버튼  " + (i+1)));
	    }
	    getContentPane().add(leftPanel, BorderLayout.WEST);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BoxLayoutTest();
	}
}
