package me.gui.layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridbagLayoutTest extends JFrame {
	GridBagLayout gbl = new GridBagLayout();;
	GridBagConstraints gbc = new GridBagConstraints();

	public GridbagLayoutTest() {
		super("GridbagLayout Test");
		setSize(300, 200);
		setLocationRelativeTo(null);
		
		setLayout(gbl);
		gbc.ipadx = 8;
		gbc.ipadx = 8;
		gbc.fill = GridBagConstraints.BOTH; // 수평/수직 확장
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		makeButton("버튼 1");
		makeButton("버튼 2");
		makeButton("버튼 3");
		gbc.gridwidth = GridBagConstraints.REMAINDER; // 현재 행의 마지막 셀
		makeButton("버튼 4");
		gbc.weightx = 0.0;
		gbc.weighty = 0.0; // 가중치 기본값
		makeButton("버튼 5"); // 새로운 행
		// 현재 행의 다음 셀부터 마지막 셀까지 차지
		gbc.gridwidth = GridBagConstraints.RELATIVE; 
		makeButton("버튼 6");
		gbc.gridwidth = GridBagConstraints.REMAINDER; // 현재 행의 마지막 셀
		gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		makeButton("버튼 7");
		gbc.gridwidth = 1; 
		gbc.gridheight = 2;
		gbc.weightx = 0.25;
		gbc.weighty = 0.25;
		makeButton("버튼 8");
		gbc.weighty = 0.0; // 가중치 기본값
		gbc.gridwidth = GridBagConstraints.REMAINDER; // 현재 행의 마지막 셀
		gbc.gridheight = 1; 
		makeButton("버튼 9");
		makeButton("버튼 10");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	protected void makeButton(String title) {
		JButton button = new JButton(title);
		gbl.setConstraints(button, gbc);
		add(button);
	}

	public static void main(String[] args) {
		new GridbagLayoutTest();
	}
}
