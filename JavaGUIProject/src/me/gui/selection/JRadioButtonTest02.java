package me.gui.selection;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JRadioButtonTest02 extends JFrame implements ActionListener{
	JTextField tf;
	JLabel imageLabel;
	Icon man, woman, robot;
	public JRadioButtonTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JRadioButtonTest02 - selected");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		JRadioButton b1 = new JRadioButton("남자",true);
	    JRadioButton b2 = new JRadioButton("여자");
	    JRadioButton b3 = new JRadioButton("넌누구냐?");
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);

	    ButtonGroup bg = new ButtonGroup();
	    bg.add(b1);	    bg.add(b2);		bg.add(b3);
	    
	    JPanel top = new JPanel();
	    top.add(b1);	top.add(b2);	top.add(b3);
	    add(top, BorderLayout.NORTH);
	    
	    man = new ImageIcon("images/man.png");
	    woman = new ImageIcon("images/woman.png");
	    robot = new ImageIcon("images/robot.png");

	    imageLabel = new JLabel("남자", JLabel.CENTER);
	    imageLabel.setIcon(man);
	    imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
	    imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	    add(imageLabel, BorderLayout.CENTER);
	    
	    tf = new JTextField("남자");
	    tf.setEditable(false);
	    add(tf,BorderLayout.SOUTH);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText(e.getActionCommand());
		if(e.getActionCommand().equals("남자")){
			imageLabel.setIcon(man);
			imageLabel.setText("남자");
		}else if(e.getActionCommand().equals("여자")){
			imageLabel.setIcon(woman);
			imageLabel.setText("여자");
		}else{
			imageLabel.setIcon(robot);
			imageLabel.setText("넌누구냐?");
		}
	}
	public static void main(String[] args) {
		new JRadioButtonTest02();
	}
}
