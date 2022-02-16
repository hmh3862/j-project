package me.gui.selection;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListTest02 extends JFrame {
	private static final Color lightBlue = new Color(153, 204, 255);
	JTextField info;
	public JListTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JListTest02 - Selected");
		setSize(300, 300);
		setLocationRelativeTo(null);

		String[] bruteForceCode = { "int count = 0",
				"int m = mPattern.length();", "int n = mSource .length();",
				"outer:", " ++count;", " }", " return count;", "}" };
		JList<String> list = new JList<String>(bruteForceCode);
		Border etch = BorderFactory.createEtchedBorder();
		list.setBorder(BorderFactory.createTitledBorder(etch, "Brute Force Code"));
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				JList<String> list = (JList<String>)e.getSource();
				String msg = list.getSelectedIndex() + ". " + list.getSelectedValue();
				info.setText(msg);
			}
		});
		JPanel listPanel = new JPanel();
		listPanel.add(list);
		listPanel.setBackground(lightBlue);
		list.setBackground(lightBlue);
		JScrollPane sp = new JScrollPane(listPanel);
		add(sp, BorderLayout.CENTER);

		info = new JTextField();
		add(info,BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JListTest02();
	}
}
