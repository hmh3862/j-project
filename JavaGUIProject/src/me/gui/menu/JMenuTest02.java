package me.gui.menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class JMenuTest02 extends JFrame {
	public JMenuTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JMenuTest02 - JPopupMenu");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JPopupMenu popupMenu = new JPopupMenu();

		JMenuItem popup1  = new JMenuItem("Poupup1"); 
		JMenuItem popup2  = new JMenuItem("Poupup2"); 
		JMenuItem popup3  = new JMenuItem("Poupup3");

		popupMenu.add(popup1); 
		popupMenu.add(popup2); 
		popupMenu.add(popup3);
		
		MouseListener ml = new MouseAdapter()  {
		    @Override
		    public void  mouseReleased(MouseEvent e)  {
		        if (e.isPopupTrigger()) {
		            popupMenu.show(e.getComponent(), e.getX(), e.getY());
		        }
		    }
		};

		addMouseListener(ml);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuTest02();
	}
}
