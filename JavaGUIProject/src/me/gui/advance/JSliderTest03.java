package me.gui.advance;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderTest03 extends JFrame{

	public JSliderTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSliderTest03 - Tick Slider");
		setSize(300, 400);
		setLocationRelativeTo(null);

		JSlider jSliderOne = new JSlider(0,100,10);

	    jSliderOne.setMinorTickSpacing(5); //  작은 눈금 5
	    jSliderOne.setMajorTickSpacing(25);// 큰 눈금 25
	    jSliderOne.setPaintTicks(true);// 눈금자 표시
	    jSliderOne.setSnapToTicks(true);// 눈금에 맞추기 

	    add(jSliderOne, BorderLayout.NORTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JSliderTest03();
	}
}
