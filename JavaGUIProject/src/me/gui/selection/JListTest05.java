package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class JListTest05 extends JFrame {
	JTextField info;

	public JListTest05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JListTest04 - Double Click");
		setSize(300, 200);
		setLocationRelativeTo(null);
		String[] season = { "봄", "여름", "가을", "겨울" };

		JList<String> jlist = new JList<String>(season);
		JScrollPane scrollPane = new JScrollPane(jlist);
		add(scrollPane, BorderLayout.CENTER);

		jlist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent mouseEvent) {
				JList<String> theList = (JList<String>) mouseEvent.getSource();
				if (mouseEvent.getClickCount() == 2) {
					int index = theList.locationToIndex(mouseEvent.getPoint());
					if (index >= 0) {
						Object o = theList.getModel().getElementAt(index);
						info.setText("Double-clicked on: " + o.toString());
					}
				}
			}
		});
		info = new JTextField();
		add(info, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JListTest05();
	}
}
