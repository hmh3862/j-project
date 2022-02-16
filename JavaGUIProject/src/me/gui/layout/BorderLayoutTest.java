package me.gui.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame{
	JButton[] btn;
	public BorderLayoutTest() {
		super("BorderLayout Test");
		setSize(400, 300);
		setLocationRelativeTo(null);
		
		btn = new JButton[5];
		for(int i=0;i<5;i++){
			btn[i] = new JButton((i+1) + "번째 버튼");
			//getContentPane().add(btn[i]);
		}
		getContentPane().add(btn[0], BorderLayout.NORTH);
		getContentPane().add(btn[1], BorderLayout.WEST);
		getContentPane().add(btn[2], BorderLayout.CENTER);
		getContentPane().add(btn[3], BorderLayout.EAST);
		getContentPane().add(btn[4], BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
