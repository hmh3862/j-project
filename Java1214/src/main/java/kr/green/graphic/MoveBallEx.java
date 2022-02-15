package kr.green.graphic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoveBallEx extends JFrame implements Runnable {
	private static final long serialVersionUID = -6148066140346985994L;

	int width, height; // Panel의 크기를 저장할 변수
	int nowX, nowY; // 현재 공의 위치를 저장할 변수
	int swX = 1, swY = 1; // 반전 시키기 위한 변수
	MoveBall moveBall;
	
	public MoveBallEx() {
		setTitle("튕겨라공!!!");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		moveBall = new MoveBall();
		add(moveBall);
		// 화면의 크기를 알아내자
		moveBall.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				super.componentResized(e);
				Component component = (Component)e.getSource();
				width = component.getWidth();
				height = component.getHeight();
				// System.out.println(width + ", " + height);
			}
		});
		// 스레드를 시작해 보자
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MoveBallEx();
	}
	// 이동을 위해 스레드에서 좌표를 이동시켜보자 
	@Override
	public void run() {
		while(true) {
			nowX += swX*10; // 곱해주는 숫자가 크면 속도가 빨라진다.
			nowY += swY*5;
			if(nowX<=0 || nowX>=width-30) swX *= -1;
			if(nowY<=0 || nowY>=height-30) swY *= -1;
			try {
				Thread.sleep(10); // 잠시 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint(); // 다시 그려라!!
		}
	}
	
	// 실제 공을 그릴 Panel을 만들자
	class MoveBall extends JPanel{
		private static final long serialVersionUID = 8717510764489448998L;
		@Override
		public void paint(Graphics g) {
			//setBackground(Color.WHITE);
			g.setColor(Color.red);
			g.fillOval(nowX, nowY, 30, 30);
		}
	}
}
