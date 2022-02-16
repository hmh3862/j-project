package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class JListTest06 extends JFrame {
	public JListTest06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JListTest06 - Sizing");
		setSize(300, 600);
		setLocationRelativeTo(null);
		String labels[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

		JList<String> jlist1 = new JList<String>(labels);
		jlist1.setVisibleRowCount(4);
		DefaultListModel<String> model = new DefaultListModel<String>();
		model.ensureCapacity(100);
		for (int i = 0; i < 100; i++) {
			model.addElement(Integer.toString(i));
		}
		JScrollPane scrollPane1 = new JScrollPane(jlist1);
		add(scrollPane1, BorderLayout.NORTH);

		JList<String> jlist2 = new JList<String>(model);
		jlist2.setVisibleRowCount(4);
		jlist2.setFixedCellHeight(20);
		jlist2.setFixedCellWidth(100);

		JScrollPane scrollPane2 = new JScrollPane(jlist2);
		add(scrollPane2, BorderLayout.CENTER);

		JList<String> jlist3 = new JList<String>(labels);
		jlist3.setVisibleRowCount(4);
		add(jlist3, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JListTest06();
	}
}
