package me.gui.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventTest05 extends JFrame {
	private JButton northBtn, centerBtn, southBtn;
	
	public ActionEventTest05() {
		super("Action Event Test 05");
		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		northBtn = new JButton("north Button");
		// 이벤트 리스너를 익명 내장 클래스로 구현한다.
		northBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("north 버튼을 클릭했습니다.");				
			}
		});
		add(northBtn,BorderLayout.NORTH);
		
		centerBtn = new JButton("center Button");
		// 이벤트 리스너를 익명 내장 클래스로 구현한다.
		centerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("center 버튼을 클릭했습니다.");				
			}
		});
		add(centerBtn,BorderLayout.CENTER);
		
		southBtn = new JButton("south Button");
		// 이벤트 리스너를 익명 내장 클래스로 구현한다.
		southBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("south 버튼을 클릭했습니다.");				
			}
		});
		add(southBtn,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionEventTest05();
	}
}
