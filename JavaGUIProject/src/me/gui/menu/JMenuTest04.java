package me.gui.menu;

import java.awt.event.*;

import javax.swing.*;

public class JMenuTest04 extends JFrame {
	public JMenuTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JMenuTest04 - Radio/CheckBox/Images");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar(); 
		JMenu menu1 = new JMenu("Text/Image"); 
		JMenuItem textMenu = new JMenuItem("Text 전용");
		menu1.add(textMenu);
		JMenuItem imageMenu = new JMenuItem(new ImageIcon("images/middle.gif"));
		menu1.add(imageMenu);
		JMenuItem textImageMenu = new JMenuItem("textI/mage",new ImageIcon("images/middle.gif"));
		menu1.add(textImageMenu);
		menuBar.add(menu1);
		
		JMenu menu2 = new JMenu("Radio/Check"); 
		ButtonGroup group = new ButtonGroup();
		JRadioButtonMenuItem rbm1 = new JRadioButtonMenuItem("radio button menu 1");
		JRadioButtonMenuItem rbm2 = new JRadioButtonMenuItem("radio button menu 2");
		rbm1.setSelected(true);
		group.add(rbm1);
		group.add(rbm2);
		menu2.add(rbm1);
		menu2.add(rbm2);
		menu2.addSeparator();
		JCheckBoxMenuItem cbm1 = new JCheckBoxMenuItem("checkbox menu 1");
		JCheckBoxMenuItem cbm2 = new JCheckBoxMenuItem("checkbox menu 2");
		cbm2.setSelected(true);
		menu2.add(cbm1);
		menu2.add(cbm2);
		menuBar.add(menu2);
		
		setJMenuBar(menuBar);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuTest04();
	}
}
