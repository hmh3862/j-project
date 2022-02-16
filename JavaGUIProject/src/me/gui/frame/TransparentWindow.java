package me.gui.frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TransparentWindow extends JFrame {
  public TransparentWindow() {
    super("투명한 윈도우");
    setSize(300, 300);
    setLocationRelativeTo(null);
    
    setUndecorated(true);
    setOpacity(0.9f);
    
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
	  new TransparentWindow();
  }
}