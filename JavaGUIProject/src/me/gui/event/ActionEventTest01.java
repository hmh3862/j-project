package me.gui.event;

import java.awt.event.*;

import javax.swing.*;

// 이벤트 리스너를 구현한다.
// ActionListener인터페이스를 구현하여 별도의 클래스 작성
class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다.");		
	}
}

public class ActionEventTest01 extends JFrame {
	private JButton btnEvent;
	
	public ActionEventTest01() {
		super("Action Event Test 01");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btnEvent = new JButton("눌러줘!");
		// 액션 리스너 객체 생성 
		// MyActionListener event = new MyActionListener();
		// 액션 리스너 등록
		// btnEvent.addActionListener(event);
		
		// 위의 두줄을 아래와 같이 한줄로 작성 가능
		// 익명 객체의 사용
		btnEvent.addActionListener(new MyActionListener());
		
		add(btnEvent);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionEventTest01();
	}
}
