package me.gui.selection;

import java.awt.*;
import javax.swing.*;

public class JListTest07 extends JFrame {
	public JListTest07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JListTest07 - ListSelectionModel");
		setSize(300, 600);
		setLocationRelativeTo(null);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
	    model.ensureCapacity(100);
	    for (int i = 0; i < 100; i++) {
	      model.addElement(Integer.toString(i));
	    }
	    JList<String> list = new JList<String>(model);
	    //list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
	    //list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION );
	    list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
	    
	    JScrollPane scrollPane = new JScrollPane(list);
	    add(scrollPane, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JListTest07();
	}
}
