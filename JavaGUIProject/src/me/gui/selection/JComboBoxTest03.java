package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;

public class JComboBoxTest03 extends JFrame implements ActionListener,
		ItemListener {
	JComboBox<String> combo;
	JTextArea label;
	public JComboBoxTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JComboBoxTest03 - Listener");
		setSize(300, 300);
		setLocationRelativeTo(null);

		String[] count = { "1111", "2222", "3333" };
		combo = new JComboBox<String>(count);
		combo.addActionListener(this);
		combo.addItemListener(this);
		add(combo, BorderLayout.NORTH);
		
		label = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(label);
		add(scrollPane, BorderLayout.CENTER);
		
		setVisible(true);

		System.out.println("#items=" + combo.getItemCount());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = "ActionEvent : \n";
		msg += "선택된 index=" + combo.getSelectedIndex()
				+ ", 선택된 item=" + combo.getSelectedItem();
		label.setText(label.getText()+"\n"+msg);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String msg = "ItemEvent\n";
		int state = e.getStateChange();
		msg += (state == ItemEvent.SELECTED) ? "SELECTED" : "DESELECTED";
		msg += ", Item: " + e.getItem();
		ItemSelectable is = e.getItemSelectable();
		Object selected[] = is.getSelectedObjects();
		msg += ", Selected : " + ((selected.length == 0) ? "null" : (String)selected[0]);
		label.setText(label.getText()+"\n"+msg);
	}
	public static void main(String[] args) {
		new JComboBoxTest03();
	}
}
