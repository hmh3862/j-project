import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ImagePuzzle02 extends JPanel implements MouseListener {
	int count=0,game[], row=5,col=5;
	Image original;
	BufferedImage img[];
	int width,height;
	public ImagePuzzle02() {
		// 원본 그림 읽기
		MediaTracker tracker = new MediaTracker(this);
		original = Toolkit.getDefaultToolkit().getImage("img2.jpg");
		tracker.addImage(original, 0);
	    try { tracker.waitForAll(); } catch (InterruptedException e) { ; }
	    width = original.getWidth(this);
	    height = original.getHeight(this);
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
		addMouseListener(this); // 마우스 리스너 등록
		setVisible(true);
	}
	// 그리기 코드에 paint에 몰아준다.
	public void paint(Graphics g) {
		int cnt=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				g.drawImage(img[game[cnt]],
					i*width/col, j*height/row, 
					(i+1)*width/col, (j+1)*height/row,	
					0,0,width/col,height/row,this);
				cnt++;
			}
		}
	}
	public static void main(String[] args) {
		ImagePuzzle02 pane = new ImagePuzzle02();
		JFrame frame = new JFrame("재미없는 Puzzle Ver 0.1");
		frame.setSize(pane.width, pane.height);
		frame.setResizable(false);
		Container panel = frame.getContentPane();
		panel.add(pane);
		frame.setVisible(true);
	}
	// 마우스 리스너 구현
	public void mouseClicked(MouseEvent e) {
		int x = e.getX(); // x좌표
		int y = e.getY(); // y좌표
		int r = y/(height/row); // 그림 한개의 높이로 나눈다
		int c = x/(width/col);  // 그림 한개의 폭으로 나눈다
		int imgNo = (r+1) * (c+1) -1; // 배열 첨자
		String coord = "(" + x + ", " + y  + 
				") - (" + r + ", " + c + ") - " + imgNo; 
		System.out.println(coord);
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
}
