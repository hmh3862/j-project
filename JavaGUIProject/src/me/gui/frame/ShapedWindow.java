package me.gui.frame;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.*;

public class ShapedWindow extends JFrame {
  public ShapedWindow() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(300, 200);
    getContentPane().setBackground(Color.LIGHT_GRAY);

    Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 300, 200);
    Rectangle2D.Double rect = new Rectangle2D.Double(0, 150, 300, 200);
    Path2D path = new Path2D.Double();
    path.append(rect, true);
    path.append(ellipse, true);

    setUndecorated(true);
    setShape(path);
    
    JButton btnQuit = new JButton("종료하기");
    btnQuit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
    add(btnQuit, BorderLayout.NORTH);
    setVisible(true);
  }
  public static void main(String[] args) {
	  new ShapedWindow();
   }
}
