package me.gui.text;

import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;

public class JTextPaneTest03 extends JFrame {
	public static final String text = "Attributes, Styles and Style Contexts\n"
			+ "이것은 JTextPane 연습입니다.\n"
	        + "이것도 JTextPane 연습입니다.\n";

	public JTextPaneTest03() throws BadLocationException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextPaneTest03 - StyleContext");
		setSize(300, 300);
		setLocationRelativeTo(null);

		StyleContext sc = new StyleContext();
		final DefaultStyledDocument doc = new DefaultStyledDocument(sc);
		JTextPane textPane = new JTextPane(doc);

		final Style heading2Style = sc.addStyle("Heading2", null);
		heading2Style.addAttribute(StyleConstants.Foreground, Color.red);
		heading2Style.addAttribute(StyleConstants.FontSize, new Integer(16));
		heading2Style.addAttribute(StyleConstants.FontFamily, "serif");
		heading2Style.addAttribute(StyleConstants.Bold, new Boolean(true));
		doc.insertString(0, text, null);
		doc.setParagraphAttributes(40, 1, heading2Style, false);

		JScrollPane scrollPane2 = new JScrollPane(textPane);
		add(scrollPane2);

		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new JTextPaneTest03();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}