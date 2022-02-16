package me.gui.event;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class ActionEventTest06 extends JFrame implements ActionListener{
	private JButton northBtn, westBtn, centerBtn, eastBtn, southBtn;
	
	public ActionEventTest06() {
		super("Action Event Test 06");
		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		northBtn = new JButton("north Button");
		northBtn.addActionListener(this);
		add(northBtn,BorderLayout.NORTH);
		
		westBtn = new JButton("west Button");
		westBtn.addActionListener(this);
		add(westBtn,BorderLayout.WEST);
		
		centerBtn = new JButton("north Button");
		centerBtn.addActionListener(this);
		add(centerBtn,BorderLayout.CENTER);
		
		eastBtn = new JButton("east Button");
		eastBtn.addActionListener(this);
		add(eastBtn,BorderLayout.EAST);
		
		southBtn = new JButton("south Button");
		southBtn.addActionListener(this);
		add(southBtn,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionEventTest06();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand() + "을 클릭했습니다.");
	}
}
