package me.gui.selection;

import javax.swing.*;

public class JCheckBoxTest05 extends JFrame {
	public JCheckBoxTest05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JCheckBoxTest05 - HTML");
		setSize(300, 300);
		setLocationRelativeTo(null);

		JCheckBox checkbox = new JCheckBox("HTML로 만든 CkeckBox");

		String label = "<html><table cellpadding=0><tr><td>"
				+ "<b style='font-size:15pt;'><u>"
				+ checkbox.getText() 
				+ "</u></b></td></tr></table></html>";

		checkbox.setText(label);
		add(checkbox);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JCheckBoxTest05();
	}

}
