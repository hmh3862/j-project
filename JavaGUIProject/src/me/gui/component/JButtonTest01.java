package me.gui.component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CloseAction extends AbstractAction {
	public CloseAction() {
		super("닫기");
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		System.exit(0);
	}
}

public class JButtonTest01 extends JFrame {
	public JButtonTest01() {
		super("JButtonTest01 - Constructor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 300));
		setLayout(new GridLayout(5, 1));

		// 다양한 생성자를 이용가능 합니다.
		add(new JButton());
		add(new JButton("버튼"));
		add(new JButton(new ImageIcon("images/middle.gif")));
		add(new JButton("이전", new ImageIcon("images/left2.gif")));
		add(new JButton(new CloseAction()));

		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonTest01();
	}
}
