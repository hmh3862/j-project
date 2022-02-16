package me.gui.advance;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JScrollBarTest02 extends JFrame implements AdjustmentListener{
	JScrollBar redScrollBar, greenScrollBar, blueScrollBar;
	JPanel centerPanel;
	public JScrollBarTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JScrollBarTest02 - AdjustmentListener");
		setSize(300, 400);
		setLocationRelativeTo(null);
		
		JPanel topPanel = new JPanel(new GridLayout(3,1));
		JPanel panel1 = new JPanel(new BorderLayout());
		redScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,125,10,0,255);
		redScrollBar.addAdjustmentListener(this);
		JLabel redLabel = new JLabel("적");
		redLabel.setLabelFor(redScrollBar);
		panel1.add(redLabel, BorderLayout.WEST);
		panel1.add(redScrollBar, BorderLayout.CENTER);
		topPanel.add(panel1);

		JPanel panel2 = new JPanel(new BorderLayout());
		greenScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,125,10,0,255);
		greenScrollBar.addAdjustmentListener(this);
		JLabel greenLabel = new JLabel("녹");
		greenLabel.setLabelFor(greenScrollBar);
		panel2.add(greenLabel, BorderLayout.WEST);
		panel2.add(greenScrollBar, BorderLayout.CENTER);
		topPanel.add(panel2);

		JPanel panel3 = new JPanel(new BorderLayout());
		blueScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,125,10,0,255);
		blueScrollBar.addAdjustmentListener(this);
		JLabel blueLabel = new JLabel("청");
		blueLabel.setLabelFor(blueScrollBar);
		panel3.add(blueLabel, BorderLayout.WEST);
		panel3.add(blueScrollBar, BorderLayout.CENTER);
		topPanel.add(panel3);
		add(topPanel, BorderLayout.SOUTH);
		
		centerPanel = new JPanel();
		centerPanel.setBackground(new Color(125,125,125));
		add(centerPanel, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollBarTest02();
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int red = (int)redScrollBar.getValue();
		int green =(int)greenScrollBar.getValue();
		int blue = (int)blueScrollBar.getValue();
		Color color = new Color(red,green,blue);
		centerPanel.setBackground(color);
	}
}
