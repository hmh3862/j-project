package me.gui.component;

import java.awt.*;
import javax.swing.*;

public class JPanelTest01 extends JFrame {
	public JPanelTest01() {
		super("JPanelTest01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 300));
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.YELLOW);
		topPanel.add(new JLabel("JPanel 연습하기",JLabel.CENTER));
		add(topPanel,BorderLayout.NORTH);
		JPanel centerPanel = new JPanel(new GridLayout(2,2));
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.RED,3));
		centerPanel.add(new JLabel(new ImageIcon("images/Rabbit.gif")));
		centerPanel.add(new JLabel(new ImageIcon("images/Bird.gif")));
		centerPanel.add(new JLabel(new ImageIcon("images/Dog.gif")));
		centerPanel.add(new JLabel(new ImageIcon("images/Cat.gif")));
		add(centerPanel,BorderLayout.CENTER);
		JPanel bottomPanel = new JPanel(new GridLayout(1,3));
		bottomPanel.add(new JButton("메뉴1"));
		bottomPanel.add(new JButton("메뉴2"));
		bottomPanel.add(new JButton("메뉴3"));
		add(bottomPanel,BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JPanelTest01();
	}
}
