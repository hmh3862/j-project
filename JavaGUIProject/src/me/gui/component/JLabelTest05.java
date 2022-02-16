package me.gui.component;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class JLabelTest05 extends JFrame{
	public JLabelTest05() {
		super("JLabelTest05 - Mnemonic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300,100));
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setDisplayedMnemonic(KeyEvent.VK_N);
	    JTextField tfName = new JTextField();
	    lblName.setLabelFor(tfName);
	    
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setDisplayedMnemonic(KeyEvent.VK_A);
	    JTextField tfAge = new JTextField();
	    lblAge.setLabelFor(tfAge);
	    
	    JPanel centerPanel = new JPanel();
	    centerPanel.setLayout(new GridLayout(2,2));
	    centerPanel.add(lblName);
	    centerPanel.add(tfName);
	    centerPanel.add(lblAge);
	    centerPanel.add(tfAge);
	    
	    add(centerPanel,BorderLayout.CENTER);
	    JButton btn = new JButton("확인");
	    add(btn, BorderLayout.SOUTH);
	    setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest05();
	}
}
