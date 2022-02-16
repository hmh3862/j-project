package me.gui.advance;

import java.awt.*;
import javax.swing.*;

public class JSliderTest01 extends JFrame {
	public JSliderTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSliderTest01 - Constructor");
		setSize(300, 400);
		setLocationRelativeTo(null);

		JSlider hs1 = new JSlider();
		JSlider hs2 = new JSlider(SwingConstants.HORIZONTAL);
		JSlider hs3 = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 25);
		JPanel centerPanel = new JPanel();
		centerPanel.add(hs1);
		centerPanel.add(hs2);
		centerPanel.add(hs3);
		add(centerPanel, BorderLayout.CENTER);

		JSlider vs1 = new JSlider(SwingConstants.VERTICAL);
		JSlider vs2 = new JSlider(SwingConstants.VERTICAL, 0, 100, 75);
		vs2.setMinorTickSpacing(1);
		vs2.setMajorTickSpacing(20);
		vs2.setPaintTicks(true);
		add(vs1, BorderLayout.WEST);
		add(vs2, BorderLayout.EAST);

		DefaultBoundedRangeModel model = new DefaultBoundedRangeModel(50, 10,
				0, 100);
		JSlider hs4 = new JSlider(model);
		hs4.setMinorTickSpacing(1);
		hs4.setMajorTickSpacing(10);
		hs4.setPaintTicks(true);
		add(hs4, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JSliderTest01();
	}
}
