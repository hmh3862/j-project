package me.gui.event;

import java.awt.event.*;

import javax.swing.*;
// 직접 ActionListener인터페이스 구현
public class ActionEventTest03 extends JFrame implements ActionListener{
	private JButton btnEvent;
	
	public ActionEventTest03() {
		super("Action Event Test 03");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btnEvent = new JButton("눌러줘!");
		// 직접 ActionListener인터페이스 구현시는 인수로 this전달
		btnEvent.addActionListener(this);
		add(btnEvent);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionEventTest03();
	}
	// 직접 ActionListener인터페이스 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다.");		
	}
}
