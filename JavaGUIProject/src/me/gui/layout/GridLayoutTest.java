package me.gui.layout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{
	JButton[] btn;
	public GridLayoutTest() {
		super("GridLayout Test");
		setSize(600, 200);
		setLocationRelativeTo(null);
		
		//setLayout(new GridLayout());
		//setLayout(new GridLayout(3,5));
		//setLayout(new GridLayout(4,4));
		setLayout(new GridLayout(5,2));
		
		btn = new JButton[15];
		for(int i=0;i<btn.length;i++){
			btn[i] = new JButton("버튼" + (i+1));
			getContentPane().add(btn[i]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
