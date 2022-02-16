package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PuzzleEx05 extends JFrame implements KeyListener, ActionListener {

	JButton[] buttons = new JButton[16];
	int[] game = new int[16];
	
	public PuzzleEx05() {
		setTitle("Puzzle Ver 0.09");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4, 4,5,5));
		
		JPanel panel = (JPanel)getContentPane();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.WHITE);
		addKeyListener(this);
		
		createButton(); 	// 라벨 만들기
		setVisible(true);	// 보이기

		shuffle(); 			// 숫자 섞기
		
	}
	private void createButton() {
		for(int i=0;i<buttons.length;i++){
			buttons[i] = new JButton("");
			buttons[i].setName(i+""); // 이름 주고
			buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			buttons[i].setFont(new Font("굴림체", Font.BOLD, 40));
			buttons[i].setBackground(Color.LIGHT_GRAY);
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
	}
	// 라벨의 내용을 그려주기
	private void draw(){
		for(int i=0;i<buttons.length;i++){
			if(game[i]==0){
				buttons[i].setText(""); 
				buttons[i].setBorder(BorderFactory.createEmptyBorder());
				buttons[i].setBackground(Color.WHITE);
			}else{
				buttons[i].setText(game[i]+""); 
				buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
				buttons[i].setBackground(Color.LIGHT_GRAY);
			}
			// 배열의 내용을 찍어보자
			//System.out.printf("%3d", game[i]);
			//if(i%4==3) System.out.println();
		}
		//System.out.println();
	}
	// 게임 배열의 숫자를 섞는 메소드
	private void shuffle() {
		// 어떻게 해야 될까?
		for(int i=0;i<game.length;i++) game[i] = i; // 일단 배열을 0~15까지로 채운다.
		// KeyEvent(Component source, int id, long when, int modifiers, int keyCode)
		Random r = new Random();
		for(int i=0;i<50;i++){
			switch (r.nextInt(4)) {
			case 0:
				keyPressed(new KeyEvent(this, 1, 1, 1, KeyEvent.VK_LEFT));// 이벤트 발생
				break;
			case 1:
				keyPressed(new KeyEvent(this, 1, 1, 1, KeyEvent.VK_RIGHT));
				break;
			case 2:
				keyPressed(new KeyEvent(this, 1, 1, 1, KeyEvent.VK_UP));
				break;
			case 3:
				keyPressed(new KeyEvent(this, 1, 1, 1, KeyEvent.VK_DOWN));
				break;
			}
			try { Thread.sleep(20); } catch (InterruptedException e) {;}
		}
	}
	
	public static void main(String[] args) {
		new PuzzleEx05();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {;}
	@Override
	public void keyPressed(KeyEvent e) {
		// 0의 위치를 찾는다.
		int index = 0;
		for(int i=0;i<game.length;i++){
			if(game[i]==0){
				index = i;
				break;
			}
		}
		switch (e.getKeyCode()) {
		case KeyEvent.VK_DOWN:
			if(index>3){
				int temp = game[index];
				game[index] = game[index-4];
				game[index-4] = temp;
			}
			break;
		case KeyEvent.VK_UP:
			if(index<12){
				int temp = game[index];
				game[index] = game[index+4];
				game[index+4] = temp;
			}
			break;
		case KeyEvent.VK_RIGHT:
			if(index%4!=0){
				int temp = game[index];
				game[index] = game[index-1];
				game[index-1] = temp;
			}
			break;
		case KeyEvent.VK_LEFT:
			if(index%4!=3){
				int temp = game[index];
				game[index] = game[index+1];
				game[index+1] = temp;
			}
			break;
		}
		draw();
		
		// 여기서 게임 종료를 확인한다.
		if(isEndGame()){
			// JOptionPane.showMessageDialog(this, "게임 종료!!!");
			if(JOptionPane.showConfirmDialog(this,"게임종료","다시 하시겠습니까?",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
				shuffle(); // 섞고
				draw();
			}else{
				System.exit(0); // 프로그램 종료
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {;}
	
	// 게임 종료여부를 판단한다.
	private boolean isEndGame() {
		for(int i=0;i<game.length-1;i++){
			if(i!=game[i]-1) return false;
		}
		return true;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 클릭했을때 이벤트를 처리한다.
		JButton button = (JButton)e.getSource();
		int index = Integer.parseInt(button.getName());
		// System.out.println(index  + "버튼 클릭");
		int temp;
		if(index%4!=0 && game[index-1]==0){// 맨왼쪽이 아니면서 왼쪽것이 0이라면
			temp = game[index];
			game[index] = game[index-1];
			game[index-1] = temp;
		}
		if(index%4!=3 && game[index+1]==0){// 맨오른쪽이 아니면서 오른쪽것이 0이라면
			temp = game[index];
			game[index] = game[index+1];
			game[index+1] = temp;
		}
		if(index>3 && game[index-4]==0){// 맨위쪽이 아니면서 위쪽것이 0이라면
			temp = game[index];
			game[index] = game[index-4];
			game[index-4] = temp;
		}
		if(index<12 && game[index+4]==0){// 맨아래쪽이 아니면서 아래쪽것이 0이라면
			temp = game[index];
			game[index] = game[index+4];
			game[index+4] = temp;
		}
		draw();
	}
}
