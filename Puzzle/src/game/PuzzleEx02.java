package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PuzzleEx02 extends JFrame implements ActionListener {
	// 사용할 컨트롤들을 변수로 선언
	static final int MAX=6;
	JButton[] buttons = new JButton[MAX*MAX]; 	// 보여질 버튼 배열
	Image[]   images = new Image[MAX*MAX];		// 잘라서 저장할 이미지
	int[]     game = new int[MAX*MAX]; 			// 뒤에서 작동할 게임 배열
	Image     srcImage;							// 원본이미지
	
	// 생성자에서 UI를 작성
	public PuzzleEx02() {
		setTitle("Puzzle Ver 0.019");
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
		// 숫자를 섞자
		shuffle();
		
		// 섞인 그림을 버튼을 만들어 이미지를 붙이자
		for(int i=0;i<game.length;i++){
			buttons[i] = new JButton(new ImageIcon(images[game[i]]));
			buttons[i].addActionListener(this); // 이벤트 지정
			buttons[i].setName(i+""); // 버튼에 이름을 지정하자!!!!
			add(buttons[i]);
		}
	}
	
	// 게임 배열의 숫자를 섞는 메소드
	private void shuffle() {
		Random rnd = new Random();
		int t;
		for(int i=0;i<game.length;i++) game[i] = 0; // 배열을 0으로 만든다.
		for(int i=0;i<game.length;i++){
			do{
				t = rnd.nextInt(game.length); 
			}while(game[t]!=0);
			game[t] = i;
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
	
	int oldNum, newNum, count; // 이전그림, 현재그림 번호를 저장할 변수, 카운트 변수 
	@Override
	public void actionPerformed(ActionEvent e) {
		count++; // 카운트 증가
		// 어떻게 번호를 알아낼까?
		JButton button = (JButton)e.getSource();
		// System.out.println(button.getName()); // 이렇게하면 버튼의 이름을 알아낼 수 있다.
		if(count==1){ // 카운트가 1이면 첫번째 선택
			oldNum = Integer.parseInt(button.getName());
		}else{
			newNum = Integer.parseInt(button.getName());
			if(oldNum!=newNum){ // 두개의 번호가 같지 않은 경우
				
				// 배열의 내용을 변경
				game[oldNum] = game[oldNum] ^ game[newNum]; 
				game[newNum] = game[oldNum] ^ game[newNum]; 
				game[oldNum] = game[oldNum] ^ game[newNum]; 
				
				changeImage(); // 이미지를 모두 다시변경
				
				count=0;
				// 여기서 게임 종료 여부를 판단한다.
				if(isEndGame()){
					// JOptionPane.showMessageDialog(this, "게임 종료!!!");
					if(JOptionPane.showConfirmDialog(this,"게임종료","다시 하시겠습니까?",
							JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
						shuffle(); // 카드 섞고
						changeImage(); // 이미지 변경하고
					}else{
						System.exit(0); // 프로그램 종료
					}
				}
			}else{ // 두개의 번호가 같은 경우는 같은 것을 두번 선택한 경우이다. 다시 선택하도록 번호 감소
				count--;
			}
		}
	}
	// 게임 종료여부를 판단한다.
	private boolean isEndGame() {
		for(int i=0;i<game.length;i++){
			if(i!=game[i]) return false;
		}
		return true;
	}
	// 버튼의 이미지를 배열의 내용에 따라 변경한다.
	private void changeImage() {
		for(int i=0;i<game.length;i++){
			buttons[i].setIcon(new ImageIcon(images[game[i]]));
		}
	}
	
	public static void main(String[] args) {
		new PuzzleEx02().setVisible(true);
	}
}
