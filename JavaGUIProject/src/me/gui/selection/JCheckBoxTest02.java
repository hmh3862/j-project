package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxTest02 extends JFrame {
	public JCheckBoxTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JCheckBoxTest02 - ActionListener");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JCheckBox checkBox1 = new JCheckBox("해제됨");
		JCheckBox checkBox2 = new JCheckBox("선택됨", true);
		JCheckBox checkBox3 = new JCheckBox("해제됨", false);
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				JCheckBox check = (JCheckBox) actionEvent.getSource();
				boolean selected = check.getModel().isSelected();
				check.setText(selected ? "선택됨" : "해제됨");
			}
		};
		checkBox1.addActionListener(actionListener);
		checkBox2.addActionListener(actionListener);
		checkBox3.addActionListener(actionListener);
		add(checkBox1);
		add(checkBox2);
		add(checkBox3);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JCheckBoxTest02();
	}
}
