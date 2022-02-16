package me.gui.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest2 extends JFrame{
	JButton[] btn;
	public BorderLayoutTest2() {
		super("BorderLayout Test2");
		setSize(400, 300);
		setLocationRelativeTo(null);
		
		btn = new JButton[10];
		for(int i=0;i<10;i++){
			btn[i] = new JButton("버튼 " + (i+1));
		}
		getContentPane().add(btn[0], BorderLayout.NORTH);
		getContentPane().add(btn[1], BorderLayout.WEST);
		getContentPane().add(btn[3], BorderLayout.EAST);
		getContentPane().add(btn[4], BorderLayout.SOUTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(btn[5],BorderLayout.NORTH);
		centerPanel.add(btn[6],BorderLayout.WEST);
		centerPanel.add(btn[7],BorderLayout.CENTER);
		centerPanel.add(btn[8],BorderLayout.EAST);
		centerPanel.add(btn[9],BorderLayout.SOUTH);
		
		getContentPane().add(centerPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutTest2();
	}
}
