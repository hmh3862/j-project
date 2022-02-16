package me.gui.selection;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JCheckBoxTest03 extends JFrame {
	public JCheckBoxTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JCheckBoxTest03 - ItemListener");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JCheckBox checkBox1 = new JCheckBox("해제됨");
		JCheckBox checkBox2 = new JCheckBox("선택됨", true);
		JCheckBox checkBox3 = new JCheckBox("해제됨", false);
		ItemListener itemListener = new ItemListener() {
			public void itemStateChanged(ItemEvent itemEvent) {
				JCheckBox check = (JCheckBox) itemEvent.getSource();
				int state = itemEvent.getStateChange();
				if (state == ItemEvent.SELECTED) {
					check.setText("선택됨");
				} else {
					check.setText("해제됨");
				}
			}
		};
		checkBox1.addItemListener(itemListener);
		checkBox2.addItemListener(itemListener);
		checkBox3.addItemListener(itemListener);
		add(checkBox1);
		add(checkBox2);
		add(checkBox3);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JCheckBoxTest03();
	}
}
