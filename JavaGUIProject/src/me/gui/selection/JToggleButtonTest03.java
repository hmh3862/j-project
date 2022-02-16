package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonTest03 extends JFrame {
	public JToggleButtonTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JToggleButtonTest03 - ItemListener");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JToggleButton toggleBtn1 = new JToggleButton("해제됨");
		JToggleButton toggleBtn2 = new JToggleButton("선택됨", true);
		JToggleButton toggleBtn3 = new JToggleButton("해제됨", false);
		ItemListener itemListener = new ItemListener() {
			public void itemStateChanged(ItemEvent itemEvent) {
				AbstractButton abstractButton = (AbstractButton) itemEvent.getSource();
				int state = itemEvent.getStateChange();
				if (state == ItemEvent.SELECTED) {
					abstractButton.setText("선택됨");
				} else {
					abstractButton.setText("해제됨");
				}
			}
		};
		toggleBtn1.addItemListener(itemListener);
		toggleBtn2.addItemListener(itemListener);
		toggleBtn3.addItemListener(itemListener);
		add(toggleBtn1);
		add(toggleBtn2);
		add(toggleBtn3);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JToggleButtonTest03();
	}
}
