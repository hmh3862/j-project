package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PuzzleEx06 extends JFrame implements KeyListener, ActionListener {

	static final int MAX=2;
	Image     srcImage;
	Image[]   images = new Image[MAX*MAX];		// 잘라서 저장할 이미지
	
	JButton[] buttons = new JButton[MAX*MAX];
	int[] game = new int[MAX*MAX];
	
	boolean isEnd = false; // 게임이 완료되면 마지막 그림도 드려준다.
	
	public PuzzleEx06() {
		setTitle("Puzzle Ver 0.09");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(MAX, MAX));
		// 이미지를 읽어서 잘라 배열에 넣자
		try {
			srcImage = ImageIO.read(new File("img2.jpg")); 	// 이미지 읽기
			// 이미지를 읽고 윈도우 크기를 바꾼다.
			setSize(new Dimension(srcImage.getWidth(this), srcImage.getHeight(this)));
			setResizable(false);
			setLocationRelativeTo(null);
			// 읽은 이미지를 잘라서 배열에 넣는 메서드
			imageInit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JPanel panel = (JPanel)getContentPane();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.WHITE);
		addKeyListener(this);
		
		createButton(); 	// 버튼 만들기
		setVisible(true);	// 보이기

		shuffle(); 			// 숫자 섞기
		
	}
	private void createButton() {
		for(int i=0;i<buttons.length;i++){
			buttons[i] = new JButton();
			buttons[i].setName(i+""); // 이름 주고
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
	}
	// 읽은 이미지를 잘라서 배열에 넣는 메서드
	private void imageInit() {
		int w = srcImage.getWidth(this)/MAX;			// 잘라낼 이미지 폭
		int h = srcImage.getHeight(this)/MAX;			// 잘라낼 이미지 높이
		int count=0;
		for(int i=0;i<MAX;i++){ // row
			for(int j=0;j<MAX;j++){ // col
				// 이미지 만들고
				BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_BGR);
				// 이니지에 그리기 위해 그래픽 객체를 얻고
				Graphics g = bi.getGraphics();
				// 그래픽 객체에 이미지를 그린다.
				g.drawImage(srcImage, 0,0,w,h,w*j,h*i,w*(j+1),h*(i+1), this);
				// 그려진 이미지를 배열에 넣는다.
				images[count] = bi;
				count++;
			}
		}
	}
	// 이미지에 그림 그려주기
	private void draw(){
		for(int i=0;i<buttons.length;i++){
			if(game[i]==0 && !isEnd){
				buttons[i].setIcon(new ImageIcon());
				buttons[i].setBorder(BorderFactory.createEmptyBorder());
				buttons[i].setBackground(Color.WHITE);
			}else{
				buttons[i].setIcon(new ImageIcon(images[game[i]]));
				buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
				buttons[i].setBackground(Color.LIGHT_GRAY);
			}
		}
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
		new PuzzleEx06();
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
			if(index>MAX-1){
				int temp = game[index];
				game[index] = game[index-MAX];
				game[index-MAX] = temp;
			}
			break;
		case KeyEvent.VK_UP:
			if(index<MAX*(MAX-1)){
				int temp = game[index];
				game[index] = game[index+MAX];
				game[index+MAX] = temp;
			}
			break;
		case KeyEvent.VK_RIGHT:
			if(index%MAX!=0){
				int temp = game[index];
				game[index] = game[index-1];
				game[index-1] = temp;
			}
			break;
		case KeyEvent.VK_LEFT:
			if(index%MAX!=MAX-1){
				int temp = game[index];
				game[index] = game[index+1];
				game[index+1] = temp;
			}
			break;
		}
		draw();
	}
	@Override
	public void keyReleased(KeyEvent e) {;}
	
	// 게임 종료여부를 판단한다.
	private boolean isEndGame() {
		for(int i=0;i<game.length-1;i++){
			if(i!=game[i]) return false;
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
		if(index%MAX!=0 && game[index-1]==0){// 맨왼쪽이 아니면서 왼쪽것이 0이라면
			temp = game[index];
			game[index] = game[index-1];
			game[index-1] = temp;
		}
		if(index%MAX!=MAX-1 && game[index+1]==0){// 맨오른쪽이 아니면서 오른쪽것이 0이라면
			temp = game[index];
			game[index] = game[index+1];
			game[index+1] = temp;
		}
		if(index>MAX-1 && game[index-MAX]==0){// 맨위쪽이 아니면서 위쪽것이 0이라면
			temp = game[index];
			game[index] = game[index-MAX];
			game[index-MAX] = temp;
		}
		if(index<MAX*(MAX-1) && game[index+MAX]==0){// 맨아래쪽이 아니면서 아래쪽것이 0이라면
			temp = game[index];
			game[index] = game[index+MAX];
			game[index+MAX] = temp;
		}
		draw();
		// 여기서 게임 종료를 확인한다.
		if(isEndGame()){
			isEnd = true;
			draw();
			// JOptionPane.showMessageDialog(this, "게임 종료!!!");
			if(JOptionPane.showConfirmDialog(this,"다시 하시겠습니까?","게임종료",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
				isEnd = false;
				shuffle(); // 섞고
				draw();
			}else{
				System.exit(0); // 프로그램 종료
			}
		}

	}
}
