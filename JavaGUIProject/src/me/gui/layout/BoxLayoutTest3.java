package me.gui.layout;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutTest3 extends JFrame{
	public BoxLayoutTest3() {
		super("BoxLayout Test3");
		setSize(400, 200);
		setLocationRelativeTo(null);
		
		Container contentPane = getContentPane();
		// 두 개의 패널은 세로 방향으로 쌓는다.
		setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		JPanel panel1 = new JPanel();
		// 가로 방향의 레이아웃
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.setBorder(BorderFactory.createTitledBorder("첫번째 Panel"));
		panel1.add(Box.createHorizontalGlue());
		panel1.add(new JButton("확인"));
		panel1.add(Box.createRigidArea(new Dimension(10, 0)));
		panel1.add(new JButton("취소"));

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.setBorder(BorderFactory.createTitledBorder("두번째 Panel"));
		panel2.add(new JButton("확인"));
		panel2.add(Box.createVerticalStrut(80));
		panel2.add(new JButton("취소"));

		contentPane.add(panel1);
		contentPane.add(panel2);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BoxLayoutTest3();
	}
}
