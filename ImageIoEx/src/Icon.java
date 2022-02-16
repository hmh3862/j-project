import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Icon extends JFrame {
	int row = 13, col = 14,width,height;
	Image original;
	BufferedImage img;

	public Icon() {
		try {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400,400);
			// 이미지읽기
			original = ImageIO.read(new File("SIconicIcons.jpg"));
			width = original.getWidth(this);
			height = original.getHeight(this);
			
			int w = width/col;
			int h = height/row;
			System.out.println(width + "/" + height);
			System.out.println(w + "/" + h);
			System.out.println(w*col + "/" + h*row);
			// 버퍼에 임시 이미지 생성
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					img = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
					// 그래픽스 객체 얻기
					Graphics g = img.getGraphics();
					// 원본이미지에서 필요한 부분만 잘라서 그리기
					g.drawImage(original,0, 0, w, h, j*w, i*h, (j+1)*w, (i+1)*h, this);
					// 잘라낸 그림을 저장하기
					int count = i*row+j+1;
					ImageIO.write(img, "png", new File("icon\\Iconic"+count+".png"));
				}
			}
		    setVisible(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Icon();
	}

}
