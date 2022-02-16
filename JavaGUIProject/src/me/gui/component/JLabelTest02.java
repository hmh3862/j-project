package me.gui.component;

import java.awt.*;

import javax.swing.*;

public class JLabelTest02 extends JFrame{
	public JLabelTest02() {
		super("JLabelTest02 - Icon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300,300));
		setLayout(new FlowLayout());
		
		// 다양한 정보 설정하기 
		JLabel label = new JLabel();
		Icon icon = new ImageIcon("images/Dog.gif");
		label.setText("강아지");
		label.setIcon(icon);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setToolTipText("강아지 이미지");
		label.setBorder(BorderFactory.createTitledBorder("아이콘 JLabel"));
		add(label);

		JLabel label2 = new JLabel("비활성라벨");
		label2.setEnabled(false);
		add(label2);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest02();
	}
}
