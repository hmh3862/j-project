package me.gui.component;

import java.awt.*;
import javax.swing.*;

public class JButtonTest02 extends JFrame {
	public JButtonTest02() {
		super("JButtonTest02 - Icon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 300));

		// 기본 이미지 지정
		JButton button = new JButton(new ImageIcon("images/Dog.gif"));
		// 마우스가 올라갔을 때 이미지 지정 
		Icon rolloverIcon = new ImageIcon("images/Cat.gif");
	    button.setRolloverIcon(rolloverIcon);
        // 클릭했을 때 이미지 지정
	    Icon pressedIcon = new ImageIcon("images/Pig.gif");
	    button.setPressedIcon(pressedIcon);

	    // null을 지정시에 제거됨
	    // button.setRolloverIcon(null);
	    // button.setPressedIcon(null);

	    add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonTest02();
	}
}
