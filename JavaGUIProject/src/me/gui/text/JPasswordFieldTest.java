package me.gui.text;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class JPasswordFieldTest extends JFrame{
	JPasswordField password1, password2;
	JTextField userId;
	public JPasswordFieldTest() {
		super("JPasswordFieldTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 150));
		setLayout(new GridLayout(4,2));
		setLocationRelativeTo(null);
		
		add(new JLabel("아이디  ",JLabel.RIGHT));
		userId = new JTextField(20);
		add(userId);
		
	    add(new JLabel("암호  ",JLabel.RIGHT));
	    password1 = new JPasswordField(20);
	    add(password1);
	    
	    add(new JLabel("암호확인  ",JLabel.RIGHT));
	    password2 = new JPasswordField(20);
	    password2.setEchoChar('#');
	    add(password2);
	    
	    add(new JLabel(""));
	    
	    JButton btn = new JButton("확인");
	    btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char pass1[] = password1.getPassword();
				char pass2[] = password2.getPassword();

				if (Arrays.equals(pass1,  pass2))
				  System.out.println("두개의 암호가 같다.");
				else
				  System.out.println("두개의 암호가 다르다.");
			}
		});
	    add(btn);
	    
		setVisible(true);
	}
	public static void main(String[] args) {
		new JPasswordFieldTest();
	}
}
