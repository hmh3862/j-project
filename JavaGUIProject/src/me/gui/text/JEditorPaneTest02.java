package me.gui.text;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class JEditorPaneTest02 extends JFrame{

	public JEditorPaneTest02() throws IOException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JEditorPaneTest02 - html");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4,1));
		
		JEditorPane htmlPane1  = new JEditorPane();
		htmlPane1.setBorder(BorderFactory.createLineBorder(Color.green));
		htmlPane1.setContentType("text/html");
		htmlPane1.setText("<html><body><h1>Hello!!</h1>Hello!!<b>Hello!!</b></body></html>");
		add(htmlPane1);
		
		JEditorPane htmlPane2  = new JEditorPane();
		htmlPane2.setContentType("text/html");
		htmlPane2.setBorder(BorderFactory.createLineBorder(Color.green));
		String filename = "myFile.html";
		
		FileReader reader = new FileReader(filename);
		htmlPane2.read(reader, filename);
		add(htmlPane2);
		
		JEditorPane htmlPane3  = new JEditorPane();
		htmlPane3.setContentType("text/plain");
		htmlPane3.setBorder(BorderFactory.createLineBorder(Color.green));
		reader = new FileReader(filename);
		htmlPane3.read(reader, filename);
		JScrollPane scrollPane1 = new JScrollPane(htmlPane3);
		add(scrollPane1);
		
		JEditorPane rtfPane  = new JEditorPane();
		rtfPane.setContentType("text/rtf");
		rtfPane.setBorder(BorderFactory.createLineBorder(Color.green));
		filename = "test.rtf";
		reader = new FileReader(filename);
		rtfPane.read(reader, filename);
		JScrollPane scrollPane2 = new JScrollPane(rtfPane);
		add(scrollPane2);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		try {
			new JEditorPaneTest02();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}