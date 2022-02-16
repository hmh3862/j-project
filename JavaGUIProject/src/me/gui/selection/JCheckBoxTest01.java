package me.gui.selection;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class CloseAction2 extends AbstractAction {
	public CloseAction2() {
		super("상태 : 해제됨");
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		AbstractButton abstractButton = (AbstractButton) event.getSource();
		boolean selected = abstractButton.getModel().isSelected();
		abstractButton.setText("상태 : " + (selected ? "선택됨" : "해제됨"));
	}
}
public class JCheckBoxTest01 extends JFrame implements ActionListener{
	ImageIcon normal = new ImageIcon("images/CheckOff.png");
	ImageIcon rollover = new ImageIcon("images/CheckOver.png");
	ImageIcon selected = new ImageIcon("images/CheckOn.png");
	
	public JCheckBoxTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JCheckBoxTest02 - selected");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(8,1));

		JCheckBox aCheckBox1 = new JCheckBox();
		JCheckBox aCheckBox2 = new JCheckBox(normal);
		aCheckBox2.setRolloverIcon(rollover);
		aCheckBox2.setSelectedIcon(selected);
		aCheckBox2.addActionListener(this);
		JCheckBox aCheckBox3 = new JCheckBox(selected,true);
		aCheckBox3.setRolloverIcon(rollover);
		aCheckBox3.setSelectedIcon(selected);
		aCheckBox3.addActionListener(this);
		JCheckBox aCheckBox4 = new JCheckBox("CheckBox(해제)");
		JCheckBox aCheckBox5 = new JCheckBox("CheckBox(선택)", true);
		JCheckBox aCheckBox6 = new JCheckBox("CheckBox(해제)",  normal);
		aCheckBox6.setRolloverIcon(rollover);
		aCheckBox6.setSelectedIcon(selected);
		aCheckBox6.addActionListener(this);
		JCheckBox aCheckBox7 = new JCheckBox("CheckBox(선택)", selected, true);
		aCheckBox7.setRolloverIcon(rollover);
		aCheckBox7.setSelectedIcon(selected);
		aCheckBox7.addActionListener(this);
		Action action = new CloseAction2();
		JCheckBox aCheckBox8 = new JCheckBox(action);
		add(aCheckBox1);
		add(aCheckBox2);
		add(aCheckBox3);
		add(aCheckBox4);
		add(aCheckBox5);
		add(aCheckBox6);
		add(aCheckBox7);
		add(aCheckBox8);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox check = (JCheckBox)e.getSource();
		if(check.isSelected()){
			check.setIcon(selected);
			if(!e.getActionCommand().equals(""))
				check.setText("CheckBox(선택)");
		}else{
			check.setIcon(normal);
			if(!e.getActionCommand().equals(""))
				check.setText("CheckBox(해제)");
		}
	}
	public static void main(String[] args) {
		new JCheckBoxTest01();
	}
}
