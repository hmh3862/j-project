package me.gui.text;

import java.awt.*;
import java.text.*;
import javax.swing.*;

public class JFormattedTextFieldTest02 extends JFrame {

	public JFormattedTextFieldTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JFormattedTextField - DecimalFormat");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(7,1));
		
		double d = 123456789.12345d;

		JFormattedTextField text1 = new JFormattedTextField(new DecimalFormat(
				"##########"));
		JFormattedTextField text2 = new JFormattedTextField(new DecimalFormat(
				"#,###,###,###"));
		JFormattedTextField text3 = new JFormattedTextField(new DecimalFormat(
				"0,000,000,000"));
		JFormattedTextField text4 = new JFormattedTextField(new DecimalFormat(
				"#,###,###,###.000000"));
		JFormattedTextField text5 = new JFormattedTextField(new DecimalFormat(
				"#,###,###,###.######"));
		JFormattedTextField text6 = new JFormattedTextField(new DecimalFormat(
				"\u00A4#,###,###,###.######"));
		JFormattedTextField text7 = new JFormattedTextField(new DecimalFormat(
				"##0.00%"));

		text1.setValue(d);
		text2.setValue(d);
		text3.setValue(d);
		text4.setValue(d);
		text5.setValue(d);
		text6.setValue(123456789);
		text7.setValue(0.12345);

		add(text1);
		add(text2);
		add(text3);
		add(text4);
		add(text5);
		add(text6);
		add(text7);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JFormattedTextFieldTest02();
	}

}