package me.gui.component;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class JButtonTest06 extends JFrame {
	public JButtonTest06() {
		super("JButtonTest06 - Mnemonic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 300));
		setLayout(new GridLayout(3,1));

		JButton btn1 = new JButton("Close");
		btn1.setMnemonic('C');
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Close버튼 클릭");
			}
		});
	    add(btn1);
	    
		JButton btn2 =new JButton("Open"); 
		btn2.setMnemonic(KeyEvent.VK_O);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Open버튼 클릭");
			}
		});
	    add(btn2);
	    
		JButton btn3 = new JButton("New(F3)"); 
		btn3.setMnemonic(KeyEvent.VK_F3);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("New버튼 클릭");
			}
		});
	    add(btn3);
	    
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonTest06();
	}
}
