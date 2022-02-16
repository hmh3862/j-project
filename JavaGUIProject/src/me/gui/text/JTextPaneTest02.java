package me.gui.text;

import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;

public class JTextPaneTest02 extends JFrame {

	public JTextPaneTest02() throws BadLocationException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextPaneTest02 - StyledDocument");
		setSize(300, 300);
		setLocationRelativeTo(null);

		JTextPane textPane = new JTextPane();
		StyledDocument doc = textPane.getStyledDocument();

		Style def = StyleContext.getDefaultStyleContext().getStyle(
				StyleContext.DEFAULT_STYLE);
		Style regular = doc.addStyle("regular", def);

		Style italic = doc.addStyle("italic", regular);
		StyleConstants.setItalic(italic, true);

		Style bold = doc.addStyle("bold", regular);
		StyleConstants.setBold(bold, true);

		Style small = doc.addStyle("small", regular);
		StyleConstants.setFontSize(small, 10);

		Style large = doc.addStyle("large", regular);
		StyleConstants.setFontSize(large, 16);

		Style superscript = doc.addStyle("superscript", regular);
		StyleConstants.setSuperscript(superscript, true);

		Style highlight = doc.addStyle("highlight", regular);
		StyleConstants.setBackground(highlight, Color.yellow);

		doc.insertString(0, "This is regular text\n", regular);
		doc.insertString(doc.getLength(), "This is italic text\n", italic);
		doc.insertString(doc.getLength(), "This is bold text\n", bold);
		doc.insertString(doc.getLength(), "This is small text\n", small);
		doc.insertString(doc.getLength(), "This is large text\n", large);
		doc.insertString(doc.getLength(), "This is superscript text\n", superscript);
		doc.insertString(doc.getLength(), "This is highlight text\n", highlight);

		JScrollPane scrollPane2 = new JScrollPane(textPane);
		add(scrollPane2);

		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new JTextPaneTest02();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}