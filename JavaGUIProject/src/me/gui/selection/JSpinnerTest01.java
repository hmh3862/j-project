package me.gui.selection;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import javax.swing.*;

public class JSpinnerTest01 extends JFrame{
	public JSpinnerTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSpinnerTest01 - Constructor");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4,1));
		
		SpinnerNumberModel  nModel = new SpinnerNumberModel(5, 1,   10,  1); 
		JSpinner  numberSpinner = new JSpinner(nModel);
		add(numberSpinner);
		
		Calendar calendar  = Calendar.getInstance();
		calendar.set(2000, 1, 1);
		Date  minValue  = calendar.getTime();
		calendar.set(2050, 12,   31);
		Date  maxValue = calendar.getTime(); 
		Date  currentValue = new Date();
		int steps = Calendar.MONTH; 
		SpinnerDateModel dModel = new SpinnerDateModel(currentValue, minValue,   maxValue,  steps);
		JSpinner  dateSpinner = new JSpinner(dModel);
		JSpinner.DateEditor dEditor = new JSpinner.DateEditor(dateSpinner,"yyyy년 MM월 dd일 hh:mm:ss");
		dateSpinner.setEditor(dEditor);
		add(dateSpinner);
		
		String[]  seasons = new String[]  {"Spring", "Summer",  "Fall", "Winter"}; 
		SpinnerListModel sModel  = new SpinnerListModel(seasons);
		JSpinner listSpinner = new JSpinner(sModel);
		add(listSpinner);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JSpinnerTest01();
	}
}
