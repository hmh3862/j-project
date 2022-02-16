package me.gui.text;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

class LimitedCharDocument extends PlainDocument {
	private int limit;
	public LimitedCharDocument() {
		this(0);
	}
	public LimitedCharDocument(int limit) {
		this.limit = limit;
	}
	@Override
	public void insertString(int offset, String str, AttributeSet a)
			throws BadLocationException {
		String newString = str;
		if (str != null) {
			int currentLength = this.getLength();
			int newTextLength = str.length();
			if (currentLength + newTextLength > limit) {
				newString = str.substring(0, limit - currentLength);
			}
		}
		super.insertString(offset, newString, a);
	}
}

class TenCharTextField extends JTextField {
	@Override
	protected Document createDefaultModel() {
		return new LimitedCharDocument(10);
	}
}

public class JTextFieldTest03 extends JFrame {
	public JTextFieldTest03() {
		super("JTextFieldTest03 - Document");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 100));
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 0));
		
		Document tenCharDoc = new LimitedCharDocument(10);
		JTextField nameTF = new JTextField(tenCharDoc, "1234567890", 10);
		add(nameTF);
		TenCharTextField tenStr = new TenCharTextField();
		add(tenStr);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest03();
	}
}
