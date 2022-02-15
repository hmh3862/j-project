package kr.green.win.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutEx2 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 77591736771413910L;
	Container container;
	CardLayout cardLayout;
	JButton prevBtn, nextBtn;
	ImageIcon imageIcon1, imageIcon2, imageIcon3, imageIcon4;
	JPanel centerPanel, bottomPanel;
	
	public CardLayoutEx2() {
		super("카드레이아웃연습");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		cardLayout = new CardLayout(10,10); // 카드레이아웃 작성
		centerPanel = new JPanel(); // 중앙에 배치할 패널 만들고
		centerPanel.setLayout(cardLayout); // 카드레이웃으로 지정
		imageIcon1 = new ImageIcon("src/main/resources/horka_1.jpg"); // 이미지를 읽고
		centerPanel.add(new JLabel(imageIcon1)); // 라벨에 이미지 붙이고 패널에 추가
		imageIcon2 = new ImageIcon("src/main/resources/horka_2.jpg");
		centerPanel.add(new JLabel(imageIcon2));
		imageIcon3 = new ImageIcon("src/main/resources/horka_3.jpg");
		centerPanel.add(new JLabel(imageIcon3));
		imageIcon4 = new ImageIcon("src/main/resources/horka_4.jpg");
		centerPanel.add(new JLabel(imageIcon4));
		
		add(centerPanel, BorderLayout.CENTER); // 패널을 화면의 중앙에
		
		
		// 하단에 표시될 패널(컨테이너)
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1, 2)); // 그리드레이아웃으로
		prevBtn = new JButton("이전"); // 버튼 만들고
		prevBtn.addActionListener(this); // 리스너 등록
		bottomPanel.add(prevBtn); // 패널에 추가
		nextBtn = new JButton("다음"); // 다음버튼 만들고
		nextBtn.addActionListener(this); // 리스어 지정하고
		bottomPanel.add(nextBtn); // 패널에 추가하고
		
		add(bottomPanel, BorderLayout.SOUTH); // 패널을 화면의 하단에
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new CardLayoutEx2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("이전")) {// 버튼의 제목이 이전이면 이전으로
			cardLayout.previous(centerPanel);
		}else{// 버튼의 제목이 이전이 아니면 다음으로
			cardLayout.next(centerPanel);
		}
	}
}
