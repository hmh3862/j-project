package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;

public class JComboBoxTest04 extends JFrame implements ActionListener{
	DefaultComboBoxModel<String> model;
	int count;
	public JComboBoxTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("scrollPane - SharedData");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		String labels[] = { "아이템 하나", "아이템 두울", "아이템 세엣"};
		model = new DefaultComboBoxModel<>(labels);
		JPanel panel = new JPanel();
	    JComboBox<String> comboBox1 = new JComboBox<>(model);

	    JComboBox<String> comboBox2 = new JComboBox<>(model);
	    panel.add(comboBox1);
	    panel.add(comboBox2);
	    add(panel, BorderLayout.NORTH);

	    JButton button = new JButton("아이템추가");
	    button.addActionListener(this);
	    add(button, BorderLayout.SOUTH);

		setVisible(true);
	}
	public static void main(String[] args) {
		new JComboBoxTest04();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		model.addElement("추가된 아이템 " + ++count);
	}
}
