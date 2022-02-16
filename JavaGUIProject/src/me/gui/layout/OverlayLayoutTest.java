package me.gui.layout;

import java.awt.*;
import javax.swing.*;

public class OverlayLayoutTest extends JFrame {
	
	public OverlayLayoutTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("OverlayLayoutTest");
		setSize(300, 300);
		setLayout(new OverlayLayout(getContentPane()));
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		panel1.add(new JLabel("<html><br>나 라벨</html>"));
		panel1.setOpaque(false);
		add(panel1, "1");
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("<html><br><br>나 라벨</html>",JLabel.RIGHT));
		panel2.setOpaque(false);
		add(panel2, "2");
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(new JButton("나 버튼"), BorderLayout.SOUTH);
		panel3.setOpaque(false);
		add(panel3, "3");
		
		setVisible(true);
	}
	public static void main(String[] args){
		new OverlayLayoutTest();
	}
}