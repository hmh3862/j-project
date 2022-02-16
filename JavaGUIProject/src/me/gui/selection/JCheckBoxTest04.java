package me.gui.selection;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JCheckBoxTest04 extends JFrame implements ActionListener {
	JCheckBox redChk, greenChk, blueChk;
	JPanel colorPanel;
	public JCheckBoxTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JCheckBoxTest04 - setColor");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		colorPanel = new JPanel();
		colorPanel.setBackground(Color.BLACK);
		colorPanel.setBorder(BorderFactory.createTitledBorder("색상표시"));
		add(colorPanel, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		redChk = new JCheckBox("Red");
		greenChk = new JCheckBox("Green");
		blueChk = new JCheckBox("Blue");
		bottomPanel.add(redChk);
		bottomPanel.add(greenChk);
		bottomPanel.add(blueChk);
		redChk.addActionListener(this);
		greenChk.addActionListener(this);
		blueChk.addActionListener(this);
		
		add(bottomPanel,BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JCheckBoxTest04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color color = colorPanel.getBackground();
	    int red = color.getRed();
	    int green = color.getGreen();
	    int blue = color.getBlue();
	    
		String title = e.getActionCommand();
		JCheckBox abstractButton = (JCheckBox) e.getSource();
		if(title.equals("Red")){
			red = abstractButton.isSelected() ? 255 : 0;
		}
		if(title.equals("Green")){
			green = abstractButton.isSelected() ? 255 : 0;
		}
		if(title.equals("Blue")){
			blue = abstractButton.isSelected() ? 255 : 0;
		}
		color = new Color(red, green, blue);
		colorPanel.setBackground(color);
	}
}
