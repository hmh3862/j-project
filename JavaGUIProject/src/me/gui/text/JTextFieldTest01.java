package me.gui.text;

import java.awt.*;
import javax.swing.*;

public class JTextFieldTest01 extends JFrame {
	public JTextFieldTest01() {
		super("JTextFieldTest01 - Constructor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(600, 100));
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		// 다양한 생성자를 이용가능 합니다.
		JTextField emptyTF = new JTextField();
		JTextField helloTF = new JTextField("Hello Swing!!");
		JTextField nameTF = new JTextField(15);
		add(new JLabel("기본생성자로 작성",JLabel.RIGHT));
		add(emptyTF);
		add(new JLabel("String으로 작성",JLabel.RIGHT));
		add(helloTF);
		add(new JLabel("int로 작성",JLabel.RIGHT));
		nameTF.setHorizontalAlignment(JTextField.CENTER) ;
		add(nameTF);
		setVisible(true);
		nameTF.requestFocus();
	}

	public static void main(String[] args) {
		new JTextFieldTest01();
	}

}
