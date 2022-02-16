package me.gui.selection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CloseAction3 extends AbstractAction {
	public CloseAction3() {
		super("상태 : 해제됨");
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		AbstractButton abstractButton = (AbstractButton) event.getSource();
		boolean selected = abstractButton.getModel().isSelected();
		abstractButton.setText("상태 : " + (selected ? "선택됨" : "해제됨"));
	}
}
public class JRadioButtonTest01 extends JFrame implements ActionListener{
	ImageIcon normal = new ImageIcon("images/CheckOff.png");
	ImageIcon selected = new ImageIcon("images/CheckOn.png");
	
	public JRadioButtonTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JRadioButtonTest01 - Constructor");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(8,1));

		JRadioButton aRadioButton1 = new JRadioButton();
		JRadioButton aRadioButton2 = new JRadioButton(normal);
		aRadioButton2.setSelectedIcon(selected);
		aRadioButton2.addActionListener(this);
		JRadioButton aRadioButton3 = new JRadioButton(selected,true);
		aRadioButton3.setSelectedIcon(selected);
		aRadioButton3.addActionListener(this);
		JRadioButton aRadioButton4 = new JRadioButton("CheckBox(해제)");
		JRadioButton aRadioButton5 = new JRadioButton("CheckBox(선택)", true);
		JRadioButton aRadioButton6 = new JRadioButton("CheckBox(해제)",  normal);
		aRadioButton6.setSelectedIcon(selected);
		aRadioButton6.addActionListener(this);
		JRadioButton aRadioButton7 = new JRadioButton("CheckBox(선택)", selected, true);
		aRadioButton7.setSelectedIcon(selected);
		aRadioButton7.addActionListener(this);
		Action action = new CloseAction3();
		JRadioButton aRadioButton8 = new JRadioButton(action);
		add(aRadioButton1);
		add(aRadioButton2);
		add(aRadioButton3);
		add(aRadioButton4);
		add(aRadioButton5);
		add(aRadioButton6);
		add(aRadioButton7);
		add(aRadioButton8);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JRadioButton check = (JRadioButton)e.getSource();
		if(check.isSelected()){
			check.setIcon(selected);
			if(!e.getActionCommand().equals(""))
				check.setText("RadioButton (선택)");
		}else{
			check.setIcon(normal);
			if(!e.getActionCommand().equals(""))
				check.setText("RadioButton (해제)");
		}
	}
	public static void main(String[] args) {
		new JRadioButtonTest01();
	}
}
