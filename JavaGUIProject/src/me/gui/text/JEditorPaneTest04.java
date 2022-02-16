package me.gui.text;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class JEditorPaneTest04 extends JFrame implements ActionListener,
		HyperlinkListener {
	private JEditorPane view;
	private JTextField commandLine;

	public JEditorPaneTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JEditorPaneTest04 - 웹페이지 보기");
		setSize(500, 500);
		setLocationRelativeTo(null);

		JPanel top = new JPanel();
		top.add(new JLabel("주소 : "));
		commandLine = new JTextField("http://www.daum.net", 30);
		commandLine.addActionListener(this);
		top.add(commandLine);
		JButton goBtn = new JButton("이동");
		goBtn.addActionListener(this);
		top.add(goBtn);
		add(top, BorderLayout.NORTH);

		view = new JEditorPane();
		view.setEditable(false);
		view.setPreferredSize(new Dimension(400, 400));
		view.addHyperlinkListener(this);

		JScrollPane main = new JScrollPane(view);
		add(main, BorderLayout.CENTER);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			URL url = new URL(commandLine.getText());
			view.setPage(url);
			commandLine.setText(url.toExternalForm());
		} catch (MalformedURLException e2) {
			System.out.println("Bad URL: " + e.getActionCommand());
		} catch (java.io.IOException e2) {
		}
	}

	public void hyperlinkUpdate(HyperlinkEvent e) {
		try {
			view.setPage(e.getURL());
			commandLine.setText(e.getURL().toExternalForm());
		} catch (java.io.IOException e2) {
		}
	}

	public static void main(String[] args) {
		new JEditorPaneTest04();
	}
}