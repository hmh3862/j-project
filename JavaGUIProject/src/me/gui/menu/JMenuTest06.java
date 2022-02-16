package me.gui.menu;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.*;

public class JMenuTest06 extends JFrame {
	JLabel info;
	JMenuItem menu1, menu2;
	public JMenuTest06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JMenuTest06 - StatusBar ");
		setSize(300, 400);
		setLocationRelativeTo(null);
		JPanel statusBar = new JPanel(new BorderLayout());
		statusBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		info = new JLabel("메뉴연습");
		statusBar.add(info, BorderLayout.WEST);
		statusBar.add(new JLabel(new Date().toLocaleString()), BorderLayout.EAST);
		add(statusBar, BorderLayout.SOUTH);
		
		JMenuBar menuBar = new JMenuBar(); 
		JMenu menu = new JMenu("Menu"); 
		menu1 = new JMenuItem("메뉴 1");
		menu1.getAccessibleContext().setAccessibleDescription("메뉴 1입니다.");
		menu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				info.setText(menu1.getAccessibleContext().getAccessibleDescription());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				info.setText("메뉴연습");			
			}
		});
		menu.add(menu1);
		menu2 = new JMenuItem("메뉴 2");
		menu2.getAccessibleContext().setAccessibleDescription("메뉴 2입니다.");
		menu2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				info.setText(menu2.getAccessibleContext().getAccessibleDescription());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				info.setText("메뉴연습");			
			}
		});
		menu.add(menu2);
		
		menuBar.add(menu);
		setJMenuBar(menuBar);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuTest06();
	}
}
