package me.gui.text;

import java.awt.*;
import java.io.*;
import java.net.URL;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;

public class JEditorPaneTest03 extends JFrame implements HyperlinkListener {
	JEditorPane htmlPane;

	public JEditorPaneTest03() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JEditorPaneTest03 - HyperlinkListener");
		setSize(500, 500);
		setLocationRelativeTo(null);

		htmlPane = new JEditorPane("http://google.co.kr");
		htmlPane.setContentType("text/html");
		htmlPane.setBorder(BorderFactory.createLineBorder(Color.green));
		htmlPane.addHyperlinkListener(this);
		htmlPane.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(htmlPane);
		add(scrollPane);

		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new JEditorPaneTest03();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void hyperlinkUpdate(HyperlinkEvent e) {
		HyperlinkEvent.EventType type = e.getEventType();
		URL url = e.getURL();
		if (type == HyperlinkEvent.EventType.ENTERED) {
			System.out.println("URL: " + url);
		} else if (type == HyperlinkEvent.EventType.ACTIVATED) {
			System.out.println(url + "로 이동");
			try {
				htmlPane.setPage(url);
			} catch (IOException ioException) {
				System.out.println("Error!!!");
				Document doc = htmlPane.getDocument();
				htmlPane.setDocument(doc);
			}
		}
	}
}