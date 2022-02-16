package me.gui.advance;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JProgressBarTest05 extends JFrame{
	public JProgressBarTest05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBarTest05 - Progress Dialog");
		setSize(300, 400);
		setLocationRelativeTo(null);

		JLabel label = new JLabel();
		label.setText("Count : 0");
		add(label,BorderLayout.NORTH);
		setVisible(true);
		
		final JDialog dlg = new JDialog(this, "Progress Dialog", true);
	    JProgressBar dpb = new JProgressBar(0, 500);
	    dlg.add(BorderLayout.CENTER, dpb);
	    dlg.add(BorderLayout.NORTH, new JLabel("Progress..."));
	    dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	    dlg.setSize(300, 75);
	    dlg.setLocationRelativeTo(null);

	    Thread t = new Thread(new Runnable() {
	      public void run() {
	        dlg.setVisible(true);
	      }
	    });
	    t.start();
	    
	    for (int i = 0; i <= 500; i++) {
	      label.setText("Count : " + i);
	      dpb.setValue(i);
	      if(dpb.getValue() == 500){
	        dlg.setVisible(false);
	        System.exit(0);
	      }
	      try {
	        Thread.sleep(25);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	    dlg.setVisible(true);
		
	}

	public static void main(String[] args) {
		new JProgressBarTest05();
	}
}
