package me.gui.menu;

import javax.swing.*;

public class JMenuTest05 extends JFrame {
	public JMenuTest05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JMenuTest05 - Sub Menu");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar(); 
		JMenu menu = new JMenu("Menu"); 
		JMenu subMenu = new JMenu("Sub Menu"); 
		menu.add(subMenu);
		JMenuItem subMenu1 = new JMenuItem("서브메뉴 1");
		JMenuItem subMenu2 = new JMenuItem("서브메뉴 2");
		JMenu subMenu3 = new JMenu("서브메뉴 3");
		JMenuItem subSubMenu1 = new JMenuItem("서브메뉴 11");
		JMenuItem subSubMenu2 = new JMenuItem("서브메뉴 22");
		subMenu3.add(subSubMenu1);
		subMenu3.add(subSubMenu2);
		
		subMenu.add(subMenu1);
		subMenu.add(subMenu2);
		subMenu.add(subMenu3);
		
		menuBar.add(menu);
		
		setJMenuBar(menuBar);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuTest05();
	}
}
