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

public class ImageEx01 extends JPanel{
	private static final long serialVersionUID = -3033825707370137113L;
	
	Image[] images = new Image[8]; // 이미지를 읽어서 저장할 변수
	int width, height; // 이미지 크기를 저장할 변수
	public ImageEx01() {
		try {
			// 이미지 읽기
			images[0] = ImageIO.read(new File("src/main/resources/ship2_1.png"));
			images[1] = ImageIO.read(new File("src/main/resources/ship2_2.png"));
			images[2] = ImageIO.read(new File("src/main/resources/ship2_3.png"));
			images[3] = ImageIO.read(new File("src/main/resources/ship2_4.png"));
			images[4] = ImageIO.read(new File("src/main/resources/ship2_hit_1.png"));
			images[5] = ImageIO.read(new File("src/main/resources/ship2_hit_2.png"));
			images[6] = ImageIO.read(new File("src/main/resources/ship2_hit_3.png"));
			images[7] = ImageIO.read(new File("src/main/resources/ship2_hit_4.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		width = images[0].getWidth(null);
		height = images[0].getHeight(null);
		System.out.println("이미지 크기(" + width + ", " + height + ")");
		// 저장할 폴더를 만들자
		File file = new File("ship/jpg");
		if(!file.exists()) {
			file.mkdirs();
		}
		// 이미지 형식을 바꿔서 이미지 저장
		for(int i=0;i<images.length;i++) {
			// 그림 복사
			// 메모리에 이미지를 만든다.
			BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			// 이미지의 그래픽 객체를 얻는다.
			Graphics gg = bi.getGraphics();
			// 희색으로 셑팅
			gg.setColor(Color.WHITE);
			// 전체를  흰색으로 그린다. 그리지 않으면 검은색 바탕이다.
			gg.fillRect(0, 0, width, height);
			// 거기에 그림을 출력한다.
			gg.drawImage(images[i], 0, 0, this);
			
			try {
				ImageIO.write(bi, "jpg", new File(String.format("ship/jpg/ship2_%02d.jpg",i)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 8개의 이미지를 1장의 이미지로 합쳐서 저장해보자
		// 메모리에 이미지를 만든다.
		BufferedImage bi = new BufferedImage(width*8, height, BufferedImage.TYPE_INT_RGB);
		// 이미지의 그래픽 객체를 얻는다.
		Graphics gg = bi.getGraphics();
		// 희색으로 셑팅
		gg.setColor(Color.WHITE);
		// 전체를  흰색으로 그린다. 그리지 않으면 검은색 바탕이다.
		gg.fillRect(0, 0, width*8, height);
		// 8개의 이미지를 x좌표만 바꿔서 저장해보자
		for(int i=0;i<images.length;i++) {
			gg.drawImage(images[i], i*width, 0, this);
		}
		// 이제 합쳐진 이미지를 저장해보자!!!
		try {
			ImageIO.write(bi, "jpg", new File("ship/jpg/ship.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0;i<images.length;i++) {
			g.drawImage(images[i], 10, height*i + 10, null);
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 800);
		frame.setLocationRelativeTo(null);
		Container container = frame.getContentPane();
		container.add(new ImageEx01()); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
