package me.gui.text;

import java.awt.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;

public class JFormattedTextFieldTest04 extends JFrame {

	public JFormattedTextFieldTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JFormattedTextField - SimpleDateFormat");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(7,1));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSSSS");
		SimpleDateFormat sdf4 = new SimpleDateFormat("ahh:mm:ss");
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy年MM月dd日(E)");
		
		JFormattedTextField text1 = new JFormattedTextField(sdf1);
		JFormattedTextField text2 = new JFormattedTextField(sdf2);
		JFormattedTextField text3 = new JFormattedTextField(sdf3);
		JFormattedTextField text4 = new JFormattedTextField(sdf4);
		JFormattedTextField text5 = new JFormattedTextField(sdf5);		
		
		Date date = new Date();
		
		text1.setValue(date);
		text2.setValue(date);
		text3.setValue(date);
		text4.setValue(date);
		text5.setValue(date);

		add(text1);
		add(text2);
		add(text3);
		add(text4);
		add(text5);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JFormattedTextFieldTest04();
	}

}