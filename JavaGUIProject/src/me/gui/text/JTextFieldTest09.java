package me.gui.text;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JTextFieldTest09 extends JFrame {
	public JTextFieldTest09() {
		super("JTextFieldTest09 - KeyListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 100));
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel usernameLabel = new JLabel("Username: ");
	    JTextField usernameTextField = new JTextField();
	    usernameTextField.setPreferredSize(new Dimension(100, 20));
	    add(usernameLabel);
	    add(usernameTextField);

	    usernameTextField.addKeyListener(new KeyAdapter() {
	      public void keyReleased(KeyEvent e) {
	        JTextField textField = (JTextField) e.getSource();
	        String text = textField.getText();
	        textField.setText(text.toUpperCase());
	      }
	      public void keyTyped(KeyEvent e) {;}
	      public void keyPressed(KeyEvent e) {;}
	    });
	    
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextFieldTest09();
	}
}
