package me.gui.selection;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;

public class JComboBoxTest01 extends JFrame{
	public JComboBoxTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JComboBoxTest01 - Constructor");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4,1));
		
		JComboBox<String> combo1 = new JComboBox<>();
		combo1.addItem("봄");
		combo1.addItem("여름");
		combo1.addItem("가을");
		combo1.addItem("겨울");
		
		String[] season = {"봄","여름","가을","겨울"};
		JComboBox<String> combo2 = new JComboBox<>(season);
		combo2.setSelectedItem("여름");

		Vector<String> v = new Vector<>();
		for(String str : season) v.add(str);
		JComboBox<String> combo3 = new JComboBox<>(v);
		combo3.setSelectedItem("가을");
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(season);
		JComboBox<String> combo4 = new JComboBox<>(model);
		combo4.setSelectedItem("겨울");
		
		add(combo1);
		add(combo2);
		add(combo3);
		add(combo4);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComboBoxTest01();
	}
}
