package me.gui.component;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderTest extends JFrame{

	public BorderTest() {
		super("BorderTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(600,400));
		setLayout(new GridLayout(4,3,10,10));
		JLabel lbl1 = new JLabel("BevelBorder.RAISED",JLabel.CENTER);
		lbl1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		add(lbl1);
		JLabel lbl2 = new JLabel("BevelBorder.LOWERED",JLabel.CENTER);
		lbl2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		add(lbl2);
		JLabel lbl3 = new JLabel("BevelBorder Color",JLabel.CENTER);
		lbl3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.blue,Color.cyan));
		add(lbl3);
		JLabel lbl4 = new JLabel("DashedBorder",JLabel.CENTER);
		lbl4.setBorder(BorderFactory.createDashedBorder(getForeground()));
		add(lbl4);
		JLabel lbl5 = new JLabel("LineBorder",JLabel.CENTER);
		lbl5.setBorder(BorderFactory.createLineBorder(Color.RED));
		add(lbl5);
		JLabel lbl6 = new JLabel("EmptyBorder",JLabel.CENTER);
		lbl6.setBorder(BorderFactory.createEmptyBorder());
		add(lbl6);
		JLabel lbl7 = new JLabel("EtchedBorder",JLabel.CENTER);
		lbl7.setBorder(BorderFactory.createEtchedBorder());
		add(lbl7);
		JLabel lbl8 = new JLabel("EtchedBorder.LOWERED",JLabel.CENTER);
		lbl8.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		add(lbl8);
		JLabel lbl9 = new JLabel("EtchedBorder.RAISED",JLabel.CENTER);
		lbl9.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		add(lbl9);
		JLabel lbl10 = new JLabel("TitledBorder",JLabel.CENTER);
		lbl10.setBorder(BorderFactory.createTitledBorder("제목"));
		add(lbl10);
		JLabel lbl11 = new JLabel("MatteBorder",JLabel.CENTER);
		lbl11.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.RED));
		add(lbl11);
		Icon icon = new ImageIcon("images/wavy.gif");
		JLabel lbl12 = new JLabel("MatteBorder",JLabel.CENTER);
		lbl12.setBorder(BorderFactory.createMatteBorder(-1, -1, -1, -1, icon));
		add(lbl12);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderTest();
	}
}
