package me.gui.event;

import java.awt.event.*;

import javax.swing.*;

public class ActionEventTest02 extends JFrame {
	private JButton btnEvent;
	
	public ActionEventTest02() {
		super("Action Event Test 02");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btnEvent = new JButton("눌러줘!");
		// 익명 객체의 사용
		btnEvent.addActionListener(new MyActionListener());
		
		add(btnEvent);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEventTest02();
	}
	
	// 이벤트 리스너를 내장 클래스로 구현한다.
	// ActionListener인터페이스를 구현하여 별도의 내장 클래스 작성
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼을 클릭했습니다.");		
		}
	}
}
