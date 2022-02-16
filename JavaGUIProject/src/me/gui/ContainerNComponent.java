package me.gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContainerNComponent extends JFrame{

	public ContainerNComponent() {
		super("Container & Component");
		setSize(300, 300);
		setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.yellow);
		JLabel lblName = new JLabel("이름 : ",JLabel.LEFT);
		topPanel.add(lblName);
		JTextField tfName = new JTextField(20);
		topPanel.add(tfName);
		getContentPane().add(topPanel,BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.cyan);
		JCheckBox chkJava = new JCheckBox("Java");
		JCheckBox chkCpp = new JCheckBox("C++");
		JCheckBox chkSpring = new JCheckBox("Spring");
		centerPanel.add(chkJava);
		centerPanel.add(chkCpp);
		centerPanel.add(chkSpring);
		getContentPane().add(centerPanel,BorderLayout.CENTER);
		
		
		JButton btnOk = new JButton("확인");
		getContentPane().add(btnOk,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new ContainerNComponent().setVisible(true);
	}
}
