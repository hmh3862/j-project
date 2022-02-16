package me.gui.selection;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JToggleButtonTest04 extends JFrame implements ActionListener {
	JToggleButton redBtn, greenBtn, blueBtn;
	JPanel colorPanel;
	public JToggleButtonTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JToggleButtonTest04 - setColor");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		colorPanel = new JPanel();
		colorPanel.setBackground(Color.BLACK);
		colorPanel.setBorder(BorderFactory.createTitledBorder("색상표시"));
		add(colorPanel, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		redBtn = new JToggleButton("Red");
		greenBtn = new JToggleButton("Green");
		blueBtn = new JToggleButton("Blue");
		bottomPanel.add(redBtn);
		bottomPanel.add(greenBtn);
		bottomPanel.add(blueBtn);
		redBtn.addActionListener(this);
		greenBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		
		add(bottomPanel,BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JToggleButtonTest04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color color = colorPanel.getBackground();
	    int red = color.getRed();
	    int green = color.getGreen();
	    int blue = color.getBlue();
	    
		String title = e.getActionCommand();
		AbstractButton abstractButton = (AbstractButton) e.getSource();
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
