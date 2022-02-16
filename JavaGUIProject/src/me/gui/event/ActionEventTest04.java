package me.gui.event;

import java.awt.event.*;
import javax.swing.*;

public class ActionEventTest04 extends JFrame {
	private JButton btnEvent;
	
	public ActionEventTest04() {
		super("Action Event Test 04");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btnEvent = new JButton("눌러줘!");
		// 이벤트 리스너를 익명 내장 클래스로 구현한다.
		btnEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다.");				
			}
		});
		add(btnEvent);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionEventTest04();
	}
}
