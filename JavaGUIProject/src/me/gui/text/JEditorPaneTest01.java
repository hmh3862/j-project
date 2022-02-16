package me.gui.text;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.*;

public class JEditorPaneTest01 extends JFrame{

	public JEditorPaneTest01() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JEditorPaneTest01 - web");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2,1));
		
		JEditorPane htmlPane1  = new JEditorPane("http://www.google.co.kr");
		JScrollPane scrollPane1 = new JScrollPane(htmlPane1);
		add(scrollPane1);
		
		JEditorPane htmlPane2  = 
				new JEditorPane("text/html",
				                "<ol><li>One<li><i>Two</i><li><u>Three</u></ol>");
		JScrollPane scrollPane2 = new JScrollPane(htmlPane2);
		
		add(scrollPane2);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		try {
			new JEditorPaneTest01();
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}