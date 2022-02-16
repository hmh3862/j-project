package me.gui.advance;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class JScrollPaneToTopAction implements ActionListener {
	  JScrollPane scrollPane;
	  public JScrollPaneToTopAction(JScrollPane scrollPane) {
	    if (scrollPane == null) {
	      throw new IllegalArgumentException(
	        "JScrollPaneToTopAction: null JScrollPane");
	    }
	    this.scrollPane = scrollPane;
	  }
	  public void actionPerformed(ActionEvent actionEvent) {
	    JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
	    JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();
	    verticalScrollBar.setValue(verticalScrollBar.getMinimum());
	    horizontalScrollBar.setValue(horizontalScrollBar.getMaximum());
	  }
	}

public class JScrollPaneTest03 extends JFrame {
	public JScrollPaneTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JScrollBarTest01 - ActionListener");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Label");
	    label.setPreferredSize(new Dimension(1000, 1000));
	    JScrollPane jScrollPane = new JScrollPane(label);

	    JButton bn = new JButton("Move");
	    
	    bn.addActionListener(new JScrollPaneToTopAction(jScrollPane));
	    
	    add(bn, BorderLayout.SOUTH);
	    add(jScrollPane, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollPaneTest03();
	}
}
