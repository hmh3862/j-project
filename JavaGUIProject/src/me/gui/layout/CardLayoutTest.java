package me.gui.layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutTest extends JFrame{
	CardLayout cardLayout = new CardLayout();
	public CardLayoutTest() {
		super("CardLayout Test");
		setSize(400, 200);
		setLocationRelativeTo(null);
		
		// 카드 레이아웃을 사용할 JPanel
		JPanel centerPanel = new JPanel();
		// 카드 레이아웃 지정
		centerPanel.setLayout(cardLayout);
		// 카드 색상 배열
		Color color[] = {Color.red, Color.cyan,Color.yellow,Color.green};
		
		for(int i=0;i<color.length;i++){
			JPanel card = new JPanel(); // 카드생성
			card.setBackground(color[i]); // 카드 배경색 지정
			card.add(new JLabel(i+1+"번째 카드", JLabel.CENTER));
			centerPanel.add(card, "card"+i); // 카드 추가
		}
		// 프레임 중앙에 배치
		add(centerPanel, BorderLayout.CENTER); 
		
		// 하단에 카드 이동할 JPanel
		JPanel bottomPanel = new JPanel();
		// GridLayout 지정
		bottomPanel.setLayout(new GridLayout());
		// 이전 버튼
		JButton preBtn = new JButton("이전");
		preBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(centerPanel);	// 이전 카드로 이동		
			}
		});
		// 다음 버튼
		JButton nextBtn = new JButton("다음");
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(centerPanel);	// 다음 카드로 이동				
			}
		});
		// 버튼을 하단에 배치
		bottomPanel.add(preBtn);
		bottomPanel.add(nextBtn);
		// 프레임 하단에 배치 
		add(bottomPanel,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CardLayoutTest();
	}
}
