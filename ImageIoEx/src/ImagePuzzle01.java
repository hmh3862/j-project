import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ImagePuzzle01 extends JFrame implements ActionListener {
	JButton []btn;
	JButton oldBtn,curBtn;
	int count=0,game[], row=4,col=4;
	Image original;
	BufferedImage img[];
	public ImagePuzzle01() {
		// 원본 그림 읽기
		MediaTracker tracker = new MediaTracker(this);
		original = Toolkit.getDefaultToolkit().getImage("img2.jpg");
		tracker.addImage(original, 0);
	    try { tracker.waitForAll(); } catch (InterruptedException e) { ; }
	    int width = original.getWidth(this);
	    int height = original.getHeight(this);
	    setSize(new Dimension(width,height));
	    // 이미지를 잘라 넣자
	    img = new BufferedImage[row*col];
	    int cnt=0;
	    for(int i=0;i<row;i++){
	    	for(int j=0;j<col;j++){
	    		img[cnt] = new BufferedImage(width/col,height/row,BufferedImage.TYPE_INT_RGB);
			    Graphics g = img[cnt].getGraphics();
			    // 원본이미지에서 필요한 부분만 잘라서 그리기
			    g.drawImage(original,
			    		    0, 0,  width/col, height/row, 
			    		    i*(width/col), j*(height/row),
			    		    (i+1)*(width/col), (j+1)*(height/row),this);
			    cnt++;
	    	}
	    }
	  
	    // 숫자 섞기
	    game = new int[row*col];		
		Random rnd = new Random();
		for(int i=0;i<row*col;i++) game[i] = 0; 
		for(int i=0;i<row*col;i++){
			int temp = 0;
			do{
				temp = rnd.nextInt(row*col);
			}while(game[temp]!=0);
			game[temp] = i;
		}
		setLayout(new GridLayout(row,col));
		// 버튼을 만들어 버튼에 이미지 입히기
		btn = new JButton[row*col];
		for(int i=0;i<row*col;i++){
			btn[i] = new JButton(new ImageIcon(img[i]));
			add(btn[i]);
		}
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ImagePuzzle01();
	}
	public void actionPerformed(ActionEvent e) {
		// 여기만 완성하면 됩니다.
		
		
	}
}
