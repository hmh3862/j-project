package kr.green.graphic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
// 1. 그림을 그리기 위해서는 JPanel을 상속받아
public class GraphicEx02 extends JPanel implements ActionListener , MouseListener{

	private static final long serialVersionUID = 8641179549398627428L;
	List<Integer> listX = new ArrayList<Integer>();
	List<Integer> listY = new ArrayList<Integer>();
	
	
	public GraphicEx02() {
		listX.add(10);
		listY.add(10);
		addMouseListener(this);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		Container container = frame.getContentPane();
		container.add(new GraphicEx02()); // 3. 프레임에 객체를 붙인다.
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
		
		if(listX.size()>1) {
			for(int i=1;i<listX.size();i++) {
				g2d.drawLine(listX.get(i-1), listY.get(i-1), listX.get(i), listY.get(i));
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		listX.add(e.getX());
		listY.add(e.getY());
		repaint(); // 다시 그려!!!
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
