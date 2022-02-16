package me.gui.advance;

import java.awt.*;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderTest04 extends JFrame {

	public JSliderTest04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSliderTest04 - Slider Label");
		setSize(300, 400);
		setLocationRelativeTo(null);

		JSlider jSliderOne = new JSlider(JSlider.VERTICAL, 0, 100, 52);

		jSliderOne.setPaintLabels(true);

		Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
		table.put(0, new JLabel(new ImageIcon("images/x.png")));
		table.put(15, new JLabel("15%"));
		table.put(25, new JLabel("25%"));
		table.put(34, new JLabel("34%"));
		table.put(52, new JLabel("52%"));
		table.put(70, new JLabel("70%"));
		table.put(82, new JLabel("82%"));
		table.put(100, new JLabel(new ImageIcon("images/o.png")));
		jSliderOne.setLabelTable(table);

		add(jSliderOne, BorderLayout.WEST);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSliderTest04();
	}
}
