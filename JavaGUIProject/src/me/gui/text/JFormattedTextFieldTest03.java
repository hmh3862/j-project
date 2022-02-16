package me.gui.text;

import java.awt.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;

public class JFormattedTextFieldTest03 extends JFrame {

	public JFormattedTextFieldTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JFormattedTextField - DateFormat");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(7,1));
		
		DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		
		JFormattedTextField text1 = new JFormattedTextField(df1);
		JFormattedTextField text2 = new JFormattedTextField(df2);
		JFormattedTextField text3 = new JFormattedTextField(df3);
		JFormattedTextField text4 = new JFormattedTextField(df4);
		
		Date date = new Date();
		
		text1.setValue(date);
		text2.setValue(date);
		text3.setValue(date);
		text4.setValue(date);

		add(text1);
		add(text2);
		add(text3);
		add(text4);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JFormattedTextFieldTest03();
	}

}