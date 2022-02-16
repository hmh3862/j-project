package game;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PuzzleEx04 extends JFrame implements KeyListener {

	JLabel[] labels = new JLabel[16];
	int[] game = new int[16];
	
	public PuzzleEx04() {
		setTitle("Puzzle Ver 0.09");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4, 4,5,5));
		
		JPanel panel = (JPanel)getContentPane();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		addKeyListener(this);
		createLabel(); 	// 라벨 만들기
		setVisible(true);
		
		// draw();			// 라벨에 숫자그리기
		shuffle(); 		// 숫자 섞기
		
	}
	private void createLabel() {
		for(int i=0;i<labels.length;i++){
			labels[i] = new JLabel("", JLabel.CENTER);
			labels[i].setBorder(BorderFactory.createRaisedBevelBorder());
			labels[i].setFont(new Font("굴림체", Font.BOLD, 40));
			add(labels[i]);
		}
	}
	// 라벨의 내용을 그려주기
	private void draw(){
		for(int i=0;i<labels.length;i++){
			if(game[i]==0){
				labels[i].setText(""); 
				labels[i].setBorder(BorderFactory.createEmptyBorder());
			}else{
				labels[i].setText(game[i]+""); 
				labels[i].setBorder(BorderFactory.createRaisedBevelBorder());
			}
			//labels[i].setText(game[i]==0? "" : game[i]+"");
		}
	}
	// 게임 배열의 숫자를 섞는 메소드
	private void shuffle() {
		// 이렇게 섞으면 게임 종료가 되지 않을 수 있다. 
		/*
		Random rnd = new Random();
		int t;
		for(int i=0;i<game.length;i++) game[i] = 0; // 배열을 0으로 만든다.
		for(int i=0;i<game.length;i++){
			do{
				t = rnd.nextInt(game.length); 
			}while(game[t]!=0);
			game[t] = i;
		}
		*/
		
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
		new PuzzleEx04();
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
		// System.out.println("0의 위치 : " + index);
		
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
}
