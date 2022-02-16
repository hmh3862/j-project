package me.gui.selection;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class JToggleButtonTest02 extends JFrame {
	public JToggleButtonTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JToggleButtonTest01 - ActionListener");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JToggleButton toggleBtn1 = new JToggleButton("해제됨");
		JToggleButton toggleBtn2 = new JToggleButton("선택됨", true);
		JToggleButton toggleBtn3 = new JToggleButton("해제됨", false);
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
				boolean selected = abstractButton.getModel().isSelected();
				abstractButton.setText(selected ? "선택됨" : "해제됨");
			}
		};
		toggleBtn1.addActionListener(actionListener);
		toggleBtn2.addActionListener(actionListener);
		toggleBtn3.addActionListener(actionListener);
		add(toggleBtn1);
		add(toggleBtn2);
		add(toggleBtn3);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JToggleButtonTest02();
	}
}
