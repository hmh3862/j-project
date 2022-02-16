package me.gui.text;

import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;

public class JTextPaneTest01 extends JFrame {

	public JTextPaneTest01() throws BadLocationException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextPaneTest01 - SimpleAttributeSet");
		setSize(300, 300);
		setLocationRelativeTo(null);

		JTextPane textPane = new JTextPane();
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setBold(set, true);
		StyleConstants.setFontSize(set, 20);

		textPane.setCharacterAttributes(set, true);
		textPane.setText("Java ");

		set = new SimpleAttributeSet();
		StyleConstants.setItalic(set, true);
		StyleConstants.setForeground(set, Color.red);
		StyleConstants.setBackground(set, Color.yellow);

		Document doc = textPane.getStyledDocument();
		doc.insertString(doc.getLength(), "Swing ", set);

		set = new SimpleAttributeSet();
		StyleConstants.setFontSize(set, 30);

		doc.insertString(doc.getLength(), "Tutorial", set);

		JScrollPane scrollPane2 = new JScrollPane(textPane);
		add(scrollPane2);

		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new JTextPaneTest01();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}