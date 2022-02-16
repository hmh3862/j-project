package me.gui.menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class JMenuTest01 extends JFrame {
	public JMenuTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBarTest01 - JMenuBar");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar(); 
		JMenu fileMenu = new JMenu("File"); 
		fileMenu.setMnemonic('F');
		JMenuItem newMenuItem = new JMenuItem("New"); 
		JMenuItem openMenuItem = new JMenuItem("Open"); 
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		fileMenu.add(newMenuItem); 
		fileMenu.add(openMenuItem); 
		fileMenu.addSeparator(); 
		fileMenu.add(exitMenuItem);
	
		KeyStroke cntrlEKey = KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK);
		exitMenuItem.setAccelerator(cntrlEKey);
		menuBar.add(fileMenu); 
		
		JMenu helpMenu = new JMenu("Help"); 
		helpMenu.setMnemonic('H');
		menuBar.add(helpMenu);
		setJMenuBar(menuBar);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuTest01();
	}
}
