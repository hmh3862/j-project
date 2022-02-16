package me.gui.component;

import java.awt.*;

import javax.swing.*;

public class JButtonTest04 extends JFrame {
	public JButtonTest04() {
		super("JButtonTest04 - TextPosition");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 500));
		setLayout(new GridLayout(3,1));

		JButton btn1 = new JButton("강아지",new ImageIcon("images/Dog.gif"));
	    add(btn1);
	    
		JButton btn2 = new JButton("고양이",new ImageIcon("images/Cat.gif"));
		btn2.setIconTextGap(10);
		btn2.setVerticalTextPosition(AbstractButton.BOTTOM);
		btn2.setHorizontalTextPosition(AbstractButton.CENTER);
	    add(btn2);
	    
		JButton btn3 = new JButton("돼지",new ImageIcon("images/Pig.gif"));
		btn3.setIconTextGap(30);
		btn3.setFont(new Font("궁서체",Font.BOLD,20));
		btn3.setVerticalTextPosition(AbstractButton.TOP);
		btn3.setHorizontalTextPosition(AbstractButton.LEFT);
	    add(btn3);
	    
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonTest04();
	}
}
