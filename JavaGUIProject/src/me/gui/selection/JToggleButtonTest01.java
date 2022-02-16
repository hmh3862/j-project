package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CloseAction extends AbstractAction {
	public CloseAction() {
		super("버튼상태 : 해제됨");
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		AbstractButton abstractButton = (AbstractButton) event.getSource();
		boolean selected = abstractButton.getModel().isSelected();
		abstractButton.setText("버튼상태 : " + (selected ? "선택됨" : "해제됨"));
	}
}
public class JToggleButtonTest01 extends JFrame {
	public JToggleButtonTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JToggleButtonTest02 - selected");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(8,1));

		JToggleButton aToggleButton1 = new JToggleButton();
		JToggleButton aToggleButton2 = new JToggleButton(new ImageIcon("images/middle.gif"));
		JToggleButton aToggleButton3 = new JToggleButton(new ImageIcon("images/middle.gif"), true);
		JToggleButton aToggleButton4 = new JToggleButton("토글버튼(기본)");
		JToggleButton aToggleButton5 = new JToggleButton("토글버튼(선택)", true);
		JToggleButton aToggleButton6 = new JToggleButton("토글버튼(기본)",  new ImageIcon("images/middle.gif"));
		JToggleButton aToggleButton7 = new JToggleButton("토글버튼(선택)", new ImageIcon("images/middle.gif"), true);
		Action action = new CloseAction();
		JToggleButton aToggleButton8 = new JToggleButton(action);
		add(aToggleButton1);
		add(aToggleButton2);
		add(aToggleButton3);
		add(aToggleButton4);
		add(aToggleButton5);
		add(aToggleButton6);
		add(aToggleButton7);
		add(aToggleButton8);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JToggleButtonTest01();
	}
}
