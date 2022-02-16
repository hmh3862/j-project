package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JComboBoxTest05 extends JFrame 
       implements ActionListener, ListSelectionListener,ItemListener{
	DefaultComboBoxModel<String> model;
	JComboBox<String> comboBox;
	JList<String> list;
	int count;
	public JComboBoxTest05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("scrollPane - SharedData");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		String labels[] = { "아이템 하나", "아이템 두울", "아이템 세엣"};
		model = new DefaultComboBoxModel<>(labels);
		JPanel panel = new JPanel();
	    comboBox = new JComboBox<>(model);
	    comboBox.addItemListener(this);
	    panel.add(comboBox);
	    add(panel, BorderLayout.NORTH);

	    list = new JList<>(model);
	    list.addListSelectionListener(this);
	    JScrollPane scrollPane = new JScrollPane(list);
	    add(scrollPane, BorderLayout.CENTER);

	    JButton button = new JButton("아이템추가");
	    button.addActionListener(this);
	    add(button, BorderLayout.SOUTH);

		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		model.insertElementAt("추가된 아이템 " + ++count , 0);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		list.setSelectedIndex(comboBox.getSelectedIndex());
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		comboBox.setSelectedIndex(list.getSelectedIndex());
	}
	public static void main(String[] args) {
		new JComboBoxTest05();
	}
}
