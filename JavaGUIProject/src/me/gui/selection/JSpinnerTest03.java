package me.gui.selection;

import java.awt.*;
import java.text.DateFormatSymbols;
import java.util.Locale;

import javax.swing.*;
import javax.swing.event.*;

public class JSpinnerTest03 extends JFrame{
	JPanel centerPanel;
	JSpinner  redSpinner,greenSpinner,blueSpinner;
	public JSpinnerTest03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSpinnerTest02 - Color");
		setSize(300, 200);
		setLocationRelativeTo(null);
		
		DateFormatSymbols symbols = new DateFormatSymbols(Locale.KOREA);
	    String days[] = symbols.getWeekdays();
	    SpinnerModel model = new SpinnerListModel(days);
	    JSpinner spinner = new JSpinner(model);
	    spinner.setValue("화요일");

	    JLabel label = new JLabel("요일");
	    JPanel panel = new JPanel(new BorderLayout());
	    panel.add(label, BorderLayout.WEST);
	    panel.add(spinner, BorderLayout.CENTER);
	    add(panel, BorderLayout.NORTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JSpinnerTest03();
	}
}
