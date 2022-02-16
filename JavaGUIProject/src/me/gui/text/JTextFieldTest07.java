package me.gui.text;

import java.awt.*;
import javax.swing.*;

public class JTextFieldTest07 extends JFrame {

	public JTextFieldTest07() {
		super("JTextFieldTest07 - Drag & Drop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 100));
		setLocationRelativeTo(null);
		
		JTextField field1 = new JTextField("Life's a drag", 20);
	    JTextField field2 = new JTextField("and then you drop", 20);
	    field1.setDragEnabled(true);
	    field2.setDragEnabled(true);
	    Container content = getContentPane();

	    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
	    content.add(field1);
	    content.add(field2);

		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest07();
	}
}
