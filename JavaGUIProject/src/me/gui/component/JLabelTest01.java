package me.gui.component;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest01 extends JFrame{

	public JLabelTest01() {
		super("JLabelTest01 - Constructor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300,300));
		setLayout(new GridLayout(10,1));
		
		// 다양한 생성자를 이용가능 합니다.
		add(new JLabel());
		add(new JLabel("왼쪽", JLabel.LEFT));
		add(new JLabel("가운데", JLabel.CENTER));
		add(new JLabel("오른쪽", JLabel.RIGHT));
		add(new JLabel(new ImageIcon("images/middle.gif")));
		add(new JLabel(new ImageIcon("images/middle.gif"),JLabel.RIGHT));
		add(new JLabel("이전",new ImageIcon("images/left.gif"),JLabel.CENTER));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest01();
	}
}
