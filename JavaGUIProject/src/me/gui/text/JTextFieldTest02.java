package me.gui.text;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class JTextFieldTest02 extends JFrame {
	JLabel nameLabel = new JLabel("Name : ",JLabel.RIGHT);
	JLabel mirroredNameLabel = new JLabel("Mirrored Name : ",JLabel.RIGHT);
	JTextField name = new JTextField(20);
	JTextField mirroredName = new JTextField(20);

	public JTextFieldTest02() {
		super("JTextFieldTest02 - Model");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 100));
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 0));

		Container contentPane = this.getContentPane();
		contentPane.add(nameLabel);
		contentPane.add(name);
		contentPane.add(mirroredNameLabel);
		contentPane.add(mirroredName);

		Document nameModel = name.getDocument();
		mirroredName.setDocument(nameModel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest02();
	}
}
