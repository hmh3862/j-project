package me.gui.component;

import java.awt.*;

import javax.swing.*;

public class JButtonTest05 extends JFrame {
	public JButtonTest05() {
		super("JButtonTest05 - HTML");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 300));
		setLayout(new GridLayout(3,1));

		JButton btn1 = new JButton("<html><body><b>Close</b>  Window</body></html>");
	    add(btn1);
	    
		JButton btn2 =new JButton(); 
		btn2.putClientProperty("html.disable",  Boolean.TRUE); 
		btn2.setText("<html><body>HTML is disabled</body></html>");
	    add(btn2);
	    
		JButton btn3 = new JButton(); 
		btn3.setText("<html><body>Line 1<br/>Line 2</body></html>");
	    add(btn3);
	    
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonTest05();
	}
}
