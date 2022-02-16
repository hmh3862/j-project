package me.gui.component;

import java.awt.*;
import javax.swing.*;

class OverlinedLabel extends JLabel {
	public OverlinedLabel() {
		this("사용자정의 Label");
	}
	public OverlinedLabel(String text) {
		super(text);
	}
	public void paint(Graphics g) {
		Rectangle r;
		super.paint(g);
		r = g.getClipBounds();
		g.drawLine(0, 0, r.width, 0); // OverLine
		//g.drawLine(0, r.height-1, r.width, r.height-1); // UnderLine
	}
}

public class JLabelTest06 extends JFrame {
	public JLabelTest06() {
		super("JLabelTest06 - Custom Label");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 300));
		setLayout(new FlowLayout());

		OverlinedLabel label = new OverlinedLabel("윗줄라벨~~~~");
		add(label);
		setVisible(true);
	}
	public static void main(String[] argv) {
		new JLabelTest06();
	}
}