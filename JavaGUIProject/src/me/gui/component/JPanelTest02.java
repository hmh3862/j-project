package me.gui.component;

import java.awt.*;
import javax.swing.*;

public class JPanelTest02 extends JPanel {
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.black);
		g.drawOval(0, 0, width, height);
		g.drawOval(width/4, height/4,width/4*2, height/4*2);
		g.drawRect(width/4, height/4,width/4*2, height/4*2);
		g.drawString("JPanelTest02", 110, 130);
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("JPanelTest02");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JPanelTest02());
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}