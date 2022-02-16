package me.gui.layout;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GridbagLayoutTest2 extends JFrame{
	JTextField smtpServer, mailFrom, rcptTo, subject;
	JTextArea body;
	GridBagLayout gbl;
	GridBagConstraints gbc;
	
	public GridbagLayoutTest2() {
		super("GridbagLayout Test2");
		setSize(300, 200);
		setLocationRelativeTo(null);
		
		smtpServer = new JTextField(40);
		mailFrom = new JTextField(40);
		rcptTo = new JTextField(40);
		subject = new JTextField(40);
		body = new JTextArea(10, 40);
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();

		setLayout(gbl);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;

		add(new JLabel("메일서버: ", JLabel.RIGHT), 0, 0, 1, 1);
		add(smtpServer, 1, 0, 3, 1);
		add(new JLabel("From: ", JLabel.RIGHT), 0, 1, 1, 1);
		add( mailFrom, 1, 1, 3, 1);
		add(new JLabel("To: ", JLabel.RIGHT), 0, 2, 1, 1);
		add(rcptTo, 1, 2, 3, 1);
		add(new JLabel("제 목: ", JLabel.RIGHT), 0, 3, 1, 1);
		add(subject, 1, 3, 3, 1);
		add(new JLabel("내 용: ", JLabel.RIGHT), 0, 4, 1, 1);
		add(body, 1, 4, 1, 1);
		add(new JButton("전송하기"), 0, 5, 2, 1);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void add(Component c, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		add(c);
	}

	public static void main(String[] args) {
		new GridbagLayoutTest2();
	}
}
