package kr.green.graphic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageEx02 extends JPanel implements Runnable{
	private static final long serialVersionUID = -3033825707370137113L;
	
	Image shipImage; // 이미지를 읽어서 저장할 변수
	int width, height; // 이미지 크기를 저장할 변수
	BufferedImage bi; 
	int index = 0, nowX = 0;
	public ImageEx02() {
		try {
			shipImage = ImageIO.read(new File("ship/jpg/ship.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		width = shipImage.getWidth(null)/8; // 비행기 1개의 폭
		height = shipImage.getHeight(null);
		System.out.println("이미지 크기(" + width + ", " + height + ")");
		
		// 메모리에 이미지를 만든다.
		bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 이미지의 그래픽 객체를 얻는다.
		Graphics gg = bi.getGraphics();
		// 희색으로 셑팅
		gg.setColor(Color.WHITE);
		// 전체를  흰색으로 그린다. 그리지 않으면 검은색 바탕이다.
		gg.fillRect(0, 0, width*8, height);
		
		// 비행기 1개만 복사하자
		//           원본이미지, 대상x1,y1,x2,y2 , 원본 x1, y1, x2, y2
		gg.drawImage(shipImage, 0, 0, width, height, 0, 0, width, height, null);
		// 좌우 반전
		// gg.drawImage(shipImage, width, 0, 0, height, 0, 0, width, height, null);
		// 상하 반전
		// gg.drawImage(shipImage, 0, height, width, 0, 0, 0, width, height, null);
		
		// 상하좌우 반전
		// gg.drawImage(shipImage, width, height, 0, 0, 0, 0, width, height, null);
		
		// 스레드를 시작
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 메모리에 이미지를 만든다.
		bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 이미지의 그래픽 객체를 얻는다.
		Graphics gg = bi.getGraphics();
		// 희색으로 셑팅
		gg.setColor(Color.WHITE);
		// 전체를  흰색으로 그린다. 그리지 않으면 검은색 바탕이다.
		gg.fillRect(0, 0, width*8, height);
		
		// 비행기 1개만 복사하자
		//           원본이미지, 대상x1,y1,x2,y2 , 원본 x1, y1, x2, y2
		gg.drawImage(shipImage, 0, 0, width, height, (index)*width, 0, (index+1)*width, height, null);
		//gg.drawImage(shipImage, 0, 0, width, height, (index+4)*width, 0, (index+5)*width, height, null);
		g.drawImage(bi, nowX, 0, null);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(900, 200);
		frame.setLocationRelativeTo(null);
		Container container = frame.getContentPane();
		container.add(new ImageEx02()); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	@Override
	public void run() {
		while(true) {
			index = ++index%4; // 0 , 1, 2, 3, 반복
			nowX += 2;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
		
	}
	
}
