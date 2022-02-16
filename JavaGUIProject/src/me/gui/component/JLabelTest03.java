package me.gui.component;

import java.awt.*;
import javax.swing.*;

public class JLabelTest03 extends JFrame{
	public JLabelTest03() {
		super("JLabelTest03 - HTML");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300,300));
		
		// HTML label
		String html = "<html><h2>이것은 <b style='color:red'>JLabel</b>입니다.</h2></html>";
		JLabel label = new JLabel(html, JLabel.CENTER);
		
		add(label);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest03();
	}
}
