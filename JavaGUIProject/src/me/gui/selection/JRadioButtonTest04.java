package me.gui.selection;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JRadioButtonTest04 extends JFrame implements ActionListener {
	JRadioButton redRB, greenRB, blueRB;
	JPanel colorPanel;
	public JRadioButtonTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JRadioButtonTest04 - setColor");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		colorPanel = new JPanel();
		colorPanel.setBackground(Color.BLACK);
		colorPanel.setBorder(BorderFactory.createTitledBorder("색상표시"));
		add(colorPanel, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		redRB = new JRadioButton("Red");
		greenRB = new JRadioButton("Green");
		blueRB = new JRadioButton("Blue");
		ButtonGroup bg = new ButtonGroup();
		bg.add(redRB);	bg.add(greenRB);	bg.add(blueRB);
		bottomPanel.add(redRB);
		bottomPanel.add(greenRB);
		bottomPanel.add(blueRB);
		redRB.addActionListener(this);
		greenRB.addActionListener(this);
		blueRB.addActionListener(this);
		
		add(bottomPanel,BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JRadioButtonTest04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String title = e.getActionCommand();
		JRadioButton abstractButton = (JRadioButton) e.getSource();
		if(title.equals("Red")){
			colorPanel.setBackground(Color.red);
		}
		if(title.equals("Green")){
			colorPanel.setBackground(Color.green);
		}
		if(title.equals("Blue")){
			colorPanel.setBackground(Color.blue);
		}
	}
}
