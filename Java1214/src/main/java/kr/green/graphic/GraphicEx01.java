package kr.green.graphic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
// 1. 그림을 그리기 위해서는 JPanel을 상속받아
public class GraphicEx01 extends JPanel implements ActionListener {

	private static final long serialVersionUID = 8641179549398627428L;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		Container container = frame.getContentPane();
		container.add(new GraphicEx01()); // 3. 프레임에 객체를 붙인다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	protected void paintComponent(Graphics g) { // 2. 여기서 그림을 그리고  : 무효화 영역이 생겼을때 자동으로 호출된다.
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.blue);
		
		g2d.drawLine(0, 0, 200, 200);// 선그리기
		g2d.setColor(Color.RED);
		g2d.fillOval(150, 150, 100, 100); // 원그리기
		
		g2d.setColor(Color.GREEN);
		g2d.drawRect(150, 150, 100, 100); // 사각형그리기
		
	}

}
