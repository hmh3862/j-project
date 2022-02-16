package me.gui.menu;

import java.awt.event.*;

import javax.swing.*;

public class JMenuTest03 extends JFrame {
	public JMenuTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JMenuTest03 - ActionListener");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar(); 
		JMenu fileMenu = new JMenu("File"); 
		fileMenu.setMnemonic('F');
		
		JMenuItem newMenuItem = new JMenuItem("New"); 
		newMenuItem.setMnemonic('N');
		KeyStroke altNewKey = KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK | ActionEvent.SHIFT_MASK);
		newMenuItem.setAccelerator(altNewKey);
		newMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getParent(), "New Menu입니다.");
			}
		});
		JMenuItem openMenuItem = new JMenuItem("Open"); 
		openMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getParent(), "Open Menu입니다.");
			}
		});
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setMnemonic('x');
		exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				int choice = JOptionPane.showConfirmDialog(getParent(), "정말 종료하시겠습니까?",
						"종료확인", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (choice == 0) {
					System.exit(0);
				}
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		fileMenu.add(newMenuItem); 
		fileMenu.add(openMenuItem); 
		fileMenu.addSeparator(); 
		fileMenu.add(exitMenuItem);
	
		KeyStroke cntrlExitKey = KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK);
		exitMenuItem.setAccelerator(cntrlExitKey);
		menuBar.add(fileMenu); 
		setJMenuBar(menuBar);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuTest03();
	}
}
