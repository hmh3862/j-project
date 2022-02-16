package me.gui.component;

import java.awt.*;

import javax.swing.*;

public class JButtonTest03 extends JFrame {
	public JButtonTest03() {
		super("JButtonTest03 - disabledIcon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 300));
		setLayout(new GridLayout(3,1));

		JButton btn1 = new JButton(new ImageIcon("images/Dog.gif"));
		btn1.setEnabled(false);
	    Icon disabledIcon = new ImageIcon("images/Cat.gif");
	    btn1.setDisabledIcon(disabledIcon);
	    add(btn1);
	    
		JButton btn2 = new JButton(new ImageIcon("images/Dog.gif"));
		btn2.setEnabled(true);
	    btn2.setDisabledIcon(new ImageIcon("images/Cat.gif"));
	    add(btn2);
	    
		JButton btn3 = new JButton(new ImageIcon("images/Dog.gif"));
		btn3.setEnabled(false);
	    btn3.setDisabledIcon(new ImageIcon("images/Cat.gif"));
	    add(btn3);
	    
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonTest03();
	}
}
