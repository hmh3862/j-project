import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ImageIoEx extends JFrame{
	BufferedImage bi = null;
	BufferedImage img = null;
	
	public ImageIoEx() {
		try {
			// 이미지읽기
			bi = ImageIO.read(new File("images.jpg"));
			// 버퍼에 임시 이미지 생성(버튼에 입힐 이미지크기)
			img = new BufferedImage(50,50,BufferedImage.TYPE_INT_RGB);
			// 그래픽스 객체 얻기
		    Graphics g = img.getGraphics();
		    // 원본이미지에서 필요한 부분만 잘라서 그리기
		    g.drawImage(bi, 0, 0, 50, 50, 63, 42, 113, 92, this);
		    // 잘라낸 그림을 저장하기
		    ImageIO.write(img, "png", new File("img.png"));
		    ImageIO.write(img, "gif", new File("img.gif"));
		    ImageIO.write(img, "jpg", new File("img.jpg"));
		    setSize(400,400);
		    // 잘라낸이미지를 버튼에 입히기
		    JButton btn = new JButton(new ImageIcon(img));
		    add(btn);
		    setVisible(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ImageIoEx();
	}

}
