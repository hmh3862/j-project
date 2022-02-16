package me.gui.selection;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSpinnerTest02 extends JFrame{
	JPanel centerPanel;
	JSpinner  redSpinner,greenSpinner,blueSpinner;
	public JSpinnerTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSpinnerTest02 - Color");
		setSize(300, 200);
		setLocationRelativeTo(null);
		
		centerPanel = new JPanel();
		centerPanel.setBackground(Color.BLACK);
		add(centerPanel, BorderLayout.CENTER);
		
		ChangeListener listener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int red = (int)redSpinner.getValue();
				int green =(int)greenSpinner.getValue();
				int blue = (int)blueSpinner.getValue();
				Color color = new Color(red,green,blue);
				centerPanel.setBackground(color);
			}
		};
		
		JPanel bottomPanel = new JPanel();
		SpinnerNumberModel  red = new SpinnerNumberModel(0, 0,   255,  1); 
		redSpinner = new JSpinner(red);
		redSpinner.addChangeListener(listener);
		
		bottomPanel.add(new JLabel("Red"));
		bottomPanel.add(redSpinner);
		SpinnerNumberModel  green = new SpinnerNumberModel(0, 0,   255,  1); 
		greenSpinner = new JSpinner(green);
		greenSpinner.addChangeListener(listener);
		bottomPanel.add(new JLabel("Green"));
		bottomPanel.add(greenSpinner);
		
		SpinnerNumberModel  blue = new SpinnerNumberModel(0, 0,   255,  1); 
		blueSpinner = new JSpinner(blue);
		blueSpinner.addChangeListener(listener);
		bottomPanel.add(new JLabel("Blue"));
		bottomPanel.add(blueSpinner);
		
		add(bottomPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JSpinnerTest02();
	}
}
