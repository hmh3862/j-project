package kr.green.game;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CoupleGame extends JFrame implements ActionListener {
	private static final long serialVersionUID = -4067099382217588466L;
	private static Card[] cards = new Card[16]; 	// 게임에 사용될 배열
	private JButton[] buttons = new JButton[16];	// 배열값을 출력할 버튼 배열
	
	public static void main(String[] args) {
		// shuffle();
		// for(Card c : cards) {
		//	 System.out.println(c);
		// }
		new CoupleGame();
	}
	
	public CoupleGame() {
		super("짝맞추기 게임 Ver 0.009");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		shuffle();
		setLayout(new GridLayout(4, 4)); // 그리드 레이아웃으로 지정
		for(int i=0;i<buttons.length;i++) { // 버튼 객체 생성
			buttons[i] = new JButton();
			buttons[i].setFont(new Font("굴림", Font.BOLD, 35));
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
		display();
		setVisible(true);
		// 3초간 보여주고 모두 숫자를 숨긴다.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<cards.length;i++) cards[i].setShow(false);
		display();
	}
	
	private void display() {
		for(int i=0;i<cards.length;i++) {
			if(cards[i].isShow()) {
				buttons[i].setText(cards[i].getNum()+"");
			}else {
				buttons[i].setText("");
			}
		}
	}

	// 같은 숫자가 2개씩 되도록 섞는다.
	public static void shuffle() {
		// 재시작 될때도 불러져야 한다. 그렇다면 이전에 있던 값을 지워야 한다.
		for(int i=0;i<cards.length;i++) cards[i] = null; // 모든 배열을 초기화
		// 섞어보자
		Random rnd = new Random();
		int temp = 0;
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=8;j++) {
				do {
					temp = rnd.nextInt(cards.length);
				}while(cards[temp]!=null);
				cards[temp] = new Card();
				cards[temp].setNum(j);
				cards[temp].setShow(true);
			}
		}
	}
	private int first=-1, second = -1, count = 0; 
	@Override
	public void actionPerformed(ActionEvent e) {
		++count;
		JButton button = (JButton) e.getSource(); // 눌린 객체를 얻어보자
		int index = getIndex(button); // 눌린 버튼의 인덱스 얻기
		if(count==1) { // 첫번째 눌리면 
			System.out.println("첫번째 눌림 : " + cards[index].getNum());
			first = index; // 첫번째 눌린 인덱스를 기억하고
			cards[first].setShow(true); // 첫번째 눌린 버튼을 보이게 값 변경
			button.setText(cards[first].getNum()+"");
			button.invalidate();
		}else if(count==2){ // 두번째 눌린것이라면
			if(first==index) { // 같은 버튼을 두번 누렀다면
				count=1;
				return; 
			}
			System.out.println("두번째 눌림 : " + cards[index].getNum());
			second = index; // 두번쩨 값의 인덱스를 기억하고
			cards[second].setShow(true); // 두번째 버튼을 보이게 값 변경
			button.setText(cards[second].getNum()+"");
			button.invalidate();
			count = 0; // 횟수를 다시 0으로 만들고
		}
		// 보여주고
		invalidate();
		isCheck();
	}
	
	private void isCheck() {
		if(count==0) { 
			// 1초가 멈추고
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			// 첫번째와 두번째가 같으면 보여주고 같지 않으면 다시 숨겨줘야 한다.
			if(cards[first].getNum()!=cards[second].getNum()) {
				cards[first].setShow(false);
				cards[second].setShow(false);
			}else {
				buttons[first].setEnabled(false);
				buttons[second].setEnabled(false);
			}
			// 게임 종료 여부를 판단해야 한다.
			boolean isEndGame = true;
			for(int i=0;i<cards.length;i++) {
				if(!cards[i].isShow()) {
					isEndGame  = false;
					break;
				}
			}
			if(isEndGame) {
				// JOptionPane.showMessageDialog(this, "게임 종료!!!");
				// System.exit(0);
				if(JOptionPane.showConfirmDialog(this,"계속할래?", "대화상자",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					shuffle();
					display();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					for(int i=0;i<cards.length;i++) {
						cards[i].setShow(false);
						buttons[i].setEnabled(true);
					}
					display();
				}else {
					System.exit(0);
				}
			}
		}
		display();
	}
	
	// 버튼이 몇번째 버튼인지 인덱스값을 알려주는 메서드
	private int getIndex(JButton button) {
		int index = 0;
		for(int i=0;i<buttons.length;i++) {
			if(button.equals(buttons[i])) {
				index = i;
				break;
			}
		}
		return index;
	}
}
