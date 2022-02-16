package me.gui.text;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class JTextFieldTest10 extends JFrame{
	JButton button;
	JTextField textField;
	public JTextFieldTest10() {
		super("JTextFieldTest10 - DocumentListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 100));
		setLocationRelativeTo(null);
		
		button = new JButton("전송하기");
		button.setEnabled(false);
		textField = new JTextField(10);
		Document document = textField.getDocument();
		document.addDocumentListener(new JButtonStateController(button));
		add(button, BorderLayout.EAST);
		add(textField, BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest10();
	}
}

class JButtonStateController implements DocumentListener {
	JButton button;
	JButtonStateController(JButton button) {
		this.button = button;
	}
	public void changedUpdate(DocumentEvent e) {
		disableIfEmpty(e);
	}
	public void insertUpdate(DocumentEvent e) {
		disableIfEmpty(e);
	}
	public void removeUpdate(DocumentEvent e) {
		disableIfEmpty(e);
	}
	public void disableIfEmpty(DocumentEvent e) {
		button.setEnabled(e.getDocument().getLength() > 0);
	}
}