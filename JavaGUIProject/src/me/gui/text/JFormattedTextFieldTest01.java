package me.gui.text;

import java.awt.*;
import java.text.*;
import javax.swing.*;

public class JFormattedTextFieldTest01 extends JFrame {

	public JFormattedTextFieldTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JFormattedTextField - NumberFormat");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(7, 1));

		double d = 1234567890.123456789d;
		NumberFormat nf1 = NumberFormat.getNumberInstance();
		NumberFormat nf2 = NumberFormat.getNumberInstance();
		nf2.setMaximumFractionDigits(9);
		NumberFormat nf3 = NumberFormat.getNumberInstance();
		nf3.setMaximumFractionDigits(1);
		NumberFormat nf4 = NumberFormat.getNumberInstance();
		nf4.setMaximumIntegerDigits(9);
		NumberFormat nf5 = NumberFormat.getNumberInstance();
		nf5.setMaximumIntegerDigits(1);
		NumberFormat nf6 = NumberFormat.getNumberInstance();
		nf6.setParseIntegerOnly(true);
		NumberFormat nf7 = NumberFormat.getNumberInstance();
		nf7.setGroupingUsed(false);

		JFormattedTextField text1 = new JFormattedTextField(nf1);
		JFormattedTextField text2 = new JFormattedTextField(nf2);
		JFormattedTextField text3 = new JFormattedTextField(nf3);
		JFormattedTextField text4 = new JFormattedTextField(nf4);
		JFormattedTextField text5 = new JFormattedTextField(nf5);
		JFormattedTextField text6 = new JFormattedTextField(nf6);
		JFormattedTextField text7 = new JFormattedTextField(nf7);

		text1.setValue(d);
		text2.setValue(d);
		text3.setValue(d);
		text4.setValue(d);
		text5.setValue(d);
		text6.setValue(d);
		text7.setValue(d);

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
		new JFormattedTextFieldTest01();
	}

}