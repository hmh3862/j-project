package kr.green.win.layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutEx extends JFrame implements ActionListener {
	private static final long serialVersionUID = 77591736771413910L;
	Container c;
	CardLayout cardLayout;
	JButton btn1, btn2, btn3;
	
	public CardLayoutEx() {
		super("카드레이아웃연습");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		cardLayout = new CardLayout(10, 10); // 가로세로 여백을 10으로 준다.
		setLayout(cardLayout);
		btn1 = new JButton("사과");
		btn2 = new JButton("딸기");
		btn3 = new JButton("수박");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		c.add("이전", btn1);
		c.add("다음", btn2);
		c.add("현재", btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CardLayoutEx();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cardLayout.next(c);
	}

}
