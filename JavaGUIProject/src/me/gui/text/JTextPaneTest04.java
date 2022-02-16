package me.gui.text;

import java.awt.Color;

import javax.swing.*;
import javax.swing.text.*;

public class JTextPaneTest04 extends JFrame {
	public static final String text = "\n이것은 JTextPane 연습입니다.\n"
	        + "이것도 JTextPane 연습입니다.\n";

	public JTextPaneTest04() throws BadLocationException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextPaneTest04 - Icon");
		setSize(300, 300);
		setLocationRelativeTo(null);

		StyleContext sc = new StyleContext();
		final DefaultStyledDocument doc = new DefaultStyledDocument(sc);
		JTextPane textPane = new JTextPane(doc);

		Style labelStyle = sc.getStyle(StyleContext.DEFAULT_STYLE);

	    Icon icon = new ImageIcon("images/Rabbit.gif");
	    JLabel label = new JLabel(icon);
	    StyleConstants.setComponent(labelStyle, label);

	    Style style = doc.addStyle("StyleName", null);
	    StyleConstants.setFontFamily(style, "SansSerif");
	    StyleConstants.setBackground(style, Color.YELLOW);

	    doc.insertString(doc.getLength(), "Ignored", labelStyle);
	    doc.insertString(0, text, null);
	    doc.insertString(doc.getLength(), text, style);
	    
		JScrollPane scrollPane2 = new JScrollPane(textPane);
		add(scrollPane2);

		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new JTextPaneTest04();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}