package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

class MyListModel extends AbstractListModel implements ListModel {
	private Object selectedItem;
	private List<String> anList;
	public MyListModel(List<String> list) {
		anList = list;
	}
	public Object getSelectedItem() {
		return selectedItem;
	}
	public void setSelectedItem(Object newValue) {
		selectedItem = newValue;
	}
	public int getSize() {
		return anList.size();
	}
	public Object getElementAt(int i) {
		return anList.get(i);
	}
}

public class JListTest04 extends JFrame {
	public JListTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JListTest04 - Custom Model");
		setSize(300, 200);
		setLocationRelativeTo(null);
		String[] season = { "봄", "여름", "가을", "겨울" };
		List<String> list = Arrays.asList(season);
		MyListModel model = new MyListModel(list);
	    JList<String> jList = new JList<String>(model);

	    add(jList, BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListTest04();
	}
}
