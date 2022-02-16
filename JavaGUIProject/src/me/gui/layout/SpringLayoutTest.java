package me.gui.layout;

import javax.swing.*;

public class SpringLayoutTest extends JFrame {
	public SpringLayoutTest () {
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setTitle ( "SpringLayoutTest");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		SpringLayout layout = new SpringLayout();
		setLayout (layout);
		
		JButton button1 = new JButton ( "Button A");
		JButton button2 = new JButton ( "Button BB");
		JButton button3 = new JButton ( "Button CCC");
		JButton button4 = new JButton ( "Button DDDD");
		
		// 각 버튼의 상대 위치 (제약)을 설정
		// 버튼1 프레임으로 부터 상대 위치를 설정
		layout.putConstraint (SpringLayout.NORTH, button1, 10, SpringLayout.NORTH, this);
		layout.putConstraint (SpringLayout.WEST, button1, 10, SpringLayout.WEST, this);
		// 버튼2는  버튼1에서의 상대 위치를 설정
		layout.putConstraint (SpringLayout.NORTH, button2, 20, SpringLayout.NORTH, button1);
		layout.putConstraint (SpringLayout.WEST, button2, 5, SpringLayout.WEST, button1);
		// 버튼3은 버튼1에서의 상대 위치를 설정
		layout.putConstraint (SpringLayout.NORTH, button3, 50, SpringLayout.NORTH, button1);
		layout.putConstraint (SpringLayout.WEST, button3, 100, SpringLayout.WEST, button1);
		// 버튼4는 버튼3에서의 상대 위치를 설정
		layout.putConstraint (SpringLayout.NORTH, button4, -40, SpringLayout.NORTH, button3);
		layout.putConstraint (SpringLayout.WEST, button4, -10, SpringLayout.WEST, button3);
		
		add (button1);
		add (button2);
		add (button3);
		add (button4);
		setVisible (true);
	}
	public static void main (String [] args) {
		new SpringLayoutTest ();
	}
}