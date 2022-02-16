package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JRadioButtonTest05 extends JFrame{
	public static Container createRadioButtonGrouping(String elements[],
			String title) {
		JPanel panel = new JPanel(new GridLayout(0, 1));

		if (title != null) {
			Border border = BorderFactory.createTitledBorder(title);
			panel.setBorder(border);
		}

		ButtonGroup group = new ButtonGroup();
		JRadioButton aRadioButton;

		for (int i = 0, n = elements.length; i < n; i++) {
			aRadioButton = new JRadioButton(elements[i]);
			if(i==0) aRadioButton.setSelected(true);
			panel.add(aRadioButton);
			group.add(aRadioButton);
		}
		return panel;
	}

	public JRadioButtonTest05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JRadioButtonTest05 - Grouping");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(3,1));
		String[] gender = { "남자", "여자" };
		String[] lunar = { "양력", "음력" };
		String[] weight = { "저체중", "표준", "비만" };

		add(JRadioButtonTest05.createRadioButtonGrouping(gender, "성별"));
		add(JRadioButtonTest05.createRadioButtonGrouping(lunar, "달력"));
		add(JRadioButtonTest05.createRadioButtonGrouping(weight, "체중"));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JRadioButtonTest05();
	}
}
