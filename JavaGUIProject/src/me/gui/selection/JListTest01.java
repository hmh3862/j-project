package me.gui.selection;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;

public class JListTest01 extends JFrame{
	public JListTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JListTest01 - Constructor");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4,1));
		
		JList<String> list1 = new JList<>();
		list1.setBorder(BorderFactory.createLineBorder(Color.red));
		String[] season = {"봄","여름","가을","겨울"};
		JList<String> list2 = new JList<>(season);
		list2.setSelectedIndex(0);
		list2.setBorder(BorderFactory.createLineBorder(Color.red));

		Vector<String> v = new Vector<>();
		for(String str : season) v.add(str);
		JList<String> list3 = new JList<>(v);
		list3.setSelectedValue("가을", true);
		list3.setBorder(BorderFactory.createLineBorder(Color.red));
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		for(String s : season) model.addElement(s);
		JList<String> list4 = new JList<>(model);
		list4.setSelectedIndices(new int[]{0,2,3});
		list4.setBorder(BorderFactory.createLineBorder(Color.red));
		
		add(list1);
		add(list2);
		add(list3);
		add(list4);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListTest01();
	}
}
