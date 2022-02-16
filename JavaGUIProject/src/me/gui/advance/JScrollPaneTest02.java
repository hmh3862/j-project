package me.gui.advance;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class JScrollPaneTest02 extends JFrame {
	public JScrollPaneTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JScrollBarTest01 - ScrollBarPolicy");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("나는 라벨입니다.");
	    label.setPreferredSize(new Dimension(500, 500));
	    JScrollPane jScrollPane = new JScrollPane(label);

	    jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	    add(jScrollPane, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollPaneTest02();
	}
}
