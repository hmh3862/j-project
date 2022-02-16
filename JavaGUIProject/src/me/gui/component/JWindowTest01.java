package me.gui.component;

import javax.swing.JFrame;
import javax.swing.JWindow;
public class JWindowTest01 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("The Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setLocation(100, 100);

    JWindow window = new JWindow();
    window.setSize(300, 300);
    window.setLocation(500, 100);

    frame.setVisible(true);
    window.setVisible(true);
  }
}