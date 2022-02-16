package game;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WinMineEx extends JFrame implements ActionListener{
	static final int ROW = 9, COL = 9; // 행열
	static final int MAX = 10; // 지뢰수
	int[][] mine = new int[ROW][COL]; // 게임 배열
	JButton[] buttons = new JButton[ROW*COL]; // 버튼 배열

	public WinMineEx() {
		setTitle("Mine Ver 0.09");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(ROW, COL));
		setSize(ROW*45,COL*45);
		setResizable(false);
		setLocationRelativeTo(null);
		createButton(); // 버튼 만들고
		makeMine(); // 폭탄 생성하고
		calMine();  // 폭탄의 개수 세어주고
		draw();		// 버튼에 내용을 채워보자!!!
		setVisible(true); // 보이고
		
	}
	
	public static void main(String[] args) {
		new WinMineEx();
	}
	// 버튼에 내용을 채워보자!!!
	private void draw(){
		int count = 0;
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(mine[i][j]==9){
					buttons[count].setText("");
					buttons[count].setIcon(new ImageIcon("mine.gif"));
				}else{
					if(mine[i][j]!=0){
						buttons[count].setText(mine[i][j]+"");
					}else{
						buttons[count].setText("");
					}
					buttons[count].setIcon(new ImageIcon());
				}
				count++;
			}
		}
	}
	// 폭탄을 10개 만든다.
	private void makeMine() {
		Random r = new Random(); // 난수
		// 배열을 모두 0으로 초기화
		for(int i=0;i<ROW;i++)
			for(int j=0;j<COL;j++)
				mine[i][j] = 0;
		// MAX개만 9로 채운다.
		int row,col;
		for(int i=0;i<MAX;i++){
			do{
				row = r.nextInt(ROW);
				col = r.nextInt(COL);
			}while(mine[row][col]!=0);
			mine[row][col] = 9; // 9가 폭탄
		}
	}
	// 폭탄의 개수를 계산한다.
	private void calMine(){
		// 배열을 돌면서 9가 아닌경우 둘레의 9의 개수를 세서 그값을 가진다.
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(mine[i][j]!=9){ // 9가 아닌경우 둘레의 8군데 9의 숫자 확인
					int cnt = 0;
					// 좌
					if(j>0 && mine[i][j-1]==9) cnt++;
					// 우
					if(j<COL-1 && mine[i][j+1]==9) cnt++;
					// 상
					if(i>0 && mine[i-1][j]==9) cnt++;
					// 하
					if(i<ROW-1 && mine[i+1][j]==9) cnt++;
					// 좌상
					if(i>0 && j>0 && mine[i-1][j-1]==9) cnt++;
					// 우상
					if(i>0 && j<COL-1  && mine[i-1][j+1]==9) cnt++;
					// 좌하
					if(i<ROW-1 && j>0  && mine[i+1][j-1]==9) cnt++;
					// 우하
					if(i<ROW-1 && j<COL-1  && mine[i+1][j+1]==9) cnt++;
					mine[i][j] = cnt; // 9의 개수를 배열에 가진다.
				}
			}
		}
	}
	// 버튼을 만든다.
	private void createButton() {
		for(int i=0;i<buttons.length;i++){
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
