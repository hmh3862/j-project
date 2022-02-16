package me.gui.layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame{
	JButton[] btn;
	public FlowLayoutTest() {
		super("FlowLayout Test");
		setSize(400, 300);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
		
		btn = new JButton[10];
		for(int i=0;i<btn.length;i++){
			btn[i] = new JButton(String.format("%02d",i+1) + "번째 버튼");
			getContentPane().add(btn[i]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
