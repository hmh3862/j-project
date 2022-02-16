package me.gui.selection;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;

public class JListTest03 extends JFrame{
	public JListTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JListTest03 - model");
		setSize(300, 200);
		setLocationRelativeTo(null);
		String[] season = {"봄","여름","가을","겨울"};
		DefaultListModel<String> model = new DefaultListModel<String>();
		for(String s : season) model.addElement(s);
		model.addElement("늦겨울");
		model.insertElementAt("초봄", 0);
		model.removeElement("여름");
		model.removeElementAt(1);
		JList<String> list = new JList<>(model);
		
		list.setSelectedIndices(new int[]{0,2,3});
		
		add(list,BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListTest03();
	}
}
