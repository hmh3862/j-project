package me.gui.component;

import java.awt.*;

import javax.swing.*;

public class JLabelTest04 extends JFrame{
	public JLabelTest04() {
		super("JLabelTest04 - Font");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300,300));
		setLayout(new FlowLayout());
		JTextField nameTextField = new JTextField(15);
	    JLabel nameLabel = new JLabel("이름(Name):");
	    nameLabel.setLabelFor(nameTextField);
	    nameLabel.setForeground(Color.blue);
	    nameLabel.setFont(new Font("궁서체",Font.BOLD,15));
	    add(nameLabel, BorderLayout.WEST);

	    add(nameLabel, BorderLayout.WEST);
	    add(nameTextField, BorderLayout.CENTER);		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest04();
	}
}
