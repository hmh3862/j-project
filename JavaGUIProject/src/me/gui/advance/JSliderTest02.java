package me.gui.advance;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderTest02 extends JFrame  implements ChangeListener{
	JSlider redSlider, greenSlider, blueSlider;
	JPanel centerPanel;
	public JSliderTest02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSliderTest01 - Color");
		setSize(300, 400);
		setLocationRelativeTo(null);

		JPanel topPanel = new JPanel(new GridLayout(3,1));
		JPanel panel1 = new JPanel(new BorderLayout());
		redSlider = new JSlider(JSlider.HORIZONTAL,0, 255, 125);
		redSlider.addChangeListener(this);
		JLabel redLabel = new JLabel("적");
		redLabel.setLabelFor(redSlider);
		panel1.add(redLabel, BorderLayout.WEST);
		panel1.add(redSlider, BorderLayout.CENTER);
		topPanel.add(panel1);

		JPanel panel2 = new JPanel(new BorderLayout());
		greenSlider = new JSlider(JSlider.HORIZONTAL,0, 255, 125);
		greenSlider.addChangeListener(this);
		JLabel greenLabel = new JLabel("녹");
		greenLabel.setLabelFor(greenSlider);
		panel2.add(greenLabel, BorderLayout.WEST);
		panel2.add(greenSlider, BorderLayout.CENTER);
		topPanel.add(panel2);

		JPanel panel3 = new JPanel(new BorderLayout());
		blueSlider = new JSlider(JSlider.HORIZONTAL,0,255,125);
		blueSlider.addChangeListener(this);
		JLabel blueLabel = new JLabel("청");
		blueLabel.setLabelFor(blueSlider);
		panel3.add(blueLabel, BorderLayout.WEST);
		panel3.add(blueSlider, BorderLayout.CENTER);
		topPanel.add(panel3);
		add(topPanel, BorderLayout.SOUTH);
		
		centerPanel = new JPanel();
		centerPanel.setBackground(new Color(125,125,125));
		add(centerPanel, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JSliderTest02();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		int red = (int)redSlider.getValue();
		int green =(int)greenSlider.getValue();
		int blue = (int)blueSlider.getValue();
		Color color = new Color(red,green,blue);
		centerPanel.setBackground(color);
	}
}
